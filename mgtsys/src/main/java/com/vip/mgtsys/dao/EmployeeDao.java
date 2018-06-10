package com.vip.mgtsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.vip.mgtsys.model.EmployeeInfo;

public interface EmployeeDao {

	public List<EmployeeInfo> getEmployeeList(@Param("sid") String sid,
			                                  @Param("employeeStatus") String employeeStatus);
	
	public int count(@Param("sid") String sid,
			         @Param("employeeStatus") String employeeStatus);
	
	public int insertEmployee(@Param("sid") String sid,
			                  @Param("employeeId") String employeeId,
			                  @Param("employeePwd") String employeePwd,
			                  @Param("employeeName") String employeeName,
			                  @Param("employeeTel") String employeeTel,
			                  @Param("employeeStatus") String employeeStatus,
			                  @Param("employeeType") String employeeType
			                 );
}
