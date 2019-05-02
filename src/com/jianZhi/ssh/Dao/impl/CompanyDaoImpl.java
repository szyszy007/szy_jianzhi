package com.jianZhi.ssh.Dao.impl;

import org.springframework.stereotype.Repository;

import com.jianZhi.ssh.Dao.CompanyDao;
import com.jianZhi.ssh.entities.Company;

import java.util.List;

@Repository("companyDao")
public class CompanyDaoImpl extends BaseDao<Company> implements CompanyDao{

    @Override
	public void insertCompany(Company c) {
		insert(c);
	}

	@Override
	public boolean deleteSchool(int company_id) {
		Company c = get(company_id);
		return delete(c);
	}

	@Override
	public boolean updateSchool(Company c) {
		return update(c);
	}

	@Override
	public Company selectSchool(int company_id) {
		return get(company_id);
	}

	@Override
	public Company selectCompanyByCityDistrictCompanyName(String city, String district, String companyName) {
		String hql = "from Company where city.cityName = ? and district = ? and companyName = ?";
		return get(hql, city, district, companyName).get(0);
	}

	@Override
	public List<String> getCities() {
		String hql = "select distinct city from Company";
		return getSession().createQuery(hql).list();
	}
}
