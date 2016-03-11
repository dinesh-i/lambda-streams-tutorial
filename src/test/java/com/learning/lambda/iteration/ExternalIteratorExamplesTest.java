package com.learning.lambda.iteration;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.learning.lambda.constants.Constants;
import com.learning.lambda.data.Employee;

public class ExternalIteratorExamplesTest {

	private ExternalIteratorFilterReduceExamples iterator;

	@Before
	public void setUp() throws Exception {
		iterator = new ExternalIteratorFilterReduceExamples();
	}

	private void assertHighestPaidEmployeeInDepartment(Employee highestPaidMathematician) {
		assertTrue(3 == highestPaidMathematician.getId());
	}

	@Test
	public void usingForLoopShouldReturnHighestPaidMathematician() {
		Employee highestPaidMathematician = iterator.getHighestPaidEmployeeUsingExternalIterator_ForLoop(
				EmployeeUtil.getEmployees(), Constants.MATHEMATICS_DEPARTMENT);
		assertHighestPaidEmployeeInDepartment(highestPaidMathematician);
	}

	@Test
	public void usingIteratorShouldReturnHighestPaidMathematician() {
		Employee highestPaidMathematician = iterator.getHighestPaidEmployeeUsingExternalIterator_Iterator(
				EmployeeUtil.getEmployees(), Constants.MATHEMATICS_DEPARTMENT);
		assertHighestPaidEmployeeInDepartment(highestPaidMathematician);
	}

	@Test
	public void usingForEachShouldReturnHighestPaidMathematician() {
		Employee highestPaidMathematician = iterator.getHighestPaidEmployeeUsingExternalIterator_ForEach(
				EmployeeUtil.getEmployees(), Constants.MATHEMATICS_DEPARTMENT);
		assertHighestPaidEmployeeInDepartment(highestPaidMathematician);
	}

}
