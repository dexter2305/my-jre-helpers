package com.dl.helper.welcomer;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class Application {

    @Inject
    private GreetingService service;

    public Application(GreetingService service){
        this.service = service;
    }

    public void start(){
        String message = service.greet();
        System.out.println(message);
    }

    public static void main(String [] args){
        final Injector injector = Guice.createInjector(new BasicModule());
        Application app = new Application(injector.getInstance(GreetingService.class));
        app.start();
    }

}
