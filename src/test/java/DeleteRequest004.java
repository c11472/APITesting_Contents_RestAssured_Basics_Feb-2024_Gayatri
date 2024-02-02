import java.io.IOException;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DeleteRequest004 {

	public static void main(String[] args) throws IOException {

		DeleteRequest004 obj = new DeleteRequest004();
		obj.testapp_login();

	}

	public void testapp_login() throws IOException {

		RestAssured.baseURI = "https://reqres.in/";

		String requestBody = "{ \"name\": \"morpheus\", \"job\": \"zion resident\" }";

		Response response = RestAssured.given().contentType(ContentType.JSON) // Set content type as JSON
				.body(requestBody).delete("/api/users/2");

		// Get the status code from the response
		int statusCode = response.getStatusCode();
		System.out.println("Status Code: " + statusCode);

		// Get the response body as a string
		String responseBody = response.getBody().asString();
		System.out.println("Response Body: " + responseBody);

	}

}
