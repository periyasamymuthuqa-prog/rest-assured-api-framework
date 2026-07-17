package base;


import io.restassured.RestAssured;

import io.restassured.specification.RequestSpecification;



public class BaseAPI {



protected RequestSpecification request;



public BaseAPI(){


    RestAssured.baseURI =
            "https://reqres.in";



    request =
            RestAssured
            .given()
            .header(
            "Content-Type",
            "application/json")
            .log()
            .all();


}


}
