package com.daniel.czajka.userdataservice.controller;

import com.daniel.czajka.userdataservice.entity.Messages;
import com.daniel.czajka.userdataservice.service.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MessagesController {

    private MessagesService messagesService;

    @Autowired
    public MessagesController(MessagesService theMessagesService){
        messagesService = theMessagesService;
    }

    @Autowired
    private RestTemplate restTemplate;

    //return list of all messages
    @GetMapping("/messages")
    public List<Messages> findAll(){
        return messagesService.findAll();
    }

    //find message by id
    @GetMapping("/messages/{messageId}")
    public Messages findById(@PathVariable int messageId){
        Messages theMessage = messagesService.findById(messageId);

        if (theMessage == null){
            throw new RuntimeException("Employee ID not found: " + messageId);
        }
        return theMessage;
    }
}
