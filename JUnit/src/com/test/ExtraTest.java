package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExtraTest {
	
		@Test
	    void test1()
	    {
	        //fail("Not yet implemented");
	        int a=10,b=20;
	        assertTrue(b>a);
	        System.out.println("AssertTrue TestCase Passed");    
	    }
	    @Test
	    void test2()
	    {
	        //fail("Not yet implemented");
	        int a=20,b=40;
	        assertFalse(b<a);
	        System.out.println("Assert False TestCase Passed");        
	    }
	    @Test
	    void test3()
	    {
	        //fail("Not yet implemented");
	        String str="Aditya";
	        assertNotNull(str);
	        System.out.println("Assert Not null TestCase Passed");
	    }
	    @Test
	    void test4()
	    {
	        //fail("Not yet implemented");
	        String str=null;
	        assertNull(str);
	        System.out.println("Assert Null TestCase Passed");
	    }
	    @Test
	    public void test5()
	    {
	        //fail("Not yet implemented");
	        int arr1[]= {1,2,3,4};
	        int arr2[]= {1,2,3,4};
	        assertArrayEquals(arr1,arr2);
	        System.out.println("Assert Arrays Equals TestCase Passed");
	    }
	}
