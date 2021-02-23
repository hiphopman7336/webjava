package com.tot.th.esb.soap.message;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import com.tot.th.esb.soap.transform.dto.BaIdQueryResponse;
import com.tot.th.esb.soap.transform.dto.CRM_QueryByCitizenIDResponse;
import com.tot.th.esb.soap.transform.dto.CRM_QueryCAforAllResponse;
import com.tot.th.esb.soap.transform.dto.CustomerInquiryResponse;
import com.tot.th.esb.soap.transform.dto.NameQueryResponse;
import com.tot.th.esb.soap.transform.dto.ServiceIdQueryResponse;
import com.tot.th.esb.soap.transform.dto.ServiceInquiryResponse;
import com.tot.th.esb.soap.transform.dto.ServiceRequestResponse;
import com.tot.th.esb.soap.transform.dto.StatusRequestResponse;

public class ParserSoapRawData {

	public static String getSoapBody(String rcvSoapMessage){
		String rtnSoapBody = null;
		StringBuffer stringBuffer = new StringBuffer();	
		if(rcvSoapMessage != null) {
			if (rcvSoapMessage.indexOf("<Body>") > 0) {
				rtnSoapBody = rcvSoapMessage.substring(rcvSoapMessage.indexOf("<Body>")+6,rcvSoapMessage.indexOf("</Body>"));		

			}else if (rcvSoapMessage.indexOf("<soapenv:Body>") > 0) {
				rtnSoapBody = rcvSoapMessage.substring(rcvSoapMessage.indexOf("<soapenv:Body>")+14,rcvSoapMessage.indexOf("</soapenv:Body>"));

			}else if (rcvSoapMessage.indexOf("<soap:Body>") > 0){
				rtnSoapBody = rcvSoapMessage.substring(rcvSoapMessage.indexOf("<soap:Body>")+11,rcvSoapMessage.indexOf("</soap:Body>"));

			}else if (rcvSoapMessage.indexOf("<SOAP-ENV:Body>") > 0){
				rtnSoapBody = rcvSoapMessage.substring(rcvSoapMessage.indexOf("<SOAP-ENV:Body>")+15,rcvSoapMessage.indexOf("</SOAP-ENV:Body>"));			

			}else {

			}
			stringBuffer.append(rtnSoapBody);
		}
		return stringBuffer.toString();
	}
	
	public static CustomerInquiryResponse convertSoapMsgToCustomerInquiryDto(String rcvSoapMessage) {
		try{
			String strSoapBody = getSoapBody(rcvSoapMessage);
			strSoapBody = strSoapBody.replaceAll("xsi:nil", "xsi_nil");
			strSoapBody = strSoapBody.replaceAll("&", "&amp;");
			strSoapBody = strSoapBody.replaceAll("ns1:", "");
			strSoapBody = strSoapBody.replaceAll("xsi:type", "xsi_type");
			strSoapBody = strSoapBody.replaceAll("SOAP-ENC:Array", "SOAP_ENC:Array");
			strSoapBody = strSoapBody.replaceAll("SOAP-ENC:arrayType", "SOAP_ENC_arrayType");

			Serializer serializer = new Persister();
			CustomerInquiryResponse customerInquiryResponse = serializer.read(CustomerInquiryResponse.class, strSoapBody);
			return customerInquiryResponse;
		
		}catch (Exception e) {
			// TODO: handle exception
			CustomerInquiryResponse customerInquiryResponse = null;
			return customerInquiryResponse;
		}
	}
	
