package com.example;

public class FactoryMain {
    public static void main(String[] args) {
        OS obj = new IOS();
        obj.spec();

        OSFactory factory =new OSFactory();
        OS obj2 = factory.getInstance("android");
        obj2.spec();
    }
}
