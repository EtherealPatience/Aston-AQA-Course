package Methods;

import ExpectedData.PostExpectedData;
import ExpectedData.PostWithParamsExpectedData;
import POJO.PostData;
import Specs.PostSpecs;
import Specs.PostWithParamsSpecs;
import org.junit.jupiter.api.*;

import java.util.HashMap;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PostMethod {

    @Order(1)
    @Test
    @DisplayName("Тестирование метода POST: Проверка соответствия ожидаемых полей в response с фактическими")
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

        PostExpectedData.updateExpectedFields();

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
        Assertions.assertEquals(PostExpectedData.getUrl(), data.getUrl());
    }

    @Order(2)
    @Test
    @DisplayName("Тестирование метода POST с параметрами")
    public void testPostWithParamsMethod(){
        HashMap<String, String> params = new HashMap<>();
        params.put("foo1", "bar1");
        params.put("foo2", "bar2");

        PostData data = PostWithParamsSpecs.request.
                when().
                    formParams(params).
                    post("/post").
                then().
                    spec(PostWithParamsSpecs.response).
                    log().body().
                    extract().as(PostData.class);

        PostWithParamsExpectedData.updateExpectedFields();

        Assertions.assertEquals(PostWithParamsExpectedData.getHost(), data.getHeaders().getHost());
        Assertions.assertNotNull(data.getHeaders().getxRequestStart());
        Assertions.assertEquals(PostWithParamsExpectedData.getConnection(), data.getHeaders().getConnection());
        Assertions.assertEquals(PostWithParamsExpectedData.getContentLength(), data.getHeaders().getContentLength());
        Assertions.assertEquals(PostWithParamsExpectedData.getxForwardedProto(), data.getHeaders().getxForwardedProto());
        Assertions.assertEquals(PostWithParamsExpectedData.getxForwardedPort(), data.getHeaders().getxForwardedPort());
        Assertions.assertNotNull(data.getHeaders().getxAmznTraceId());
        Assertions.assertEquals(PostWithParamsExpectedData.getAccept(), data.getHeaders().getAccept());
        Assertions.assertEquals(PostWithParamsExpectedData.getContentType(), data.getHeaders().getContentType());
        Assertions.assertEquals(PostWithParamsExpectedData.getUserAgent(), data.getHeaders().getUserAgent());
        Assertions.assertEquals(PostWithParamsExpectedData.getAcceptEncoding(), data.getHeaders().getAcceptEncoding());
        Assertions.assertNull(data.getJson());
        Assertions.assertNotNull(data.getData());
        Assertions.assertEquals(PostWithParamsExpectedData.getUrl(), data.getUrl());

    }
}
