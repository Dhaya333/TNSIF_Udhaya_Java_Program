package com.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		List<Integer> oddSquare = numbers.stream()
				
				//Intermediate Operation
				
				.filter(n -> n % 2 != 0)
				.map(n -> n * n)
				
				//Terminal Operation
				
				.collect(Collectors.toList());
		
		System.out.println("Odd Squares: "+oddSquare);
						

	}

}
