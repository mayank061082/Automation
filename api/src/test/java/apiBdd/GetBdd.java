package apiBdd;
/*
 * given()
 * add auth,set cookies,add param,set header info etc
 * when()
 *  get,Post,put,delete method
 *  then()
 *  Validate Status code,extract header cookies and response body...., extract response
 */
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class GetBdd {
	
	@Test
	public void getMethod_BDD()
	{
				
		given()
		.when()
		  .get("http://ergast.com/api/f1/circuits/circuitId")
		  .then()
		  .statusCode(200)
		  .assertThat().body("circuitId", equalTo("albert_park"));		
		
	}

}