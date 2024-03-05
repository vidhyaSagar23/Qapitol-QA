package org.file_handling;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteData {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

        WriteData wr=new WriteData();
        boolean flag=true;
        while(flag) {
            System.out.println("Enter choice");
            int choice=sc.nextInt();
            switch (choice) {
                case 1: {
                    wr.writeData();
                    break;
                }
                case 2: {
                    wr.readData();
                    break;
                }
                case 3:
                {
                    wr.writeDataCSV();
                    break;
                }
                case 4:
                {
                    wr.readDataCSV();
                    break;
                }
                case 5:{
                    flag=false;
                    break;
                }
                default:{
                    System.out.println("Enter valid choice");
                }
            }
        }
    }

    private void readDataCSV() {
        File f=new File("C:\\Users\\sagar\\Desktop\\SELENIUM TESTING" +
                "\\Java Basics\\src\\main\\java\\org\\file_handling\\data.csv");
        try{
            FileReader fr=new FileReader(f);
            CSVReader reader=new CSVReader(fr);
            String next[];
            while((next=reader.readNext()) != null){
                for (String data:next){
                    System.out.println(data);
                }
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void writeDataCSV() {
        File f=new File("C:\\Users\\sagar\\Desktop\\SELENIUM TESTING" +
                "\\Java Basics\\src\\main\\java\\org\\file_handling\\data.csv");
        try{
            FileWriter fw=new FileWriter(f,true);
            CSVWriter csv=new CSVWriter(fw);
            String []title={"Name","Company","Role"};
            csv.writeNext(title);
            String arr[]={"raghu", "Qapitol qa", "Qa"};
            csv.writeNext(arr);
            csv.close();
            System.out.println("Data Stored");

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void readData() {
        File f=new File("C:\\Users\\sagar\\Desktop\\SELENIUM TESTING\\Java Basics\\src" +
                "\\main\\java\\org\\file_handling\\computer.txt");
        try{
            FileReader fr=new FileReader(f);
            int ch=fr.read();
            while(ch != -1){
                System.out.print((char) ch);
                ch= fr.read();
            }
            System.out.println();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }

    private void writeData() {
        File f=new File("C:\\Users\\sagar\\Desktop\\SELENIUM TESTING\\Java Basics" +
                "\\src\\main\\java\\org\\file_handling\\computer.txt");
        FileWriter fw=null;
        try{
            fw=new FileWriter(f,true);
            System.out.println("Enter the data to add in the file");
            fw.write(sc.next());
            fw.flush();
            System.out.println("Data Stored");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            try {
                fw.close();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}
