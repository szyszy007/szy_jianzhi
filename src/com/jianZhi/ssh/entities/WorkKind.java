package com.jianZhi.ssh.entities;

/**
 * 只有一个字段，没必要单独建个表
 * 去掉硬约束
 */
@Deprecated
public class WorkKind {
	private String workKindName;

	public WorkKind() {
		
	}
	
	public WorkKind(WorkKind w) {
		this.workKindName = w.getWorkKindName();
	}
	
	public String getWorkKindName() {
		return workKindName;
	}

	public void setWorkKindName(String workKindName) {
		this.workKindName = workKindName;
	}

	@Override
	public String toString() {
		return "WorkKind [workKindName=" + workKindName + "]";
	}

}
