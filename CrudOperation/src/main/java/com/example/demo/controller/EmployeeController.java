package com.example.demo.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.model.EmployeeModel;
import com.example.demo.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;

	@PostMapping("saveEmployee")
	public String saveEmployee(@RequestBody EmployeeModel model)
	{

		boolean flag=repository.existsById(model.getEmpId());
		if(flag==true)
		{
			return "Sorry try with employee Id";
		}
		else {
			Employee entity=new Employee();
			BeanUtils.copyProperties(model,entity);
			repository.save(entity);
			return "Employee saved to database successfully";
		}

	}

}
