package DifferentWaysToCreateStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminateFunctions {

	public static void main(String[] args) {
		
		//reduce
		/**
		 * Reduction on the elements of the stream,Perform associative aggregative  funtion
		 */
		
		List<Integer> list=Arrays.asList(3,6,1,2,8,4);
		Optional<Integer> result = list.stream().filter(a->a>3).reduce((a,b)->a+b);
		System.out.println(result.get());
		
		//toArray
		/**
		 * Collect the elements of stream into an array
		 */
		Integer[] rr = list.stream().filter(a->a>3).toArray(a->new Integer[a]);
		
		//FOREACH
		
		list.stream().filter(a->a>3).forEach(a->System.out.println(a));
		
		//COllect the element of stream into list
		List<Integer> res=list.stream().filter(a->a>3).collect(Collectors.toList());
		System.out.println(res);
		
		//MIN,MAX
		
		System.out.println(list.stream().filter(a->a>3).min((a1,a2)->a1-a2).get());
		System.out.println(list.stream().filter(a->a>3).max((a1,a2)->a1-a2).get());
		
		//COUNT
		System.out.println(list.stream().filter(a->a>3).count());
		
		//ANYMATCH
		boolean ress = list.stream().anyMatch(a->a>3);
		System.out.println(ress);
		
		System.out.println(list.stream().allMatch(a->a>3));
		System.out.println(list.stream().noneMatch(a->a>8));
		
		//FINDFIRST
		System.out.println(list.stream().filter(a->a>3).findFirst().get());
		System.out.println(list.stream().filter(a->a>3).findAny().get());
		
	}

}
