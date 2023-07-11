package streamAPIImp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFlatMap {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();

		l.add(0);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		List<String> list=Arrays.asList("5.6","7.4","4","1","2.3");
		
		List<Integer> L=l.stream().flatMap(e->Stream.of((e*e),(e*2)))
				.collect(Collectors.toList());
		
		list.stream().flatMap(num -> Stream.of(num)).
        forEach(System.out::println);
		/*
		 * 5.6
			7.4
			4
			1
			2.3
		 */
		
		/*
		 * flatMap(Function)
		 * 	This function is getting input as any object and return ( by apply Method) stream<Object> as Out to the function
		 * 
		 *  flatMap(e->Stream.of((e*e),(e*2))) Answer [0, 0, 1, 2, 4, 4, 9, 6, 16, 8, 25, 10]
		 *  
		 *  flatting
		 */
		System.out.println(L);
		//[0, 0, 1, 2, 4, 4, 9, 6, 16, 8, 25, 10]

	}

}
