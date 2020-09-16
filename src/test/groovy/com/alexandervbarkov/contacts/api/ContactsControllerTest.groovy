package com.alexandervbarkov.contacts.api

import com.alexandervbarkov.contacts.dao.ContactsDao
import com.alexandervbarkov.contacts.model.Contact
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup
import static utils.TestUtils.readFixtureAsString

class ContactsControllerTest extends Specification {
    ContactsDao dao = Mock()
    def mockMvc = standaloneSetup(new ContactsController(dao)).build()

    def "get contacts"() {
        given:
        def expectedBody = readFixtureAsString('get-contact-response.json')

        def contacts = [new Contact(
                firstName: 'firstName',
                lastName: 'lastName',
                phoneNumber: 'phoneNumber',
                email: 'email'
        )]

        when:
        dao.findAll() >> contacts

        then:
        mockMvc.perform(get("/contacts"))
                .andExpect(status().isOk())
//                .andExpect(content().json(expectedBody))

        then:
        1 * dao.findAll()
    }
}