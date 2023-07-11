package streamAPIImp;

public class Person {

		int Pid;
		String PName;
		String Email;
		public Person(int pid, String pName, String email) {
			super();
			Pid = pid;
			PName = pName;
			Email = email;
		}
		@Override
		public String toString() {
			return "\n"+"Person [Pid=" + Pid + ", PName=" + PName + ", Email=" + Email + "]";
		}
}
