package org.review;

import java.util.HashMap;
import java.util.Set;

public class Student {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        map.put("sagar",93);
        map.put("raghu",78);
        map.put("prem",85);
        map.put("scott",97);

        Set<String> keys=map.keySet();

        String name="";
        int max=0;
        for (String key:keys){
            if(map.get(key) > max){
                max=map.get(key);
                name=key;
            }
        }
        System.out.println(name+" "+max);


        Student s=new Student();
        HashMap<String,Integer> map2=new HashMap<>();
        map2.put("vidhya sagar",69);
        map2.put("Elango",80);
        map2.put("scott",97);

        System.out.println("Before merging : \nmap1 : "+map+"\nmap2 : "+map2);
        System.out.println("-----------------------------------");

        map=s.merge(map,map2);
        System.out.println("After merging : \nmap1 :"+ map);
    }

    private HashMap<String,Integer> merge(HashMap<String, Integer> map, HashMap<String, Integer> map2) {
        Set<String> keys=map2.keySet();

        for(String key:keys){
            if(map.containsKey(key)){
                System.out.println("Duplicate entry :"+key+" : "+ map2.get(key));
            }
            else{
                map.put(key,map2.get(key));
            }
        }
        return map;
    }
}
