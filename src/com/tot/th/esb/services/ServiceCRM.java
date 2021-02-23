package com.tot.th.esb.services;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.tot.th.esb.services.dto.request.CRM_QueryByCitizenIDMessageReqDto;
import com.tot.th.esb.services.dto.request.CRM_QueryByCitizenIDReqDto;
import com.tot.th.esb.services.dto.request.CRM_QueryCAforAllMessageReqDto;
import com.tot.th.esb.services.dto.request.CRM_QueryCAforAllReqDto;
import com.tot.th.esb.services.dto.response.CRM_QueryByCitizenIDMessageDto;
import com.tot.th.esb.services.dto.response.CRM_QueryByCitizenIDResponse;
import com.tot.th.esb.services.dto.response.CRM_QueryCAforAllMessageDto;
import com.tot.th.esb.services.dto.response.CRM_QueryCAforAllResponse;
import com.tot.th.esb.services.dto.response.ContextIntegrator;
import com.tot.th.esb.services.dto.response.IntegrationResult;
import com.tot.th.esb.services.dto.response.Message;
import com.tot.th.esb.services.helper.ESBCommonServiceBean;
import com.tot.th.esb.soap.message.ServiceRepository;
import com.tot.th.esb.soap.message.ValidateParamMessage;
import com.tot.th.esb.utilities.DateUtil;
import com.tot.th.esb.utilities.LogUtil;

@Path("/proxyservice/crm")
public class ServiceCRM {
	private static Logger log = Logger.getLogger(ServiceCRM.class);	
	private static ESBCommonServiceBean helper = new ESBCommonServiceBean();
	private LogUtil logDetail = new LogUtil();
	private String transectionId = null;	
	private Gson gson = new Gson();
	
	/**
	 * update by Kritsana J. on 30/11/2563.
	 */	
	//http://10.1.71.67:8080/esbjavarest/rest/proxyservice/crm/CRM_QueryCAforAll
	@POST
	@Path("/CRM_QueryCAforAll")
	@Produces(MediaType.APPLICATION_JSON)
	public Response CRM_QueryCAforAll(String payload) throws Exception {		
		log.debug("start call service : CRM_QueryCAforAll");
		log.debug("message incomming : "+payload);
		
		//Gen SSID
		transectionId = DateUtil.genSSID();
		CRM_QueryCAforAllResponse msgRes = new CRM_QueryCAforAllResponse();
		
		ContextIntegrator con = null;
		Message msg = null;
		IntegrationResult in = null;
				
		CRM_QueryCAforAllMessageDto msgDto = new CRM_QueryCAforAllMessageDto();
		
		//RQIN
		logDetail.getLogDetail_RQIN(transectionId, ServiceRepository.WS_CRM_QUERY_CA_FOR_ALL, payload.trim());
		
		try{
			
			log.debug("validate incomming message");
			CRM_QueryCAforAllReqDto msgReq = gson.fromJson(payload, CRM_QueryCAforAllReqDto.class);
			CRM_QueryCAforAllMessageReqDto msgReqResult = msgReq.getCRM_QueryCAforAll().getBody();
			
			log.debug("validate incomming message");
			msgReqResult = ValidateParamMessage.CRM_QueryCAforAll(msgReqResult);
			
			//call service endpoint
			msgDto = helper.CRM_QueryCAforAll(msgReqResult, transectionId);				
			log.debug("end call service : CRM_QueryCAforAll");
			
			//RSOU
			logDetail.getLogDetail_RSOU(transectionId, ServiceRepository.WS_CRM_QUERY_CA_FOR_ALL, gson.toJson(msgDto));
			
			//Headers
			con = new ContextIntegrator();
			msg = new Message();
			in = new IntegrationResult();
								
			in.setResult(true);
			in.setEsbReturnCode("0000");
			in.setEsbReturnMsg("success");						
			in.setDestinationReturnCode("0000");
			in.setDestinationReturnMsg("success");
			
			msg.setIntegrationResult(in);
			con.setMessage(msg);
						
			msgRes.setContextIntegrator(con);
			msgRes.setBody(msgDto);
			
			log.debug("end call service : CRM_QueryCAforAll");
			return Response
					.status(200)
					.entity(msgRes).build();		
			
		}catch (Exception e) {
			
			//Headers
			con = new ContextIntegrator();
			msg = new Message();
			in = new IntegrationResult();
						
			in.setResult(false);
			in.setEsbReturnCode("9999");
			in.setEsbReturnMsg("ESB Service Callout action received SOAP Fault response");						
			in.setDestinationReturnCode("9999");
			in.setDestinationReturnMsg("ESB Service Callout action received SOAP Fault response");

			msg.setIntegrationResult(in);
			con.setMessage(msg);
						
			msgRes.setContextIntegrator(con);
			msgRes.setBody(msgDto);
			
			log.debug("end call service : CRM_QueryCAforAll");
			return Response
					.status(401)
					.entity(msgRes).build();	
		}				
	}
	
