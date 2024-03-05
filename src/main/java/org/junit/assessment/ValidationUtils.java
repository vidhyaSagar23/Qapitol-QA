package org.junit.assessment;

import javax.naming.NamingEnumeration;

public class ValidationUtils{
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9_+&-]+(?:\\.[a-zA-Z0-9_+&-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final String PHONE_NUMBER_PATTERN = "[6789]{1}\\d{9}";

    private static final String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";


    public boolean isValidEmail(String email) {
        return email.matches(EMAIL_PATTERN);
    }

    public boolean isValidNumber(String number) {
        return number.matches(PHONE_NUMBER_PATTERN);
    }

    public boolean isValidPassword(String pwd) {
        return pwd.matches(PASSWORD_PATTERN);
    }
}
