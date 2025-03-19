package activities;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Activity1 {

	
	@Test(priority = 1)
	public void addNewPet()
	{
		Map<String,Object> reqBody = new HashMap<>();
		reqBody.put("Id", 77232);
		reqBody.put("name","Riley");
		reqBody.put("status", "alive");

		given() 
		    .baseUri("https://petstore.swagger.io/v2/pet")
		    .header("content-type","application/json")
		    .body(reqBody)
		    .log().all()
		    
		.when()
		    .post()
		    
		 .then()
		    .log().all()
		    .statusCode(200)
		    .body("name", equalTo("Riley"))
		    .body("status", equalTo("alive"));
	}
	
	@Test(priority = 2)
	public void getPetInfo()
	{
 		given() 
	    .baseUri("https://petstore.swagger.io/v2/pet")
	    .header("content-type","application/json")
	    .pathParam("petId", 77232)
	    .log().all()
	    
	.when()
	    .get("/{petId}")
	    
	 .then()
	    .log().all()
	    .statusCode(200)
	    .body("name", equalTo("Riley"))
	    .body("status", equalTo("alive"));
		    
	}
	@Test(priority = 3)
	public void deletePet()
	{
 		given() 
	    .baseUri("https://petstore.swagger.io/v2/pet")
	    .header("content-type","application/json")
	    .pathParam("petId", 77232)
	    .log().all()
	    
	.when()
	    .delete("/{petId}")
	    
	 .then()
	    .log().all()
	    .statusCode(200)
	    .body("message",equalTo(77232));
   
		    
	}
	
}
