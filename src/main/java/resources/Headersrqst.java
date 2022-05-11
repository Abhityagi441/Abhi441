package resources;

import base_class.Base_class;

import io.restassured.http.Headers;

public class Headersrqst extends Base_class
{
	public static Headers getallheadersvalue(String parameter)
	{
		return getrequestmethod(parameter).headers();
	}
	public static String getheadervalue(String parameter, String header)
	{
		return getrequestmethod(parameter).header(header);
	}
}
