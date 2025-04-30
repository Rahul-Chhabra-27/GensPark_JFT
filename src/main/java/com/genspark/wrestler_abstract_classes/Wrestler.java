package com.genspark.wrestler_abstract_classes;

public abstract class Wrestler {

    // This is not the abstract method.
    int chargesMoney() {
        return 100;
    }
    abstract void startingTheme();
    abstract void EndingTheme();
    abstract String healthCheckUpReport();
}
