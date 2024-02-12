package DifferentWaysToCreateStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * WHy internediate operations are lazy
 * Because it gets invoked only when calling terminal functions
 */
public class Sample {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(2,5,7,3,4,6,9,1);
		Stream<Integer> streamResult = list.stream().filter(a->a>=3).peek(a->System.out.println(a));
		streamResult.count();
		
		IntStream value = list.stream().mapToInt(a->a);
		 int[] result = value.toArray();
		 
		Object[] rr= list.stream().toArray();
	}

}
