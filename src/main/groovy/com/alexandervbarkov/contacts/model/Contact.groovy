package com.alexandervbarkov.contacts.model

import org.springframework.data.annotation.Id

class Contact {
    @Id
    String id
    String firstName
    String lastName
    String phoneNumber
    String email
}
