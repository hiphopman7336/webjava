package com.tot.th.esb.services.helper;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.tot.th.esb.services.dto.request.BaIdQueryMessageReqDto;
import com.tot.th.esb.services.dto.request.CRM_QueryByCitizenIDMessageReqDto;
import com.tot.th.esb.services.dto.request.CRM_QueryCAforAllMessageReqDto;
import com.tot.th.esb.services.dto.request.CustomerInquiryMessageReqDto;
import com.tot.th.esb.services.dto.request.NameQueryMessageReqDto;
import com.tot.th.esb.services.dto.request.ServiceIdQueryMessageReqDto;
import com.tot.th.esb.services.dto.request.ServiceInquiryMessageReqDto;
import com.tot.th.esb.services.dto.request.ServiceRequestMessageReqDto;
import com.tot.th.esb.services.dto.request.StatusRequestMessageReqDto;
import com.tot.th.esb.services.dto.response.BaIdQueryItem;
import com.tot.th.esb.services.dto.response.BaIdQueryMessageDto;
import com.tot.th.esb.services.dto.response.CRM_QueryByCitizenIDMessageDto;
import com.tot.th.esb.services.dto.response.CRM_QueryByCitizenIDResponseResult;
import com.tot.th.esb.services.dto.response.CRM_QueryByCitizenIDRowSet;
import com.tot.th.esb.services.dto.response.CRM_QueryCAforAllAsset;
import com.tot.th.esb.services.dto.response.CRM_QueryCAforAllAssetAttr;
import com.tot.th.esb.services.dto.response.CRM_QueryCAforAllBA;
import com.tot.th.esb.services.dto.response.CRM_QueryCAforAllBillAddr;
import com.tot.th.esb.services.dto.response.CRM_QueryCAforAllCA;
import com.tot.th.esb.services.dto.response.CRM_QueryCAforAllInstAddr;
import com.tot.th.esb.services.dto.response.CRM_QueryCAforAllLegalAddr;
import com.tot.th.esb.services.dto.response.CRM_QueryCAforAllMessageDto;
import com.tot.th.esb.services.dto.response.CRM_QueryCAforAllResponseResult;
import com.tot.th.esb.services.dto.response.CustomerInquiryItem;
import com.tot.th.esb.services.dto.response.CustomerInquiryMessageDto;
import com.tot.th.esb.services.dto.response.NameQueryItem;
import com.tot.th.esb.services.dto.response.NameQueryMessageDto;
import com.tot.th.esb.services.dto.response.ServiceIdQueryMessageDto;
import com.tot.th.esb.services.dto.response.ServiceInquiryItem;
import com.tot.th.esb.services.dto.response.ServiceInquiryMessageDto;
import com.tot.th.esb.services.dto.response.ServiceRequestMessageDto;
import com.tot.th.esb.services.dto.response.StatusRequestMessageDto;
import com.tot.th.esb.soap.message.MessageRequestBaIdQuery;
import com.tot.th.esb.soap.message.MessageRequestCRM_QueryByCitizenID;
import com.tot.th.esb.soap.message.MessageRequestCustomerInquiry;
import com.tot.th.esb.soap.message.MessageRequestInquiryCRM;
import com.tot.th.esb.soap.message.MessageRequestNameQuery;
import com.tot.th.esb.soap.message.MessageRequestServiceIdQuery;
import com.tot.th.esb.soap.message.MessageRequestServiceInquiry;
import com.tot.th.esb.soap.message.MessageRequestServiceRequest;
import com.tot.th.esb.soap.message.MessageRequestStatusRequest;
import com.tot.th.esb.soap.message.ParserSoapRawData;
import com.tot.th.esb.soap.message.ServiceRepository;
import com.tot.th.esb.soap.transform.dto.BaIdQueryResult;
import com.tot.th.esb.soap.transform.dto.CRM_QueryCAforAllResponse;
import com.tot.th.esb.soap.transform.dto.CRM_QueryCAforAllResult;
import com.tot.th.esb.soap.transform.dto.CRM_QueryCAforAll_Asset;
import com.tot.th.esb.soap.transform.dto.CRM_QueryCAforAll_AssetAttr;
import com.tot.th.esb.soap.transform.dto.CRM_QueryCAforAll_BA;
import com.tot.th.esb.soap.transform.dto.CRM_QueryCAforAll_BillAddr;
import com.tot.th.esb.soap.transform.dto.CRM_QueryCAforAll_CA;
import com.tot.th.esb.soap.transform.dto.CRM_QueryCAforAll_InstAddr;
import com.tot.th.esb.soap.transform.dto.CRM_QueryCAforAll_LegalAddr;
import com.tot.th.esb.soap.transform.dto.CRM_QueryCAforAll_ResponseResult;
import com.tot.th.esb.soap.transform.dto.CustomerInquiryResult;
import com.tot.th.esb.soap.transform.dto.NameQueryResult;
import com.tot.th.esb.soap.transform.dto.ServiceIdQueryResult;
import com.tot.th.esb.soap.transform.dto.ServiceInquiryResult;
import com.tot.th.esb.soap.transform.dto.ServiceRequestResult;
import com.tot.th.esb.soap.transform.dto.StatusRequestResult;
import com.tot.th.esb.utilities.ConfigPropUtil;
import com.tot.th.esb.utilities.HttpConnectionUtil;
import com.tot.th.esb.utilities.LogUtil;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
public class ESBCommonServiceBean {
	private static Logger log = Logger.getLogger(ESBCommonServiceBean.class);
	private LogUtil logDetail = new LogUtil();
	private Gson gson = new Gson();
	
