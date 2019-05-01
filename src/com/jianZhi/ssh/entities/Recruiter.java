package com.jianZhi.ssh.entities;


/**
 * fixme 取消City硬外键约束 修改：1.删除原Company字段2.新增company（id）字段和companyName字段
 */
public class Recruiter {
	private Integer recruiter_id;
	private String username;
	private String name;
	private String password;
	private Integer company;
	private String companyName;
	private String telphone;
	private String email;

	public Recruiter() {
		
	}

    /**
     * fixme ??? 什么TMDxx构造方法？ 其他地方有usage，暂不删除
     * @param r
     */
	public Recruiter(Recruiter r) {
		this.recruiter_id = r.getRecruiter_id();
		this.username = r.getUsername();
		this.password = r.getPassword();
		this.company = r.getCompany();
		this.companyName = r.getCompanyName();
		this.telphone = r.telphone;
		this.email = r.email;
//		this.recruitments = new HashSet<Recruitment>();
//		for(Recruitment re : r.getRecruitments()) {
//			this.recruitments.add(re);
//		}
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRecruiter_id() {
		return recruiter_id;
	}

	public void setRecruiter_id(Integer recruiter_id) {
		this.recruiter_id = recruiter_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    public Integer getCompany() {
        return company;
    }

    public void setCompany(Integer company) {
        this.company = company;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Recruiter [recruiter_id=" + recruiter_id + ", username=" + username + ", password=" + password
				+ ", company=" + company + ", telphone=" + telphone + ", email=" + email + "]";
	}

}
