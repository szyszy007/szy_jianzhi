package com.jianZhi.ssh.Dao.impl;

import org.springframework.stereotype.Repository;

import com.jianZhi.ssh.Dao.CityDao;
import com.jianZhi.ssh.entities.City;

@Deprecated
@Repository("cityDao")
public class CityDaoImpl extends BaseDao<City> implements CityDao{

	@Override
	public City getCityByName(String cityName) {
		return (City) getSession().get(City.class, cityName);
	}

}
