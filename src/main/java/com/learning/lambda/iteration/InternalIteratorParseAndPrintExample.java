package com.learning.lambda.iteration;

import java.util.List;
import java.util.function.Consumer;

public class InternalIteratorParseAndPrintExample {
	public void parseAndPrintNumbers(List<Integer> numbers) {

		parseAndPrintUsingConsumerImplementation(numbers);

		parseAndPrintUsingLambdaWithDataTypeOfArguments(numbers);

		parseAndPrintUsingLambdaWithOutDataTypeOfArguments(numbers);

		parseAndPrintUsingLambdaWithOutParanthesisAroundArgument(numbers);

		parseAndPrintUsingMethodReference(numbers);

	}

	private void parseAndPrintUsingMethodReference(List<Integer> numbers) {
		print("Using Method reference ==> System.out::println");
		numbers.forEach(System.out::println);
	}

	private void parseAndPrintUsingLambdaWithOutParanthesisAroundArgument(List<Integer> numbers) {
		print("Using only the input(excluding paranthesis of arguments) and logic of consumer ==> number -> System.out.println(number)");
		numbers.forEach(number -> System.out.println(number));
	}

	private void parseAndPrintUsingLambdaWithOutDataTypeOfArguments(List<Integer> numbers) {
		print("Using only the input(excluding data type of arguments) and logic of consumer ==> (number) -> System.out.println(number)");
		numbers.forEach((number) -> System.out.println(number));
	}

	private void parseAndPrintUsingLambdaWithDataTypeOfArguments(List<Integer> numbers) {
		print("Using only the input(including data type of arguments) and logic of consumer ==> (Integer number) -> System.out.println(number)");
		numbers.forEach((Integer number) -> System.out.println(number));
	}

	private void parseAndPrintUsingConsumerImplementation(List<Integer> numbers) {
		print("Using an implementation of Consumer");
		numbers.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer number) {
				System.out.println(number);
			}
		});
	}

	private void print(String message) {
		System.out.println(message);
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------");
	}
}
