package com.alexandervbarkov.contacts.api

import com.alexandervbarkov.contacts.dao.ContactsDao
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup

class ContactsControllerTest extends Specification {
    def controller
    ContactsDao dao = Mock()

    def mockMvc

    def setup() {
        controller = new ContactsController(dao)
        mockMvc = standaloneSetup(controller).build()
    }

    def "get contacts"() {
        expect:
        mockMvc.perform(get("/contacts"))
                .andExpect(status().isOk())
    }
}