package com.genspark.db.interfaces;

public class DBMongo implements LoginAuth {
    @Override
    public String encryptPassword() {
        System.out.println("Same for every database [abc encryption]");
        return "abc";
    }

    @Override
    public void checkDBforUser() {

    }
}
