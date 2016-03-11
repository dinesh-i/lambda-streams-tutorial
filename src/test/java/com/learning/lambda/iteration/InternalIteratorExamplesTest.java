package com.learning.lambda.iteration;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.learning.lambda.constants.Constants;
import com.learning.lambda.data.Employee;

public class InternalIteratorExamplesTest {

	private InternalIteratorFilterReduceExamples iterator;

	@Before
	public void setUp() throws Exception {
		iterator = new InternalIteratorFilterReduceExamples();
	}

	private void assertHighestPaidEmployeeInDepartment(Employee highestPaidMathematician) {
		assertTrue(3 == highestPaidMathematician.getId());
	}

	@Test
	public void test() {
		assertHighestPaidEmployeeInDepartment(iterator.getHighestPaidEmployeeUsingInternalIterator_LambdaStream(
				EmployeeUtil.getEmployees(), Constants.MATHEMATICS_DEPARTMENT));
	}

}
