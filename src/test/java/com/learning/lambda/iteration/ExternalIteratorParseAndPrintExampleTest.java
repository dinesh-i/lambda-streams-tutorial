package com.learning.lambda.iteration;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class ExternalIteratorParseAndPrintExampleTest {

	private ExternalIteratorParseAndPrintExample iterator;

	@Before
	public void setUp() throws Exception {
		iterator = new ExternalIteratorParseAndPrintExample();
	}

	@Test
	public void test() {
		iterator.parseAndPrintNumbers(Arrays.asList(1, 2, 3, 4, 5));
	}

}
