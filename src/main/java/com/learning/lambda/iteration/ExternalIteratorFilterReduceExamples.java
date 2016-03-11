package com.learning.lambda.iteration;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.learning.lambda.data.Employee;

public class ExternalIteratorFilterReduceExamples {

	private void validateEmployees(List<Employee> employees) {
		if (CollectionUtils.isEmpty(employees))
			throw new RuntimeException("Employees can't be empty");
	}

	public Employee getHighestPaidEmployeeUsingExternalIterator_Iterator(List<Employee> employees, String department) {
		validateEmployees(employees);
		Employee highestPaidEmployee = null;
		Iterator<Employee> iterator = employees.iterator();
		while (iterator.hasNext()) {
			Employee currentEmployee = iterator.next();
			if (department.equalsIgnoreCase(currentEmployee.getDepartmentName())) {
				if (null == highestPaidEmployee || highestPaidEmployee.getSalary() < currentEmployee.getSalary()) {
					highestPaidEmployee = currentEmployee;
				}
			}
		}
		return highestPaidEmployee;
	}

	public Employee getHighestPaidEmployeeUsingExternalIterator_ForLoop(List<Employee> employees, String department) {
		validateEmployees(employees);
		Employee highestPaidEmployee = null;
		for (int i = 0; i < employees.size(); i++) {
			Employee currentEmployee = employees.get(i);
			if (department.equalsIgnoreCase(currentEmployee.getDepartmentName())) {
				if (null == highestPaidEmployee || highestPaidEmployee.getSalary() < currentEmployee.getSalary()) {
					highestPaidEmployee = currentEmployee;
				}
			}
		}
		return highestPaidEmployee;
	}

	public Employee getHighestPaidEmployeeUsingExternalIterator_ForEach(List<Employee> employees, String department) {
		validateEmployees(employees);
		Employee highestPaidEmployee = null;
		for (Employee currentEmployee : employees) {
			if (department.equalsIgnoreCase(currentEmployee.getDepartmentName())) {
				if (null == highestPaidEmployee || highestPaidEmployee.getSalary() < currentEmployee.getSalary()) {
					highestPaidEmployee = currentEmployee;
				}
			}
		}
		return highestPaidEmployee;
	}

}
