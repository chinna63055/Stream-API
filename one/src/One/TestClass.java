package One;

public class TestClass {

	public static void main(String[] args) {
		
		
		OuterClass.outer();
		System.out.println(OuterClass.message);
		
		OuterClass.InnerClass.inn();
		
		OuterClass.InnerClass oc=new OuterClass.InnerClass();
	}
}
