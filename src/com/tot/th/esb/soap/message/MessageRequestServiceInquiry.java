package com.tot.th.esb.soap.message;

import com.tot.th.esb.services.dto.request.ServiceInquiryMessageReqDto;
import com.tot.th.esb.utilities.StringUtil;

public class MessageRequestServiceInquiry {
	
	public String msgRequestServiceInquiry_old(String customer_number) throws Exception{		
		try {
			
			StringBuffer buffer = new StringBuffer();
			buffer.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
			buffer.append("<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">"); 
			buffer.append("<soapenv:Header/>"); 
			buffer.append("<soapenv:Body>");
			buffer.append("<serviceInquiry soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">"); 
			buffer.append("<customer_number xsi:type=\"ser:serviceInquiryRequestType\" xmlns:ser=\"http://203.113.2.34/soap/serviceInquiry\">");  
			buffer.append("<customer_number xsi:type=\"xsd:string\">");
			buffer.append(customer_number);
			buffer.append("</customer_number>");  
			buffer.append("</customer_number>");  
			buffer.append("</serviceInquiry>"); 
			buffer.append("</soapenv:Body>"); 
			buffer.append("</soapenv:Envelope>"); 
			
			return buffer.toString();
			
		}catch (Exception e) {
			// TODO: handle exception
			return "";	
		}
	}
	
	
	public String msgRequestServiceInquiry(ServiceInquiryMessageReqDto obj) throws Exception{		
		try {
			
			StringBuffer buffer = new StringBuffer();
			buffer.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
			buffer.append("<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">"); 
			buffer.append("<soapenv:Header/>"); 
			buffer.append("<soapenv:Body>");
			buffer.append("<serviceInquiry soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">"); 
			buffer.append("<val xsi:type=\"ser:serviceInquiryRequestType\" xmlns:ser=\"http://203.113.2.34/soap/ServiceInquiry\">");
			
			buffer.append("<customer_number xsi:type=\"xsd:string\">");
			buffer.append(obj.getCustomer_number());
			buffer.append("</customer_number>");  
			
//			buffer.append("<service_id xsi:type=\"xsd:string\">");
//			buffer.append(service_id);
//			buffer.append("</service_id>");
//			
//			buffer.append("<billing_account_number xsi:type=\"xsd:string\">");
//			buffer.append(billing_account_number);
//			buffer.append("</billing_account_number>");	
//			
//			buffer.append("<subscriber_id xsi:type=\"xsd:string\">");
//			buffer.append(subscriber_id);
//			buffer.append("</subscriber_id>");
			
			
			if(StringUtil.isNotBlank(obj.getService_id())){
				buffer.append("<service_id xsi:type=\"xsd:string\">");
				buffer.append(obj.getService_id());
				buffer.append("</service_id>");
			}
			
			if(StringUtil.isNotBlank(obj.getBilling_account_number())){
				buffer.append("<billing_account_number xsi:type=\"xsd:string\">");
				buffer.append(obj.getBilling_account_number());
				buffer.append("</billing_account_number>");	
			}
			
			if(StringUtil.isNotBlank(obj.getSubscriber_id())){
				buffer.append("<subscriber_id xsi:type=\"xsd:string\">");
				buffer.append(obj.getSubscriber_id());
				buffer.append("</subscriber_id>");
			}
			
			buffer.append("</val>"); 
			buffer.append("</serviceInquiry>"); 
			buffer.append("</soapenv:Body>"); 
			buffer.append("</soapenv:Envelope>"); 
			
			return buffer.toString();
			
		}catch (Exception e) {
			// TODO: handle exception
			return "";	
		}
	}
	
	
}
