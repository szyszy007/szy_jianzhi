package com.jianZhi.ssh.services;

import com.jianZhi.ssh.Dao.CompanyDao;
import com.jianZhi.ssh.entities.Company;
import com.jianZhi.ssh.web.RecruiterRegister;
import com.jianZhi.ssh.web.mapper.RecruiterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jianZhi.ssh.Dao.RecruiterDao;
import com.jianZhi.ssh.entities.Recruiter;
import com.jianZhi.ssh.web.RecruiterLogin;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RecruiterService {
	
	@Autowired
	private RecruiterDao recruiterDao;
	@Autowired
    private RecruiterMapper recruiterMapper;
	@Autowired
    private CompanyDao companyDao;
	
	/**
	 * 登录
	 * @param recruiterLogin
	 * @return
	 */
	public String login(RecruiterLogin recruiterLogin) {
		if(recruiterDao.isHaveRecruiter(recruiterLogin))
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
	public boolean register(RecruiterRegister register) {
	    try {
            Company company = recruiterMapper.toCompany(register);
            companyDao.insertCompany(company);
            Recruiter recruiter = recruiterMapper.toRecruiter(register);
            recruiter.setCompany(company.getCompany_id());
            recruiterDao.insertRecruiter(recruiter);
            return true;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
        }

	}
	
	/**
	 * 通过账号密码找到招聘人
	 * @param username
	 * @param password
	 * @return
	 */
	public Recruiter getRecruiter(String username, String password) {
		return recruiterDao.getRecruiter(username, password);
	}
	
	/**
	 * 通过id找到
	 * @param id 招聘人
	 * @return
	 */
	public Recruiter getRecruiter(int id) {
		return recruiterDao.getRecruiter(id);
	}
}
