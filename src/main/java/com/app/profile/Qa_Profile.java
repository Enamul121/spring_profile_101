package com.app.profile;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@Profile("qa")
public class Qa_Profile {


    public Qa_Profile() {
        System.out.println("QA Profile");
    }
}
