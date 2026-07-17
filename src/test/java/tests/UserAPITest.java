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


}


}
