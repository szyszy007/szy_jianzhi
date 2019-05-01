package com.jianZhi.ssh.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jianZhi.ssh.Dao.CorrespondDao;
import com.jianZhi.ssh.entities.Correspond;

import java.util.List;

@Service
@Deprecated
public class CorrespondService {
	
	@Autowired
	private CorrespondDao correspondDao;
	
	public Correspond getCorrespond(String name) {
		return correspondDao.getCorrespond(name);
	}

	public List<Correspond> getAll() {
		return correspondDao.getAll();
	}
	
}
