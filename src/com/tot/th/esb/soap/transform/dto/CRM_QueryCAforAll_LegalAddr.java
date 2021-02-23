package com.tot.th.esb.soap.transform.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 18/11/2563.
 */
@Root(name="LegalAddr",strict=false)
public class CRM_QueryCAforAll_LegalAddr {

    @Element(required=false, name="Addr_Detail")
    private String Addr_Detail;
    @Element(required=false, name="Addr_ID")
    private String Addr_ID;
    @Element(required=false, name="Addr_Code")
    private String Addr_Code;
    @Element(required=false, name="Addr_Number")
    private String Addr_Number;
    @Element(required=false, name="Addr_RoomNo")
    private String Addr_RoomNo;
    @Element(required=false, name="Addr_FloorNo")
    private String Addr_FloorNo;
    @Element(required=false, name="Addr_Village")
    private String Addr_Village;
    @Element(required=false, name="Addr_Building")
    private String Addr_Building;
    @Element(required=false, name="Addr_Moo")
    private String Addr_Moo;
    @Element(required=false, name="Addr_Soi")
    private String Addr_Soi;
    @Element(required=false, name="Addr_Road")
    private String Addr_Road;
    @Element(required=false, name="Addr_Latitude")
    private String Addr_Latitude;
    @Element(required=false, name="Addr_Longitude")
    private String Addr_Longitude;
    @Element(required=false, name="SubDistrict_Name")
    private String SubDistrict_Name;
    @Element(required=false, name="District_Name")
    private String District_Name;
    @Element(required=false, name="Province_Name")
    private String Province_Name;
    @Element(required=false, name="Addr_ZipCode")
    private String Addr_ZipCode;
    @Element(required=false, name="Country_Name")
    private String Country_Name;
    
	public String getAddr_Detail() {
		return Addr_Detail;
	}
	public void setAddr_Detail(String addr_Detail) {
		Addr_Detail = addr_Detail;
	}
	public String getAddr_ID() {
		return Addr_ID;
	}
	public void setAddr_ID(String addr_ID) {
		Addr_ID = addr_ID;
	}
	public String getAddr_Code() {
		return Addr_Code;
	}
	public void setAddr_Code(String addr_Code) {
		Addr_Code = addr_Code;
	}
	public String getAddr_Number() {
		return Addr_Number;
	}
	public void setAddr_Number(String addr_Number) {
		Addr_Number = addr_Number;
	}
	public String getAddr_RoomNo() {
		return Addr_RoomNo;
	}
	public void setAddr_RoomNo(String addr_RoomNo) {
		Addr_RoomNo = addr_RoomNo;
	}
	public String getAddr_FloorNo() {
		return Addr_FloorNo;
	}
	public void setAddr_FloorNo(String addr_FloorNo) {
		Addr_FloorNo = addr_FloorNo;
	}
	public String getAddr_Village() {
		return Addr_Village;
	}
	public void setAddr_Village(String addr_Village) {
		Addr_Village = addr_Village;
	}
	public String getAddr_Building() {
		return Addr_Building;
	}
	public void setAddr_Building(String addr_Building) {
		Addr_Building = addr_Building;
	}
	public String getAddr_Moo() {
		return Addr_Moo;
	}
	public void setAddr_Moo(String addr_Moo) {
		Addr_Moo = addr_Moo;
	}
	public String getAddr_Soi() {
		return Addr_Soi;
	}
	public void setAddr_Soi(String addr_Soi) {
		Addr_Soi = addr_Soi;
	}
	public String getAddr_Road() {
		return Addr_Road;
	}
	public void setAddr_Road(String addr_Road) {
		Addr_Road = addr_Road;
	}
	public String getAddr_Latitude() {
		return Addr_Latitude;
	}
	public void setAddr_Latitude(String addr_Latitude) {
		Addr_Latitude = addr_Latitude;
	}
	public String getAddr_Longitude() {
		return Addr_Longitude;
	}
	public void setAddr_Longitude(String addr_Longitude) {
		Addr_Longitude = addr_Longitude;
	}
	public String getSubDistrict_Name() {
		return SubDistrict_Name;
	}
	public void setSubDistrict_Name(String subDistrict_Name) {
		SubDistrict_Name = subDistrict_Name;
	}
	public String getDistrict_Name() {
		return District_Name;
	}
	public void setDistrict_Name(String district_Name) {
		District_Name = district_Name;
	}
	public String getProvince_Name() {
		return Province_Name;
	}
	public void setProvince_Name(String province_Name) {
		Province_Name = province_Name;
	}
	public String getAddr_ZipCode() {
		return Addr_ZipCode;
	}
	public void setAddr_ZipCode(String addr_ZipCode) {
		Addr_ZipCode = addr_ZipCode;
	}
	public String getCountry_Name() {
		return Country_Name;
	}
	public void setCountry_Name(String country_Name) {
		Country_Name = country_Name;
	}
    
    
}
