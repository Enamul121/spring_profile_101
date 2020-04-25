package com.app.ds;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("qa")
public class QA_ds implements DummyDataSources {

    @Override
    public String getConnection() {
        return "This is Q & A Data sources";
    }
}
