package com.tot.th.esb.soap.transform.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 18/11/2563.
 */
@Root(name="AssetAttr",strict=false)
public class CRM_QueryByCitizenIDAssetAttr {
	
	@Element(required=false, name="Product_ID")
	private String Product_ID;
	@Element(required=false, name="Product_Name")
	private String Product_Name;
	@Element(required=false, name="PricePlan_Name")
	private String PricePlan_Name;
	
	@Element(required=false, name="InstAddr")
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
