package automataionAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.*;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiAutomate {
	
	@Test(priority=1)
	public void GetMethod(){
		RestAssured.baseURI="http://restAPI.demoqa.com/utilities/weather/city";
		
		RequestSpecification hr=RestAssured.given();
		Response rs=hr.request(Method.GET,"Ghaziabad");
		String s=rs.getBody().asString();
		System.out.println("Responce body :"+s);
		int Statuscode=rs.getStatusCode();
		System.out.println("Status code is :-" +Statuscode);
		Assert.assertEquals(Statuscode, 200);
	}
	
		
		@Test(priority=0)
		public void PostMethod(){
			RestAssured.baseURI="http://restAPI.demoqa.com/utilities/weather/city";			
			RequestSpecification hr=RestAssured.given();
			Response rs=hr.request(Method.GET,"Mumbai");
			String s=rs.getBody().asString();
			System.out.println("Responce body :"+s);
			int Statuscode=rs.getStatusCode();
			System.out.println("Status code is :-" +Statuscode);
			Assert.assertEquals(Statuscode, 200);
	}}
