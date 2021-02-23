package com.tot.th.esb.soap.message;

import com.tot.th.esb.services.dto.request.BaIdQueryMessageReqDto;
import com.tot.th.esb.services.dto.request.CRM_QueryByCitizenIDMessageReqDto;
import com.tot.th.esb.services.dto.request.CRM_QueryCAforAllMessageReqDto;
import com.tot.th.esb.services.dto.request.CustomerInquiryMessageReqDto;
import com.tot.th.esb.services.dto.request.NameQueryMessageReqDto;
import com.tot.th.esb.services.dto.request.ServiceIdQueryMessageReqDto;
import com.tot.th.esb.services.dto.request.ServiceInquiryMessageReqDto;
import com.tot.th.esb.services.dto.request.ServiceRequestMessageReqDto;
import com.tot.th.esb.services.dto.request.StatusRequestMessageReqDto;
import com.tot.th.esb.utilities.StringUtil;

public class ValidateParamMessage {

	public static CustomerInquiryMessageReqDto customerInquiry(CustomerInquiryMessageReqDto req) throws Exception {
		CustomerInquiryMessageReqDto msgObj = new CustomerInquiryMessageReqDto();
		
		if(StringUtil.isNotBlank(req.getCustomer_name())){
			msgObj.setCustomer_name(req.getCustomer_name());
		
		}else{
			msgObj.setCustomer_name("");
		}
		
		return msgObj;			
	}
	
	public static ServiceInquiryMessageReqDto serviceInquiry(ServiceInquiryMessageReqDto req) throws Exception {
		ServiceInquiryMessageReqDto msgObj = new ServiceInquiryMessageReqDto();
		
		if(StringUtil.isNotBlank(req.getCustomer_number())){
			msgObj.setCustomer_number(req.getCustomer_number());
		
		}else{
			msgObj.setCustomer_number("");
		}
		
		if(StringUtil.isNotBlank(req.getBilling_account_number())){
			msgObj.setBilling_account_number(req.getBilling_account_number());
		
		}else{
			msgObj.setBilling_account_number("");
		}
		
		if(StringUtil.isNotBlank(req.getService_id())){
			msgObj.setService_id(req.getService_id());
		
		}else{
			msgObj.setService_id("");
		}
		
		if(StringUtil.isNotBlank(req.getSubscriber_id())){
			msgObj.setSubscriber_id(req.getSubscriber_id());
		
		}else{
			msgObj.setSubscriber_id("");
		}
				
		return msgObj;			
	}
	
	public static StatusRequestMessageReqDto statusRequest(StatusRequestMessageReqDto req) throws Exception {
		StatusRequestMessageReqDto msgObj = new StatusRequestMessageReqDto();
		
		if(StringUtil.isNotBlank(req.getRequest_id())){
			msgObj.setRequest_id(req.getRequest_id());
		
		}else{
			msgObj.setRequest_id("");
		}
		
		return msgObj;			
	}
	
	public static ServiceRequestMessageReqDto serviceRequest(ServiceRequestMessageReqDto req) throws Exception {
		ServiceRequestMessageReqDto msgObj = new ServiceRequestMessageReqDto();
		
		if(StringUtil.isNotBlank(req.getBilling_account())){
			msgObj.setBilling_account(req.getBilling_account());
		
		}else{
			msgObj.setBilling_account("");
		}
		
		if(StringUtil.isNotBlank(req.getBilling_address())){
			msgObj.setBilling_address(req.getBilling_address());
		
		}else{
			msgObj.setBilling_address("");
		}
		
		if(StringUtil.isNotBlank(req.getCall_number())){
			msgObj.setCall_number(req.getCall_number());
		
		}else{
			msgObj.setCall_number("");
		}
		
		if(StringUtil.isNotBlank(req.getContact_number())){
			msgObj.setContact_number(req.getContact_number());
		
		}else{
			msgObj.setContact_number("");
		}
		
		if(StringUtil.isNotBlank(req.getCustomer_name())){
			msgObj.setCustomer_name(req.getCustomer_name());
		
		}else{
			msgObj.setCustomer_name("");
		}
		
		if(StringUtil.isNotBlank(req.getInstallation_address())){
			msgObj.setInstallation_address(req.getInstallation_address());
		
		}else{
			msgObj.setInstallation_address("");
		}
		
		if(StringUtil.isNotBlank(req.getRequest_date())){
			msgObj.setRequest_date(req.getRequest_date());
		
		}else{
			msgObj.setRequest_date("");
		}
		
		if(StringUtil.isNotBlank(req.getRequest_description())){
			msgObj.setRequest_description(req.getRequest_description());
		
		}else{
			msgObj.setRequest_description("");
		}
		
		if(StringUtil.isNotBlank(req.getRequest_tracking_type())){
			msgObj.setRequest_tracking_type(req.getRequest_tracking_type());
		
		}else{
			msgObj.setRequest_tracking_type("");
		}
		
		if(StringUtil.isNotBlank(req.getService_id())){
			msgObj.setService_id(req.getService_id());
		
		}else{
			msgObj.setService_id("");
		}
		
		if(StringUtil.isNotBlank(req.getService_type())){
			msgObj.setService_type(req.getService_type());
		
		}else{
			msgObj.setService_type("");
		}
		
		if(StringUtil.isNotBlank(req.getSubscriber_id())){
			msgObj.setSubscriber_id(req.getSubscriber_id());
		
		}else{
			msgObj.setSubscriber_id("");
		}
		
		if(StringUtil.isNotBlank(req.getTot_task_id())){
			msgObj.setTot_task_id(req.getTot_task_id());
		
		}else{
			msgObj.setTot_task_id("");
		}
		
		return msgObj;			
	}
	
