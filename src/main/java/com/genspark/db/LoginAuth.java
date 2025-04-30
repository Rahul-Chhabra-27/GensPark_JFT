package com.genspark.db;

public abstract class LoginAuth {
    public String encryptPassword(){
        System.out.println("Same for every database [abc encryption]");
        return "abc";
    }
    public abstract void checkDBforUser();
}
