
import java.util.Scanner;
interface Shape
{
    abstract void areaAndperimerter();
}
class  Rectangle implements Shape,Runnable
{
    public void run()
    {
        areaAndperimerter();
    }
    public void areaAndperimerter()
    {
        int l,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length and Bredth to perform Area and Perimeter of Rectangle Class");
        l=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Area of recntangle : "+l*b);
        System.out.println("Perimeter of recntangle : "+(2*(l+b)));
    }
}  
class Circle implements Shape,Runnable
{
    int r=5;
    public void run()
    {
        areaAndperimerter();
    }
    public void areaAndperimerter()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius to perform Area and Cicumfrence of Circle Class");
        int r=sc.nextInt();
        System.out.println("Area of Circle : "+(3.14*r*r));
        System.out.println("Perimeter of Circle : "+(2*(3.14)*r));
    }
}
public class GameEngine
{
    public static void main(String[] args) throws InterruptedException
    {
        // TODO Auto-generated method stub
        Rectangle r=new Rectangle();
        Circle c=new Circle();
        Thread t=new Thread(r);  
        Thread t1=new Thread(c);
        t.start();
        t.join();
        t1.start();
        t1.join();
    }
}