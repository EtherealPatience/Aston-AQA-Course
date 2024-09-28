package Methods;

import ExpectedData.PutExpectedData;
import POJO.PutData;
import Specs.PutSpecs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PutMethod {

    @Test
    @DisplayName("Тестирование метода PUT: Проверка соответствия ожидаемых полей в response с фактическими")
    public void testPutMethod(){
        PutData data = PutSpecs.request.
                when().
                    body(PutExpectedData.getData()).
                    put("/put").
                then().
                    spec(PutSpecs.response).
                    log().body().
                    extract().as(PutData.class);

        PutExpectedData.updateExpectedFields();

        Assertions.assertEquals(PutExpectedData.getHost(), data.getHeaders().getHost());
        Assertions.assertNotNull(data.getHeaders().getxRequestStart());
        Assertions.assertEquals(PutExpectedData.getConnection(), data.getHeaders().getConnection());
        Assertions.assertEquals(PutExpectedData.getContentLength(), data.getHeaders().getContentLength());
        Assertions.assertEquals(PutExpectedData.getxForwardedProto(), data.getHeaders().getxForwardedProto());
        Assertions.assertEquals(PutExpectedData.getxForwardedPort(), data.getHeaders().getxForwardedPort());
        Assertions.assertNotNull(data.getHeaders().getxAmznTraceId());
        Assertions.assertEquals(PutExpectedData.getAccept(), data.getHeaders().getAccept());
        Assertions.assertEquals(PutExpectedData.getContentType(), data.getHeaders().getContentType());
        Assertions.assertEquals(PutExpectedData.getUserAgent(), data.getHeaders().getUserAgent());
        Assertions.assertEquals(PutExpectedData.getAcceptEncoding(), data.getHeaders().getAcceptEncoding());
        Assertions.assertNull(data.getJson());
        Assertions.assertNotNull(data.getData());
        Assertions.assertEquals(PutExpectedData.getUrl(), data.getUrl());
    }
}
