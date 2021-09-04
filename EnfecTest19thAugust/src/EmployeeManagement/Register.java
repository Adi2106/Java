package EmployeeManagement;

public class Register {
	public String name;
	int age;
	Register(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println("Successfully Registered!");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		double id =  Math.random()*1000000;
		System.out.println("Employee Id Generated: " +  (int)id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Register r = new Register("Aditya", 22);
		r.display();
	}

}
