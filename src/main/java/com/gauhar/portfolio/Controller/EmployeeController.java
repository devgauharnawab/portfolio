package com.gauhar.portfolio.Controller;

import com.gauhar.portfolio.Dto.EmployeeDto;
import com.gauhar.portfolio.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeDto employeeDto){

        String id = employeeService.addEmployee(employeeDto);
        return id;
    }
}
