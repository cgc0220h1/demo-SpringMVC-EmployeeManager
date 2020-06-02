package controllers;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Duc on 6/2/2020
 * @project demo-SpringMVC-EmployeeManager
 **/

@Controller
@RequestMapping("/")
public class EmployeeController {
    @GetMapping()
    public ModelAndView showForm() {
        return new ModelAndView("create", "employee", new Employee());
    }

    @PostMapping()
    public ModelAndView createEmployee(@ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView("info");
        modelAndView.addObject("employee", employee);
        return modelAndView;
    }
}