	public CustomerInquiryMessageDto customerInquiry(CustomerInquiryMessageReqDto msgReq, String transectionId) {
		CustomerInquiryMessageDto resp = new CustomerInquiryMessageDto();
		
		log.debug("start service helper : CustomerInquiry");
		
		try{

			MessageRequestCustomerInquiry msg = new MessageRequestCustomerInquiry();
			
			String URL = "";
			String msgResponse = "";
			int timeout = 0;


			URL = ConfigPropUtil.getConfig("endpoint.service.customerInquiry");
			timeout = Integer.parseInt(ConfigPropUtil.getConfig("timeout.service.customerInquiry"));
			String req = msg.msgRequestCustomerInquiry(msgReq);
			
			//RQOU
			logDetail.getLogDetail_RQOU(transectionId, ServiceRepository.WS_CUSTOMER_INQUIRY, req);
			
			msgResponse = HttpConnectionUtil.executePost(URL, req, timeout);

			try{
				//Parser Message
				com.tot.th.esb.soap.transform.dto.CustomerInquiryResponse customerInquiryDto = ParserSoapRawData.convertSoapMsgToCustomerInquiryDto(msgResponse);			
				CustomerInquiryResult customerInquiryResult = customerInquiryDto.getCustomerInquiryResult();

				//RSIN
				logDetail.getLogDetail_RSIN(transectionId, ServiceRepository.WS_CUSTOMER_INQUIRY, gson.toJson(customerInquiryDto));
				
				resp.setResponse_code(customerInquiryResult.getResponse_code());
				resp.setResponse_message(customerInquiryResult.getResponse_message());
				resp.setCdb_transaction_id(customerInquiryResult.getCdb_transaction_id());
				resp.setResponse_date(customerInquiryResult.getResponse_date());
				resp.setTotal_item(customerInquiryResult.getTotal_item());

				if(null != customerInquiryResult.getService_items()){
					
					CustomerInquiryItem[] products = new CustomerInquiryItem[customerInquiryResult.getService_items().getItem().size()];
					int i = 0;
					CustomerInquiryItem item_dto;
					for (com.tot.th.esb.soap.transform.dto.CustomerInquiryItem p : customerInquiryResult.getService_items().getItem()) {
						item_dto = new CustomerInquiryItem();

						item_dto.setCustomer_name(p.getCustomer_name());
						item_dto.setCustomer_number(p.getCustomer_number());
						item_dto.setRegistered_id(p.getRegistered_id());
						item_dto.setBirth_date(p.getBirth_date());

						products[i] = item_dto;
						i++;
					}

					resp.setItem(products);
				}
								

			}catch (Exception e) {
				log.error("Exception service : CustomerInquiry");
				log.debug("end service helper : CustomerInquiry");
				return resp;	
			}

			log.debug("end service helper : CustomerInquiry");

			return resp;	

		}catch (Exception e) {
			log.error("Exception service : CustomerInquiry");
			log.debug("end service helper : CustomerInquiry");
			return resp;
		}	
	}


