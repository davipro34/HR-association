package fr.davipro.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.davipro.api.model.Employee;
import fr.davipro.api.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
	 * Create - Add a new employee
	 * @param employee An object employee
	 * @return The employee object saved
	 */
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

    /**
	 * Read - Get one employee 
	 * @param id The id of the employee
	 * @return An Employee object full filled
	 */
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable("id") final Long id) {
		Optional<Employee> employee = employeeService.getEmployee(id);
		if(employee.isPresent()) {
			return employee.get();
		} else {
			return null;
		}
    }

    /**
    * Read - Get all employees
    * @return - An Iterable object of Employee full filled
    */
    @GetMapping("/employees")
    public Iterable<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
	
}
