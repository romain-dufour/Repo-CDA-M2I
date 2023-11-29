package org.example.Classes;

import java.util.HashMap;

public class Article {

//    private static Integer counter = 0;
String id;
    static HashMap<String, Article> hashMap = new HashMap<>();

    public Article(String id) {
        this.id = id;
        hashMap.put(this.id,this);
    }

    public String getId() {
        return id;
    }

    public static Article getArticle(String id){
        Article value = hashMap.get(id);
        return value;
    };


    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                '}';
    }


}