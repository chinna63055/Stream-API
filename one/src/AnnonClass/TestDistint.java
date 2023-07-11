package AnnonClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestDistint {
	public static void main(String[] args) {
		List<Integer> i=new ArrayList<>();
		i.add(2);
		i.add(30);
		i.add(4);
		i.add(5);
		i.add(50);
		i.add(2);
		
		
		List<Integer> list=i.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(i);
		System.out.println("---------------");
		System.out.println(list);
		
		
	}
}
