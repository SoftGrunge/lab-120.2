package university;

public class StringArrayException extends Exception {

    private static final String DEFAULT_DESCRIPTION = "Common error";

    public StringArrayException (){
        super(DEFAULT_DESCRIPTION);
    }
    public StringArrayException(String string) {
        super(string);
    }
}