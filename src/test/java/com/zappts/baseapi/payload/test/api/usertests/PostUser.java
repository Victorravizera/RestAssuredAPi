package com.zappts.baseapi.payload.test.api.usertests;


import com.zappts.baseapi.payload.UserBooks;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class PostUser {

    //Testes Success

    @Test
    public void createSuccess() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("morpheus", "leader");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }

    
    @Test
    public void createSuccess2() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("Victor ravira", "QA");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }

    //Teste com informações duplicadas

    @Test
    public void duplicateData() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("morpheus", "leader");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }

    //Testes com letras maiusculas


    @Test
    public void capitallLeatersTest() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("JOÃO VICTOR JACINTO", "CEO");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }

    //Testes invertando os parametros


    @Test
    public void createInvertParam() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("leader", "morpheus");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }

    //Testes sem o campos obrigatorios


    @Test
    public void createSemName() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("", "leader");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }


    @Test
    public void createSemJob() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("morpheus", "");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }

    //Testes com caracteres especials e numeros


    @Test
    public void nameCaracteresEspecialsAndNumbers() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("m0ph3us@@", "leader");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }


    @Test
    public void jobCaracteresEspecialsAndNumbers() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("morpheus", "l34d3r#$@");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }

    @Test
    public void jobCaracteresEspecialsAndNumbersWhitoutName() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("", "l34d3r#$@");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }

    @Test
    public void nameCaracteresEspecialsAndNumbersWithoutJob() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("morpheus", "l34d3r#$@");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }

    //Testes com data em campos obrigatorios

    @Test
    public void dataTestNameField() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("23/08/1998", "student");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }

    @Test
    public void dataTestJobField() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("Ricardo Oliveira", "21/09/2005");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }

    // Testes com o minimo e maximo de caracteres

    @Test
    public void minTestNameField() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("m", "leader");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }

    @Test
    public void minTestJobField() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("Maicon", "l");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }


    @Test
    public void nameFieldMax() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("morpheusasdfgvcdasfghjgfdscvbnmjhytrecvfdsasdfredfmorpheusasdfgvcdasfghjgfdscvbnmjhytrecvfdsasdfredfmorpheusasdfgvcdasfghjgfdscvbnmjhytrecvfdsasdfredfmorpheusasdfgvcdasfghjgfdscvbnmjhytrecvfdsasdfredfmorpheusasdfgvcdasfghjgfdscvbnmjhytrecvfdsasdfredf", "l34d3r#$@");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }


    @Test
    public void jobFieldMax() {
        RestAssured.baseURI = "https://reqres.in/api/";


        UserBooks user = new UserBooks("morpheus", "morpheusasdfgvcdasfghjgfdscvbnmjhytrecvfdsasdfredfmorpheusasdfgvcdasfghjgfdscvbnmjhytrecvfdsasdfredfmorpheusasdfgvcdasfghjgfdscvbnmjhytrecvfdsasdfredfmorpheusasdfgvcdasfghjgfdscvbnmjhytrecvfdsasdfredfmorpheusasdfgvcdasfghjgfdscvbnmjhytrecvfdsasdfredf");


        Response response = given()
                .body(user)
                .post("/users");


        assertEquals(201, response.getStatusCode());

    }

    // Testes com parametros adicionais

    @Test
    public void parametAdiconalAdress() {
        RestAssured.baseURI = "https://reqres.in/api/";

       
        String adress = "raul bertan, 105";

    
        UserBooks user = createAdress("Maria fernanda", "CTO", adress);

        Response response = given()
                .body(user)
                .post("/users");

        assertEquals(201, response.getStatusCode());
    }

    private UserBooks createAdress(String name, String job, String adress) {
        
        UserBooks user = new UserBooks();
        user.setName(name);
        user.setJob(job);

        
        user.setAdress(adress);

        return user;
    }

    @Test
    public void parametAdicionalBirthday() {
        RestAssured.baseURI = "https://reqres.in/api/";

       
        String birthday = "23/08/1998";

    
        UserBooks user = createBirthday("Maria fernanda", "CTO", birthday);

        Response response = given()
                .body(user)
                .post("/users");

        assertEquals(201, response.getStatusCode());
    }

    private UserBooks createBirthday(String name, String job, String birthday) {
        
        UserBooks user = new UserBooks();
        user.setName(name);
        user.setJob(job);
        user.setBirthday(birthday);
    

        return user;
    }

    @Test
    public void paramtAdicionalBirthdayAdress() {
        RestAssured.baseURI = "https://reqres.in/api/";

       
        String birthday = "23/08/1998";
        String adress = "raul bertan, 105";

    
        UserBooks user = createBirthdayAdress("Maria fernanda", "CTO", birthday, adress);

        Response response = given()
                .body(user)
                .post("/users");

        assertEquals(201, response.getStatusCode());
    }

    private UserBooks createBirthdayAdress(String name, String job, String birthday, String adress) {
        
        UserBooks user = new UserBooks();
        user.setName(name);
        user.setJob(job);
        user.setBirthday(birthday);
        user.setAdress(adress);

        return user;
    }



}
