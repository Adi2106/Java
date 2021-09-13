package LambdaExpression;
/**
 *  Method Reference
 *  It is used to refer to a function of FunctionalInterface
 *  it is a compact version of lambda Expression
 *  */

interface I5
{
	void hello();	
}
class Method1{
	static void hello() {
		System.out.println("Hello World!");
	}
	static void bye()
	{
		System.out.println("Bye Bye!");
	}
}
public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I5 i = Method1::hello;		
		i.hello();
	}

}
