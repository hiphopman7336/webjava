package com.tot.th.esb.soap.message;

import com.tot.th.esb.services.dto.request.CustomerInquiryMessageReqDto;

public class MessageRequestCustomerInquiry {
	
	public String msgRequestCustomerInquiry(CustomerInquiryMessageReqDto obj) throws Exception{		
		try {			
			StringBuffer buffer = new StringBuffer();
			buffer.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
			buffer.append("<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">");
			buffer.append("<soapenv:Header/>");
			buffer.append("<soapenv:Body>");
			buffer.append("<customerInquiry soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">");
			buffer.append("<customer_name xsi:type=\"cus:customerInquiryRequest\" xmlns:cus=\"http://203.113.2.34/soap/customerInquiry\">");
			
			buffer.append("<customer_name xsi:type=\"xsd:string\">");			
			buffer.append(obj.getCustomer_name());
			buffer.append("</customer_name>");
			
			buffer.append("</customer_name>");
			buffer.append("</customerInquiry>");
			buffer.append("</soapenv:Body>");
			buffer.append("</soapenv:Envelope>");
			
			return buffer.toString();
			
		}catch (Exception e) {
			// TODO: handle exception
			return "";	
		}
	}
	

	
}
