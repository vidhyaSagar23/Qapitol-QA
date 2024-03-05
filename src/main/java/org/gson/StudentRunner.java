package org.gson;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {
        Student s1 = new Student("sagar", "bangalore", 22);
        Student s2 = new Student("sagar", "bangalore", 22);
        Student s3 = new Student("sagar", "bangalore", 22);
        Student s4 = new Student("sagar", "bangalore", 22);
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        Gson gson = new Gson();

//        Serialization
        for (Student s : list) {
            // Write JSON to file
            try (FileWriter writer = new FileWriter("C:\\Users\\sagar\\Desktop\\SELENIUM TESTING\\Java Basics" +
                    "\\src\\main\\java\\org\\gson\\person.json",true)) {
                writer.write(gson.toJson(s));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Object successfully converted to JSON and stored in person.json");

//        System.out.println("Deserialization");
////        DeSerialization
//        String json="{'name':'vidhya','city':'bangalore','age':22}";
//        Student s=gson.fromJson(json,Student.class);
//
//        System.out.println(s);
//    }
    }
}
