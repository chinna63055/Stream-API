package streamAPIImp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFilter {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();

		l.add(0);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		List<Integer>E=new ArrayList<>();
		List<Integer>O=new ArrayList<>();
		
		for(Integer i:l)
		{
			if(i%2==0)
				E.add(i);
			else
				O.add(i);
		}
//		for(Integer i:E) {
//			System.out.println(E.get(i));
//		}
		System.out.println("Even Numbers ");
		for(int i=0;i<E.size();i++)
		{
			System.out.println(E.get(i));
		}
		
		System.out.println("Odd Numbers ");
		for(int i=0;i<O.size();i++)
		{
			System.out.println(O.get(i));
		}
		System.out.println(E);
		System.out.println("-------");
		System.out.println(O);
		
		//==================================================
		
		/*
		 * List is a interface
		 * 
		 * List is collection object
		 *  1.stream
		 * when i  call list.stream();
		 * if we are calling that list.stream(); will converted to collection data type to (stream interface )Streamtype Oject
		 * for each loop
		 * if calling  
		 * 			list.stream().filter(i->i%2==0).collect(Collectors.toList())
		 * 								   Predicate
		 * 	l for list variable.
		 */
		Stream<Integer>st=l.stream();
		
		Predicate<Integer> pre=new Predicate<Integer>() {
			
			public boolean test(Integer t) {
				return t%2==0;
			}
		};
		
		
		Stream<Integer> st2 =st.filter(pre);
		List<Integer> list2 = st2.collect(Collectors.toList());
		System.out.println("==========+++++++++++++================");
		System.out.println(list2);
		
	}
	
	
}
