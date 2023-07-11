package AnnonClass;

import java.util.Comparator;
import java.util.List;

public class DataHandler implements Comparator
{
//	void sortByName(List<Customer> o,List<Customer> o1) {
//		Customer c=(Customer)o;
//		Customer c1=(Customer)o1;
//		c.getName().compareToIgnoreCase(c1.getName());
//	}
//	
//	void sortByage(List<Customer> o,List<Customer> o1) {
//		Customer c=(Customer)o;
//		Customer c1=(Customer)o1;
//		int a=c.getAge()-(c1.getAge());
//		
//	}
	
	
	

	@Override
	public int compare(Object o1, Object o2) {
		Customer c=(Customer)o1;
		Customer c1=(Customer)o2;
		
		return c.getAge()-c1.getAge();
	}
	
	
}
