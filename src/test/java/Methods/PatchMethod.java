package Methods;

import ExpectedData.PatchExpectedData;
import POJO.PatchData;
import Specs.PatchSpecs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PatchMethod {
    @Test
    public void testPatchMethod(){

        PatchData data = PatchSpecs.request.
                when().
                    body(PatchExpectedData.getData()).
                    patch("patch").
                then().
                    log().body().
                    extract().as(PatchData.class);

        PatchExpectedData.updateExpectedFields();

        Assertions.assertEquals(PatchExpectedData.getHost(), data.getHeaders().getHost());
        Assertions.assertNotNull(data.getHeaders().getxRequestStart());
        Assertions.assertEquals(PatchExpectedData.getConnection(), data.getHeaders().getConnection());
        Assertions.assertEquals(PatchExpectedData.getContentLength(), data.getHeaders().getContentLength());
        Assertions.assertEquals(PatchExpectedData.getxForwardedProto(), data.getHeaders().getxForwardedProto());
        Assertions.assertEquals(PatchExpectedData.getxForwardedPort(), data.getHeaders().getxForwardedPort());
        Assertions.assertNotNull(data.getHeaders().getxAmznTraceId());
        Assertions.assertEquals(PatchExpectedData.getAccept(), data.getHeaders().getAccept());
        Assertions.assertEquals(PatchExpectedData.getContentType(), data.getHeaders().getContentType());
        Assertions.assertEquals(PatchExpectedData.getUserAgent(), data.getHeaders().getUserAgent());
        Assertions.assertEquals(PatchExpectedData.getAcceptEncoding(), data.getHeaders().getAcceptEncoding());
        Assertions.assertNull(data.getJson());
        Assertions.assertNotNull(data.getData());
        Assertions.assertEquals(PatchExpectedData.getUrl(), data.getUrl());
    }
}
