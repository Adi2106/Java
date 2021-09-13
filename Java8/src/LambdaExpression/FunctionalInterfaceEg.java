package LambdaExpression;
@FunctionalInterface
interface I3
{
	double pi = 3.14;
	double x1(int r);
}
public class FunctionalInterfaceEg {
	public static void main(String args[])
	{
		I3 i = (r) -> {
			return r*3.14*r;
		};
		System.out.println("Area Of circle is : " + i.x1(5));
	}
}
