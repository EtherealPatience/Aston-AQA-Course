package ExpectedData;

abstract public class DeleteExpectedData extends PostExpectedData{
    private static String data = "This is expected to be sent back as part of response body.";
    private static String newURL = "https://postman-echo.com/delete";
    private static String newContentLength = "58";
    private static String newContenType = "text/plain; charset=ISO-8859-1";
    public static String getData(){
        return data;
    }

    public static void updateExpectedFields(){
        setUrl(newURL);
        setContentLength(newContentLength);
        setContentType(newContenType);
    }
}
