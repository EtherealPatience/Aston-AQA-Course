package Methods;

import ExpectedData.GetExpectedData;
import POJO.GetData;
import Specs.GetSpecs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GetMethod {
    @Test
    @DisplayName("Тестирование метода GET: Проверка соответствия ожидаемых полей в response с фактическими")
    public void testGetMethod(){
        GetData data = GetSpecs.request.
                when().
                    get("get/").
                then().
                    spec(GetSpecs.response).
                    log().body().
                    extract().as(GetData.class);

        Assertions.assertEquals(GetExpectedData.getHost(), data.getHeaders().getHost());
        Assertions.assertNotNull(data.getHeaders().getxRequestStart());
        Assertions.assertEquals(GetExpectedData.getConnection(), data.getHeaders().getConnection());
        Assertions.assertEquals(GetExpectedData.getxForwardedProto(), data.getHeaders().getxForwardedProto());
        Assertions.assertEquals(GetExpectedData.getxForwardedPort(), data.getHeaders().getxForwardedPort());
        Assertions.assertNotNull(data.getHeaders().getxAmznTraceId());
        Assertions.assertEquals(GetExpectedData.getContentType(), data.getHeaders().getContentType());
        Assertions.assertEquals(GetExpectedData.getAccept(), data.getHeaders().getAccept());
        Assertions.assertEquals(GetExpectedData.getUserAgent(), data.getHeaders().getUserAgent());
        Assertions.assertEquals(GetExpectedData.getAcceptEncoding(), data.getHeaders().getAcceptEncoding());
        Assertions.assertEquals(GetExpectedData.getUrl(), data.getURL());
    }
}
