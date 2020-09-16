package com.alexandervbarkov.contacts.api

import com.alexandervbarkov.contacts.dao.ContactsDao
import com.alexandervbarkov.contacts.model.Contact
import org.springframework.web.bind.annotation.*

import static org.springframework.http.HttpStatus.CREATED

@RestController
class ContactsController {
    ContactsDao dao

    ContactsController(ContactsDao dao) {
        this.dao = dao
    }

    @GetMapping("/contacts")
    List<Contact> getContacts() {
        dao.findAll()
    }

    @ResponseStatus(CREATED)
    @PostMapping("/contact")
    void contacts(@RequestBody Contact contact) {
        dao.insert(contact)
    }
}