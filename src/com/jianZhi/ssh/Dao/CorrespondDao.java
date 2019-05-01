package com.jianZhi.ssh.Dao;

import com.jianZhi.ssh.entities.Correspond;

import java.util.List;

public interface CorrespondDao {
	
	public Correspond getCorrespond(String name);

	List<Correspond> getAll();
	
}
