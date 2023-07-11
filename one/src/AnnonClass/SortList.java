package AnnonClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
	public static void main(String[] args) {
		
		List<Person> list= new ArrayList<>();
		list.add(new Person(5,"Lokesh","Lok@gmail.com"));
		list.add(new Person(2,"Ram","Lok@gmail.com"));
		list.add(new Person(03,"Krishna","Lok@gmail.com"));
		list.add(new Person(6,"MANOJ","Lok@gmail.com"));
		list.add(new Person(7,"sagar","Lok@gmail.com"));
		list.add(new Person(9,"Santhosh","Lok@gmail.com"));
		list.add(new Person(8,"Reshma","Lok@gmail.com"));
		list.add(new Person(1,"ganga","Lok@gmail.com"));
		
		/*
		 * Natural Sorting Order
		 * 
		 * 1 to 10
		 */
		List<Person> list2=list.stream().sorted((e,e1)->{
				return e.getPName().compareToIgnoreCase(e1.getPName());
		}).collect((Collectors.toList()));
		
		System.out.println(list);
		
		/*
		 * 
		 */
		
		
		
		
	}
}
