import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestingAssertFuncs {

	@DisplayName("Test For Not Null")
	@Test
	void test() 
	{
		String s = "Enfec";
		assertNotNull(s);
		System.out.println("Not Null Case Passed");
	}
	@DisplayName("Test For Null")
	@Test
	void test2() 
	{
		String s = null;
		assertNull(s);
		System.out.println("Null Case Passed");
	}
	@DisplayName("Test For AssertTrue")
	@Test
	void test3() 
	{
		int a = 10;
		int b = 20;
		assertTrue(a<b);		
		System.out.println("True Case Passed");
	}
	@DisplayName("Test For AssertFalse")
	@Test
	void test4() 
	{
		int a = 10;
		int b = 20;
		assertFalse(a>b);
		System.out.println("False Case Passed");
	}
	@DisplayName("Test For ArrayEquals")
	@Test
	void test5() 
	{
		int a[] = {10, 20, 30, 40, 50};
		int b[] = {10, 20, 30, 40, 50};
		assertArrayEquals(a,b);
		System.out.println("Array Case Passed");
	}
	

}
