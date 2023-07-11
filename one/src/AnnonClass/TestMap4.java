package AnnonClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestMap4 {

	public static void main(String[] args) {
		
		List<Person> list= new ArrayList<>();
		list.add(new Person(01,"Lokesh","Lok@gmail.com"));
		list.add(new Person(02,"Ram","Lok@gmail.com"));
		list.add(new Person(03,"Krishna","Lok@gmail.com"));
		list.add(new Person(04,"MANOJ","Lok@gmail.com"));
		list.add(new Person(05,"sagar","Lok@gmail.com"));
		list.add(new Person(06,"Santhosh","Lok@gmail.com"));
		list.add(new Person(07,"Reshma","Lok@gmail.com"));
		list.add(new Person(30,"ganga","Lok@gmail.com"));
		
		list.stream()
			.map(e->{e.setPName(e.getPName().toUpperCase());
					return e;
					})
			.collect(Collectors.toList());
		
		list.forEach(e->System.out.println(e));
	}

}
