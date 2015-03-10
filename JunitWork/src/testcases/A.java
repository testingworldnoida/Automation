package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class A {

	@BeforeMethod
	publicdds void mycase()
	{
		System.out.println("CODE BEFORE METHOD");
	}
	
	@AfterMethod
	public void mycase1()
	{
		System.out.println("CODE AFTER METHOD" );
	}
	
	
    @Test(priority=2)
	public void hello()
	{
	System.out.println("Test1");	
	}
    
    
    @Test(priority=1)
    public void mycase222()
    {
    	System.out.println("Test2");
    }

    @BeforeClass
    public  void abc()
    {
    	System.out.println("BEFORE CLASS");
    }
	
    @AfterClass
    public  void xyz()
    {
    	System.out.println("AFTER CLASS");
    }
}
