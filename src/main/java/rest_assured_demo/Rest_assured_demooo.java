package rest_assured_demo;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base_class.Base_class;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
//import static io.restassured.RestAssured.*;

public class Rest_assured_demooo extends Base_class
{
	@BeforeTest
	public void launchapi()
	{
	RestAssured.baseURI="http://localhost:3000";
	}
	@Test
	public void getapicode() 
	{    
		RequestSpecification httprequest = RestAssured.given();
		Response res = httprequest.request(Method.GET, "/posts/17");
		int statuscode = res.getStatusCode();
		System.out.println("Status code is :" + statuscode);
		Assert.assertEquals(statuscode, 200);
		String getbody = res.asString();
		System.out.println("Response body is :" + getbody);
	}
	@Test
	public void getpostapicode() 
	{
		RestAssured.baseURI = "http://localhost:3000";
		RequestSpecification httprequest = RestAssured.given();
		JSONObject jo = new JSONObject();
		jo.put("name", "Abhishek1");
		jo.put("Surname", "Tyagi");
		Map<String, Object> m = new LinkedHashMap <String, Object>();
		m.put("Street_no.", 4);
		m.put("Tower_no.", 7);
		m.put("Apartment_name", "Nirala_Aspire");
		m.put("State", "U.P.");
		m.put("Country", "India");
		jo.put("Address", m);
		httprequest.header("Content-Type", "application/json");
		httprequest.body(jo.toJSONString());
		Response res1 = httprequest.request(Method.POST, "/posts");
		String responsebody = res1.asString();
		System.out.println("Response body is : " + responsebody);
	}
	@Test
	public void getallheaders()
	{
		RequestSpecification httprequest=RestAssured.given();
		Response res=httprequest.request(Method.GET,"/posts/10");
		Headers allheader= res.headers();
		for(Header headers:allheader)
		{
			System.out.println(headers.getName()+"  ::   "+headers.getValue());
		}
	}
	@Test
	public void validatejsonbody()
	{
		RequestSpecification httprequest = RestAssured.given();
		Response res= httprequest.request(Method.GET,"/posts/10");
		String responsebody = res.asString();
		Assert.assertEquals(responsebody.contains("Abhishek"), true);
	}
	@Test
	public void getvalidateheader()
	{
		RequestSpecification httpreq = RestAssured.given();
		Response res= httpreq.request(Method.GET,"/posts/10");
		String header=res.header("Content-Length");
		System.out.println("Value of header is a : "+header);
	}
	@Test
	public void getvalueofnode()
	{
		//String id = "10";
		
		RequestSpecification httprequest = RestAssured.given();
		Response res = httprequest.request(Method.GET, "/posts/17");
		JsonPath jsonpath=res.jsonPath();
		String node1= jsonpath.get("name");
		System.out.println(node1);
	}
}
