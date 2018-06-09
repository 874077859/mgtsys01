package com.vip.mgtsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.vip.mgtsys.model.EmployeeType;

public interface EmployeeTypeDao {

	public List<EmployeeType> getEmployeeType(@Param("sid") String sid);
}
