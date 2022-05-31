package in.reqres.reqresinfo;

import in.reqres.model.ReqresPojo;
import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;

/*
 *  Created by Jalpa Nakrani
 */
public class ReqresPostTest extends TestBase {

    @Test
    public void postcreated() {

        ReqresPojo reqresPojo = new ReqresPojo();
        reqresPojo.setName("morpheus");
        reqresPojo.setJob("leader");

       Response response = given()
                .header("Connection" , "keep-alive")
                .body(reqresPojo)
                .when()
                .post("/users");
       response.then().statusCode(201);
       response.prettyPrint();
    }
    @Test
    public void postloginsuccessul() {

        ReqresPojo reqresPojo = new ReqresPojo();
        reqresPojo.setEmail("eve.holt@reqres.in");
        reqresPojo.setJob("cityslicka");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(reqresPojo)
                .when()
                .post("/login");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    }
