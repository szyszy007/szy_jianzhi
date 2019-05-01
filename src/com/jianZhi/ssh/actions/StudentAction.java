package com.jianZhi.ssh.actions;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.google.gson.Gson;
import com.jianZhi.ssh.entities.School;
import com.jianZhi.ssh.entities.Student;
import com.jianZhi.ssh.services.SchoolService;
import com.jianZhi.ssh.services.StudentService;
import com.jianZhi.ssh.utils.HttpUtils;
import com.jianZhi.ssh.web.StudentLogin;
import com.jianZhi.ssh.web.StudentRegister;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class StudentAction extends ActionSupport implements SessionAware, RequestAware{
	
	private Map<String, Object> session;
	private Map<String, Object> request;
	
	private StudentRegister studentRegister;
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private SchoolService schoolService;
	
	public StudentRegister getStudentRegister() {
		return studentRegister;
	}

	public void setStudentRegister(StudentRegister studentRegister) {
		this.studentRegister = studentRegister;
	}

	public String getMine() {
		long id = (Long) session.get("id");
		Student student = studentService.getStudent(id);
		request.put("stu", student);
		return SUCCESS;
	}
	
	public String register() {
		boolean flag = studentService.register(studentRegister);
		if(flag)
			return "register";
		else
			return "input";
	}

	public String checkSchool() throws Exception {
	    try {
            String schoolName = HttpUtils.getRequest().getParameter("schoolName");
            PrintWriter writer = HttpUtils.getResponse("text/plain").getWriter();
            if (studentService.haveSchool(schoolName)) {
                writer.write("true");
            } else {
                writer.write("false");
            }
            return null;
        } catch (Exception e) {
	        e.printStackTrace();
	        throw e;
        }
    }
	
	public String toHome() {
		long id = (Long) session.get("id");
		Student s = studentService.getStudent(id);
		request.put("stu", s);
		return SUCCESS;
	}

	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}

	public void setRequest(Map<String, Object> arg0) {
		this.request = arg0;
	}
	
	public void login() throws Exception {
		HttpServletRequest request = HttpUtils.getRequest();
		HttpServletResponse response = HttpUtils.getResponse("application/json");
		String flag = null;
		Long flagNumber = 0L;
		Gson gson = new Gson();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username != null && !username.trim().equals("") && password != null && !password.trim().equals("")) {
			StudentLogin s = new StudentLogin();
			s.setUsername(username);
			s.setPassword(password);
			flag = studentService.login(s);
			if(flag.equals("login"))
				flagNumber = studentService.getStudent(s.getUsername(), s.getPassword()).getStudent_id();
			else
				flagNumber = -1L;
		} else {
			flagNumber = -2L;
		}
		flag = gson.toJson(flagNumber);
		response.getWriter().print(flag);
	}
	
	public void registerJson() throws Exception {
		HttpServletRequest request = HttpUtils.getRequest();
		HttpServletResponse response = HttpUtils.getResponse("application/json");
		
		StudentRegister s = new StudentRegister();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String cityName = request.getParameter("cityName");
		String district = request.getParameter("district");
		String schoolName = request.getParameter("schoolName");
		String telphone = request.getParameter("telphone");
		String email = request.getParameter("email");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		s.setUsername(username);
		s.setPassword(password);
		s.setCity(cityName);
		s.setDistrict(district);
		s.setSchoolName(schoolName);
		s.setTelphone(telphone);
		s.setEmail(email);
		s.setName(name);
		s.setAddress(address);
		
		Gson gson = new Gson();
		boolean flag = studentService.register(s);
		Long flagNumber = 0L;
		if(flag)
			flagNumber = studentService.getStudent(s.getUsername(), s.getPassword()).getStudent_id();
		else
			flagNumber = -1L;
		String flagData = gson.toJson(flagNumber);
		response.getWriter().print(flagData);
	}
	
	public void getById() throws Exception {
		HttpServletRequest request = HttpUtils.getRequest();
		HttpServletResponse response = HttpUtils.getResponse("application/json");
		long id = Long.parseLong(request.getParameter("id"));
		Student s = studentService.getStudent(id);
		Student res = new Student(s);
		Gson gson = new Gson();
		String stu = gson.toJson(res);
		response.getWriter().print(stu);
	}
	
}
