import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;

public class Assertion001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://reqres.in/";
		// given - specifying QurryParameter , Body , Header
		// when - post()."resource"
		// Then - verify the status code
		given().log().all().queryParam("name", "morpheus", "job", "leader")
				.body("{\n" + "    \"name\": \"morpheus\",\n" + "    \"job\": \"leader\"\n" + "}")
				.header("Content-Type", "application/json").when().post("/api/users").then().log().all().assertThat()
				.statusCode(201).body("job", equalTo("leader"));

	}

}
