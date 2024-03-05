package org.customannotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Runner {
    public static void main(String[] args) {

//        Class level
        Sagar sagarClass=MyClass.class.getAnnotation(Sagar.class);
        if(sagarClass != null){
            System.out.println(sagarClass.value());
            System.out.println(sagarClass.count());
            System.out.println("---------------------------");
        }

//        Method level
        try {
            Method method=MyClass.class.getMethod("myMethod");
            Sagar sagarMethod=method.getAnnotation(Sagar.class);
            if(sagarMethod != null){
                System.out.println(sagarMethod.count());
                System.out.println(sagarMethod.value());
                System.out.println("-----------------------------");
            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

//        field level
        try{
            Field field=MyClass.class.getDeclaredField("sagaAge");
            Sagar sagarField=field.getAnnotation(Sagar.class);
            if (sagarField != null){
                System.out.println(sagarField.value());
                System.out.println(sagarField.count());
                System.out.println("---------------------------------------");
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
