package com.tot.th.esb.services.dto.request;

/**
 * Created by Kritsana J. on 2/12/2563.
 */	
public class CRM_QueryByCitizenIDMessageReqDto {

	
	private String assetNo;
	private String Asset_Status;
	private String accountId;
	private String citizenId;
	private String customerId;
	
	public CRM_QueryByCitizenIDMessageReqDto(){
		
	}
	
	public CRM_QueryByCitizenIDMessageReqDto(String assetNo, String asset_Status, String accountId, String citizenId,
			String customerId) {
		this.assetNo = assetNo;
		this.Asset_Status = asset_Status;
		this.accountId = accountId;
		this.citizenId = citizenId;
		this.customerId = customerId;
	}

	public String getAssetNo() {
		return assetNo;
	}
	
	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}
	
	public String getAsset_Status() {
		return Asset_Status;
	}
	
	public void setAsset_Status(String asset_Status) {
		Asset_Status = asset_Status;
	}
	
	public String getAccountId() {
		return accountId;
	}
	
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
	public String getCitizenId() {
		return citizenId;
	}
	
	public void setCitizenId(String citizenId) {
		this.citizenId = citizenId;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	



}
