package com.ranjeet.jobportal.contact.service.impl;

import com.ranjeet.jobportal.contact.dto.ContactRequestDto;
import com.ranjeet.jobportal.contact.entity.Contact;
import com.ranjeet.jobportal.contact.repository.ContactRepository;
import com.ranjeet.jobportal.contact.service.IContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl  implements IContactService {

    private final ContactRepository contactRepo;

    @Override
    public boolean saveContact(ContactRequestDto contactRequestDto) {
        boolean result = false;
        Contact contact =contactRepo.save(transformContactRequestDtoToContact(contactRequestDto));
        if(contact!=null && contact.getId()!=null){
            result = true;
        }
        return result;
    }

    private Contact transformContactRequestDtoToContact(ContactRequestDto contactRequestDto) {
      Contact contact = new Contact();
      BeanUtils.copyProperties(contactRequestDto, contact);
//      contact.setCreatedAt(Instant.now());
//      contact.setCreatedBy("System");
      contact.setStatus("NEW");
      return contact;
    }
}
