package com.genspark.db.interfaces;

public class DBMysql implements LoginAuth {
    @Override
    public String encryptPassword() {
        System.out.println("Same for every database [abc encryption]");
        return "abc";
    }

    @Override
    public void checkDBforUser() {

    }
}
