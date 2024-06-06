package org.acme.webapp;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class FilmResourceTest {
    @Test
    public void helloWorldEndpointShouldReturnHelloWorld() {
        given()
                .when().get("/helloworld")
                .then()
                .statusCode(200)
                .body(is("Hello, World!"));
    }

    @Test
    public void filmEndpointShouldReturnFilmTitle() {
        given()
                .when().get("/film/27")
                .then()
                .statusCode(200)
                .body(is("ANONYMOUS HUMAN"));
    }

    @Test
    public void givenIdFilmEndpointShouldReturnCorrectFilmTitle() {
        given()
                .when().get("/film/42")
                .then()
                .statusCode(200)
                .body(is("ARTIST COLDBLOODED"));
    }
}
