import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PutUpdateRequest003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://reqres.in/";

		String requestBody = "{ \"name\": \"morpheus\", \"job\": \"zion resident\" }";

		Response response = RestAssured.given().contentType(ContentType.JSON) // Set content type as JSON
				.body(requestBody).put("/api/users/2");

		// Get the response body as a string
		String responseBody = response.getBody().asString();
		System.out.println("Response Body: " + responseBody);

		System.out.println(response.getStatusLine());

		// validate the body content

	}

}
