package pages;

import org.testng.Assert;
import base_class.Base_class;
import io.restassured.http.Header;
import resources.Headersrqst;
import resources.JSONpathrequest;

public class Get_request001 extends Base_class
{	
	public void getstatusrqst()
	{
	int code=getrequestmethod("/posts/10").getStatusCode();
	System.out.println("Status code is :"+code);
	Assert.assertEquals(code, 200);
	}
	public void getjsonvalue()
	{
		String node1= JSONpathrequest.getvalue("/posts/10").get("name");
		System.out.println(node1);
	}
	public void getresponsebody()
	{
		String responsebody= Base_class.getrequestmethod("/posts/10").asString();
		System.out.println("The response body of "+responsebody);
		Assert.assertEquals(responsebody.contains("Abhishek"), true);
	}
	public void getallheaders()

	{
		for(Header allheader: Headersrqst.getallheadersvalue("/posts/10"))
	{
		System.out.println(allheader.getName()+" : :"+allheader.getValue());
	}
	}
	public void getheadervalue()
	{
		String header= Headersrqst.getheadervalue("/posts/10", "Content-Type");
		System.out.println("The value of header is:"+ header);
	}
}
