package ExpectedData;

abstract public class PostExpectedData extends GetExpectedData{
    private static String contentLength = "23";
    public static void setContentLength(String contentLength){
        PostExpectedData.contentLength = contentLength;
    }

    public static String getContentLength(){
        return contentLength;
    }

    public static void updateURL(){
        setUrl("https://postman-echo.com/post");
    }
}
