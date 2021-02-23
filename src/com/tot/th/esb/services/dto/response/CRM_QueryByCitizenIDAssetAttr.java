package com.tot.th.esb.services.dto.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Kritsana J. on 2/12/2563.
 */	
@XmlRootElement
public class CRM_QueryByCitizenIDAssetAttr {

	private String Product_ID;
	private String Product_Name;
	private String PricePlan_Name;
	private CRM_QueryByCitizenIDInstAddr InstAddr;
	
	public String getProduct_ID() {
		return Product_ID;
	}
	public void setProduct_ID(String product_ID) {
		Product_ID = product_ID;
	}
	public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	public String getPricePlan_Name() {
		return PricePlan_Name;
	}
	public void setPricePlan_Name(String pricePlan_Name) {
		PricePlan_Name = pricePlan_Name;
	}
	public CRM_QueryByCitizenIDInstAddr getInstAddr() {
		return InstAddr;
	}
	public void setInstAddr(CRM_QueryByCitizenIDInstAddr instAddr) {
		InstAddr = instAddr;
	}

}