	public static ServiceInquiryResponse convertSoapMsgToServiceInquiryDto(String rcvSoapMessage){
		try{
			String strSoapBody = getSoapBody(rcvSoapMessage);
			strSoapBody = strSoapBody.replaceAll("xsi:nil", "xsi_nil");
			strSoapBody = strSoapBody.replaceAll("&", "&amp;");
			strSoapBody = strSoapBody.replaceAll("ns1:", "");
			strSoapBody = strSoapBody.replaceAll("xsi:type", "xsi_type");
			strSoapBody = strSoapBody.replaceAll("SOAP-ENC:Array", "SOAP_ENC:Array");
			strSoapBody = strSoapBody.replaceAll("SOAP-ENC:arrayType", "SOAP_ENC_arrayType");
			
			Serializer serializer = new Persister();
			ServiceInquiryResponse serviceInquiryResponse = serializer.read(ServiceInquiryResponse.class, strSoapBody);
		
			return serviceInquiryResponse;
		}catch (Exception e) {
			// TODO: handle exception
			ServiceInquiryResponse serviceInquiryResponse = null;
			return serviceInquiryResponse;
		}
		
	}
	
	public static ServiceRequestResponse convertSoapMsgToServiceRequestDto(String rcvSoapMessage) throws Exception {
		String strSoapBody = getSoapBody(rcvSoapMessage);
		strSoapBody = strSoapBody.replaceAll("xsi:nil", "xsi_nil");
		strSoapBody = strSoapBody.replaceAll("&", "&amp;");
		strSoapBody = strSoapBody.replaceAll("ns1:", "");
		strSoapBody = strSoapBody.replaceAll("xsi:type", "xsi_type");
		strSoapBody = strSoapBody.replaceAll("SOAP-ENC:Array", "SOAP_ENC:Array");
		strSoapBody = strSoapBody.replaceAll("SOAP-ENC:arrayType", "SOAP_ENC_arrayType");
		
		Serializer serializer = new Persister();
		ServiceRequestResponse serviceRequestResponse = serializer.read(ServiceRequestResponse.class, strSoapBody);
	
		
		return serviceRequestResponse;
	}
	
	public static StatusRequestResponse convertSoapMsgToStatusRequestDto(String rcvSoapMessage) throws Exception {
		String strSoapBody = getSoapBody(rcvSoapMessage);
		strSoapBody = strSoapBody.replaceAll("xsi:nil", "xsi_nil");
		strSoapBody = strSoapBody.replaceAll("&", "&amp;");
		strSoapBody = strSoapBody.replaceAll("ns1:", "");
		strSoapBody = strSoapBody.replaceAll("xsi:type", "xsi_type");
		strSoapBody = strSoapBody.replaceAll("SOAP-ENC:Array", "SOAP_ENC:Array");
		strSoapBody = strSoapBody.replaceAll("SOAP-ENC:arrayType", "SOAP_ENC_arrayType");
		
		Serializer serializer = new Persister();
		StatusRequestResponse statusRequestResponse = serializer.read(StatusRequestResponse.class, strSoapBody);
	
		
		return statusRequestResponse;
	}
	
	public static NameQueryResponse convertSoapMsgToNameQueryDto(String rcvSoapMessage) {
		try{
			String strSoapBody = getSoapBody(rcvSoapMessage);
			strSoapBody = strSoapBody.replaceAll("xsi:nil", "xsi_nil");
			strSoapBody = strSoapBody.replaceAll("&", "&amp;");
			strSoapBody = strSoapBody.replaceAll("ns1:", "");
			strSoapBody = strSoapBody.replaceAll("xsi:type", "xsi_type");
			strSoapBody = strSoapBody.replaceAll("SOAP-ENC:Array", "SOAP_ENC:Array");
			strSoapBody = strSoapBody.replaceAll("SOAP-ENC:arrayType", "SOAP_ENC_arrayType");

			Serializer serializer = new Persister();
			NameQueryResponse nameQueryResponse = serializer.read(NameQueryResponse.class, strSoapBody);
			return nameQueryResponse;
		
		}catch (Exception e) {
			// TODO: handle exception
			NameQueryResponse nameQueryResponse = null;
			return nameQueryResponse;
		}
	}
	
