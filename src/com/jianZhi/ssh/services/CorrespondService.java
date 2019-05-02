package com.jianZhi.ssh.services;

import com.jianZhi.ssh.Dao.RecruitmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jianZhi.ssh.Dao.CorrespondDao;
import com.jianZhi.ssh.entities.Correspond;

import java.util.List;

@Service
public class CorrespondService {

	@Autowired
	private RecruitmentDao recruitmentDao;

	public List<String> getCorresponds() {
		return recruitmentDao.getCorresponds();
	}
	
}
