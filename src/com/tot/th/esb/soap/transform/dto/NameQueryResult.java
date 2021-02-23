package com.tot.th.esb.soap.transform.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 13/09/2563.
 */
@Root(name="return",strict=false)
public class NameQueryResult {
	
	@Element(name="total", required=false)
	private String total;
	
	@Element(name="result", required=false)
	private NameQueryServiceItems result;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public NameQueryServiceItems getResult() {
		return result;
	}

	public void setResult(NameQueryServiceItems result) {
		this.result = result;
	}

	
}
