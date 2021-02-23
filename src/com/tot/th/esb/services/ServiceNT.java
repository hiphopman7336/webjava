package com.tot.th.esb.services;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.tot.th.esb.services.dto.request.BaIdQueryMessageReqDto;
import com.tot.th.esb.services.dto.request.CustomerInquiryMessageReqDto;
import com.tot.th.esb.services.dto.request.NameQueryMessageReqDto;
import com.tot.th.esb.services.dto.request.ServiceIdQueryMessageReqDto;
import com.tot.th.esb.services.dto.request.ServiceInquiryMessageReqDto;
import com.tot.th.esb.services.dto.request.ServiceRequestMessageReqDto;
import com.tot.th.esb.services.dto.request.StatusRequestMessageReqDto;
import com.tot.th.esb.services.dto.response.BaIdQueryMessageDto;
import com.tot.th.esb.services.dto.response.CustomerInquiryMessageDto;
import com.tot.th.esb.services.dto.response.NameQueryMessageDto;
import com.tot.th.esb.services.dto.response.ServiceIdQueryMessageDto;
import com.tot.th.esb.services.dto.response.ServiceInquiryMessageDto;
import com.tot.th.esb.services.dto.response.ServiceRequestMessageDto;
import com.tot.th.esb.services.dto.response.StatusRequestMessageDto;
import com.tot.th.esb.services.helper.ESBCommonServiceBean;
import com.tot.th.esb.soap.message.ServiceRepository;
import com.tot.th.esb.soap.message.ValidateParamMessage;
import com.tot.th.esb.utilities.DateUtil;
import com.tot.th.esb.utilities.LogUtil;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
//http://localhost:8070/esbjavarest/rest/proxyservice/nt
@Path("/proxyservice/nt")
public class ServiceNT {
	private static Logger log = Logger.getLogger(ServiceNT.class);	
	private static ESBCommonServiceBean helper = new ESBCommonServiceBean();
	private LogUtil logDetail = new LogUtil();
	private String transectionId = null;	
	private Gson gson = new Gson();
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException  {
		RequestDispatcher rd = req.getRequestDispatcher("index.html");
	}
	
	
	@POST
	@Path("/CustomerInquiry")
	@Produces(MediaType.APPLICATION_JSON)
	public Response customerInquiry(String payload) {		
		log.debug("start call service : CustomerInquiry");
		log.debug("message incomming");
		
		//Gen SSID
		transectionId = DateUtil.genSSID();
		
		CustomerInquiryMessageDto msgDto = new CustomerInquiryMessageDto();

		try{

			Type mapType = new TypeToken<Map<String, String>>(){}.getType();  
			Map<String, String> map = new Gson().fromJson(payload, mapType);
			String customer_name = map.get("customer_name");

			//RQIN
			logDetail.getLogDetail_RQIN(transectionId, ServiceRepository.WS_CUSTOMER_INQUIRY, payload);
			
			log.debug("validate incomming message");
			CustomerInquiryMessageReqDto msgReq = new CustomerInquiryMessageReqDto(customer_name);		
			msgReq = ValidateParamMessage.customerInquiry(msgReq);
			
			msgDto = helper.customerInquiry(msgReq, transectionId);
			log.debug("end call service : customerInquiry");
			
			//RSOU
			logDetail.getLogDetail_RSOU(transectionId, ServiceRepository.WS_CUSTOMER_INQUIRY, gson.toJson(msgDto));
			
			return Response
					.status(200)
					.entity(msgDto).build();	

		}catch (Exception e) {
			
			log.debug("end call service : customerInquiry");

			return Response
					.status(401)
					.entity(msgDto).build();	
		}
	}
	
	
	@POST
	@Path("/ServiceInquiry")
	@Produces(MediaType.APPLICATION_JSON)
	public Response serviceInquiry(String payload) {	
		log.debug("start call service : serviceInquiry");
		log.debug("message incomming : "+payload);

		//Gen SSID
		transectionId = DateUtil.genSSID();
		
		ServiceInquiryMessageDto msgDto = new ServiceInquiryMessageDto();

		//RQIN
		logDetail.getLogDetail_RQIN(transectionId, ServiceRepository.WS_SERVICE_INQUIRY, payload);
		
		try{

			Type mapType = new TypeToken<Map<String, String>>(){}.getType();  
			Map<String, String> map = new Gson().fromJson(payload, mapType);
			String customer_number = map.get("customer_number");
			String service_id = map.get("service_id");
			String billing_account_number = map.get("billing_account_number");
			String subscriber_id = map.get("subscriber_id");		

			log.debug("validate incomming message");
			ServiceInquiryMessageReqDto msgReq = new ServiceInquiryMessageReqDto(customer_number, service_id
					, billing_account_number,  subscriber_id);		
			msgReq = ValidateParamMessage.serviceInquiry(msgReq);
			
			// customer_number = 1126198
			msgDto = helper.serviceInquiry(msgReq, transectionId);			
			log.debug("end call service : serviceInquiry");
			
			//RSOU
			logDetail.getLogDetail_RSOU(transectionId, ServiceRepository.WS_SERVICE_INQUIRY, gson.toJson(msgDto));
			
			return Response
					.status(200)
					.entity(msgDto).build();	

		}catch (Exception e) {
			
			log.debug("end call service : serviceInquiry");

			return Response
					.status(401)
					.entity(msgDto).build();	
		}		
	}
	
	
	@POST
	@Path("/StatusRequest")
	@Produces(MediaType.APPLICATION_JSON)
	public Response statusRequest(String payload) throws Exception {		
		log.debug("start call service : statusRequest");
		log.debug("message incomming : "+payload);
		
		//Gen SSID
		transectionId = DateUtil.genSSID();
		
		StatusRequestMessageDto msgDto = new StatusRequestMessageDto();	
		
		//RQIN
		logDetail.getLogDetail_RQIN(transectionId, ServiceRepository.WS_STATUS_REQUEST, payload);
		
		try{
			
			Type mapType = new TypeToken<Map<String, String>>(){}.getType();  
			Map<String, String> map = new Gson().fromJson(payload, mapType);
			String request_id = map.get("request_id");	
			
			log.debug("validate incomming message");
			StatusRequestMessageReqDto msgReq = new StatusRequestMessageReqDto(request_id);		
			msgReq = ValidateParamMessage.statusRequest(msgReq);
			
			msgDto = helper.statusRequest(msgReq, transectionId);
			log.debug("end call service : statusRequest");
			
			//RSOU
			logDetail.getLogDetail_RSOU(transectionId, ServiceRepository.WS_STATUS_REQUEST, gson.toJson(msgDto));
			
			return Response
					.status(200)
					.entity(msgDto).build();		
			
		}catch (Exception e) {
			
			log.debug("end call service : statusRequest");

			return Response
					.status(401)
					.entity(msgDto).build();	
		}		
	}
	
	
	@POST
	@Path("/ServiceRequest")
	@Produces(MediaType.APPLICATION_JSON)
	public Response serviceRequest(String payload) throws Exception {		
		log.debug("start call service : serviceRequest");
		log.debug("message incomming : "+payload);
		
		//Gen SSID
		transectionId = DateUtil.genSSID();
		
		ServiceRequestMessageDto msgDto = new ServiceRequestMessageDto();
		
		//RQIN
		logDetail.getLogDetail_RQIN(transectionId, ServiceRepository.WS_SERVICE_REQUEST, payload);
		
		try{
			
			Type mapType = new TypeToken<Map<String, String>>(){}.getType();  
			Map<String, String> map = new Gson().fromJson(payload, mapType);

			String tot_task_id = map.get("tot_task_id"); 
			String call_number = map.get("call_number"); 
			String contact_number = map.get("contact_number"); 
			String service_id = map.get("service_id"); 
			String service_type = map.get("service_type"); 
			String customer_name = map.get("customer_name"); 
			String billing_account = map.get("billing_account"); 
			String request_description = map.get("request_description"); 
			String request_date = map.get("request_date"); 
			String subscriber_id = map.get("subscriber_id"); 
			String request_tracking_type = map.get("request_tracking_type"); 
			String billing_address = map.get("billing_address"); 
			String installation_address = map.get("installation_address"); 

			log.debug("validate incomming message");
			ServiceRequestMessageReqDto msgReq = new ServiceRequestMessageReqDto(tot_task_id, call_number, 
					contact_number, service_id, service_type, customer_name, 
					billing_account, request_description, request_date, 
					subscriber_id, request_tracking_type, billing_address, 
					installation_address);	
			msgReq = ValidateParamMessage.serviceRequest(msgReq);
			
			//call service endpoint
			msgDto = helper.serviceRequest(msgReq, transectionId);				
			log.debug("end call service : serviceRequest");
			
			//RSOU
			logDetail.getLogDetail_RSOU(transectionId, ServiceRepository.WS_SERVICE_REQUEST, gson.toJson(msgDto));
			
			return Response
					.status(200)
					.entity(msgDto).build();		
			
		}catch (Exception e) {
			
			log.debug("end call service : serviceRequest");

			return Response
					.status(401)
					.entity(msgDto).build();	
		}				
	}
	
