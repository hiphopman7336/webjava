package com.tot.th.esb.soap.transform.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 13/09/2563.
 */
@Root(name="baIdQueryResponse",strict=false)
public class BaIdQueryResponse {
	@Element(required=false, name="return")
	private BaIdQueryResult baIdQueryResult;

	public BaIdQueryResult getBaIdQueryResult() {
		return baIdQueryResult;
	}

	public void setBaIdQueryResult(BaIdQueryResult baIdQueryResult) {
		this.baIdQueryResult = baIdQueryResult;
	}

}
