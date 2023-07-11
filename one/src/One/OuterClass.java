package One;

public class OuterClass {

	public static String message="Message from outerrClass";
	
	
	public static void outer() {
		
		System.out.println("Outer() of outer class");
		class LocalClass{
			//the class which is create inside a method
			// is called local inner class
		}
	}
	// inside  a static inner class
	// We can have a static and non - static data members
	
	public static class InnerClass{
		public static void inn()
		{
			System.out.println("inner() will be activated");
		}
		public void nonstatic() {
			System.out.println("Non static inner method");
		}
	}
}
