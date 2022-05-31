package in.reqres.myfirsttest;


import in.reqres.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/**
 * Created by Jalpa Nakrani
 */
public class MyFirstTest extends TestBase {

    @Test
    public void getAllStudentInfo() {
        given()
                .when()
                .get("https://reqres.in/api/users/2")
                .then()
                .statusCode(200);
      /*  Response response = given()
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();*/
    }
}
