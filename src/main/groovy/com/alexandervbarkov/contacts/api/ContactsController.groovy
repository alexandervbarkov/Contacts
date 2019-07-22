package com.alexandervbarkov.contacts.api

import com.alexandervbarkov.contacts.dao.ContactsDao
import com.alexandervbarkov.contacts.model.Contact
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ContactsController {
    ContactsDao dao

    ContactsController(ContactsDao dao) {
        this.dao = dao
    }

    @GetMapping("/contacts")
    def contacts() {
        dao.findAll()
    }

    //TODO: find out why swagger shows additional parameters. Because of Groovy?
    @PostMapping("/contacts")
    def contacts(@RequestBody Contact contact) {
        dao.save(contact)
    }
}