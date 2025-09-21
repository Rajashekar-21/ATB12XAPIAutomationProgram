package com.APITesting.ex_03_Testng_AllureReports;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab004_Testcase {
    String pincode = "110048";
    @Test
    public void Get_positive_Tc1() {
        pincode = "110048";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
    @Test
    public  void Get_negative_Tc2(){
            pincode = "@";
            RestAssured
                    .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/"+pincode)
                    .when()
                    .get()
                    .then()
                    .log().all().statusCode(404);

        }


}
