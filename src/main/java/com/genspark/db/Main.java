package com.genspark.db;

public class Main {

    public static void main(String[] args) {
        DBMongo dbMongo = new DBMongo();

        dbMongo.encryptPassword();
    }
}
