package client;


import base.BaseAPI;

import io.restassured.response.Response;



public class UserAPI extends BaseAPI {



    public Response getUser(
            int userId){


        return request
                .log()
                .all()
                .when()
                .get(...)
                .then()
                .log()
                .all()
                .extract()
                .response();

    }




    public Response createUser(
            String payload){



        return request
                .log()
                .all()
                .when()
                .get(...)
                .then()
                .log()
                .all()
                .extract()
                .response();


    }




    public Response updateUser(
            int userId,
            String payload){


        return request
                .log()
                .all()
                .when()
                .get(...)
                .then()
                .log()
                .all()
                .extract()
                .response();

    }




    public Response deleteUser(
            int userId){


        return request
                .log()
                .all()
                .when()
                .get(...)
                .then()
                .log()
                .all()
                .extract()
                .response();


    }


}
