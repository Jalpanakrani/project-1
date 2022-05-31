package in.reqres.reqresinfo;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class ReqresDeleteTest {

    @Test
    public void deleteuser(){
        Response response = given()
                .pathParam("id","2")
                .when()
                .delete("/users/{id}");
        response.then().statusCode(204);
        System.out.println("Datab is delated");
        response.prettyPrint();
    }

}
