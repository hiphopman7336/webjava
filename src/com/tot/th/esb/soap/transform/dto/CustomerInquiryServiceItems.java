package com.tot.th.esb.soap.transform.dto;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
@Root(name="items",strict=false)
public class CustomerInquiryServiceItems {
	@ElementList(name="item", inline=true, required=false)
	private List<CustomerInquiryItem> item;

	public List<CustomerInquiryItem> getItem() {
		return item;
	}

	public void setItem(List<CustomerInquiryItem> item) {
		this.item = item;
	}
	
}