	@POST
	@Path("/NameQuery")
	@Produces(MediaType.APPLICATION_JSON)
	public Response nameQuery(String payload) throws Exception {		
		log.debug("start call service : nameQuery");
		log.debug("message incomming : "+payload);

		//Gen SSID
		transectionId = DateUtil.genSSID();
		
		NameQueryMessageDto msgDto = new NameQueryMessageDto();

		//RQIN
		logDetail.getLogDetail_RQIN(transectionId, ServiceRepository.WS_NAME_QUERY, payload);
		
		try{

			Type mapType = new TypeToken<Map<String, String>>(){}.getType();  
			Map<String, String> map = new Gson().fromJson(payload, mapType);
			String name = map.get("name");

			log.debug("validate incomming message");
			NameQueryMessageReqDto msgReq = new NameQueryMessageReqDto(name);		
			msgReq = ValidateParamMessage.nameQuery(msgReq);
			
			msgDto = helper.nameQuery(msgReq, transectionId);
			log.debug("end call service : nameQuery");
			
			//RSOU
			logDetail.getLogDetail_RSOU(transectionId, ServiceRepository.WS_NAME_QUERY, gson.toJson(msgDto));
			
			return Response
					.status(200)
					.entity(msgDto).build();	

		}catch (Exception e) {
			
			log.debug("end call service : nameQuery");

			return Response
					.status(401)
					.entity(msgDto).build();	
		}
	}
	
