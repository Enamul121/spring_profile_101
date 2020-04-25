package com.app.profile;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@Profile("default")
public class DefaultProfile {

    public DefaultProfile() {

        System.out.println("this is a default profile");
    }
}
