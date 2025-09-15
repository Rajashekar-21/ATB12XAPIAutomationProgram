package com.APITesting.Sample;

import io.restassured.RestAssured;

public class RestassuredHelloWorld {
    public static void main(String[] args) {

        RestAssured.given()
                .baseUri("https://api.postalpincode.in")
                .basePath("/pincode/560036")

                .when()
                .get()

                .then().log().all()
                .statusCode(200);
    }
}