	public ServiceInquiryMessageDto serviceInquiry(ServiceInquiryMessageReqDto msgReq, String transectionId) {
		
		ServiceInquiryMessageDto resp = new ServiceInquiryMessageDto();

		log.debug("start service helper : ServiceInquiry");

		try{

			MessageRequestServiceInquiry msg = new MessageRequestServiceInquiry();
			
			String URL = "";
			String msgResponse = "";
			int timeout = 0;

			URL = ConfigPropUtil.getConfig("endpoint.service.serviceInquiry.soap.php");
			timeout = Integer.parseInt(ConfigPropUtil.getConfig("timeout.service.serviceInquiry"));
			String req_v2 = msg.msgRequestServiceInquiry(msgReq);
			
			//RQOU
			logDetail.getLogDetail_RQOU(transectionId, ServiceRepository.WS_SERVICE_INQUIRY, req_v2);
			
			msgResponse = HttpConnectionUtil.executePost(URL, req_v2, timeout);	

			try{
				//Parser Message
				com.tot.th.esb.soap.transform.dto.ServiceInquiryResponse serviceInquiryDto = ParserSoapRawData.convertSoapMsgToServiceInquiryDto(msgResponse);			
				ServiceInquiryResult serviceInquiryResult = serviceInquiryDto.getServiceInquiryResult();

				//RSIN
				logDetail.getLogDetail_RSIN(transectionId, ServiceRepository.WS_SERVICE_INQUIRY, gson.toJson(serviceInquiryDto));
				
				resp.setResponse_code(serviceInquiryResult.getResponse_code());
				resp.setResponse_message(serviceInquiryResult.getResponse_message());
				resp.setCdb_transaction_id(serviceInquiryResult.getCdb_transaction_id());
				resp.setResponse_date(serviceInquiryResult.getResponse_date());
				resp.setTotal_item(serviceInquiryResult.getTotal_item());

				if(null != serviceInquiryResult.getService_items()){
					
					ServiceInquiryItem[] products = new ServiceInquiryItem[serviceInquiryResult.getService_items().getItem().size()];
					int i = 0;
					ServiceInquiryItem item_dto;
					for (com.tot.th.esb.soap.transform.dto.ServiceInquiryItem p : serviceInquiryResult.getService_items().getItem()) {
						item_dto = new ServiceInquiryItem();

						item_dto.setBilling_account_number(p.getBilling_account_number());
						item_dto.setCustomer_name(p.getCustomer_name());
						item_dto.setCustomer_number(p.getCustomer_number());
						item_dto.setService_id(p.getService_id());
						item_dto.setService_type(p.getService_type());
						item_dto.setStatus(p.getStatus());
						item_dto.setSubscriber_id(p.getSubscriber_id());
						item_dto.setBilling_address(p.getBilling_address());
						item_dto.setInstallation_address(p.getInstallation_address());

						products[i] = item_dto;
						i++;
					}

					resp.setItem(products);
					
				}else {
					return resp;
					
				}
				

			}catch (Exception e) {
				log.error("Exception service : ServiceInquiry");
				log.debug("end service helper : ServiceInquiry");
				return resp;		
			}

			log.debug("end service helper : ServiceInquiry");

			return resp;	

		}catch (Exception e) {
			log.error("Exception service : ServiceInquiry");
			log.debug("end service helper : ServiceInquiry");
			return resp;
		}	
	}


	public StatusRequestMessageDto statusRequest(StatusRequestMessageReqDto msgReq, String transectionId) {
		StatusRequestMessageDto resp = new StatusRequestMessageDto();

		log.debug("start service helper : StatusRequest");
		
		try{

			MessageRequestStatusRequest msg = new MessageRequestStatusRequest();
			
			String URL = "";
			String msgResponse = "";
			int timeout = 0;

			URL = ConfigPropUtil.getConfig("endpoint.service.statusRequest");
			timeout = Integer.parseInt(ConfigPropUtil.getConfig("timeout.service.statusRequest"));
			String req = msg.msgRequestStatusRequest(msgReq);
			
			//RQOU
			logDetail.getLogDetail_RQOU(transectionId, ServiceRepository.WS_STATUS_REQUEST, req);
			
			msgResponse = HttpConnectionUtil.executePost(URL, req, timeout);

			try{			
				//Parser Message
				com.tot.th.esb.soap.transform.dto.StatusRequestResponse serviceRequestDto = ParserSoapRawData.convertSoapMsgToStatusRequestDto(msgResponse);			
				StatusRequestResult statusRequestResult = serviceRequestDto.getStatusRequestResult();

				//RSIN
				logDetail.getLogDetail_RSIN(transectionId, ServiceRepository.WS_STATUS_REQUEST, gson.toJson(serviceRequestDto));
				
				resp.setCdb_transaction_id(statusRequestResult.getCdb_transaction_id());
				resp.setClose_date(statusRequestResult.getClose_date());
				resp.setRequest_id(statusRequestResult.getRequest_id());
				resp.setResponse_date(statusRequestResult.getResponse_date());
				resp.setResponse_message(statusRequestResult.getResponse_message());
				resp.setStatus(statusRequestResult.getResponse_message());

			}catch (Exception e) {
				log.error("Exception service : StatusRequest");
				log.debug("end service helper : StatusRequest");
				return resp;	
			}

			log.debug("end service helper : StatusRequest");

			return resp;	

		}catch (Exception e) {
			log.error("Exception service : StatusRequest");
			log.debug("end service helper : StatusRequest");
			return resp;
		}	
	}


