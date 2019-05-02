package com.jianZhi.ssh.Dao;

import com.jianZhi.ssh.entities.Correspond;

import java.util.List;

@Deprecated
public interface CorrespondDao {
	
	public Correspond getCorrespond(String name);

	List<Correspond> getAll();
	
}