	@POST
	@Path("/BaIdQuery")
	@Produces(MediaType.APPLICATION_JSON)
	public Response baIdQuery(String payload) throws Exception {		
		log.debug("start call service : nameQuery");
		log.debug("message incomming : "+payload);

		//Gen SSID
		transectionId = DateUtil.genSSID();
		
		BaIdQueryMessageDto msgDto = new BaIdQueryMessageDto();

		//RQIN
		logDetail.getLogDetail_RQIN(transectionId, ServiceRepository.WS_BA_ID_QUERY, payload);
		
		try{

			Type mapType = new TypeToken<Map<String, String>>(){}.getType();  
			Map<String, String> map = new Gson().fromJson(payload, mapType);
			String baId = map.get("baId");

			log.debug("validate incomming message");
			BaIdQueryMessageReqDto msgReq = new BaIdQueryMessageReqDto(baId);		
			msgReq = ValidateParamMessage.baIdQuery(msgReq);
			
			msgDto = helper.baIdQuery(msgReq, transectionId);
			log.debug("end call service : nameQuery");
			
			//RSOU
			logDetail.getLogDetail_RSOU(transectionId, ServiceRepository.WS_BA_ID_QUERY, gson.toJson(msgDto));
			
			return Response
					.status(200)
					.entity(msgDto).build();	

		}catch (Exception e) {
			
			log.debug("end call service : nameQuery");

			return Response
					.status(401)
					.entity(msgDto).build();	
		}
	}
	
	@POST
	@Path("/ServiceIdQuery")
	@Produces(MediaType.APPLICATION_JSON)
	public Response serviceIdQuery(String payload) throws Exception {		
		log.debug("start call service : nameQuery");
		log.debug("message incomming : "+payload);

		//Gen SSID
		transectionId = DateUtil.genSSID();
		
		ServiceIdQueryMessageDto msgDto = new ServiceIdQueryMessageDto();

		//RQIN
		logDetail.getLogDetail_RQIN(transectionId, ServiceRepository.WS_SERVICE_ID_QUERY, payload);
		
		try{

			Type mapType = new TypeToken<Map<String, String>>(){}.getType();  
			Map<String, String> map = new Gson().fromJson(payload, mapType);
			String serviceId = map.get("serviceId");

			log.debug("validate incomming message");
			ServiceIdQueryMessageReqDto msgReq = new ServiceIdQueryMessageReqDto(serviceId);		
			msgReq = ValidateParamMessage.serviceIdQuery(msgReq);
			
			msgDto = helper.serviceIdQuery(msgReq, transectionId);
			log.debug("end call service : nameQuery");
			
			//RSOU
			logDetail.getLogDetail_RSOU(transectionId, ServiceRepository.WS_SERVICE_ID_QUERY, gson.toJson(msgDto));
			
			return Response
					.status(200)
					.entity(msgDto).build();	

		}catch (Exception e) {

			log.debug("end call service : nameQuery");

			return Response
					.status(401)
					.entity(msgDto).build();	
		}
	}	
	
	
}
