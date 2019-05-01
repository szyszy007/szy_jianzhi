package com.jianZhi.ssh.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jianZhi.ssh.Dao.CityDao;
import com.jianZhi.ssh.entities.City;

import java.util.List;

/**
 * 需要在对应service中重新定义获取 城市列表 的接口
 */
@Service
@Deprecated
public class CityService {

	@Autowired
	private CityDao cityDao;
	
	public City getCity(String cityName) {
		return cityDao.getCityByName(cityName);
	}

	public List<City> getAll() {
		return cityDao.getAll();
	}
	
}
