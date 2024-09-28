package POJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteData {
    @JsonProperty("args")
    private Args args;

    @JsonProperty("data")
    private String data;
    public String getData(){
        return data;
    }

    @JsonProperty("form")
    private Form form;

    @JsonProperty("files")
    private Files files;

    @JsonProperty("headers")
    private Headers headers;

    @JsonProperty("json")
    private Object json;
    public Object getJson(){
        return json;
    }

    @JsonProperty("url")
    private String url;
    public String getUrl(){
        return url;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Args{

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Files{

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Form{

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

        @JsonProperty("content-length")
        private String contentLength;
        public String getContentLength(){
            return contentLength;
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
            return  accept;
        }

        @JsonProperty("accept-encoding")
        private String acceptEncoding;
        public String getAcceptEncoding(){
            return acceptEncoding;
        }

        public Headers(){

        }
    }

    public Headers getHeaders(){
        return headers;
    }
}
