package com.tot.th.esb.soap.message;

import com.tot.th.esb.services.dto.request.CRM_QueryByCitizenIDMessageReqDto;

public class MessageRequestCRM_QueryByCitizenID {
	public String msgRequestCRM_QueryByCitizenID(CRM_QueryByCitizenIDMessageReqDto obj) throws Exception{		
		try {			
			StringBuffer buffer = new StringBuffer();
			buffer.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");			
			buffer.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">");
			buffer.append("<soapenv:Header/>");
			buffer.append("<soapenv:Body>");
			buffer.append("<tem:InquiryCAFor2ldb>");
			buffer.append("<tem:request>");
			         
			buffer.append("<tem:Asset_No>");
			buffer.append(obj.getAssetNo());
			buffer.append("</tem:Asset_No>");
			
			buffer.append("<tem:Asset_Status>");
			buffer.append(obj.getAsset_Status());
			buffer.append("</tem:Asset_Status>");
		
			buffer.append("<tem:BA_ID>");
			buffer.append(obj.getAccountId());
			buffer.append("</tem:BA_ID>");
	
			buffer.append("<tem:CA_ID>");
			buffer.append(obj.getCustomerId());
			buffer.append("</tem:CA_ID>");
			
			buffer.append("<tem:CA_CitizenID>");
			buffer.append(obj.getCitizenId());
			buffer.append("</tem:CA_CitizenID>");
			            
			buffer.append("</tem:request>");
			buffer.append("</tem:InquiryCAFor2ldb>");
			buffer.append("</soapenv:Body>");
			buffer.append("</soapenv:Envelope>");
			
					
			return buffer.toString();
			
		}catch (Exception e) {
			// TODO: handle exception
			return "";	
		}
	}
}
