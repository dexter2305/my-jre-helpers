package com.dl.helper.welcomer;

public class HelloWorld implements GreetingService {
    @Override
    public String greet() {
        return "Hello, world";
    }
}
