package streamAPIImp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import AnnonClass.Person;

public class TestFlatMap3 {

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
		
		Function<Person,Stream<Person>> fun = new Function<Person,Stream<Person>>(){
			
			public Stream<Person> apply(Person e)
			{
				Person p1 =new Person(e.getPid(),e.getPName().toUpperCase(),e.getEmail());
				
				Person p2 = new Person(e.getPid(),e.getPName(),e.getEmail().toUpperCase());
				
				
				p1.setPName((p1.getPName().toUpperCase()));
				
				p2.setEmail(p2.getEmail().toUpperCase());
				
				return Stream.of(p1,p2);
			}
		};
		List<Person> p =list.stream().flatMap(e->{
			
			e.setPName(e.getPName().toUpperCase());
			return Stream.of(e,e);
		
		}).collect(Collectors.toList());
		
		// 2
		
List<Person> p2 =list.stream().flatMap(fun).collect(Collectors.toList());
		
		System.out.println(p2);
		
		
		/*
		 * Here 
		 * 		There are using max method 
		 */
		
//		List<Person> PersonMax = list.stream().max((e1,e2)->e1-e2);
	}

}
