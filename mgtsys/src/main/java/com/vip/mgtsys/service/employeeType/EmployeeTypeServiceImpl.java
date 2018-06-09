package com.vip.mgtsys.service.employeeType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vip.mgtsys.dao.EmployeeTypeDao;
import com.vip.mgtsys.model.EmployeeType;

@Service("employerTypeService")
public class EmployeeTypeServiceImpl implements EmployeeTypeService {
	
	@Autowired
	private EmployeeTypeDao employeeTypeDao;

	@Override
	public List<EmployeeType> getEmployeeType(String sid) {
		return employeeTypeDao.getEmployeeType(sid);
	}
}
