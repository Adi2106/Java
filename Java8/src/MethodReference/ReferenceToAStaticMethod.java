package MethodReference;
//Reference To A Static Method
interface I1
{
	void print();
}
class M1
{
	public static void hello()
	{
		System.out.println("Hello");
	}
}
public class ReferenceToAStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I1 i = M1::hello;
		i.print();
	}

}
