package streamAPIImp;

import java.util.List;
import java.util.Optional;

import AnnonClass.Person;

public class MaxMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= List.of(12,34);
		
//		List<Person> PersonMax = l.stream().max((e1,e2)->e1-e2);
//		list.stream().max((e1,e2)->e1-e2);
		
		Optional<Integer> optional =list.stream().max((e1,e2)->e1-e2);
		
		System.out.println(optional);
		Integer max=optional.get();
		
		
		System.out.println(max);
		
	}

}
