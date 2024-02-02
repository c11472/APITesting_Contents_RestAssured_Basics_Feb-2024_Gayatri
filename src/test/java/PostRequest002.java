import java.io.IOException;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequest002 {
	public static void main(String args[]) throws IOException {

		// RestAssured.baseURI = "https://reqres.in/";
		// https://reqres.in/api/users
		/*
		 * // Define the request body (JSON payload in this example) --- data String
		 * requestBody =
		 * "{ \"email\": \"eve.holt@reqres.in\", \"password\": \"pistol\" }";
		 * 
		 * // Send a POST request to the endpoint with the request body
		 * 
		 * Response response = RestAssured.given().contentType(ContentType.JSON) // Set
		 * content type as JSON .body(requestBody).post("/api/register");
		 * 
		 * // Get the status code from the response int statusCode =
		 * response.getStatusCode(); System.out.println("Status Code: " + statusCode);
		 * 
		 * // Get the response body as a string String responseBody =
		 * response.getBody().asString(); System.out.println("Response Body: " +
		 * responseBody);
		 * 
		 * { "name": "morpheus", "job": "leader" }
		 * 
		 */

		String exp_StatusValue = "201 Created";

		RestAssured.baseURI = "https://reqres.in/";

		String requestbody = "{\name\":\"morpheus\",\"job\":\"leader\"}";

		Response response = RestAssured.given().contentType(ContentType.JSON).body(requestbody).post("/api/users");

		int statusCode = response.getStatusCode();
		System.out.println("Status Code: " + statusCode);

		String act_StatusValue = response.getStatusLine();

		if (act_StatusValue.contains("Created")) {
			System.out.println("Data has been inserted:");
		}

		else {
			System.out.println("Failed execution");
		}

		System.out.println(response.statusCode());
		System.out.println(response.getTime());

	}

}
