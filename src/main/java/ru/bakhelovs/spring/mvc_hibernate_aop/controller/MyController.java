package ru.bakhelovs.spring.mvc_hibernate_aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.bakhelovs.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import ru.bakhelovs.spring.mvc_hibernate_aop.entity.Employee;


import java.util.List;

@Controller
public class MyController {
    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping("/")
    public String showEmployees(Model model) {
        List<Employee> allEmployees =  employeeDAO.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);
        return "all-employees";
    }
}
