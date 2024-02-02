import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest001 {
	public static void main(String args[]) throws InterruptedException {
		// given -- all the input details
		// when -- submit api
		// then -- validate response

		// RestAssured.baseURI = "https://reqres.in/api/users/2";
		// Then - verify the status code

		// Set the base URI for the API

		RestAssured.baseURI = "https://reqres.in/";

		// Send a GET request to the endpoint
		Response response = RestAssured.get("/api/user/2");

		Thread.sleep(1500);

		System.out.println(response.getStatusCode()); // 200

		Thread.sleep(1500);

		System.out.println(response.getBody().asString()); // res body

		String contentType = response.getContentType();
		System.out.println(contentType);

		String SessionId = response.getSessionId();
		System.out.println(SessionId); // null

		System.out.println(response.getTime());

		String exp_statusLine = "200 OK";

		String Act_StatusLine = response.getStatusLine();

		System.out.println(Act_StatusLine); // HTTP/1.1 200 OK

		if (Act_StatusLine.contains(exp_statusLine)) {
			System.out.println("Valid Response code");

		} else {
			System.out.println("Invalid Responce code");
		}

	}

}
