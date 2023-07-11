package streamAPIImp;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFlatMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l = List.of(1,4, 4, 9, 6, 16, 8);
		List<Integer> l1 = List.of(1,4, 4, 9, 6, 16, 8);
		List<Integer> l2 = List.of(1,4, 4, 9, 6, 16, 8);
		List<Integer> l3 = List.of(1,4, 4, 9, 6, 16, 8);
		
//		l.add(2);
		List<List<Integer>> LL=List.of(l,l1,l2,l3);
		
		
		System.out.println(LL);
		
		List<Integer> List2 = LL.stream().flatMap(e->e.stream()).collect(Collectors.toList());
		
		System.out.println(List2);

	}

}
