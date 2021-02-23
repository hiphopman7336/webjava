package com.tot.th.esb.soap.transform.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 18/11/2563.
 */
@Root(name="Asset",strict=false)
public class CRM_QueryByCitizenIDAsset {
	
	@Element(required=false, name="Asset_No")
	private String Asset_No;
	@Element(required=false, name="ProductType_Name")
	private String ProductType_Name;
	@Element(required=false, name="Asset_Status")
	private String Asset_Status;
	@Element(required=false, name="Asset_EndDate")
	private String Asset_EndDate;
	@Element(required=false, name="PackageCode")
	private String PackageCode;
	@Element(required=false, name="PackageName")
	private String PackageName;
	@Element(required=false, name="PackageDesc")
	private String PackageDesc;
	@Element(required=false, name="PackageStartDate")
	private String PackageStartDate;
	@Element(required=false, name="PackageEndDate")
	private String PackageEndDate;
	@Element(required=false, name="SLA_Hr")
	private String SLA_Hr;
	@Element(required=false, name="Project_Code")
	private String Project_Code;
	@Element(required=false, name="Project_Name")
	private String Project_Name;
	@Element(required=false, name="Project_Penalty_Hr")
	private String Project_Penalty_Hr;
	@Element(required=false, name="Project_Csoc")
	private String Project_Csoc;
	
	@Element(required=false, name="AssetAttr")
	private CRM_QueryByCitizenIDAssetAttr AssetAttr;

	public String getAsset_No() {
		return Asset_No;
	}

	public void setAsset_No(String asset_No) {
		Asset_No = asset_No;
	}

	public String getProductType_Name() {
		return ProductType_Name;
	}

	public void setProductType_Name(String productType_Name) {
		ProductType_Name = productType_Name;
	}

	public String getAsset_Status() {
		return Asset_Status;
	}

	public void setAsset_Status(String asset_Status) {
		Asset_Status = asset_Status;
	}

	public String getAsset_EndDate() {
		return Asset_EndDate;
	}

	public void setAsset_EndDate(String asset_EndDate) {
		Asset_EndDate = asset_EndDate;
	}

	public String getPackageCode() {
		return PackageCode;
	}

	public void setPackageCode(String packageCode) {
		PackageCode = packageCode;
	}

	public String getPackageName() {
		return PackageName;
	}

	public void setPackageName(String packageName) {
		PackageName = packageName;
	}

	public String getPackageDesc() {
		return PackageDesc;
	}

	public void setPackageDesc(String packageDesc) {
		PackageDesc = packageDesc;
	}

	public String getPackageStartDate() {
		return PackageStartDate;
	}

	public void setPackageStartDate(String packageStartDate) {
		PackageStartDate = packageStartDate;
	}

	public String getPackageEndDate() {
		return PackageEndDate;
	}

	public void setPackageEndDate(String packageEndDate) {
		PackageEndDate = packageEndDate;
	}

	public String getSLA_Hr() {
		return SLA_Hr;
	}

	public void setSLA_Hr(String sLA_Hr) {
		SLA_Hr = sLA_Hr;
	}

	public String getProject_Code() {
		return Project_Code;
	}

	public void setProject_Code(String project_Code) {
		Project_Code = project_Code;
	}

	public String getProject_Name() {
		return Project_Name;
	}

	public void setProject_Name(String project_Name) {
		Project_Name = project_Name;
	}

	public String getProject_Penalty_Hr() {
		return Project_Penalty_Hr;
	}

	public void setProject_Penalty_Hr(String project_Penalty_Hr) {
		Project_Penalty_Hr = project_Penalty_Hr;
	}

	public String getProject_Csoc() {
		return Project_Csoc;
	}

	public void setProject_Csoc(String project_Csoc) {
		Project_Csoc = project_Csoc;
	}

	public CRM_QueryByCitizenIDAssetAttr getAssetAttr() {
		return AssetAttr;
	}

	public void setAssetAttr(CRM_QueryByCitizenIDAssetAttr assetAttr) {
		AssetAttr = assetAttr;
	}


}
