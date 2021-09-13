package LambdaExpression;

interface I1{
	 void print(String s);
//	 void mul(int x);
}
interface I2{
	void mul(int x);
}
public class Test2 {
	public static void main(String args[])
	{
		I1 i = (String s)->{ System.out.println(s);			
		};
		I2 i2 = (int x)->{System.out.println(2*x);};
		i.print("Hello");
		i2.mul(5);
	}
}
