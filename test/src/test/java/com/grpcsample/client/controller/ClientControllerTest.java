package com.grpcsample.client.controller;

import com.grpcsample.BaseSpringBootTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.is;

public class ClientControllerTest  extends BaseSpringBootTest {

    @Test(groups = "integration")
    public void testGetTxnHistory() {

        String responseString = get("http://localhost:8080/user/1")
                .then()
                .assertThat()
                .statusCode(200).extract().asString();

        System.out.println("responseString : " + responseString);

        get("http://localhost:8080/user/1")
                .then()
                .assertThat()
                .statusCode(200)
                .body("size()", is(2));
    }
}
