package com.jianZhi.ssh.entities;

public class Student {

	private Long student_id;
	private String username;
	private String name;
	private String password;
	private Integer school;
	private String schoolName;
	private String telphone;
	private String email;
	
	public Student() {
		
	}
	
	public Student(Student s) {
		this.student_id = s.getStudent_id();
		this.username = s.getUsername();
		this.password = s.getPassword();
		this.school = s.getSchool();
		this.schoolName = s.getSchoolName();
		this.telphone = s.getTelphone();
		this.email = s.getEmail();
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
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

    public Integer getSchool() {
        return school;
    }

    public void setSchool(Integer school) {
        this.school = school;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
	public String toString() {
		return "Student [student_id=" + student_id + ", username=" + username + ", password=" + password + ", school="
				+ school + ", telphone=" + telphone + ", email=" + email + "]";
	}

	
}
