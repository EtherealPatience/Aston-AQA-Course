package ExpectedData;

public class PostWithParamsExpectedData extends PostExpectedData{
    private static String newContentLength = "19";
    private static String newContenType = "text/plain; charset=ISO-8859-1";
    public static void updateExpectedFields(){
        updateURL();
        setContentLength(newContentLength);
        setContentType(newContenType);
    }
}
