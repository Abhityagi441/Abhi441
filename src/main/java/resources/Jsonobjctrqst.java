package resources;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Jsonobjctrqst 
{
	public static void jsonobjct(String key, String value)
	{
		JSONObject jo=new JSONObject();
		jo.put(key, value);
	}
	public static void mapobjct(String key, Object value)
	{
		Map<String, Object> m=new HashMap<String, Object>();
		m.put(key, value);
		System.out.println(m);
	}
}
