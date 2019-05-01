package com.jianZhi.ssh.Dao;

import com.jianZhi.ssh.entities.City;

import java.util.List;

/**
 * todo 1.删除中间表，直接加到对应关联字段中
 * todo 2.修改中间表字段查询逻辑
 *
 */
public interface CityDao {
	public City getCityByName(String cityName);

	List<City> getAll();
}
