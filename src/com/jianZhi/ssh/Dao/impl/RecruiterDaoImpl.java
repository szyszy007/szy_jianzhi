package com.jianZhi.ssh.Dao.impl;

import java.util.List;

import com.jianZhi.ssh.Dao.CompanyDao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jianZhi.ssh.Dao.RecruiterDao;
import com.jianZhi.ssh.entities.Company;
import com.jianZhi.ssh.entities.Recruiter;
import com.jianZhi.ssh.entities.Student;
import com.jianZhi.ssh.web.RecruiterLogin;

@Repository("recruiterDao")
public class RecruiterDaoImpl extends BaseDao<Recruiter> implements RecruiterDao {
    @Autowired
    private CompanyDao companyDao;

	@Override
	public boolean isHaveRecruiter(RecruiterLogin s) {
		String hql = "from Recruiter r where r.username = ? and r.password = ?";
		List<Recruiter> list = get(hql, s.getUsername(), s.getPassword());
		if(list.size() == 0)
			return false;
		return true;
	}

	@Override
	public boolean insertRecruiter(Recruiter s) {
		return insert(s);
	}

	@Override
	public Recruiter getRecruiter(int recruiter_id) {
		return get(recruiter_id);
	}

	@Override
	public boolean deleteRecruiter(int recruiter_id) {
		Recruiter r = get(recruiter_id);
		return delete(r);
	}

	@Override
	public List<Recruiter> getAll() {
		String hql = "from Recruiter";
		return get(hql);
	}

	@Override
	public boolean updateRecruiter(Recruiter s) {
		return update(s);
	}

	@Override
	public Company getCompanyByRecruiter(int recruiter_id) {
		Recruiter r = get(recruiter_id);
		return companyDao.selectSchool(r.getRecruiter_id());
	}

	@Override
	public Recruiter getRecruiter(String username, String password) {
		String hql = "from Recruiter where username = ? and password = ?";
		return get(hql, username, password).get(0);
	}
	
}
