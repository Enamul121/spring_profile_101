package com.app.ds;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProductionDs implements DummyDataSources {


    @Override
    public String getConnection() {
        return "This is development data sources";
    }
}
