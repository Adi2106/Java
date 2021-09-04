/**SINGLETON CLASS
 *  SingleTon Class may be defined as a class that can have only one object at a time.
 *   as instance of the class
 *   So whatever modifications we do to any variable inside the class through any instance,
 *    it affects the variable of the single instance created and is visible if we 
 that variable through any variable of that class type defined.
 *  T design a singleton class:
 *	Make constructor as private.
 *	Write a static method that has return type object of this singleton class.
 *  Here getInstance() Method is used
 */

public class SingleTon
{
    private static SingleTon single_instance = null;
  
    public String s;
  
    private SingleTon()
    {
        s = "Singleton class";
    }
  
    public static SingleTon getInstance()
    {
        if (single_instance == null)
            single_instance = new SingleTon();
  
        return single_instance;
    }
    
    public static void main(String args[])
    {
 
        SingleTon x = SingleTon.getInstance();

        SingleTon y = SingleTon.getInstance();

        x.s = (x.s).toUpperCase();
  
        System.out.println("String from Object x is " + x.s);
        System.out.println("String from Object y is " + y.s);
     }
}
  
