package com.app.ds;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@Profile("default")
public class DefaultProfile implements DummyDataSources {


    @Override
    public String getConnection() {
        return "This is Default Profile";
    }
}
