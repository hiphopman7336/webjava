package com.tot.th.esb.soap.transform.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 18/11/2563.
 */
@Root(name="InquiryCAFor2ldbResult",strict=false)
public class CRM_QueryByCitizenIDResult {
	
	@Element(required=false, name="ResponseResult")
	private CRM_QueryByCitizenIDResponseResult  responseResult;
	
	@Element(required=false, name="RowSet")
	private CRM_QueryByCitizenIDRowSet RowSet;

	public CRM_QueryByCitizenIDResponseResult getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(CRM_QueryByCitizenIDResponseResult responseResult) {
		this.responseResult = responseResult;
	}

	public CRM_QueryByCitizenIDRowSet getRowSet() {
		return RowSet;
	}

	public void setRowSet(CRM_QueryByCitizenIDRowSet rowSet) {
		RowSet = rowSet;
	}
	

}
