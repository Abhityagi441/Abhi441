package resources;

import base_class.Base_class;
import io.restassured.path.json.JsonPath;

public class JSONpathrequest extends Base_class
{
	public static JsonPath getvalue(String request)
	{
		return getrequestmethod(request).jsonPath();
	}
}
