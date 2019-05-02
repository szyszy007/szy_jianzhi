package com.jianZhi.ssh.services;

import com.jianZhi.ssh.Dao.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jianZhi.ssh.Dao.CityDao;
import com.jianZhi.ssh.entities.City;

import java.util.List;

/**
 * 需要在对应service中重新定义获取 城市列表 的接口
 */
@Service
public class CityService {

	@Autowired
    private CompanyDao companyDao;

	public List<String> getAll() {
		return companyDao.getCities();
	}
	
}
