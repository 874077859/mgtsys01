package com.vip.mgtsys.service.employeeStatus;

import java.util.List;

import com.vip.mgtsys.model.EmployeeStatus;

public interface EmployeeStatusService {

	List<EmployeeStatus> getEmployeeStatus(String sid);
}
