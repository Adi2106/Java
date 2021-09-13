package MethodReference;
//Example of instance of method reference
interface I2{
	 void print();	
}
class M2{
	public void print()
	{
		System.out.println("Hello World");
	}
}
public class ReferenceToAnInstanceMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M2 m = new M2();		
		I2 i = m::print;
		i.print();
	}

}
