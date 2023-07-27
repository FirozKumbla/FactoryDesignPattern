package com.example;

public class OSFactory {
    public OS getInstance(String str){
        if (str.equalsIgnoreCase("android")){
            return new Android();
        } else if (str.equalsIgnoreCase("ios")) {
            return new IOS();
        }else {
            return new Windows();
        }
    }
}
