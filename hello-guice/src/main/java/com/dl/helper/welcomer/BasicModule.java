package com.dl.helper.welcomer;

import com.google.inject.AbstractModule;

public class BasicModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(GreetingService.class).to(HelloWorld.class);
    }
}
