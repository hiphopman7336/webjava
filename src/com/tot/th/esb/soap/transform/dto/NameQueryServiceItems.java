package com.tot.th.esb.soap.transform.dto;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 13/09/2563.
 */
@Root(name="result",strict=false)
public class NameQueryServiceItems {
	@ElementList(name="item", inline=true, required=false)
	private List<NameQueryItem> item;

	public List<NameQueryItem> getItem() {
		return item;
	}

	public void setItem(List<NameQueryItem> item) {
		this.item = item;
	}
}
