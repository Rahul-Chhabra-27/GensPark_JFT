package com.genspark.wrestler_abstract_classes;

public class Undertaker extends Wrestler {
    @Override
    int chargesMoney() {
        return 100;
    }

    @Override
    void startingTheme() {
        System.out.println("Undertaker's Starting Theme");
    }

    @Override
    void EndingTheme() {
        System.out.println("Undertaker's Ending Theme");
    }

    @Override
    String healthCheckUpReport() {
        return "Ready to fight";
    }
}
