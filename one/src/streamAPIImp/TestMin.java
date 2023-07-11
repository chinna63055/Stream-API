package streamAPIImp;

import java.util.List;
import java.util.Optional;

public interface TestMin {
	public static void main(String[] args) {
		List< Integer> list= List.of(9,8,6,7,5,4,3,8,0);
		
		
		Integer min = list.stream().min(( e1,e2)->e1-e2).get();
		System.out.println(min);
		
		Object op=new Object();
		op=new Person(0,null,null);
		
		op=null;
		
		System.out.println(op);
		System.out.println(op);
		System.out.println(op);

	}
}
