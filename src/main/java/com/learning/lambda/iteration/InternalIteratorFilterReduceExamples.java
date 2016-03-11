package com.learning.lambda.iteration;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

import com.learning.lambda.data.Employee;

public class InternalIteratorFilterReduceExamples {

	public Employee getHighestPaidEmployeeUsingInternalIterator_LambdaStream(List<Employee> employees,
			String department) {

		Objects.requireNonNull(employees, "Employees can't be empty");

		// @formatter:off
		BinaryOperator<Employee> toHighestPaidEmployee = (employee1, employee2) -> ( employee1.getSalary() > employee2.getSalary() ) ? employee1 : employee2;
				
		Predicate<? super Employee> byEmployeesMatchingDepartment = employee -> department.equalsIgnoreCase(employee.getDepartmentName());
		
		Optional<Employee> highestPaidEmployee = employees
													.stream()
													.filter(byEmployeesMatchingDepartment)
													.reduce(toHighestPaidEmployee);
		// @formatter:on

		return highestPaidEmployee.orElse(null);
	}

}
