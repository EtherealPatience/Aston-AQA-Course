package Specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;

public class PostWithParamsSpecs {
    private static String baseURI = "https://postman-echo.com/";
    private static int expectCode = 200;

    public static RequestSpecification request = with()
            .baseUri(baseURI)
            .log().all()
            .contentType(ContentType.TEXT);

    public static ResponseSpecification response = new ResponseSpecBuilder()
            .expectStatusCode(expectCode)
            .build();
}
