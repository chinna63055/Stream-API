package One;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String v="java is a programing language";

		System.out.println(v.length());
		String[] s=v.split(" ");
		int count =0;
		for(String a:s) {
			count++;
			System.out.println(a);
		}
		System.out.print("The count of words :"+count);
	}

}
