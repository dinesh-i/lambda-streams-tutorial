package com.learning.lambda.iteration;

import java.util.Arrays;
import java.util.List;

import com.learning.lambda.constants.Constants;
import com.learning.lambda.data.Employee;

public class EmployeeUtil {

	public static List<Employee> getEmployees() {
		return Arrays.asList(new Employee(1, "Alonzo", "Church", Constants.MATHEMATICS_DEPARTMENT, 1000),
				new Employee(2, "Stephen", "Kleene", Constants.MATHEMATICS_DEPARTMENT, 2000),
				new Employee(3, "Rosser", "JB", Constants.MATHEMATICS_DEPARTMENT, 3000),
				new Employee(4, "Montague", "", Constants.LINGUISTICS_DEPARTMENT, 4000));
	}
}
