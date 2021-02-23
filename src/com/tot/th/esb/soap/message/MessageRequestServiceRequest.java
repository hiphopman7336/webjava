package com.tot.th.esb.soap.message;

import com.tot.th.esb.services.dto.request.ServiceRequestMessageReqDto;

public class MessageRequestServiceRequest {
	public String msgRequestServiceRequest(ServiceRequestMessageReqDto obj) throws Exception{	
		
		try {			
			StringBuffer buffer = new StringBuffer();
			buffer.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
			buffer.append("<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">");
			buffer.append("<soapenv:Header/>");
			buffer.append("<soapenv:Body>");
			buffer.append("<serviceRequest soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">");
			buffer.append("<val xsi:type=\"ser:serviceRequest\" xmlns:ser=\"http://203.113.2.34/soap/serviceRequest\">");
			
			buffer.append("<tot_task_id xsi:type=\"xsd:string\">");
			buffer.append(obj.getTot_task_id());
			buffer.append("</tot_task_id>");
			
			buffer.append("<call_number xsi:type=\"xsd:string\">");
			buffer.append(obj.getCall_number());
			buffer.append("</call_number>");
			
			buffer.append("<contact_number xsi:type=\"xsd:string\">");
			buffer.append(obj.getContact_number());
			buffer.append("</contact_number>");
			
			buffer.append("<service_id xsi:type=\"xsd:string\">");
			buffer.append(obj.getService_id());
			buffer.append("</service_id>");
			
			buffer.append("<service_type xsi:type=\"xsd:string\">");
			buffer.append(obj.getService_type());
			buffer.append("</service_type>");
			
			buffer.append("<customer_name xsi:type=\"xsd:string\">");
			buffer.append(obj.getCustomer_name());
			buffer.append("</customer_name>");
			
			buffer.append("<billing_account xsi:type=\"xsd:string\">");
			buffer.append(obj.getBilling_account());
			buffer.append("</billing_account>");
			
			buffer.append("<request_description xsi:type=\"xsd:string\">");
			buffer.append(obj.getRequest_description());
			buffer.append("</request_description>");
			
			buffer.append("<request_date xsi:type=\"xsd:string\">");
			buffer.append(obj.getRequest_date());
			buffer.append("</request_date>");
			
			buffer.append("<subscriber_id xsi:type=\"xsd:string\">");
			buffer.append(obj.getSubscriber_id());
			buffer.append("</subscriber_id>");
			
			buffer.append("<request_tracking_type xsi:type=\"xsd:string\">");
			buffer.append(obj.getRequest_tracking_type());
			buffer.append("</request_tracking_type>");
			
			buffer.append("<billing_address xsi:type=\"xsd:string\">");
			buffer.append(obj.getBilling_address());
			buffer.append("</billing_address>");
			
			buffer.append("<installation_address xsi:type=\"xsd:string\">");
			buffer.append(obj.getInstallation_address());
			buffer.append("</installation_address>");
			
			buffer.append("</val>");
			buffer.append("</serviceRequest>");
			buffer.append("</soapenv:Body>");
			buffer.append("</soapenv:Envelope>");
			
			return buffer.toString();
			
		}catch (Exception e) {
			// TODO: handle exception
			return "";	
		}
	}
}
