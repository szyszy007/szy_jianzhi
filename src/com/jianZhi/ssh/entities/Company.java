package com.jianZhi.ssh.entities;

public class Company {
	private Integer company_id;
	private String companyName;
	private String city;
	private String district;
	private String address;
	private String status;
	
	public Company() {
	}
	
	public Company(Company c) {
		this.company_id = c.getCompany_id();
		this.companyName = c.getCompanyName();
		this.city = c.getCity();
		this.district = c.getDistrict();
		this.address = c.getAddress();
		this.status = c.getStatus();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getCompany_id() {
		return company_id;
	}

	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Company [company_id=" + company_id + ", companyName=" + companyName + ", city=" + city + ", district="
				+ district + ", address=" + address + ", status=" + status + "]";
	}

}
