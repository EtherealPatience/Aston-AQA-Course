package ExpectedData;

abstract public class GetExpectedData {
    private static String host = "postman-echo.com";
    private static String connection = "close";
    private static String xForwardedProto = "https";
    private static String xForwardedPort = "443";
    private static String contentType = "application/json";
    private static String accept = "*/*";
    private static String userAgent = "Apache-HttpClient/4.5.13 (Java/11.0.24)";
    private static String acceptEncoding = "gzip,deflate";
    private static String url = "https://postman-echo.com/get/";

    public static String getHost(){
        return host;
    }

    public static String getConnection(){
        return connection;
    }

    public static String getxForwardedProto(){
        return xForwardedProto;
    }

    public static String getxForwardedPort(){
        return xForwardedPort;
    }

    public static String getContentType(){
        return contentType;
    }
    public static void setContentType(String contentType){
        GetExpectedData.contentType = contentType;
    }

    public static String getAccept(){
        return accept;
    }

    public static String getUserAgent(){
        return userAgent;
    }

    public static String getAcceptEncoding(){
        return acceptEncoding;
    }

    public static String getUrl(){
        return url;
    }

    public static void setUrl(String url){
        GetExpectedData.url = url;
    }
}
