package MethodRefference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import AnnonClass.Person;

public class Test {

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
		
		List<String> l=list.stream().map(MethodRefClass::operation).collect(Collectors.toList());
		
		l.forEach(System.out::println);
	}

}
