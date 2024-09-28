package Methods;

import ExpectedData.DeleteExpectedData;
import POJO.DeleteData;
import Specs.DeleteSpecs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DeleteMethod {
    @Test
    @DisplayName("Тестирование метода DELETE: Проверка соответствия ожидаемых полей в response с фактическими")
    public void testDeleteMethod(){
        DeleteData data = DeleteSpecs.request.
                when().
                    body(DeleteExpectedData.getData()).
                    delete("delete").
                then().
                    spec(DeleteSpecs.response).
                    log().body().
                    extract().as(DeleteData.class);

        DeleteExpectedData.updateExpectedFields();

        Assertions.assertEquals(DeleteExpectedData.getHost(), data.getHeaders().getHost());
        Assertions.assertNotNull(data.getHeaders().getxRequestStart());
        Assertions.assertEquals(DeleteExpectedData.getConnection(), data.getHeaders().getConnection());
        Assertions.assertEquals(DeleteExpectedData.getContentLength(), data.getHeaders().getContentLength());
        Assertions.assertEquals(DeleteExpectedData.getxForwardedProto(), data.getHeaders().getxForwardedProto());
        Assertions.assertEquals(DeleteExpectedData.getxForwardedPort(), data.getHeaders().getxForwardedPort());
        Assertions.assertNotNull(data.getHeaders().getxAmznTraceId());
        Assertions.assertEquals(DeleteExpectedData.getAccept(), data.getHeaders().getAccept());
        Assertions.assertEquals(DeleteExpectedData.getContentType(), data.getHeaders().getContentType());
        Assertions.assertEquals(DeleteExpectedData.getUserAgent(), data.getHeaders().getUserAgent());
        Assertions.assertEquals(DeleteExpectedData.getAcceptEncoding(), data.getHeaders().getAcceptEncoding());
        Assertions.assertNull(data.getJson());
        Assertions.assertNotNull(data.getData());
        Assertions.assertEquals(DeleteExpectedData.getUrl(), data.getUrl());
    }
}
