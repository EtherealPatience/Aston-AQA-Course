package Methods;

import POJO.GetData;
import Specs.GetSpecs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GetMethod {
    @Test
    public void testGetMethod(){
        String hostExpected = "postman-echo.com";
        String connectionExpected = "close";
        String xForwardedProtoExpected = "https";
        String xForwardedPortExpected = "443";
        String contentTypeExpected = "application/json";
        String acceptExpected = "*/*";
        String userAgentExpected = "Apache-HttpClient/4.5.13 (Java/11.0.24)";
        String acceptEncodingExpected = "gzip,deflate";

        GetData data = GetSpecs.request
                .when()
                    .get("get/")
                .then()
                    .spec(GetSpecs.response)
                .log().body().
                extract().as(GetData.class);

        Assertions.assertEquals(hostExpected, data.getHeaders().getHost());
        Assertions.assertNotNull(data.getHeaders().getxRequestStart());
        Assertions.assertEquals(connectionExpected, data.getHeaders().getConnection());
        Assertions.assertEquals(xForwardedProtoExpected, data.getHeaders().getxForwardedProto());
        Assertions.assertEquals(xForwardedPortExpected, data.getHeaders().getxForwardedPort());
        Assertions.assertNotNull(data.getHeaders().getxAmznTraceId());
        Assertions.assertEquals(contentTypeExpected, data.getHeaders().getContentType());
        Assertions.assertEquals(acceptExpected, data.getHeaders().getAccept());
        Assertions.assertEquals(userAgentExpected, data.getHeaders().getUserAgent());
        Assertions.assertEquals(acceptEncodingExpected, data.getHeaders().getAcceptEncoding());

    }
}
