package com.ranjeet.jobportal.contact.service;

import com.ranjeet.jobportal.contact.dto.ContactRequestDto;
import com.ranjeet.jobportal.contact.entity.Contact;

public interface IContactService {

    boolean saveContact(ContactRequestDto contactRequestDto);
}