	public static BaIdQueryResponse convertSoapMsgToBaIdQueryDto(String rcvSoapMessage) {
		try{
			String strSoapBody = getSoapBody(rcvSoapMessage);
			strSoapBody = strSoapBody.replaceAll("xsi:nil", "xsi_nil");
			strSoapBody = strSoapBody.replaceAll("&", "&amp;");
			strSoapBody = strSoapBody.replaceAll("ns1:", "");
			strSoapBody = strSoapBody.replaceAll("xsi:type", "xsi_type");
			strSoapBody = strSoapBody.replaceAll("SOAP-ENC:Array", "SOAP_ENC:Array");
			strSoapBody = strSoapBody.replaceAll("SOAP-ENC:arrayType", "SOAP_ENC_arrayType");

			Serializer serializer = new Persister();
			BaIdQueryResponse baIdQueryResponse = serializer.read(BaIdQueryResponse.class, strSoapBody);
			return baIdQueryResponse;
		
		}catch (Exception e) {
			// TODO: handle exception
			BaIdQueryResponse baIdQueryResponse = null;
			return baIdQueryResponse;
		}
	}
	
	public static ServiceIdQueryResponse convertSoapMsgToServiceIdQueryDto(String rcvSoapMessage) {
		try{
			String strSoapBody = getSoapBody(rcvSoapMessage);
			strSoapBody = strSoapBody.replaceAll("xsi:nil", "xsi_nil");
			strSoapBody = strSoapBody.replaceAll("&", "&amp;");
			strSoapBody = strSoapBody.replaceAll("ns1:", "");
			strSoapBody = strSoapBody.replaceAll("xsi:type", "xsi_type");
			strSoapBody = strSoapBody.replaceAll("SOAP-ENC:Array", "SOAP_ENC:Array");
			strSoapBody = strSoapBody.replaceAll("SOAP-ENC:arrayType", "SOAP_ENC_arrayType");

			Serializer serializer = new Persister();
			ServiceIdQueryResponse serviceIdQueryResponse = serializer.read(ServiceIdQueryResponse.class, strSoapBody);
			return serviceIdQueryResponse;
		
		}catch (Exception e) {
			// TODO: handle exception
			ServiceIdQueryResponse serviceIdQueryResponse = null;
			return serviceIdQueryResponse;
		}
	}
	
	public static CRM_QueryCAforAllResponse convertSoapMsgToCRM_QueryCAforAllDto(String rcvSoapMessage) throws Exception {
		String strSoapBody = getSoapBody(rcvSoapMessage);
		strSoapBody = strSoapBody.replaceAll("xsi:nil", "xsi_nil");
		strSoapBody = strSoapBody.replaceAll("&", "&amp;");
		strSoapBody = strSoapBody.replaceAll("ns1:", "");
		strSoapBody = strSoapBody.replaceAll("xsi:type", "xsi_type");
		strSoapBody = strSoapBody.replaceAll("SOAP-ENC:Array", "SOAP_ENC:Array");
		strSoapBody = strSoapBody.replaceAll("SOAP-ENC:arrayType", "SOAP_ENC_arrayType");
		
		Serializer serializer = new Persister();
		CRM_QueryCAforAllResponse crm_QueryCAforAllResponse = serializer.read(CRM_QueryCAforAllResponse.class, strSoapBody);
	
		
		return crm_QueryCAforAllResponse;
	}
	
	public static CRM_QueryByCitizenIDResponse convertSoapMsgToCRM_QueryByCitizenIDDto(String rcvSoapMessage) throws Exception {
		String strSoapBody = getSoapBody(rcvSoapMessage);
		strSoapBody = strSoapBody.replaceAll("xsi:nil", "xsi_nil");
		strSoapBody = strSoapBody.replaceAll("&", "&amp;");
		strSoapBody = strSoapBody.replaceAll("ns1:", "");
		strSoapBody = strSoapBody.replaceAll("xsi:type", "xsi_type");
		strSoapBody = strSoapBody.replaceAll("SOAP-ENC:Array", "SOAP_ENC:Array");
		strSoapBody = strSoapBody.replaceAll("SOAP-ENC:arrayType", "SOAP_ENC_arrayType");
		
		Serializer serializer = new Persister();
		CRM_QueryByCitizenIDResponse crm_QueryCAforAllResponse = serializer.read(CRM_QueryByCitizenIDResponse.class, strSoapBody);
	
		
		return crm_QueryCAforAllResponse;
	}
	
	
}
