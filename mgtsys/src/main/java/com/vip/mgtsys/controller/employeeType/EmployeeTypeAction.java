package com.vip.mgtsys.controller.employeeType;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vip.mgtsys.constant.Constant;
import com.vip.mgtsys.model.EmployeeType;
import com.vip.mgtsys.model.EmployerInfo;
import com.vip.mgtsys.service.employeeType.EmployeeTypeService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping("/employeeType")
public class EmployeeTypeAction {
	@Autowired
	private EmployeeTypeService employeeTypeService;

	@RequestMapping("/getEmployeeTypes")
	@ResponseBody
	public JSONArray getEmployeeTypes(HttpSession session) {
		
		String sid = ((EmployerInfo)session.getAttribute(Constant.SESSION_EMPLOYER_INFO)).getSid();
		List<EmployeeType> lst = employeeTypeService.getEmployeeType(sid);

		JSONArray ja = new JSONArray();
		for(EmployeeType et : lst) {
			JSONObject jo = new JSONObject();
			jo.put("key", et.getTypeKey());
			jo.put("value", et.getTypeValue());
			ja.add(jo);
		}
		
		return ja;
	}
}
