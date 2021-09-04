import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
class Books implements Serializable
{
   int id,price;
   String name;
   public Books(int id, int price, String name)
   {
      super();
      this.id = id;
      this.price = price;
      this.name = name;
   }
   public int getId()
   {
      return id;
   }
   public void setId(int id)
   {
     this.id = id;
   }
   public int getPrice()
   {
     return price;
   }
   public void setPrice(int price)
   {
     this.price = price;
   }
   public String getName()
   {
     return name;
   }
   public void setName(String name)
   {
     this.name = name;
   }
   @Override
   public String toString()
   {
     return "Book [id=" + id + ", price=" + price + ", name=" + name + "]";
   }
   @Override
   protected Object clone() throws CloneNotSupportedException
   {
    // TODO Auto-generated method stub
    return super.clone();
   }
}
public class Book
{
    private static final boolean Object = false;

	public static void main(String[] args) throws IOException, ClassNotFoundException
    {
         FileOutputStream fo=new FileOutputStream("bookdetail.txt");
         FileInputStream fi=new FileInputStream("bookdetail.txt");       
         ArrayList a=new ArrayList();
         int id,price;
         String auth_name;
         Scanner sc=new Scanner(System.in);
         ObjectOutputStream obj=new ObjectOutputStream(fo);
         ObjectInputStream obj1=new ObjectInputStream(fi);         
             System.out.println("Length");
             int len=sc.nextInt();
             for(int i=1; i<=len; i++)
             {
            	 System.out.println("Enter Book Id ");
                 id=sc.nextInt();
                 System.out.println("Enter Book Name ");
                 auth_name=sc.next();
                 System.out.println("Enter Book Price ");
                 price = sc.nextInt(); 
                 Books b=new Books(id,price,auth_name);
                 obj.writeObject(b);
                 Books b1=(Books)obj1.readObject();
                 a.add(b1);
             }
             Object ar[] = a.toArray();
             System.out.println("Displaying Objects To End User \n");
             for (Object o : ar) 
             {
            	 System.out.println(o);
             }            
             obj1.close();
             obj.flush();
             obj.close();                                                
    }
}