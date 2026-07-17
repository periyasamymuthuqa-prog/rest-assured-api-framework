package client;


import base.BaseAPI;

import io.restassured.response.Response;



public class UserAPI extends BaseAPI {



    public Response getUser(
            int userId){


        return request
                .when()
                .get(
                "/api/users/"
                + userId);

    }




    public Response createUser(
            String payload){



        return request
                .body(payload)
                .when()
                .post(
                "/api/users");


    }




    public Response updateUser(
            int userId,
            String payload){


        return request
                .body(payload)
                .when()
                .put(
                "/api/users/"
                + userId);


    }




    public Response deleteUser(
            int userId){


        return request
                .when()
                .delete(
                "/api/users/"
                + userId);


    }


}
