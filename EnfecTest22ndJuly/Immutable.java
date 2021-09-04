package Test22ndJuly;

final class Immutable 
{
    final String name = "Aditya Mukherjee";
    private void display()
    {
        System.out.println("Hello " + name);
    }
    public static void main(String args[])
    {
        Immutable i = new Immutable();
        i.display();        
    }
}
