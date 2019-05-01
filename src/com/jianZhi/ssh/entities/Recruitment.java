package com.jianZhi.ssh.entities;

import java.util.Date;

/**
 * @author szy
 */
public class Recruitment {
	
	private Integer recruitment_id;
	private String title;
	private String city;
	private String district;
	private String address;
	private Integer salary;
	private String phone;
	private Integer beginYear;
	private Integer beginMonth;
	private Integer beginDay;
	private Integer endYear;
	private Integer endMonth;
	private Integer endDay;
	private String correspond;
	private String workKind;
	private Date date;
	private Integer recruiter;
	private String recruiterName;
	private String context;
	/**
	 * 详细描述
	 */
	private String detail;

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Recruitment() {
		
	}
	
	public Recruitment(Recruitment r) {
		this.recruitment_id = r.getRecruitment_id();
		this.title = r.getTitle();
		this.city = r.getCity();
		this.district = r.getDistrict();
		this.address = r.getAddress();
		this.salary = r.getSalary();
		this.phone = r.getPhone();
		this.beginYear = r.getBeginYear();
		this.beginMonth = r.getBeginMonth();
		this.beginDay = r.getBeginDay();
		this.endYear = r.getEndYear();
		this.endMonth = r.getBeginMonth();
		this.endDay = r.getBeginDay();
		this.correspond = r.getCorrespond();
		this.workKind = r.getWorkKind();
		this.date = r.getDate();
		this.recruiter = r.getRecruiter();
		this.recruiterName = r.getRecruiterName();
		this.context = r.getContext();
	}
	
	public Integer getBeginYear() {
		return beginYear;
	}

	public void setBeginYear(Integer beginYear) {
		this.beginYear = beginYear;
	}

	public Integer getBeginMonth() {
		return beginMonth;
	}

	public void setBeginMonth(Integer beginMonth) {
		this.beginMonth = beginMonth;
	}

	public Integer getBeginDay() {
		return beginDay;
	}

	public void setBeginDay(Integer beginDay) {
		this.beginDay = beginDay;
	}

	public Integer getEndYear() {
		return endYear;
	}

	public Integer getRecruitment_id() {
		return recruitment_id;
	}

	public void setRecruitment_id(Integer recruitment_id) {
		this.recruitment_id = recruitment_id;
	}

	public void setEndYear(Integer endYear) {
		this.endYear = endYear;
	}

	public Integer getEndMonth() {
		return endMonth;
	}

	public void setEndMonth(Integer endMonth) {
		this.endMonth = endMonth;
	}

	public Integer getEndDay() {
		return endDay;
	}

	public void setEndDay(Integer endDay) {
		this.endDay = endDay;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCorrespond() {
		return correspond;
	}

	public void setCorrespond(String correspond) {
		this.correspond = correspond;
	}

	public String getWorkKind() {
		return workKind;
	}

	public void setWorkKind(String workKind) {
		this.workKind = workKind;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Date getDate() {
		return date;
	}

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDate(Date date) {
		this.date = date;
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

    public Integer getRecruiter() {
        return recruiter;
    }

    public void setRecruiter(Integer recruiter) {
        this.recruiter = recruiter;
    }

    public String getRecruiterName() {
        return recruiterName;
    }

    public void setRecruiterName(String recruiterName) {
        this.recruiterName = recruiterName;
    }

    @Override
	public String toString() {
		return recruitment_id + "," + " Recruitment [title=" + title + ", city=" + city + ", district=" + district + ", address=" + address
				+ ", salary=" + salary + ", phone=" + phone + ", beginYear=" + beginYear + ", beginMonth=" + beginMonth
				+ ", beginDay=" + beginDay + ", endYear=" + endYear + ", endMonth=" + endMonth + ", endDay=" + endDay
				+ ", correspond=" + correspond + ", workKind=" + workKind + ", date=" + date + ", recruiter="
				+ recruiter + ", context=" + context + "]" + "\r\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((beginDay == null) ? 0 : beginDay.hashCode());
		result = prime * result + ((beginMonth == null) ? 0 : beginMonth.hashCode());
		result = prime * result + ((beginYear == null) ? 0 : beginYear.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((context == null) ? 0 : context.hashCode());
		result = prime * result + ((correspond == null) ? 0 : correspond.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((district == null) ? 0 : district.hashCode());
		result = prime * result + ((endDay == null) ? 0 : endDay.hashCode());
		result = prime * result + ((endMonth == null) ? 0 : endMonth.hashCode());
		result = prime * result + ((endYear == null) ? 0 : endYear.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((recruiter == null) ? 0 : recruiter.hashCode());
		result = prime * result + ((recruitment_id == null) ? 0 : recruitment_id.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((workKind == null) ? 0 : workKind.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recruitment other = (Recruitment) obj;
		if(this.recruitment_id == other.getRecruitment_id())
			return true;
		return false;
	}

	
}
