package examples;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;

public class FirstTest {
	@Test
	public void getPetWithQueryParam()
	{
		// Given: Contains requirements for the request
		// When: Send Request and Receiving response
		
		Response response =
				//contains req't for the request.
				 given()
					.baseUri("https://petstore.swagger.io/v2/pet")
					.header("Content-Type","application/json")
					.queryParam("status","alive")
				.when()
				    .get("/findByStatus");
			

		//Then : Response extraction and assertion
			
			//print the response code
			System.out.println(response.getStatusCode());
			
			//print the response headers
			System.out.println(response.getHeaders().asList());
				
			//print the response body
			System.out.println(response.getBody().asPrettyString());
			
			String petStatus = response.then().extract().path("[0]['status']");
			
			assertEquals(petStatus, "alive");
			
			//
            response.then().statusCode(200).body("[0]['status']" , equalTo("alive"));
			
	}	@Test
	public void getPetWithPathParam()
	{
		
		given()
				.baseUri("https://petstore.swagger.io/v2/pet")
				.header("Content-Type","application/json")
				.pathParam("petId" , 77232)
			.when()
				.get("{petId}")
			.then()
				.statusCode(200)
				.body("status",equalTo("alive"));
	
	}
	
}