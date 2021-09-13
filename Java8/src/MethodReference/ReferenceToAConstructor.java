package MethodReference;

interface Cons
{
	Student get();
}

class Student{
	String stName;
	public Student()
	{
		stName = "Aditya mukherjee";
	}
	@Override
	public String toString() {
		return "Student [stName=" + stName + "]";
	}
	
}

public class ReferenceToAConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons c = Student::new;
		System.out.println(c.get());
	}

}
