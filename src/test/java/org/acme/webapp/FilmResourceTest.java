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
}
