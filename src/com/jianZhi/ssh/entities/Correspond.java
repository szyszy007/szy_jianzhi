package com.jianZhi.ssh.entities;

/**
 * 工作性质：兼职、实习、正式员工之类的
 *
 * 只有一个字段，没必要单独建个表
 * 去掉强约束
 *
 */
@Deprecated
public class Correspond {
	private String correspondName;

	public Correspond() {
		
	}
	
	public Correspond(Correspond c) {
		this.correspondName = c.getCorrespondName();
	}
	
	public String getCorrespondName() {
		return correspondName;
	}

	public void setCorrespondName(String correspondName) {
		this.correspondName = correspondName;
	}

	@Override
	public String toString() {
		return "Correspond [correspondName=" + correspondName + "]";
	}
	
}
