package LambdaExpression;

interface C
{
	int print(int n);
}
public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C cube =(n) -> {
			return n*n*n;			
		};
		System.out.println("Cube is " + cube.print(5));
		System.out.println("Cube is " + cube.print(6));
	}

}