	public ServiceRequestMessageDto serviceRequest(ServiceRequestMessageReqDto msgReq, String transectionId) {

		ServiceRequestMessageDto resp = new ServiceRequestMessageDto();

		log.debug("start service helper : ServiceRequest");

		try{

			MessageRequestServiceRequest msg = new MessageRequestServiceRequest();
			
			String URL = "";
			String msgResponse = "";
			int timeout = 0;

			URL = ConfigPropUtil.getConfig("endpoint.service.serviceRequest");
			timeout = Integer.parseInt(ConfigPropUtil.getConfig("timeout.service.serviceRequest"));
			String req = msg.msgRequestServiceRequest(msgReq);
			
			//RQOU
			logDetail.getLogDetail_RQOU(transectionId, ServiceRepository.WS_SERVICE_REQUEST, req);
			
			msgResponse = HttpConnectionUtil.executePost(URL, req, timeout);

			try{
				//Parser Message
				com.tot.th.esb.soap.transform.dto.ServiceRequestResponse serviceRequestDto = ParserSoapRawData.convertSoapMsgToServiceRequestDto(msgResponse);			
				ServiceRequestResult serviceInquiryResult = serviceRequestDto.getServiceRequestResult();

				//RSIN
				logDetail.getLogDetail_RSIN(transectionId, ServiceRepository.WS_SERVICE_REQUEST, gson.toJson(serviceRequestDto));
				
				resp.setCdb_transaction_id(serviceInquiryResult.getCdb_transaction_id());
				resp.setResponse_cat_task_id(serviceInquiryResult.getResponse_cat_task_id());
				resp.setResponse_code(serviceInquiryResult.getResponse_code());
				resp.setResponse_date(serviceInquiryResult.getResponse_date());
				resp.setResponse_message(serviceInquiryResult.getResponse_message());
				resp.setResponse_success_flag(serviceInquiryResult.getResponse_success_flag());

			}catch (Exception e) {
				log.error("Exception service : ServiceRequest");
				log.debug("end service helper : ServiceRequest");
				return resp;	
			}		

			log.debug("end service helper : ServiceRequest");

			return resp;

		}catch (Exception e) {
			log.error("Exception service : ServiceRequest");
			log.debug("end service helper : ServiceRequest");
			return resp;
		}		
	}

	
/**
* Created by Kritsana J. on 13/09/2563.
*/		
	public NameQueryMessageDto nameQuery(NameQueryMessageReqDto msgReq, String transectionId) {
		NameQueryMessageDto resp = new NameQueryMessageDto();
		
		log.debug("start service helper : NameQuery");
		
		try{

			MessageRequestNameQuery msg = new MessageRequestNameQuery();
			
			String URL = "";
			String msgResponse = "";
			int timeout = 0;


			URL = ConfigPropUtil.getConfig("endpoint.service.nameQuery");
			timeout = Integer.parseInt(ConfigPropUtil.getConfig("timeout.service.nameQuery"));
			String req = msg.msgRequestNameQuery(msgReq);
			
			//RQOU
			logDetail.getLogDetail_RQOU(transectionId, ServiceRepository.WS_NAME_QUERY, req);
			
			msgResponse = HttpConnectionUtil.executePost(URL, req, timeout);

			try{
				//Parser Message
				com.tot.th.esb.soap.transform.dto.NameQueryResponse nameQueryDto = ParserSoapRawData.convertSoapMsgToNameQueryDto(msgResponse);			
				NameQueryResult nameQueryResult = nameQueryDto.getNameQueryResult();
				//nameQueryResult.getResult().getItem();

				//RSIN
				logDetail.getLogDetail_RSIN(transectionId, ServiceRepository.WS_NAME_QUERY, gson.toJson(nameQueryDto));
				
				resp.setTotal(nameQueryResult.getTotal());

				if(null != nameQueryResult.getResult()){
					if(null != nameQueryResult.getResult().getItem()){
						
						NameQueryItem[] products = new NameQueryItem[nameQueryResult.getResult().getItem().size()];
						int i = 0;
						NameQueryItem item_dto;
						for (com.tot.th.esb.soap.transform.dto.NameQueryItem p :nameQueryResult.getResult().getItem()) {
							item_dto = new NameQueryItem();

							item_dto.setBaId(p.getBaId());
							item_dto.setCustomerName(p.getCustomerName());
							item_dto.setPersonalId(p.getPersonalId());
							item_dto.setVatRegistrationCode(p.getVatRegistrationCode());

							products[i] = item_dto;
							i++;
						}

						resp.setResult(products);
					}
				}

			}catch (Exception e) {
				log.error("Exception service : NameQuery");
				log.debug("end service helper : NameQuery");
				return resp;
			}

			log.debug("end service helper : NameQuery");

			return resp;	

		}catch (Exception e) {
			log.error("Exception service : NameQuery");
			log.debug("end service helper : NameQuery");
			return resp;
		}
			
	}
	
	
	public BaIdQueryMessageDto baIdQuery(BaIdQueryMessageReqDto msgReq, String transectionId) {
		BaIdQueryMessageDto resp = new BaIdQueryMessageDto();
		
		log.debug("start service helper : BaIdQuery");
		
		try{

			MessageRequestBaIdQuery msg = new MessageRequestBaIdQuery();
			
			String URL = "";
			String msgResponse = "";
			int timeout = 0;


			URL = ConfigPropUtil.getConfig("endpoint.service.baIdQuery");
			timeout = Integer.parseInt(ConfigPropUtil.getConfig("timeout.service.baIdQuery"));
			String req = msg.msgRequestBaIdQuery(msgReq);
			
			//RQOU
			logDetail.getLogDetail_RQOU(transectionId, ServiceRepository.WS_BA_ID_QUERY, req);
			
			msgResponse = HttpConnectionUtil.executePost(URL, req, timeout);

			try{
				//Parser Message
				com.tot.th.esb.soap.transform.dto.BaIdQueryResponse baIdQueryDto = ParserSoapRawData.convertSoapMsgToBaIdQueryDto(msgResponse);			
				BaIdQueryResult baIdQueryResult = baIdQueryDto.getBaIdQueryResult();
				//baIdQueryResult.getServices().getResult();

				//RSIN
				logDetail.getLogDetail_RSIN(transectionId, ServiceRepository.WS_BA_ID_QUERY, gson.toJson(baIdQueryDto));
				
				resp.setBaId(baIdQueryResult.getBaId());
				resp.setBillingAddress(baIdQueryResult.getBillingAddress());
				resp.setBillingName(baIdQueryResult.getBillingName());
				resp.setInstalllationAddress(baIdQueryResult.getInstalllationAddress());
				resp.setResponse_date(baIdQueryResult.getResponse_date());
				
				if(null != baIdQueryResult.getServices()){
					if(null != baIdQueryResult.getServices().getItem()){
						
						BaIdQueryItem[] products = new BaIdQueryItem[baIdQueryResult.getServices().getItem().size()];
						int i = 0;
						BaIdQueryItem item_dto;
						for (com.tot.th.esb.soap.transform.dto.BaIdQueryItem p :baIdQueryResult.getServices().getItem()) {
							item_dto = new BaIdQueryItem();
							
							item_dto.setServiceId(p.getServiceId());
							item_dto.setStartDate(p.getStartDate());
							item_dto.setEndDate(p.getEndDate());

							products[i] = item_dto;
							i++;
						}

						resp.setServices(products);
					}
				}
				
			}catch (Exception e) {
				log.error("Exception service : BaIdQuery");
				log.debug("end service helper : BaIdQuery");
				return resp;
			}

			log.debug("end service helper : BaIdQuery");

			return resp;	

		}catch (Exception e) {
			log.error("Exception service : BaIdQuery");
			log.debug("end service helper : BaIdQuery");
			return resp;
		}
			
	}
	
	
	public ServiceIdQueryMessageDto serviceIdQuery(ServiceIdQueryMessageReqDto msgReq, String transectionId) {
		ServiceIdQueryMessageDto resp = new ServiceIdQueryMessageDto();

		log.debug("start service helper : ServiceIdQuery");

		try{

			MessageRequestServiceIdQuery msg = new MessageRequestServiceIdQuery();
			
			String URL = "";
			String msgResponse = "";
			int timeout = 0;

			URL = ConfigPropUtil.getConfig("endpoint.service.serviceIdQuery");
			timeout = Integer.parseInt(ConfigPropUtil.getConfig("timeout.service.serviceIdQuery"));
			String req = msg.msgRequestServiceIdQuery(msgReq);
			
			//RQOU
			logDetail.getLogDetail_RQOU(transectionId, ServiceRepository.WS_SERVICE_ID_QUERY, req);
			
			msgResponse = HttpConnectionUtil.executePost(URL, req, timeout);

			try{
				//Parser Message
				com.tot.th.esb.soap.transform.dto.ServiceIdQueryResponse serviceIdQueryDto = ParserSoapRawData.convertSoapMsgToServiceIdQueryDto(msgResponse);			
				ServiceIdQueryResult serviceIdQueryResult = serviceIdQueryDto.getServiceIdQueryResult();

				//RSIN
				logDetail.getLogDetail_RSIN(transectionId, ServiceRepository.WS_SERVICE_ID_QUERY, gson.toJson(serviceIdQueryDto));
				
				resp.setBaId(serviceIdQueryResult.getBaId());
				resp.setBillingAddress(serviceIdQueryResult.getBillingAddress());
				resp.setBillingName(serviceIdQueryResult.getBillingName());
				resp.setInstalllationAddress(serviceIdQueryResult.getInstalllationAddress());
				resp.setResponse_date(serviceIdQueryResult.getResponse_date());
				resp.setServiceId(serviceIdQueryResult.getServiceId());			

			}catch (Exception e) {
				log.error("Exception service : ServiceIdQuery");
				log.debug("end service helper : ServiceIdQuery");

				return resp;	
			}		

			log.debug("end service helper : ServiceIdQuery");

			return resp;

		}catch (Exception e) {
			log.error("Exception service : ServiceIdQuery");
			log.debug("end service helper : ServiceIdQuery");
			return resp;
		}		
	}
	
	
	public CRM_QueryCAforAllMessageDto CRM_QueryCAforAll(CRM_QueryCAforAllMessageReqDto msgReq, String transectionId) {
		CRM_QueryCAforAllMessageDto resp = new CRM_QueryCAforAllMessageDto();

		log.debug("start service helper : CRM_QueryCAforAll");
		
		try{

			MessageRequestInquiryCRM msg = new MessageRequestInquiryCRM();
			
			String URL = "";
			String msgResponse = "";
			int timeout = 0;

			URL = ConfigPropUtil.getConfig("endpoint.service.crm_querycaforall");
			timeout = Integer.parseInt(ConfigPropUtil.getConfig("timeout.service.crm_querycaforall"));
			String req = msg.msgRequestCRM_QueryCAforAll(msgReq);
			
			//RQOU
			logDetail.getLogDetail_RQOU(transectionId, ServiceRepository.WS_CRM_QUERY_CA_FOR_ALL, req);
			
			msgResponse = HttpConnectionUtil.executePost(URL, req, timeout);

			try{			
				//Parser Message
				CRM_QueryCAforAllResponse crm_QueryCAforAllResponse = ParserSoapRawData.convertSoapMsgToCRM_QueryCAforAllDto(msgResponse);			
				CRM_QueryCAforAllResult crm_QueryCAforAllResult = crm_QueryCAforAllResponse.getInquiryCRMResult();
				
				//RSIN
				logDetail.getLogDetail_RSIN(transectionId, ServiceRepository.WS_CRM_QUERY_CA_FOR_ALL, gson.toJson(crm_QueryCAforAllResponse)); 
				
				CRM_QueryCAforAll_ResponseResult responseResult = crm_QueryCAforAllResult.getResponseResult();
				
				// ResponseResult
				CRM_QueryCAforAllResponseResult responseResult_Dto = new CRM_QueryCAforAllResponseResult();
				responseResult_Dto.setResponseCode(responseResult.getResponseCode());
				responseResult_Dto.setResponseDatetime(responseResult.getResponseDateTime());
				responseResult_Dto.setResponseDesc(responseResult.getResponseDesc());
				responseResult_Dto.setResponseOk(responseResult.getResponseOK());
				
				resp.setResponseResult(responseResult_Dto); 
				
				if("SUCCESS".equals(responseResult.getResponseDesc())){
					CRM_QueryCAforAll_CA ca = crm_QueryCAforAllResult.getCA();
					
					CRM_QueryCAforAll_LegalAddr legalAddr = ca.getLegalAddr();
					CRM_QueryCAforAll_BA ba = ca.getBA();
					
					CRM_QueryCAforAll_BillAddr billAddr = ba.getBillAddr();				
					CRM_QueryCAforAll_Asset asset =  ba.getAsset();
					CRM_QueryCAforAll_AssetAttr assetAttr = asset.getAssetAttr();
					CRM_QueryCAforAll_InstAddr instAddr = assetAttr.getInstAddr();
				
					// CA
					CRM_QueryCAforAllCA CA = new CRM_QueryCAforAllCA();
					CA.setCustomerId(ca.getCA_ID());
					CA.setTitle(ca.getContact_Title());
					CA.setFname(ca.getContact_Firstname());
					CA.setLname(ca.getContact_Lastname());
					CA.setCA_Status(ca.getCA_Status());
					CA.setCA_Blacklist(ca.getCA_Blacklist());
					CA.setCustomerTypeCode(ca.getCusType_Code());
					CA.setCustomerTypeName(ca.getCusType_Name());
					CA.setCustomerSubTypeCode(ca.getCusSubType_Code());
					CA.setCustomerSubTypeName(ca.getCusSubType_Name());
					CA.setCustomerClass(ca.getCA_CustomerClass());
					CA.setCompanyTitle(ca.getAccount_Title());
					CA.setCompanyName(ca.getAccount_CompanyName());
					CA.setCompanyBranch(ca.getAccount_Branch());
					CA.setGovernmentCode(ca.getAccount_GOVCode());
					CA.setCreatedDateTime(ca.getCA_CreatedDateTime());
					CA.setEmailAddress(ca.getCA_Email());
					CA.setPassportNo(ca.getCA_PassportNo());
					CA.setRegistrationId(ca.getCA_RegistrationID());
					CA.setCitizenId(ca.getCA_CitizenID());
					//CA.setCA_TaxID( );
					CA.setRootCustomerId(ca.getCA_RootID());
					CA.setParentCustomerId(ca.getCA_ParentID());
					CA.setCA_MobileNo1(ca.getCA_MobileNo1());
					CA.setCA_MobileNo2(ca.getCA_MobileNo2());
					CA.setTelephoneNo(ca.getCA_PhoneNo());
					CA.setTelephoneExtensionNo(ca.getCA_PhoneExtNo());
					CA.setFaxNo(ca.getCA_FaxNo());
									
					// LegalAddr
					CRM_QueryCAforAllLegalAddr LegalAddr = new CRM_QueryCAforAllLegalAddr(); 
					LegalAddr.setAddr_ID(legalAddr.getAddr_ID());
					LegalAddr.setCode(legalAddr.getAddr_Code());
					LegalAddr.setNo(legalAddr.getAddr_Number());
					LegalAddr.setRoomNo(legalAddr.getAddr_RoomNo());
					LegalAddr.setFloorNo(legalAddr.getAddr_FloorNo());
					LegalAddr.setVillageName(legalAddr.getAddr_Village());
					LegalAddr.setBuildingName(legalAddr.getAddr_Building());
					LegalAddr.setMoo(legalAddr.getAddr_Moo());
					LegalAddr.setSoi(legalAddr.getAddr_Soi());
					LegalAddr.setRoad(legalAddr.getAddr_Road());
					LegalAddr.setSubDistrictName(legalAddr.getSubDistrict_Name());
					LegalAddr.setDistrictName(legalAddr.getDistrict_Name());
					LegalAddr.setProvinceName(legalAddr.getProvince_Name());
					LegalAddr.setZipcode(legalAddr.getAddr_ZipCode());
					LegalAddr.setCountryName(legalAddr.getCountry_Name());
					
					CA.setLegalAddr(LegalAddr);
					
					// BA
					CRM_QueryCAforAllBA BA = new CRM_QueryCAforAllBA();								
					BA.setAccountId(ba.getBA_ID());
					BA.setBA_AccountStatus(ba.getBA_AccountStatus());
					BA.setBA_Writeoff(ba.getBA_Writeoff());
					BA.setPaymentMethodId(ba.getBA_PaymentMethod());
					BA.setBillCycle(ba.getBA_BillCycle());
					BA.setBA_CommOffCode(ba.getBA_CommOffCode());
					BA.setBA_CommOffName(ba.getBA_CommOffName());
					BA.setBA_Title(ba.getBA_Title());
					BA.setBA_FirstName(ba.getBA_FirstName());
					BA.setBA_LastName(ba.getBA_LastName());
					BA.setBA_ContactType(ba.getBA_ContactType());
					BA.setBA_OrgName(ba.getBA_OrgName());
					BA.setBA_BillHanding(ba.getBA_BillHanding());

					CA.setBA(BA);
					
					// BillAddr
					CRM_QueryCAforAllBillAddr billAddr_dto = new CRM_QueryCAforAllBillAddr();
					billAddr_dto.setBillAddr_Detail(billAddr.getBillAddr_Detail());
					billAddr_dto.setBillAddr_Code(billAddr.getBillAddr_Code());
					billAddr_dto.setBillAddr_ID(billAddr.getBillAddr_ID());
					billAddr_dto.setBillAddr_Number(billAddr.getBillAddr_Number());
					billAddr_dto.setBillAddr_RoomNo(billAddr.getBillAddr_RoomNo());
					billAddr_dto.setBillAddr_FloorNo(billAddr.getBillAddr_FloorNo());
					billAddr_dto.setBillAddr_Village(billAddr.getBillAddr_Village());
					billAddr_dto.setBillAddr_Building(billAddr.getBillAddr_Building());
					billAddr_dto.setBillAddr_Moo(billAddr.getBillAddr_Moo());
					billAddr_dto.setBillAddr_Soi(billAddr.getBillAddr_Soi());
					billAddr_dto.setBillAddr_Road(billAddr.getBillAddr_Road());
					billAddr_dto.setBillAddr_SubDistrict_Name(billAddr.getBillAddr_SubDistrict_Name());
					billAddr_dto.setBillAddr_District_Name(billAddr.getBillAddr_District_Name());
					billAddr_dto.setBillAddr_Province_Name(billAddr.getBillAddr_Province_Name());
					billAddr_dto.setBillAddr_Addr_ZipCode(billAddr.getBillAddr_Addr_ZipCode());
					billAddr_dto.setBillAddr_Country_Name(billAddr.getBillAddr_Country_Name());
					
					BA.setBillAddr(billAddr_dto);
					
					// Asset
					CRM_QueryCAforAllAsset asset_dto = new CRM_QueryCAforAllAsset();
					// AssetAttr
					CRM_QueryCAforAllAssetAttr assetAttr_dto = new CRM_QueryCAforAllAssetAttr();
					// InstAddr
					CRM_QueryCAforAllInstAddr instAddr_dto = new CRM_QueryCAforAllInstAddr();
					
					instAddr_dto.setInstAddr_Detail(instAddr.getInstAddr_Detail());
					instAddr_dto.setInstAddr_Number(instAddr.getInstAddr_Number());
					instAddr_dto.setInstAddr_RoomNo(instAddr.getInstAddr_RoomNo());
					instAddr_dto.setInstAddr_FloorNo(instAddr.getInstAddr_FloorNo());
					instAddr_dto.setInstAddr_Village(instAddr.getInstAddr_Village());
					instAddr_dto.setInstAddr_Building(instAddr.getInstAddr_Building());
					instAddr_dto.setInstAddr_Moo(instAddr.getInstAddr_Moo());
					instAddr_dto.setInstAddr_Soi(instAddr.getInstAddr_Soi());
					instAddr_dto.setInstAddr_Road(instAddr.getInstAddr_Road());
					instAddr_dto.setInstAddr_SubDistrict_Name(instAddr.getInstAddr_SubDistrict_Name());
					instAddr_dto.setInstAddr_District_Name(instAddr.getInstAddr_District_Name());
					instAddr_dto.setInstAddr_Province_Name(instAddr.getInstAddr_Province_Name());
					instAddr_dto.setInstAddr_Addr_ZipCode(instAddr.getInstAddr_Addr_ZipCode());
					instAddr_dto.setInstAddr_Country_Name(instAddr.getInstAddr_Country_Name());
					
					assetAttr_dto.setInstAddr(instAddr_dto);		
					assetAttr_dto.setProduct_Name(assetAttr.getProduct_Name());
					assetAttr_dto.setServiceLocation_Name(assetAttr.getServiceLocation_Name());
					assetAttr_dto.setServiceLocation_ID(assetAttr.getServiceLocation_ID());
					
					asset_dto.setAssetAttr(assetAttr_dto);
					asset_dto.setAssetNo(asset.getAsset_No());
					asset_dto.setProductTypeName(asset.getProductType_Name());
					asset_dto.setAsset_Status(asset.getAsset_Status());
					asset_dto.setAsset_StartDate(asset.getAsset_StartDate());
					asset_dto.setAsset_EndDate(asset.getAsset_EndDate());								
					asset_dto.setPackageCode(asset.getPackageCode());
					asset_dto.setPackageName(asset.getPackageName());
					asset_dto.setPackageDesc(asset.getPackageDesc());
					asset_dto.setPackagePrice(asset.getPackagePrice());
					asset_dto.setPackageStartDate(asset.getPackageStartDate());
					asset_dto.setPackageEndDate(asset.getPackageEndDate());
					asset_dto.setSuspend_Date(asset.getSuspend_Date());
					asset_dto.setEndSuspend_Date(asset.getEndSuspend_Date()); 
					asset_dto.setResume_Date(asset.getResume_Date()); 
									
					//asset_dto.setCPE_Brand();
					//asset_dto.setCPE_Model();
					//asset_dto.setCPE_IMEI();
					//asset_dto.setCPE_Serialno();
									
					BA.setAsset(asset_dto);
					
													
					// add CRM_QueryCAforAllMessageDto					
					resp.setCA(CA);
				}
				
				
			}catch (Exception e) {
				log.error("Exception service : CRM_QueryCAforAll");
				log.debug("end service helper : CRM_QueryCAforAll");
				return resp;	
			}

			log.debug("end service helper : CRM_QueryCAforAll");

			return resp;	

		}catch (Exception e) {
			log.error("Exception service : CRM_QueryCAforAll");
			log.debug("end service helper : CRM_QueryCAforAll");
			return resp;
		}	
	}
	
	
	public CRM_QueryByCitizenIDMessageDto CRM_QueryByCitizenID(CRM_QueryByCitizenIDMessageReqDto msgReq, String transectionId) {
		CRM_QueryByCitizenIDMessageDto resp = new CRM_QueryByCitizenIDMessageDto();

		log.debug("start service helper : CRM_QueryByCitizenID");

		try{

			MessageRequestCRM_QueryByCitizenID msg = new MessageRequestCRM_QueryByCitizenID();
			
			String URL = "";
			String msgResponse = "";
			int timeout = 0;

			URL = ConfigPropUtil.getConfig("endpoint.service.crm_querybycitizenid");
			timeout = Integer.parseInt(ConfigPropUtil.getConfig("timeout.service.crm_querybycitizenid"));
			String req = msg.msgRequestCRM_QueryByCitizenID(msgReq);
			
			//RQOU
			logDetail.getLogDetail_RQOU(transectionId, ServiceRepository.WS_CRM_QUERY_BY_CITIZENID, req);
			
			msgResponse = HttpConnectionUtil.executePost(URL, req, timeout);

			try{
				//Parser Message
				com.tot.th.esb.soap.transform.dto.CRM_QueryByCitizenIDResponse crm_QueryByCitizenIDDto = ParserSoapRawData.convertSoapMsgToCRM_QueryByCitizenIDDto(msgResponse);			

				//RSIN
				logDetail.getLogDetail_RSIN(transectionId, ServiceRepository.WS_CRM_QUERY_BY_CITIZENID, gson.toJson(crm_QueryByCitizenIDDto));
				
				com.tot.th.esb.soap.transform.dto.CRM_QueryByCitizenIDResult result = crm_QueryByCitizenIDDto.getInquiryCAFor2ldbResult();
				com.tot.th.esb.soap.transform.dto.CRM_QueryByCitizenIDResponseResult resResult = result.getResponseResult();			
				com.tot.th.esb.soap.transform.dto.CRM_QueryByCitizenIDRowSet rowSet = result.getRowSet();

				//Obj to JsonString
				String jsonRowSet = gson.toJson(rowSet);
				String jsonResResult = gson.toJson(resResult);
				
				//JsonString to Obj Response
				CRM_QueryByCitizenIDRowSet objRowSet = gson.fromJson(jsonRowSet, CRM_QueryByCitizenIDRowSet.class);
				CRM_QueryByCitizenIDResponseResult objResResult = gson.fromJson(jsonResResult, CRM_QueryByCitizenIDResponseResult.class);
				
				resp.setResponseResult(objResResult);
				resp.setRowSet(objRowSet);

			}catch (Exception e) {
				log.error("Exception service : CRM_QueryByCitizenID");
				log.debug("end service helper : CRM_QueryByCitizenID");

				return resp;	
			}		

			log.debug("end service helper : CRM_QueryByCitizenID");

			return resp;

		}catch (Exception e) {
			log.error("Exception service : CRM_QueryByCitizenID");
			log.debug("end service helper : CRM_QueryByCitizenID");
			return resp;
		}		
	}
	
	
}

