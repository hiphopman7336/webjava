package com.tot.th.esb.soap.transform.dto;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
@Root(name="service_items",strict=false)
public class ServiceInquiryServiceItems {
		
	@ElementList(name="item", inline=true, required=false)
	private List<ServiceInquiryItem> item;

	public List<ServiceInquiryItem> getItem() {
		return item;
	}

	public void setItem(List<ServiceInquiryItem> item) {
		this.item = item;
	}


}
