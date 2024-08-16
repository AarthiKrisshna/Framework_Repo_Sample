package Package2;

import org.testng.annotations.Test;

public class OrganizationTest 
{
	@Test
	public void createOrgTest()
	{
		System.out.println("execute createOrgTest");
	}
	@Test
	public void modifyOrgTest() {
		System.out.println("execute modifyOrgTest");
		
		System.out.println(System.getProperty("browser"));
		System.out.println(System.getProperty("url"));
		System.out.println(System.getProperty("un"));
	}

}
