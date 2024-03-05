package org.gson;

import com.google.gson.Gson;

public class GsonSample {
    public static void main(String[] args) {
        Gson gson=new Gson();

        String word="working in bangalore";

        String gsonString=gson.toJson(word);
        System.out.println(gsonString);
    }
}
