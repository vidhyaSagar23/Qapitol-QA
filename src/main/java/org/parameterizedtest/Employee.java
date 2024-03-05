package org.parameterizedtest;

public class Employee {
    public static void main(String[] args) {
        Employee e=new Employee();
        System.out.println(e.eName("Vidhyasag"));
    }

    private static final String NAME_PATTERN = "[A-Z]{1}[a-z]{2,10}";
    private static final String PHONE_NUMBER_PATTERN = "[6789]{1}\\d{9}";
    public boolean eName(String fName){
        return fName.matches(NAME_PATTERN);
    }

    public boolean phno(String ph){
        return ph.matches(PHONE_NUMBER_PATTERN);
    }
}
