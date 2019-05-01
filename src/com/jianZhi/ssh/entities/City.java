package com.jianZhi.ssh.entities;

/**
 * 只有一个字段，没必要单独建个表
 * 去掉硬约束
 */
@Deprecated
public class City {
	private String cityName;

	public City() {
		
	}
	
	public City(City c) {
		this.cityName = c.getCityName();
	}
	
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + "]";
	}

}
