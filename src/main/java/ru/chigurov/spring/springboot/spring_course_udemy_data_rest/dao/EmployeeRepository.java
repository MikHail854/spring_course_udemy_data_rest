package ru.chigurov.spring.springboot.spring_course_udemy_data_rest.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.chigurov.spring.springboot.spring_course_udemy_data_rest.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
