package Test29thJuly;
public class Employee 
{
    int empId;
    String empname;          
    int salary;
    Employee( String empname, int empId, int salary) 
    {
        super();
        this.empId = empId;
        this.empname = empname;        
        this.salary = salary;        
    }
    public String toString()
    {        
        return ("Ename : " + empname + "Eid : " + empId + " Salary : " + salary);
    }
}