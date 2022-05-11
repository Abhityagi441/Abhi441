package Test_api;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base_class.Base_class;
import pages.Get_request001;

public class Get_request001_test extends Base_class
{
	Get_request001 ob;
	@BeforeTest
	public void getRequest001()
	{
		ob=new Get_request001();
	}
	@Test
	public void getstatusrqst()
	{
		ob.getstatusrqst();
	}
	@Test
	public void getjsonvalue()
	{
		ob.getjsonvalue();
	}
	@Test
	public void getresponsebody()
	{
		ob.getresponsebody();
	}
	@Test
	public void getallheaders()
	{
		ob.getallheaders();
	}
	@Test
	public void getheadervalue()
	{
		ob.getheadervalue();
	}
}
