package com.learning.lambda.iteration;

import java.util.Iterator;
import java.util.List;

public class ExternalIteratorParseAndPrintExample {

	public void parseAndPrintNumbers(List<Integer> numbers) {

		print("Using Iterator");
		Iterator<Integer> iterator = numbers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		print("Using for loop");
		for (int count = 0; count < numbers.size(); count++)
			System.out.println(numbers.get(count));

		print("Using for each");
		for (Integer number : numbers)
			System.out.println(number);

	}

	private void print(String message) {
		System.out.println(message);
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");
	}

}
