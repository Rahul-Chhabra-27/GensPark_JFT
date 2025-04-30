package com.genspark.db.interfaces;

public interface LoginAuth {
    String encryptPassword();
    void checkDBforUser();
}