	/**
	* Add by Kritsana J. on 13/09/2563.
	 */	
		public static NameQueryMessageReqDto nameQuery(NameQueryMessageReqDto req) throws Exception {
			NameQueryMessageReqDto msgObj = new NameQueryMessageReqDto();
			
			if(StringUtil.isNotBlank(req.getName())){
				msgObj.setName(req.getName());
			
			}else{
				msgObj.setName("");
			}
			
			return msgObj;			
		}
		
		public static BaIdQueryMessageReqDto baIdQuery(BaIdQueryMessageReqDto req) throws Exception {
			BaIdQueryMessageReqDto msgObj = new BaIdQueryMessageReqDto();
			
			if(StringUtil.isNotBlank(req.getBaId())){
				msgObj.setBaId(req.getBaId());
			
			}else{
				msgObj.setBaId("");
			}
			
			return msgObj;			
		}
		
		public static ServiceIdQueryMessageReqDto serviceIdQuery(ServiceIdQueryMessageReqDto req) throws Exception {
			ServiceIdQueryMessageReqDto msgObj = new ServiceIdQueryMessageReqDto();
			
			if(StringUtil.isNotBlank(req.getServiceId())){
				msgObj.setServiceId(req.getServiceId());
			
			}else{
				msgObj.setServiceId("");
			}
			
			return msgObj;			
		}	
		
		public static CRM_QueryCAforAllMessageReqDto CRM_QueryCAforAll(CRM_QueryCAforAllMessageReqDto req) throws Exception {
			CRM_QueryCAforAllMessageReqDto msgObj = new CRM_QueryCAforAllMessageReqDto();

			if(StringUtil.isNotBlank(req.getCitizenId())){
				msgObj.setCitizenId(req.getCitizenId());

			}else{
				msgObj.setCitizenId("");
			}

			if(StringUtil.isNotBlank(req.getRegistrationID())){
				msgObj.setRegistrationID(req.getRegistrationID());

			}else{
				msgObj.setRegistrationID("");
			}

			if(StringUtil.isNotBlank(req.getPassportNo())){
				msgObj.setPassportNo(req.getPassportNo());

			}else{
				msgObj.setPassportNo("");
			}

			if(StringUtil.isNotBlank(req.getCA_TaxID())){
				msgObj.setCA_TaxID(req.getCA_TaxID());

			}else{
				msgObj.setCA_TaxID("");
			}

			if(StringUtil.isNotBlank(req.getAssetNo())){
				msgObj.setAssetNo(req.getAssetNo());

			}else{
				msgObj.setAssetNo("");
			}

			if(StringUtil.isNotBlank(req.getBA_ID())){
				msgObj.setBA_ID(req.getBA_ID());

			}else{
				msgObj.setBA_ID("");
			}

			if(StringUtil.isNotBlank(req.getCA_ID())){
				msgObj.setCA_ID(req.getCA_ID());

			}else{
				msgObj.setCA_ID("");
			}

			if(StringUtil.isNotBlank(req.getCA_all())){
				msgObj.setCA_all(req.getCA_all());

			}else{
				msgObj.setCA_all("");
			}

			if(StringUtil.isNotBlank(req.getBA_allStatus())){
				msgObj.setBA_allStatus(req.getBA_allStatus());

			}else{
				msgObj.setBA_allStatus("");
			}

			if(StringUtil.isNotBlank(req.getAsset_allStatus())){
				msgObj.setAsset_allStatus(req.getAsset_allStatus());

			}else{
				msgObj.setAsset_allStatus("");
			}

			if(StringUtil.isNotBlank(req.getBA_Asset_All())){
				msgObj.setBA_Asset_All(req.getBA_Asset_All());

			}else{
				msgObj.setBA_Asset_All("");
			}

			return msgObj;			
		}
		
		
		public static CRM_QueryByCitizenIDMessageReqDto CRM_QueryByCitizenID(CRM_QueryByCitizenIDMessageReqDto req) throws Exception {
			CRM_QueryByCitizenIDMessageReqDto msgObj = new CRM_QueryByCitizenIDMessageReqDto();
						
			if(StringUtil.isNotBlank(req.getAssetNo())){
				msgObj.setAssetNo(req.getAssetNo());
			
			}else{
				msgObj.setAssetNo("");
			}
			
			if(StringUtil.isNotBlank(req.getAsset_Status())){
				msgObj.setAsset_Status(req.getAsset_Status());
			
			}else{
				msgObj.setAsset_Status("");
			}
			
			if(StringUtil.isNotBlank(req.getAccountId())){
				msgObj.setAccountId(req.getAccountId());
			
			}else{
				msgObj.setAccountId("");
			}
			
			if(StringUtil.isNotBlank(req.getCitizenId())){
				msgObj.setCitizenId(req.getCitizenId());
			
			}else{
				msgObj.setCitizenId("");
			}
			
			if(StringUtil.isNotBlank(req.getCustomerId())){
				msgObj.setCustomerId(req.getCustomerId());
			
			}else{
				msgObj.setCustomerId("");
			}
			
			return msgObj;			
		}	
		
}
