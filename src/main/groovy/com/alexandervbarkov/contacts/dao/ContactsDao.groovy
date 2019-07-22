package com.alexandervbarkov.contacts.dao

import com.alexandervbarkov.contacts.model.Contact
import org.springframework.data.mongodb.repository.MongoRepository

interface ContactsDao extends MongoRepository<Contact, String> {
    List<Contact> findByFirstName(String firstName)
    List<Contact> findByLastName(String lastName)
    List<Contact> findByPhoneNumber(String phoneNumber)
    List<Contact> findByEmail(String email)
}