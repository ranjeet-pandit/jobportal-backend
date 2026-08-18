package com.ranjeet.jobportal.contact.dto;

import com.ranjeet.jobportal.contact.entity.Contact;

import java.io.Serializable;

/**
 * DTO for {@link Contact}
 */
public record ContactDto(String email, String message, String subject, String userType) implements Serializable {
}