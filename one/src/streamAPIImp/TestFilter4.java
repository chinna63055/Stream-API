package streamAPIImp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import AnnonClass.Person;

public class TestFilter4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> list= new ArrayList<>();

		list.add(new Person(5,"Lokesh","Lok@gmail.com"));
		list.add(new Person(2,"Ram","Lok@gmail.com"));
		list.add(new Person(03,"Krishna","Lok@gmail.com"));
		list.add(new Person(6,"MANOJ","Lok@gmail.com"));
		list.add(new Person(7,"sagar","Lok@gmail.com"));
		list.add(new Person(9,"Santhosh","Lok@gmail.com"));
		list.add(new Person(8,"Reshma","Lok@gmail.com"));
		list.add(new Person(1,"ganga","Lok@gmail.com"));
		List<Person> List2=list.stream().filter(e-> e.getPName().length()>=5).collect(Collectors.toList());
		
		Consumer<Person> con = System.out::println;
		
		System.out.println(con);
		
		List2.forEach(System.out::println);
		/*
		 * System is a final class 
		 * it has multiple 
		 */
	}

}
