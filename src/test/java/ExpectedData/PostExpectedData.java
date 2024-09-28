package ExpectedData;

abstract public class PostExpectedData extends GetExpectedData{
    private static String contentLength = "23";
    private static String newURL = "https://postman-echo.com/post";
    public static String getNewURL(){
        return newURL;
    }
    public static void setContentLength(String contentLength){
        PostExpectedData.contentLength = contentLength;
    }

    public static String getContentLength(){
        return contentLength;
    }

    public static void updateExpectedFields(){
        setUrl(getNewURL());
    }
}
