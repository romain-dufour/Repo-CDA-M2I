package org.example.Classes;

import java.util.HashMap;

public abstract class Article {

//    private static Integer counter = 0;
    private String id;
    static HashMap<String, Article> hashMap = new HashMap<>();

    public Article(String id) {
        this.id = id;
        hashMap.put(id,this);
    }

    public String getId() {
        return id;
    }

    public static Article getArticle(String id){
//        Article value = hashMap.get(id);
        return hashMap.get(id);
    };



    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                '}';
    }


}