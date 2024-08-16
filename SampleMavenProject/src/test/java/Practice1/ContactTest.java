package Practice1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactTest 
{
	
	@Test
	public void createContactTest()
	{
		System.out.println("execute createContactTest");
		System.out.println(System.getProperty("browser"));
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("un"));
		
	}
	
	
	@Test
	public void modifyContact() {
		System.out.println("execute modifyContact");
	}
	
	
	@Test
	public void  deleteContact() {
		System.out.println("execute deleteContact");
	}
	
	

}
