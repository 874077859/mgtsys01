package com.vip.mgtsys.model;

import java.io.Serializable;

public class EmployeeStatus implements Serializable {

	private static final long serialVersionUID = -8823504831198719837L;
	
	private String statusKey;
	
	private String statusValue;

	public String getStatusKey() {
		return statusKey;
	}

	public void setStatusKey(String statusKey) {
		this.statusKey = statusKey;
	}

	public String getStatusValue() {
		return statusValue;
	}

	public void setStatusValue(String statusValue) {
		this.statusValue = statusValue;
	}
}
