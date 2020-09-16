package com.alexandervbarkov.contacts.dao

import com.alexandervbarkov.contacts.model.Contact
import org.springframework.data.mongodb.repository.MongoRepository

interface ContactsDao extends MongoRepository<Contact, String> {}