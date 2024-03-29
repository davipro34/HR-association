package fr.davipro.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.davipro.api.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
