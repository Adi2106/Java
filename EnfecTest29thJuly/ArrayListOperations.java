package Test29thJuly;

import java.util.ArrayList;

public class ArrayListOperations  {
    ArrayList al = new ArrayList<>();
    void addDetails(Object e)
    {
        al.add(e.toString());
    }
    void Display()
    {
        System.out.println(al);
    }    
    
    public static void main(String args[])
    {
        Employee e1 = new Employee("Aditya ", 001, 1000000);
        Employee e2 = new Employee("Ram ", 002, 50000);
        Employee e3 = new Employee("Shyam ", 003, 25000);
        Employee e4 = new Employee("Sam ", 004, 60000);
        Employee e5 = new Employee("John ", 005, 85000);
        ArrayListOperations a = new ArrayListOperations();
        a.addDetails(e1);
        a.addDetails(e2);
        a.addDetails(e3);
        a.addDetails(e4);
        a.addDetails(e5);
        a.Display();
    }
}
