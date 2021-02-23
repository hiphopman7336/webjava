package com.tot.th.esb.soap.transform.dto;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 13/09/2563.
 */
@Root(name="services",strict=false)
public class BaIdQueryServiceItems {
	@ElementList(name="item", inline=true, required=false)
	private List<BaIdQueryItem> item;

	public List<BaIdQueryItem> getItem() {
		return item;
	}

	public void setItem(List<BaIdQueryItem> item) {
		this.item = item;
	}


}
