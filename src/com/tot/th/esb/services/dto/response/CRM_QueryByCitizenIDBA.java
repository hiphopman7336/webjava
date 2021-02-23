package com.tot.th.esb.services.dto.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Kritsana J. on 2/12/2563.
 */	
@XmlRootElement
public class CRM_QueryByCitizenIDBA {

	private String BA_EmailForEBill2;
	private String BA_GovCode;
	private String BA_TaxId;
	private String BA_RegistrationId;
	private String BA_CitizenId;
	private String BA_EmailForEBill;
	private String BA_HomePhone;
	private String BA_TelephoneDept;
	private String BA_Mobile;
	private String BA_ID;
	private String BA_PaymentMethod;
	private String BA_BillCycle;
	private String BA_CommOffCode;
	private String BA_CommOffName;
	private String BA_FullName;
	private String BA_Title;
	private String BA_FirstName;
	private String BA_LastName;
	private String BA_OrgTitle;
	private String BA_OrgName;
	private String BA_BillHanding;
	private String BA_Writeoff;
	private String BA_AccountStatus;

	private CRM_QueryByCitizenIDBillAddr BillAddr;
	private CRM_QueryByCitizenIDAsset Asset;

	public String getBA_EmailForEBill2() {
		return BA_EmailForEBill2;
	}
	public void setBA_EmailForEBill2(String bA_EmailForEBill2) {
		BA_EmailForEBill2 = bA_EmailForEBill2;
	}
	public String getBA_GovCode() {
		return BA_GovCode;
	}
	public void setBA_GovCode(String bA_GovCode) {
		BA_GovCode = bA_GovCode;
	}
	public String getBA_TaxId() {
		return BA_TaxId;
	}
	public void setBA_TaxId(String bA_TaxId) {
		BA_TaxId = bA_TaxId;
	}
	public String getBA_RegistrationId() {
		return BA_RegistrationId;
	}
	public void setBA_RegistrationId(String bA_RegistrationId) {
		BA_RegistrationId = bA_RegistrationId;
	}
	public String getBA_CitizenId() {
		return BA_CitizenId;
	}
	public void setBA_CitizenId(String bA_CitizenId) {
		BA_CitizenId = bA_CitizenId;
	}
	public String getBA_EmailForEBill() {
		return BA_EmailForEBill;
	}
	public void setBA_EmailForEBill(String bA_EmailForEBill) {
		BA_EmailForEBill = bA_EmailForEBill;
	}
	public String getBA_HomePhone() {
		return BA_HomePhone;
	}
	public void setBA_HomePhone(String bA_HomePhone) {
		BA_HomePhone = bA_HomePhone;
	}
	public String getBA_TelephoneDept() {
		return BA_TelephoneDept;
	}
	public void setBA_TelephoneDept(String bA_TelephoneDept) {
		BA_TelephoneDept = bA_TelephoneDept;
	}
	public String getBA_Mobile() {
		return BA_Mobile;
	}
	public void setBA_Mobile(String bA_Mobile) {
		BA_Mobile = bA_Mobile;
	}
	public String getBA_ID() {
		return BA_ID;
	}
	public void setBA_ID(String bA_ID) {
		BA_ID = bA_ID;
	}
	public String getBA_PaymentMethod() {
		return BA_PaymentMethod;
	}
	public void setBA_PaymentMethod(String bA_PaymentMethod) {
		BA_PaymentMethod = bA_PaymentMethod;
	}
	public String getBA_BillCycle() {
		return BA_BillCycle;
	}
	public void setBA_BillCycle(String bA_BillCycle) {
		BA_BillCycle = bA_BillCycle;
	}
	public String getBA_CommOffCode() {
		return BA_CommOffCode;
	}
	public void setBA_CommOffCode(String bA_CommOffCode) {
		BA_CommOffCode = bA_CommOffCode;
	}
	public String getBA_CommOffName() {
		return BA_CommOffName;
	}
	public void setBA_CommOffName(String bA_CommOffName) {
		BA_CommOffName = bA_CommOffName;
	}
	public String getBA_FullName() {
		return BA_FullName;
	}
	public void setBA_FullName(String bA_FullName) {
		BA_FullName = bA_FullName;
	}
	public String getBA_Title() {
		return BA_Title;
	}
	public void setBA_Title(String bA_Title) {
		BA_Title = bA_Title;
	}
	public String getBA_FirstName() {
		return BA_FirstName;
	}
	public void setBA_FirstName(String bA_FirstName) {
		BA_FirstName = bA_FirstName;
	}
	public String getBA_LastName() {
		return BA_LastName;
	}
	public void setBA_LastName(String bA_LastName) {
		BA_LastName = bA_LastName;
	}
	public String getBA_OrgTitle() {
		return BA_OrgTitle;
	}
	public void setBA_OrgTitle(String bA_OrgTitle) {
		BA_OrgTitle = bA_OrgTitle;
	}
	public String getBA_OrgName() {
		return BA_OrgName;
	}
	public void setBA_OrgName(String bA_OrgName) {
		BA_OrgName = bA_OrgName;
	}
	public String getBA_BillHanding() {
		return BA_BillHanding;
	}
	public void setBA_BillHanding(String bA_BillHanding) {
		BA_BillHanding = bA_BillHanding;
	}
	public String getBA_Writeoff() {
		return BA_Writeoff;
	}
	public void setBA_Writeoff(String bA_Writeoff) {
		BA_Writeoff = bA_Writeoff;
	}
	public String getBA_AccountStatus() {
		return BA_AccountStatus;
	}
	public void setBA_AccountStatus(String bA_AccountStatus) {
		BA_AccountStatus = bA_AccountStatus;
	}
	public CRM_QueryByCitizenIDBillAddr getBillAddr() {
		return BillAddr;
	}
	public void setBillAddr(CRM_QueryByCitizenIDBillAddr billAddr) {
		BillAddr = billAddr;
	}
	public CRM_QueryByCitizenIDAsset getAsset() {
		return Asset;
	}
	public void setAsset(CRM_QueryByCitizenIDAsset asset) {
		Asset = asset;
	}

}