	//http://10.1.71.67:8080/esbjavarest/rest/proxyservice/crm/CRM_QueryByCitizenID
	@POST
	@Path("/CRM_QueryByCitizenID")
	@Produces(MediaType.APPLICATION_JSON)
	public Response CRM_QueryByCitizenID(String payload) throws Exception {
		log.debug("start call service : CRM_QueryByCitizenID");
		log.debug("message incomming : "+payload);

		//Gen SSID
		transectionId = DateUtil.genSSID();
		CRM_QueryByCitizenIDResponse msgRes = new CRM_QueryByCitizenIDResponse();

		ContextIntegrator con = null;
		Message msg = null;
		IntegrationResult in = null;

		CRM_QueryByCitizenIDMessageDto msgDto = new CRM_QueryByCitizenIDMessageDto();

		//RQIN
		logDetail.getLogDetail_RQIN(transectionId, ServiceRepository.WS_CRM_QUERY_BY_CITIZENID, payload);

		try{

			CRM_QueryByCitizenIDReqDto msgReq = gson.fromJson(payload, CRM_QueryByCitizenIDReqDto.class);
			CRM_QueryByCitizenIDMessageReqDto msgReqResult = msgReq.getCRM_QueryByCitizenID().getBody();
			 
			log.debug("validate incomming message");
			msgReqResult = ValidateParamMessage.CRM_QueryByCitizenID(msgReqResult);

			//call service endpoint
			msgDto = helper.CRM_QueryByCitizenID(msgReqResult, transectionId);				
			log.debug("end call service : CRM_QueryByCitizenID");

			//RSOU
			logDetail.getLogDetail_RSOU(transectionId, ServiceRepository.WS_CRM_QUERY_BY_CITIZENID, gson.toJson(msgDto));

			//Headers
			con = new ContextIntegrator();
			msg = new Message();
			in = new IntegrationResult();

			in.setResult(true);
			in.setEsbReturnCode("0000");
			in.setEsbReturnMsg("success");						
			in.setDestinationReturnCode("0000");
			in.setDestinationReturnMsg("success");

			msg.setIntegrationResult(in);
			con.setMessage(msg);

			msgRes.setContextIntegrator(con);
			msgRes.setBody(msgDto);

			log.debug("end call service : CRM_QueryByCitizenID");
			return Response
					.status(200)
					.entity(msgRes).build();		

		}catch (Exception e) {

			//Headers
			con = new ContextIntegrator();
			msg = new Message();
			in = new IntegrationResult();

			in.setResult(false);
			in.setEsbReturnCode("9999");
			in.setEsbReturnMsg("ESB Service Callout action received SOAP Fault response");						
			in.setDestinationReturnCode("9999");
			in.setDestinationReturnMsg("ESB Service Callout action received SOAP Fault response");

			msg.setIntegrationResult(in);
			con.setMessage(msg);

			msgRes.setContextIntegrator(con);
			msgRes.setBody(msgDto);

			log.debug("end call service : CRM_QueryByCitizenID");
			return Response
					.status(401)
					.entity(msgRes).build();	
		}						
	}
	
}
