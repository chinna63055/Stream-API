package AnnonClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestDistintName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> list= new ArrayList<>();
		list.add(new Person(01,"Lokesh","Lok@gmail.com"));
		list.add(new Person(02,"Ram","Lok@gmail.com"));
		list.add(new Person(03,"Krishna","Lok@gmail.com"));
		list.add(new Person(04,"MANOJ","Lok@gmail.com"));
		list.add(new Person(05,"sagar","Lok@gmail.com"));
		list.add(new Person(06,"Lokesh","Lok@gmail.com"));
		list.add(new Person(07,"Reshma","Lok@gmail.com"));
		list.add(new Person(30,"Ram","Lok@gmail.com"));
		list.add(new Person(01,"Lokesh","Lok@gmail.com"));
		list.add(new Person(02,"Ram","Lok@gmail.com"));
		list.add(new Person(03,"Krishna","Lok@gmail.com"));
		list.add(new Person(04,"MANOJ","Lok@gmail.com"));
		list.add(new Person(05,"sagar","Lok@gmail.com"));
		list.add(new Person(06,"Lokesh","Lok@gmail.com"));
		list.add(new Person(07,"Reshma","Lok@gmail.com"));
		list.add(new Person(30,"Ram","Lok@gmail.com"));
		
		List<Person> L=list.stream().distinct().collect(Collectors.toList());
		System.out.println(L);

	}

}
