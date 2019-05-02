package com.jianZhi.ssh.Dao;

import com.jianZhi.ssh.entities.WorkKind;

import java.util.List;

@Deprecated
public interface WorkKindDao {
	
	public WorkKind getWorkKind(String workKind);

	List<WorkKind> getAll();
	
}
