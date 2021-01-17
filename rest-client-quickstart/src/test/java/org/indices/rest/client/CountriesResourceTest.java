package org.indices.rest.client;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class CountriesResourceTest {

    @Test
    public void testCountryAllEndpoint() {
        given()
                .when().get("/country/all")
                .then()
                .statusCode(200)
                .body("[0].id", is("ABW"),
                        "[0].iso2Code", is("AW"),
                        "[0].name", is("Aruba")
                        );
    }

    @Test
    public void testCountryIndicatorPovEndpoint() {
        given()
                .when().get("/country/indicator/pov/BRA")
                .then()
                .statusCode(200)
                .body("[0].indicator.id", is("SI.POV.DDAY"),
                        "[0].country.id", is("BR"),
                        "[0].countryiso3code", is("BRA"));
    }

}
