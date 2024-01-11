package com.zappts.baseapi.payload.test.api.usertests;

import com.zappts.baseapi.payload.UserBooks;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class PostUser {

    @Test
    public void testCreateUser() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("morpheus", "leader");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }

    @Test
    public void testCreateUserSemName() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("", "leader");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }

    @Test
    public void testCreateUserSemJob() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("morpheus", "");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }
    @Test
    public void testCreateUserNameEspecialAndNumbers() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("m0ph3us@@", "leader");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }
    @Test
    public void testCreateUserJobEspecialAndNumbers() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("morpheus", "l34d3r#$@");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }
    @Test
    public void testCreateUserNameTamMax() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("morpheusasdfgvcdasfghjgfdscvbnmjhytrecvfdsasdfredfmorpheusasdfgvcdasfghjgfdscvbnmjhytrecvfdsasdfredfmorpheusasdfgvcdasfghjgfdscvbnmjhytrecvfdsasdfredfmorpheusasdfgvcdasfghjgfdscvbnmjhytrecvfdsasdfredfmorpheusasdfgvcdasfghjgfdscvbnmjhytrecvfdsasdfredf", "l34d3r#$@");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }
    @Test
    public void testCreateUserJobTamMax() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("morpheus", "morpheusasdfgvcdasfghjgfdscvbnmjhytrecvfdsasdfredfmorpheusasdfgvcdasfghjgfdscvbnmjhytrecvfdsasdfredfmorpheusasdfgvcdasfghjgfdscvbnmjhytrecvfdsasdfredfmorpheusasdfgvcdasfghjgfdscvbnmjhytrecvfdsasdfredfmorpheusasdfgvcdasfghjgfdscvbnmjhytrecvfdsasdfredf");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }

}
