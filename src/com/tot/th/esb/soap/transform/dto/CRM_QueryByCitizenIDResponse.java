package com.tot.th.esb.soap.transform.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 18/11/2563.
 */
@Root(name="InquiryCAFor2ldbResponse",strict=false)
public class CRM_QueryByCitizenIDResponse {
	
	@Element(required=false, name="InquiryCAFor2ldbResult")
	CRM_QueryByCitizenIDResult InquiryCAFor2ldbResult;

	public CRM_QueryByCitizenIDResult getInquiryCAFor2ldbResult() {
		return InquiryCAFor2ldbResult;
	}

	public void setInquiryCAFor2ldbResult(CRM_QueryByCitizenIDResult inquiryCAFor2ldbResult) {
		InquiryCAFor2ldbResult = inquiryCAFor2ldbResult;
	}

}
