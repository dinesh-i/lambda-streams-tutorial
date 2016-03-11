package com.learning.lambda.iteration;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class InternalIteratorParseAndPrintExampleTest {

	private InternalIteratorParseAndPrintExample iterator;

	@Before
	public void setUp() throws Exception {
		iterator = new InternalIteratorParseAndPrintExample();
	}

	@Test
	public void test() {
		iterator.parseAndPrintNumbers(Arrays.asList(1, 2, 3, 4, 5));
	}

}
