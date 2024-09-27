package Methods;

import ExpectedData.PostExpectedData;
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

        PostData data = PostSpecs.request.
                when().
                    body(reqBody).
                    post("/post").
                then().
                    spec(PostSpecs.response).
                    log().body().
                    extract().as(PostData.class);

        Assertions.assertEquals(PostExpectedData.getHost(), data.getHeaders().getHost());
        Assertions.assertNotNull(data.getHeaders().getxRequestStart());
        Assertions.assertEquals(PostExpectedData.getConnection(), data.getHeaders().getConnection());
        Assertions.assertEquals(PostExpectedData.getContentLength(), data.getHeaders().getContentLength());
        Assertions.assertEquals(PostExpectedData.getxForwardedProto(), data.getHeaders().getxForwardedProto());
        Assertions.assertEquals(PostExpectedData.getxForwardedPort(), data.getHeaders().getxForwardedPort());
        Assertions.assertNotNull(data.getHeaders().getxAmznTraceId());
        Assertions.assertEquals(PostExpectedData.getAccept(), data.getHeaders().getAccept());
        Assertions.assertEquals(PostExpectedData.getContentType(), data.getHeaders().getContentType());
        Assertions.assertEquals(PostExpectedData.getUserAgent(), data.getHeaders().getUserAgent());
        Assertions.assertEquals(PostExpectedData.getAcceptEncoding(), data.getHeaders().getAcceptEncoding());
        Assertions.assertNotNull(data.getJson());
        Assertions.assertNotNull(data.getData());
        PostExpectedData.updateURL();
        Assertions.assertEquals(PostExpectedData.getUrl(), data.getUrl());
    }
}
