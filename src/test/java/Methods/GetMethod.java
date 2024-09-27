package Methods;

import POJO.GetData;
import Specs.GetSpecs;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GetMethod {
    @Test
    public void testGetMethod(){

        GetData data = GetSpecs.request
                .when()
                    .get("get/")
                .then()
                    .spec(GetSpecs.response)
                .log().body().
                extract().as(GetData.class);

        Assertions.assertEquals("postman-echo.com", data.getHeaders().getHost());
        Assertions.assertNotNull(data.getHeaders().getxRequestStart());
        Assertions.assertEquals("close", data.getHeaders().getConnection());
        Assertions.assertEquals("https", data.getHeaders().getxForwardedProto());
        Assertions.assertEquals("443", data.getHeaders().getxForwardedPort());
        Assertions.assertNotNull(data.getHeaders().getxAmznTraceId());
        Assertions.assertEquals("application/json", data.getHeaders().getContentType());
        Assertions.assertEquals("*/*", data.getHeaders().getAccept());
        Assertions.assertEquals("Apache-HttpClient/4.5.13 (Java/11.0.24)", data.getHeaders().getUserAgent());
        Assertions.assertEquals("gzip,deflate", data.getHeaders().getAcceptEncoding());

    }
}
