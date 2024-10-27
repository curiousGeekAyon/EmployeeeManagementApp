package com.ndb.SpringMVCcrud.controller;

import com.ndb.SpringMVCcrud.entity.Employee;
import com.ndb.SpringMVCcrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    // add mapping for "/list"

    @GetMapping("/list")
    public String listEmployees(Model theModel) {
        // get the employees from db
        List<Employee> theEmployees = employeeService.findAll();
        // add to the spring model
        theModel.addAttribute("employees", theEmployees);
        return "list-employees";
    }
    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model){
        model.addAttribute("employee",new Employee());
        return "employee-form";
    }
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee){
        employeeService.save(theEmployee);
        //use a redirect to prevent duplicate submission
        return "redirect:/employees/list";
    }
    // for update form
    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeId") int theId, Model theModel){
        // get the employee from the service by id from html parameter
        Employee theEmployee = employeeService.findById(theId);
        // set employee as a model attribute to populate the specific employee form
        theModel.addAttribute("employee", theEmployee);
        // sent over to our form, as we know when form is loaded getter method is called
        return "employee-form";
    }
    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("employeeId") int theId){
        // delete the specific employee
        employeeService.deleteById(theId);
        // redirect to the employee-list
        return "redirect:/employees/list";
    }

}