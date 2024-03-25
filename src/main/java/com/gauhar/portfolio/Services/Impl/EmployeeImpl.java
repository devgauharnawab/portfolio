package com.gauhar.portfolio.Services.Impl;

import com.gauhar.portfolio.Dto.EmployeeDto;
import com.gauhar.portfolio.Entity.Employee;
import com.gauhar.portfolio.Repository.EmployeeRepository;
import com.gauhar.portfolio.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeImpl implements EmployeeService {

    @Autowired
    private  EmployeeRepository employeeRepository;
    @Override
    public String addEmployee(EmployeeDto employeeDto) {
        // Implementation to add employee
        Employee employee = new Employee(
                employeeDto.getId(),
                employeeDto.getName(),
                employeeDto.getPhone(),
                employeeDto.getEmail(),
                employeeDto.getMessage()
        );
        employeeRepository.save(employee);
        return employee.getName();
    }
}
