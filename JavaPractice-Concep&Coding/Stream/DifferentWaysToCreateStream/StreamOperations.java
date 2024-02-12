package DifferentWaysToCreateStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {
		// filter
		/**
		 * Filter the elements
		 */
		Stream<String> streamOfStrs1=Stream.of("ABCD","ABC","BCD","A","B","ABCC","BBCC");
		Stream<String> result1=streamOfStrs1.filter((str)->str.length()<=3);
		System.out.println(result1.count());
		
		//MAP
		/*
		 * Used to transform each element
		 */
		Stream<String> streamOfStrs2=Stream.of("HELLO","HOW","ARE","YOU","EVERYBODY");
		Stream<String> result2=streamOfStrs2.map(str->str.toLowerCase());
		System.out.println(result2.collect(Collectors.toList()));
		
		//FLATMAP
		/**
		 * Used to iterate over each element of the complex collection,and helps to flatten it
		 * 
		 */
		
		List<List<String>> listOfStrings=Arrays.asList(
				Arrays.asList("I","LOVE","JAVA"),
				Arrays.asList("CONCEPTS","ARE","CLEAR"),
				Arrays.asList("ITS","VERY","EASY")
				);
		Stream<String> stream=listOfStrings.stream().flatMap((List<String> sentence)->sentence.stream());
		Stream<String> result=stream.map(str->str.toLowerCase());
		System.out.println(result.collect(Collectors.toList()));
		
		//Distinct
		
		Integer[] arr= {3,2,5,2,3,1,4,5};
		Stream streamOfValues=Arrays.stream(arr).distinct();
		System.out.println(streamOfValues.collect(Collectors.toList()));
		
		//Sorted
		/**
		 * Ascending
		 */
		Integer[] arr1= {3,2,5,2,3,1,4,5};
		System.out.println(Arrays.stream(arr1).sorted().distinct().collect(Collectors.toList()));
		
		/**
		 * Descending
		 */
		System.out.println(Arrays.stream(arr1).sorted((a1,a2)->a2-a1).collect(Collectors.toList()));
		
		/**PEEK
		 * Helps to see intermediate result os the stream which is getting proposed
		 */
		List<Integer> lists=Arrays.asList(2,3,4,6,1);
		List<Integer> results = lists.stream()
		.filter(a->a>2)
		.peek(a->System.out.println(a))
		.map(a->a*-1)
		.collect(Collectors.toList());
		System.out.println(results);
		
		//LIMIT
		System.out.println(lists.stream().limit(3).collect(Collectors.toList()));
		
		//SKIP
		System.out.println(lists.stream().skip(2).collect(Collectors.toList()));
		
		//mapToInt
		/**
		 * Helps to work with primitive int data type
		 */
		int[] a= {2,7,1,5,3,6};
		IntStream intStream=Arrays.stream(a);
		IntStream intResult = intStream.filter(value-> value>2);
		int[] filteredArray = intResult.toArray();
		for(int array:filteredArray) {
			System.out.println(array);
		} 
		/**
		 * convert string to int
		 */
		List<String> aa= Arrays.asList("2","7","1","5","3","6");
		IntStream streamOfInt = aa.stream().mapToInt(val->Integer.parseInt(val));
		
		

	}

}
