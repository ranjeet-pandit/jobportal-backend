package com.ranjeet.jobportal.scopes;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;

@Component
@ApplicationScope
@Getter
@Setter
public class ApplicationScopedBeans {
    private int visitorCount;
    public ApplicationScopedBeans(){
        System.out.println("ApplicationScopedBean created");
    }
    public  void incrementVisitorCount(){
        visitorCount++;
    }

}
