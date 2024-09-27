package POJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetData {

    @JsonProperty("args")
    private Args args;
    @JsonProperty("headers")
    private Headers headers;
    @JsonProperty("url")
    private String url;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Args{
        private String foo1;
        private String foo2;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Headers{
        private String host;
        public String getHost(){
            return host;
        }

        @JsonProperty("x-request-start")
        private String xRequestStart;
        public String getxRequestStart(){
            return xRequestStart;
        }

        private String connection;
        public String getConnection(){
            return connection;
        }

        @JsonProperty("x-forwarded-proto")
        private String xForwardedProto;
        public String getxForwardedProto(){
            return xForwardedProto;
        }

        @JsonProperty("x-forwarded-port")
        private String xForwardedPort;
        public String getxForwardedPort(){
            return xForwardedPort;
        }

        @JsonProperty("x-amzn-trace-id")
        private String xAmznTraceId;
        public String getxAmznTraceId(){
            return xAmznTraceId;
        }

        @JsonProperty("content-type")
        private String contentType;
        public String getContentType(){
            return contentType;
        }

        @JsonProperty("user-agent")
        private String userAgent;
        public String getUserAgent(){
            return userAgent;
        }

        private String accept;
        public String getAccept(){
            return accept;
        }

        @JsonProperty("accept-encoding")
        private String acceptEncoding;
        public String getAcceptEncoding(){
            return acceptEncoding;
        }

        public Headers(){

        }
    }

    public GetData() {

    }

    public Headers getHeaders(){
        return headers;
    }

}


