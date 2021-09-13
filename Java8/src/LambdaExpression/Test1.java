package LambdaExpression;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Runnable r = () -> {
			for(int i=1; i<=3; i++)
			{
				System.out.println("Test " + i);
			}
		};
		Thread t = new Thread(r);
		t.start();		
	}

}
