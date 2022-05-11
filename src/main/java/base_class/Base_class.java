package base_class;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Base_class 
{
	public static Response getrequestmethod(String parameter)
	{
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification httprequest=RestAssured.given();
		return httprequest.request(Method.GET, parameter);
	}
	public static Response postrequestmethod(String parameter)
	{
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification httprequest=RestAssured.given();
		return httprequest.request(Method.POST, parameter);
	}
	public static Response putrequestmethod(String parameter)
	{
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification httprequest=RestAssured.given();
		return httprequest.request(Method.PUT, parameter);
	}
	public static Response deleterequestmethod(String parameter)
	{
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification httprequest=RestAssured.given();
		return httprequest.request(Method.DELETE, parameter);
	}
}
