package day11;

public final class AppConstants {
    public static final double GST_RATE=0.18;
    public static final int MAX_LOGIN_ATTEMPTS=3;
    public static final String DEFAULT_CURRENCY="INR";
    public static final int MIN_PASSWORD_LENGTH=8;

    private AppConstants(){
        throw new UnsupportedOperationException("Cannot instantiate AppConstants");
    }

}
