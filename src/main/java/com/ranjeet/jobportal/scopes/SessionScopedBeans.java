package com.ranjeet.jobportal.scopes;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
@Getter
@Setter
public class SessionScopedBeans {
    private String userName;
    public SessionScopedBeans(){
        System.out.println("SessionScopedBean created");
    }
}
