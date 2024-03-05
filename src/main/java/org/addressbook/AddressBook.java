package org.addressbook;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class AddressBook {
    Hashtable<String, Contact> table = new Hashtable<>();
    static Scanner s = new Scanner(System.in);

    private static final String NAME_PATTERN = "[A-Z]{1}[a-z]{2,10}";
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9_+&-]+(?:\\.[a-zA-Z0-9_+&-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final String PHONE_NUMBER_PATTERN = "[6789]{1}\\d{9}";
    private static final String ZIP_PATTERN = "\\d{6}";

    public static void main(String[] args) {
        AddressBook a=new AddressBook();
        boolean flag = true;
        while (flag) {
            System.out.println("1: Add Contact\n2: Display Contacts\n3: Edit Person Details\n4: Delete\n5: Get Count by City" +
                    "\n6: Get details by state\n7: Read Data from CSV file\n8: Exit");
            System.out.println("Enter Choice number");
            switch (s.nextInt()) {
                case 1: {
                    a.add();
                    break;
                }
                case 2: {
                    a.display();
                    break;
                }
                case 3: {
                    a.editPerson();
                    break;
                }
                case 4: {
                    a.deleteContact();
                    break;
                }
                case 5:{
                    a.getCount();
                    break;
                }
                case 6:{
                    a.getDetailsByState();
                    break;
                }
                case 7:{
                    a.readDataCSV();
                    break;
                }
                case 8: {
                    flag = false;
                    System.out.println("Exited");
                    break;
                }
                default: {
                    System.out.println("Invalid choice..choose correct option");
                }
            }
        }
    }

    private void getDetailsByState() {
        System.out.println("Enter State name");
        String state=s.next();
        Set<String> keys= table.keySet();
        int count=0;
        Contact contact=null;
        for (String key:keys){
            contact=table.get(key);
            if (contact.getState().equals(state)){
                System.out.println(contact);
                count++;
            }
            System.out.println("----------------------------------");

        }
        if(count==0){
            System.out.println("No Contact found with "+state);
            System.out.println("----------------------------------");

        }
    }

    private void getCount() {
        System.out.println("Enter City Name");
        String city=s.next();
        int count=0;
        Set<String> keys=table.keySet();

        for (String key:keys){
            Contact c=table.get(key);
            if (c.getCity().equals(city)){
                count++;
            }
        }
        System.out.println("Number of persons in "+city+" : "+count);
        System.out.println("----------------------------------");
    }

    private void deleteContact() {
        System.out.println("Enter Name to be Removed");
        String name = s.next();
        if (table.containsKey(name)) {
            table.remove(name);
        }
    }



    private void display() {
        Set<String> set=table.keySet();
        for(String s:set){
            System.out.println(table.get(s));
            System.out.println("----------------------------------");
        }
    }

    private void add() {
        Contact c=new Contact();
        System.out.println("Enter FirstName");
        String fName=s.next();
        Set<String> set=table.keySet();
        String details[]=new String[8];
        if (fName.matches(NAME_PATTERN)){
            boolean flag=false;{
                for(String s:set){
                    if (s.equals(fName)){
                        flag=true;
                        break;
                    }
                }
                if (flag==false){
                    c.setFirstName(fName);
                    details[0]=fName;
                    System.out.print("\nLast Name : ");
                    String lName=s.next();
                    if(lName.matches(NAME_PATTERN)){
                        c.setLastName(lName);
                        details[1]=lName;
                    }
                    else{
                        throw new InvalidPatternException("Last name should start with upper case");
                    }
                    System.out.print("\nAddress : ");
                    String address=s.next();
                    c.setAddress(address);
                    details[2]=address;
                    System.out.print("\nCity : ");
                    String city=s.next();
                    if(city.matches(NAME_PATTERN)){
                        c.setCity(city);
                        details[3]=city;
                    }
                    else{
                        throw new InvalidPatternException("City Name Should Start with Upper case");
                    }


                    System.out.print("\nState : ");
                    String state=s.next();
                    if(state.matches(NAME_PATTERN)){
                        c.setState(state);
                        details[4]=state;
                    }
                    else{
                        throw new InvalidPatternException("State Name Should Start with Upper case");
                    }
                    System.out.print("\nZip Code : ");
                    int zip=s.nextInt();
                    String zipStr = String.valueOf(zip);

                    if(zipStr.matches(ZIP_PATTERN)){
                        c.setZipCode(zip);
                        details[5]=zip+"";
                    }
                    else{
                        throw new InvalidPatternException("Zip Code Should have only 6 digits");
                    }
                    System.out.print("\nPhone Number : ");
                    long phno=s.nextLong();
                    String phnoStr = String.valueOf(phno);

                    if(phnoStr.matches(PHONE_NUMBER_PATTERN)){
                        c.setPhoneNumber(phno);
                        details[6]=phno+"";
                    }
                    else{
                        throw new InvalidPatternException("Phone Number Should have only 10 digits");
                    }
                    System.out.print("\nEmail : ");
                    String email=s.next();
                    if(email.matches(EMAIL_PATTERN)){
                        c.setEmail(email);
                        details[7]=email;
                    }
                    else{
                        throw new InvalidPatternException("Email Mismatched");
                    }
                    File f=new File("C:\\Users\\sagar\\Desktop\\SELENIUM TESTING\\Java Basics" +
                            "\\src\\main\\java\\org\\addressbook\\contacts.csv");
                    try{
                        FileWriter fw=new FileWriter(f,true);
                        CSVWriter writer=new CSVWriter(fw);
                        writer.writeNext(details);
                        writer.close();
                        System.out.println("Data Stored");
                    }catch (Exception ex){
                        ex.printStackTrace();
                    }
                    table.put(fName,c);
                }
                else{
                    throw new InvalidPatternException("User Already exists");
                }
            }
        }else{
            throw new InvalidPatternException("Name Should start with Upper case and it should have at-least 3 characters");
        }
    }

    private void editPerson() {
        System.out.println("Enter First Name to find");
        String name = s.next();
        Contact contact = null;
        if (table.containsKey(name)) {
            contact = table.remove(name);
        }
        if (contact != null) {
            System.out.println("Enter FirstName");
            String fName = s.next();
            if (fName.matches(NAME_PATTERN)) {
                contact.setFirstName(fName);
            } else {
                throw new org.basics.addressbook.InvalidPatternException("Last name should start with upper case and it should have atleast 3 characters");
            }
            System.out.print("\nLast Name : ");
            String lName = s.next();
            if (lName.matches(NAME_PATTERN)) {
                contact.setLastName(lName);
            } else {
                throw new org.basics.addressbook.InvalidPatternException("Last name should start with upper case and it should have atleast 3 characters");
            }
            System.out.print("\nAddress : ");
            contact.setAddress(s.next());
            System.out.print("\nCity : ");
            String city = s.next();
            if (city.matches(NAME_PATTERN)) {
                contact.setCity(city);
            } else {
                throw new org.basics.addressbook.InvalidPatternException("City Name Should Start with Upper case");
            }


            System.out.print("\nState : ");
            String state = s.next();
            if (state.matches(NAME_PATTERN)) {
                contact.setState(state);
            } else {
                throw new org.basics.addressbook.InvalidPatternException("State Name Should Start with Upper case");
            }
            System.out.print("\nZip Code : ");
            int zip = s.nextInt();
            String zipStr = String.valueOf(zip);

            if (zipStr.matches(ZIP_PATTERN)) {
                contact.setZipCode(zip);
            } else {
                throw new org.basics.addressbook.InvalidPatternException("Zip Code Should have only 6 digits");
            }
            System.out.print("\nPhone Number : ");
            long phno = s.nextLong();
            String phnoStr = String.valueOf(phno);

            if (phnoStr.matches(PHONE_NUMBER_PATTERN)) {
                contact.setPhoneNumber(phno);
            } else {
                throw new org.basics.addressbook.InvalidPatternException("Phone Number Should have only 10 digits");
            }
            System.out.print("\nEmail : ");
            String email = s.next();
            if (email.matches(EMAIL_PATTERN)) {
                contact.setEmail(email);
            } else {
                throw new org.basics.addressbook.InvalidPatternException("Email Mismatched");
            }

            table.put(name, contact);
            File f=new File("C:\\Users\\sagar\\Desktop\\SELENIUM TESTING\\Java Basics" +
                    "\\src\\main\\java\\org\\addressbook\\contacts.csv");

            try{
                FileWriter fw=new FileWriter(f);
                CSVWriter writer=new CSVWriter(fw);
                Set<String> keys=table.keySet();
                String[] details=new String[8];
                for(String key:keys){
                   Contact c= table.get(key);
                   details[0]=c.getFirstName();
                   details[1]=c.getLastName();
                   details[2]=c.getAddress();
                   details[3]=c.getCity();
                   details[4]=c.getState();
                   details[5]=c.getZipCode()+"";
                   details[6]=c.getPhoneNumber()+"";
                   details[7]=c.getEmail();
                   writer.writeNext(details);
                }
                writer.close();
                System.out.println("Data modified");
            }catch (Exception ex){
                ex.printStackTrace();
            }
        } else {
            System.out.println("First Name Already Exists..Please try Different names");
        }
    }

    public void readDataCSV() {
        File f=new File("C:\\Users\\sagar\\Desktop\\SELENIUM TESTING\\Java Basics\\" +
                "src\\main\\java\\org\\addressbook\\contacts.csv");
        try{
            FileReader fr=new FileReader(f);
            CSVReader reader=new CSVReader(fr);
            String next[];
            while((next=reader.readNext()) != null){
                for (String data:next){
                    System.out.println(data);
                }
                System.out.println("-------------------------------");
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

