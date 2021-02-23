package com.tot.th.esb.soap.message;

import com.tot.th.esb.services.dto.request.StatusRequestMessageReqDto;

public class MessageRequestStatusRequest {
	public String msgRequestStatusRequest(StatusRequestMessageReqDto obj) throws Exception{		
		try {			
			StringBuffer buffer = new StringBuffer();
			buffer.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
			buffer.append("<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">");
			buffer.append("<soapenv:Header/>");
			buffer.append("<soapenv:Body>");
			buffer.append("<statusRequest soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">");
			buffer.append("<request_id xsi:type=\"stat:statusRequest\" xmlns:stat=\"http://203.113.2.34/soap/statusRequest\">");
			
			buffer.append("<request_id xsi:type=\"xsd:string\">");
			buffer.append(obj.getRequest_id());
			buffer.append("</request_id>");
			
			buffer.append("</request_id>");
			buffer.append("</statusRequest>");
			buffer.append("</soapenv:Body>");
			buffer.append("</soapenv:Envelope>");
			
			return buffer.toString();
			
		}catch (Exception e) {
			// TODO: handle exception
			return "";	
		}
	}
}
