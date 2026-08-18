package com.ranjeet.jobportal.contact.controller;


import com.ranjeet.jobportal.contact.dto.ContactRequestDto;
import com.ranjeet.jobportal.contact.repository.ContactRepository;
import com.ranjeet.jobportal.contact.service.IContactService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jdk.jshell.Snippet;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contacts")
@RequiredArgsConstructor
public class ContactController {
    private final IContactService iContactService;

    @PostMapping(path="/public",version = "1.0")
    public ResponseEntity<String> saveContactMsg(@RequestBody @Valid ContactRequestDto contactRequestDto) {
        boolean result = iContactService.saveContact(contactRequestDto);
        if (result) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Request processed successfully");
        }
        else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request processing failed");
        }

    }

    @GetMapping(version = "1.0")
    public ResponseEntity<String> fetchStatus(@RequestParam @Validated @NotBlank(message = "Status can not be blank") @Size(min =
4, message = "Status should be of minimum 4 characters") String status){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(status);
    }

}







