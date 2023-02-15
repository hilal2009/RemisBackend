
package com.whi.Remis.Model;

public class Company {
	private int CompanyId;
	private String CompanyName;
	private String PhoneNumber;
	private String PostalAddress;
	private String PhysicalAddress;
	private String EmailAddress;

	public Company(int CompanyId, String CompanyName, String PhoneNumber, String PostalAddress, String PhysicalAddress, String EmailAddress) {
		this.CompanyId = CompanyId;
		this.CompanyName = CompanyName;
		this.PhoneNumber = PhoneNumber;
		this.PostalAddress = PostalAddress;
		this.PhysicalAddress = PhysicalAddress;
		this.EmailAddress = EmailAddress;
	}

	public Company() {
	}
	
	public int getCompanyId() {
		return CompanyId;
	}

	public void setCompanyId(int CompanyId) {
		this.CompanyId = CompanyId;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String CompanyName) {
		this.CompanyName = CompanyName;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}

	public String getPostalAddress() {
		return PostalAddress;
	}

	public void setPostalAddress(String PostalAddress) {
		this.PostalAddress = PostalAddress;
	}

	public String getPhysicalAddress() {
		return PhysicalAddress;
	}

	public void setPhysicalAddress(String PhysicalAddress) {
		this.PhysicalAddress = PhysicalAddress;
	}

	public String getEmailAddress() {
		return EmailAddress;
	}

	public void setEmailAddress(String EmailAddress) {
		this.EmailAddress = EmailAddress;
	}	
}
