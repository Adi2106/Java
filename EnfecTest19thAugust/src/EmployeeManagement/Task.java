package EmployeeManagement;

interface DailyTasks
{
	void displayTask();
}

public class Task  extends Project implements DailyTasks{		
	public void displayTask()
	{		
		System.out.println("Your Today's Task is ::  Wap in java to copy from one file to another.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task t = new Task();
		Project p = new Project();
		t.displayTask();
	}

}
