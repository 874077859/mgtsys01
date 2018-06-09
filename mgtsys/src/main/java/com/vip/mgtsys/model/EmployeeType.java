package com.vip.mgtsys.model;

import java.io.Serializable;

public class EmployeeType implements Serializable {

	private static final long serialVersionUID = -8823504831198719837L;
	
	private String typeKey;
	
	private String typeValue;

	public String getTypeKey() {
		return typeKey;
	}

	public void setTypeKey(String typeKey) {
		this.typeKey = typeKey;
	}

	public String getTypeValue() {
		return typeValue;
	}

	public void setTypeValue(String typeValue) {
		this.typeValue = typeValue;
	}
}
