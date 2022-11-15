package ch.bbw.km;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

class GreetingResourceTest {


    @Test
    void helloWorld() {
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("Hello World!"));
    }

    @Test
    void addNumbers() {
        given()
                .when().get("/hello/1/2")
                .then()
                .statusCode(200)
                .body(is("3"));
    }



}
