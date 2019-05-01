package com.jianZhi.ssh.services;

import com.jianZhi.ssh.Dao.SchoolDao;
import com.jianZhi.ssh.entities.School;
import com.jianZhi.ssh.web.StudentRegister;
import com.jianZhi.ssh.web.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jianZhi.ssh.Dao.StudentDao;
import com.jianZhi.ssh.entities.Student;
import com.jianZhi.ssh.web.StudentLogin;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao studentDao;
	@Autowired
	private SchoolDao schoolDao;
	@Autowired
    private StudentMapper studentMapper;
	
	/**
	 * 登录
	 * @param studentLogin
	 * @return
	 */
	public String login(StudentLogin studentLogin) {
		if(studentDao.isHaveStudent(studentLogin))
			return "login";
		else
			return "input";
	}
	
	/**
	 * 注册
	 * @param register
	 * @return
	 */
	@Transactional(rollbackFor = Exception.class)
	public boolean register(StudentRegister register) {
	    try {
            School school;
            if ((school = schoolDao.selectSchoolByName(register.getSchoolName())) != null) {
                Student student = studentMapper.toStudent(register);
                student.setSchool(school.getSchool_id());
                studentDao.insertStudent(student);
            } else {
                school = studentMapper.toSchool(register);
                schoolDao.insertSchool(school);
                Student student = studentMapper.toStudent(register);
                student.setSchool(school.getSchool_id());
                studentDao.insertStudent(student);
            }
            return true;
        } catch (Exception e) {
	        e.printStackTrace();
	        return false;
        }
	}

	public boolean haveSchool(String schoolName) {
        return schoolDao.selectSchoolByName(schoolName) != null;
    }
	
	/**
	 * 通过登录名，密码找到账号
	 * @param username
	 * @param password
	 * @return
	 */
	public Student getStudent(String username, String password) {
		return studentDao.getStudent(username, password);
	}
	
	/**
	 * 通过id找到账号
	 * @param id
	 * @return
	 */
	public Student getStudent(long id) {
		return studentDao.getStudent(id);
	}
	
}
