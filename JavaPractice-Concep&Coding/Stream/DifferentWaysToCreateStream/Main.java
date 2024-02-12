package DifferentWaysToCreateStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class Main {

	public static void main(String[] args) {
		//From Collection
		
		List<Integer> list=Arrays.asList(1000,20000,4000,3000,500);
		Stream<Integer> streamOfIntegers1 = list.stream();
		
		//From array
		Integer[] arr= {1000,20000,4000,3000,500};
		Stream<Integer> streamOfIntegers2=Arrays.stream(arr);
		
		//from static method
		Stream<Integer> streamOfIntegers3=Stream.of(1000,20000,4000,3000,500);
		
		
		//from builder method
		Builder<Integer> streamBuilder = Stream.builder();
		Stream<Integer> streamOfIntegers4=streamBuilder.add(1000).add(20000).build();
		
		//Stream Iterate
		Stream<Integer> streamOfInteger5=Stream.iterate(1000, (n)->n+5000).limit(5);
		

	}

}
