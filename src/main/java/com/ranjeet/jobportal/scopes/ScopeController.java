package com.ranjeet.jobportal.scopes;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scope")
@RequiredArgsConstructor
public class ScopeController {
    private final RequestScopedBeans requestScopedBeans;
    private final SessionScopedBeans sessionScopedBeans;
    private  final ApplicationScopedBeans applicationScopedBeans;

    @GetMapping("/request")
    public ResponseEntity<String> testRequestScope(){
        requestScopedBeans.setUserName("John Doe");
        return ResponseEntity.ok().body(requestScopedBeans.getUserName());
    }
    @GetMapping("/session")
    public ResponseEntity<String> testSessionScope(){
        sessionScopedBeans.setUserName("John Doe Session");
        return ResponseEntity.ok().body(requestScopedBeans.getUserName());
    }

//    @GetMapping("/test")
//    public ResponseEntity<String> testScope(){
//        return ResponseEntity.ok().body(sessionScopedBeans.getUserName());
//    }

    @GetMapping("/application")
    public ResponseEntity<Integer> testApplicationScope(){
        applicationScopedBeans.incrementVisitorCount();
        return ResponseEntity.ok().body(applicationScopedBeans.getVisitorCount());
    }

    @GetMapping("/test")
    public ResponseEntity<Integer> testScopeApplicationScope(){
        return ResponseEntity.ok().body(applicationScopedBeans.getVisitorCount());
    }



}
