package com.vip.mgtsys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.vip.mgtsys.model.EmployeeStatus;

public interface EmployeeStatusDao {

	public List<EmployeeStatus> getEmployeeStatus(@Param("sid") String sid);
}
