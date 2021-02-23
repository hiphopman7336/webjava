package com.tot.th.esb.services.dto.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Kritsana J. on 2/12/2563.
 */	
@XmlRootElement
public class CRM_QueryByCitizenIDMessageDto {

	private CRM_QueryByCitizenIDResponseResult ResponseResult;
	private CRM_QueryByCitizenIDRowSet RowSet;

	public CRM_QueryByCitizenIDResponseResult getResponseResult() {
		return ResponseResult;
	}
	
	public void setResponseResult(CRM_QueryByCitizenIDResponseResult responseResult) {
		ResponseResult = responseResult;
	}
	
	public CRM_QueryByCitizenIDRowSet getRowSet() {
		return RowSet;
	}
	
	public void setRowSet(CRM_QueryByCitizenIDRowSet rowSet) {
		RowSet = rowSet;
	}

}
