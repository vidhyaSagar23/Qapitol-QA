package org.review;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        List<Integer> list2=new ArrayList<>();
        list2.add(20);
        list2.add(30);

        List<Integer> intersection=new ArrayList<>();
        for (int i:list2){
            if (list.contains(i)){
                intersection.add(i);
            }
        }

        Test test=new Test();
       list= test.remove(list);
        System.out.println(list);
    }

    private List<Integer> remove(List<Integer> list) {
        for (int i=0;i<list.size();i++){
            list.remove(i);
        }
        return list;
    }


}
