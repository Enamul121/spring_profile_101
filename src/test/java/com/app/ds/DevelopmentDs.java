package com.app.ds;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevelopmentDs implements DummyDataSources {


    @Override
    public String getConnection() {
        return "This is development data sources";
    }
}
