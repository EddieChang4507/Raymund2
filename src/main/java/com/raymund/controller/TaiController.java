package com.raymund.controller;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raymund.entity.ExchangeRate;
import com.raymund.service.EmployeeService;
import com.raymund.service.ExchangeRateService;

@RestController
@RequestMapping("/api/hello")
public class TaiController {

    @Autowired
    private EmployeeService employeeService;	
	
	@Autowired
	private ExchangeRateService  exchangeRateService;
	
    @GetMapping("hello")
    public String hello() {
//    	Employee employee = new Employee();
//    	employee.setName("ramund777");
//    	employee.setDepartment("A77");
//    	employee.setEmail("eddiechang4507777@gmail.com");
//    	employeeService.saveEmployee(employee);
    	

    	ExchangeRate exchangeRate = new ExchangeRate();
    	exchangeRate.setCurrency("TWD/NTD");
    	exchangeRate.setExchangeRate(new BigDecimal("35.21"));
    	exchangeRate.setExchangeRateDate(LocalDate.parse("2024-10-22"));
    	exchangeRateService.saveExchangeRate(exchangeRate);
    	
    	
    	
    	
    	return "hello world";
    }
    
    
}
