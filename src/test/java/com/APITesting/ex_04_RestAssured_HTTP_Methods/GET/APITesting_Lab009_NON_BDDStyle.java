package com.APITesting.ex_04_RestAssured_HTTP_Methods.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab009_NON_BDDStyle {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String pincode;
    @Test
    public void Test_Non_BDDStyle(){
        pincode = "560048";
    // Given Part-1
        r = RestAssured.given();
        r = r.baseUri("https://api.zippopotam.us");
        r = r.basePath("/IN/"+pincode);
    // When Part-2
        response = r.when().log().all().get();
        System.out.println(response.asString());
    // Then Part-3
        vr = response.then().log().all();
        vr.statusCode(200);

    }

    @Test
    public void Test_Non_BDDStyle_Negative(){
        pincode = "@";
        // Given Part-1
        r = RestAssured.given();
        r = r.baseUri("https://api.zippopotam.us");
        r = r.basePath("/IN/"+pincode);
        // When Part-2
        response = r.when().log().all().get();
        System.out.println(response.asString());
        // Then Part-3
        vr = response.then().log().all();
        vr.statusCode(404);


    }
}
