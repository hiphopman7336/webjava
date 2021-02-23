package com.tot.th.esb.soap.transform.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 13/09/2563.
 */
@Root(name="nameQueryResponse",strict=false)
public class NameQueryResponse {
	@Element(required=false, name="return")
	private NameQueryResult nameQueryResult;

	public NameQueryResult getNameQueryResult() {
		return nameQueryResult;
	}

	public void setNameQueryResult(NameQueryResult nameQueryResult) {
		this.nameQueryResult = nameQueryResult;
	}

}
