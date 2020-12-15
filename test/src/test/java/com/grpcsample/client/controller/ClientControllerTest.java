package com.grpcsample.client.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.is;

@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class ClientControllerTest {

    @Test
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
