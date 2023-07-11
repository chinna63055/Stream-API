package streamAPIImp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestForEach {
	
	public static void main(String[] args) {
		List<Integer> i=new ArrayList<>();
		i.add(2);
		i.add(3);
		i.add(4);
		i.add(5);
		i.add(50);
		i.add(25);
		
		
		
		for(Integer e:i)System.out.println(e*e);
		System.out.println("_----------------------------_");
		
		i.forEach(e->{if(e%2==0) { System.out.println(e*e); } });
		
//		List<Integer> j=i.stream().filter(i->i.get().length();
		
		System.out.println("-------------------");
		
		List<Integer> list2 = i.stream().map(e -> e*e).collect(Collectors.toList());
		System.out.println(list2);
		
		/*
		 *  9-6-2023
		 *  
		 *  list.stream().map().collect(Collectors.toList());
		 *  
		 */
		
	}
}
