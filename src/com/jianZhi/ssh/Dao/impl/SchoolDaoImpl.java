package com.jianZhi.ssh.Dao.impl;

import org.springframework.stereotype.Repository;

import com.jianZhi.ssh.Dao.SchoolDao;
import com.jianZhi.ssh.entities.School;

import java.util.List;

@Repository("schoolDao")
public class SchoolDaoImpl extends BaseDao<School> implements SchoolDao {

	public void insertSchool(School c) {
		insert(c);
	}

	public boolean deleteSchool(int school_id) {
		School c = get(school_id);
		return delete(c);
	}

	public boolean updateSchool(School c) {
		return update(c);
	}

	public School selectSchool(int school_id) {
		return get(school_id);
	}

	public School selectSchoolByCityDistrictAndSchoolName(String schoolName, String city, String district) {
		String hql = "from School where cityName = ? and district = ? and schoolName = ?";
		return get(hql, city, district, schoolName).get(0);
	}

    @Override
    public School selectSchoolByName(String schoolName) {
        String hql = "from School where schoolName = ?";
        List<School> schools = get(hql, schoolName);
        if (schools == null || schools.size() == 0) {
            return null;
        }
        return schools.get(0);
    }
}
