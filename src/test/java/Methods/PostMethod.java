package Methods;

import POJO.PostData;
import Specs.PostSpecs;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PostMethod {

    @Test
    public void testPostMethod(){
        String reqBody = "{\n" +
                "    \"test\": \"value\"\n" +
                "}";

        String hostExpected = "postman-echo.com";
        String connectionExpected = "close";
        String expectedContentLength = "23";
        String xForwardedProtoExpected = "https";
        String xForwardedPortExpected = "443";
        String contentTypeExpected = "application/json";
        String acceptExpected = "*/*";
        String userAgentExpected = "Apache-HttpClient/4.5.13 (Java/11.0.24)";
        String acceptEncodingExpected = "gzip,deflate";
        String urlExpected = "https://postman-echo.com/post";

        PostData data = PostSpecs.request.
                when().
                    body(reqBody).
                    post("/post").
                then().
                    spec(PostSpecs.response).
                    log().body().
                    extract().as(PostData.class);

        Assertions.assertEquals(hostExpected, data.getHeaders().getHost());
        Assertions.assertNotNull(data.getHeaders().getxRequestStart());
        Assertions.assertEquals(connectionExpected, data.getHeaders().getConnection());
        Assertions.assertEquals(expectedContentLength, data.getHeaders().getContentLength());
        Assertions.assertEquals(xForwardedProtoExpected, data.getHeaders().getxForwardedProto());
        Assertions.assertEquals(xForwardedPortExpected, data.getHeaders().getxForwardedPort());
        Assertions.assertNotNull(data.getHeaders().getxAmznTraceId());
        Assertions.assertEquals(acceptExpected, data.getHeaders().getAccept());
        Assertions.assertEquals(contentTypeExpected, data.getHeaders().getContentType());
        Assertions.assertEquals(userAgentExpected, data.getHeaders().getUserAgent());
        Assertions.assertEquals(acceptEncodingExpected, data.getHeaders().getAcceptEncoding());
        Assertions.assertNotNull(data.getJson());
        Assertions.assertNotNull(data.getData());
        Assertions.assertEquals(urlExpected, data.getUrl());
    }
}
