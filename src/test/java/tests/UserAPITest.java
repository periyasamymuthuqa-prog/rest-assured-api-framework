package tests;


import org.testng.Assert;

import org.testng.annotations.Test;


import client.UserAPI;

import io.restassured.response.Response;

import utils.TestData;



public class UserAPITest {



@Test
public void validateGetUserAPI(){


    UserAPI userAPI =
            new UserAPI();


    Response response =
            userAPI.getUser(2);



    Assert.assertEquals(
            response.statusCode(),
            200);



    String firstName =
            response
            .jsonPath()
            .getString(
            "data.first_name");


    Assert.assertEquals(
            firstName,
            "Janet");


}



@Test
public void validateCreateUserAPI(){


    UserAPI userAPI =
            new UserAPI();



    Response response =
            userAPI.createUser(
            TestData.createUserPayload());



    Assert.assertEquals(
            response.statusCode(),
            201);



    String name =
            response
            .jsonPath()
            .getString(
            "name");


    Assert.assertEquals(
            name,
            "Periyasamy");


}


}
