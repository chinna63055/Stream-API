package AnnonClass;

import java.util.Objects;

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
	
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Email, PName, Pid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(Email, other.Email) && Objects.equals(PName, other.PName) && Pid == other.Pid;
	}
	
	
	
	
	
	

}
