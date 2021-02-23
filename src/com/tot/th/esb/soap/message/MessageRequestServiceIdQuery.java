package com.tot.th.esb.soap.message;

import com.tot.th.esb.services.dto.request.ServiceIdQueryMessageReqDto;

/**
 * Created by Kritsana J. on 13/09/2563.
 */
public class MessageRequestServiceIdQuery {
	
	public String msgRequestServiceIdQuery(ServiceIdQueryMessageReqDto obj) throws Exception{		
		try {			
			StringBuffer buffer = new StringBuffer();
			buffer.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");

			buffer.append("<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">");
			buffer.append("<soapenv:Header/>");
			buffer.append("<soapenv:Body>");
			buffer.append("<serviceIdQuery soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">");
			buffer.append("<val xsi:type=\"ser:serviceIdQueryRequestType\" xmlns:ser=\"http://203.113.2.34/soap/serviceIdQuery\">");
			
			buffer.append("<serviceId xsi:type=\"xsd:string\">");
			buffer.append(obj.getServiceId());
			buffer.append("</serviceId>");
			
			buffer.append("</val>");
			buffer.append("</serviceIdQuery>");
			buffer.append("</soapenv:Body>");
			buffer.append("</soapenv:Envelope>");			
			
			return buffer.toString();
			
		}catch (Exception e) {
			// TODO: handle exception
			return "";	
		}
	}
	

	
}
