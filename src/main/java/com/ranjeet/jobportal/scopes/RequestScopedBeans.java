package com.ranjeet.jobportal.scopes;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
@Getter
@Setter
public class RequestScopedBeans {
    private String userName;
    public RequestScopedBeans(){
        System.out.println("RequestScopedBean created");
    }
}
