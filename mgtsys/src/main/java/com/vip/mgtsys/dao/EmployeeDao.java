package com.vip.mgtsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.vip.mgtsys.model.EmployeeInfo;

public interface EmployeeDao {

	public List<EmployeeInfo> getEmployeeInfo(@Param("sid") String sid, @Param("usrId") String usrId, @Param("pwd") String pwd);
	
	public int getMaxSid(@Param("sysDate") String sysDate);
	
	public int insertEmployee(@Param("sid") String sid,
			                  @Param("employeeId") String employeeId,
			                  @Param("employeePwd") String employeePwd,
			                  @Param("employeeMail") String employeeMail,
			                  @Param("employeeStatus") String employeeStatus,
			                  @Param("employeeType") String employeeType
			                 );
}
