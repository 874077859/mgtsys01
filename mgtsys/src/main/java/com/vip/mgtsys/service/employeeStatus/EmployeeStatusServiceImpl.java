package com.vip.mgtsys.service.employeeStatus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vip.mgtsys.dao.EmployeeStatusDao;
import com.vip.mgtsys.model.EmployeeStatus;

@Service("employerStatusService")
public class EmployeeStatusServiceImpl implements EmployeeStatusService {
	
	@Autowired
	private EmployeeStatusDao employeeStatusDao;

	@Override
	public List<EmployeeStatus> getEmployeeStatus(String sid) {
		return employeeStatusDao.getEmployeeStatus(sid);
	}

}
