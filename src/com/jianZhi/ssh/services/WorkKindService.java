package com.jianZhi.ssh.services;

import com.jianZhi.ssh.Dao.RecruitmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jianZhi.ssh.Dao.WorkKindDao;
import com.jianZhi.ssh.entities.WorkKind;

import java.util.List;

@Service
public class WorkKindService {
	@Autowired
	private RecruitmentDao recruitmentDao;

	public List<String> getWorkKinds() {
		return recruitmentDao.getWorkKinds();
	}
	
}
