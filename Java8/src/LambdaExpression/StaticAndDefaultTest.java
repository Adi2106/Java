package LambdaExpression;
interface I4
{
	static void sqr(int x)
	{
		System.out.println(x*x);
	}
	default void square(int y)
	{
		System.out.println(y*y);
	}

}
public class StaticAndDefaultTest implements I4 {

	public void square(int x)
	{
		System.out.println(x*x*x);
	}
	public static void sqr(int x)
	{
		System.out.println(x*x*x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		I4 i = new StaticAndDefaultTest();
		i.square(2);
		I4.sqr(10);
	}

}
