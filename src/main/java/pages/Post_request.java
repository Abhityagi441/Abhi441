package pages;

import org.testng.annotations.Test;

import base_class.Base_class;
import resources.Jsonobjctrqst;

public class Post_request extends Base_class
{	@Test
	public void postrqst()
	{
		Jsonobjctrqst.jsonobjct("name", "Ravi");
		Jsonobjctrqst.jsonobjct("Surname", "Shankar");
		Jsonobjctrqst.mapobjct("Street_no.", 1);
		Jsonobjctrqst.mapobjct("Tower_no.", 2);
		Jsonobjctrqst.mapobjct("Apartment_name", "Nirala1");
		Jsonobjctrqst.mapobjct("State","U.P.");
	}
}
