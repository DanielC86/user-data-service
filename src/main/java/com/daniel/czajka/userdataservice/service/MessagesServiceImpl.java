package com.daniel.czajka.userdataservice.service;


import com.daniel.czajka.userdataservice.dao.MessagesDAO;
import com.daniel.czajka.userdataservice.entity.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MessagesServiceImpl implements MessagesService{

    private MessagesDAO messagesDAO;

    @Autowired
    public MessagesServiceImpl(MessagesDAO theMessagesDAO){
        messagesDAO = theMessagesDAO;
    }


    @Override
    @Transactional
    public List<Messages> findAll() {
        return messagesDAO.findAll();
    }

    @Override
    @Transactional
    public Messages findById(int messageId) {
        return messagesDAO.findById(messageId);
    }

    @Override
    public void save(Messages newMessage) {

    }

    @Override
    public void deleteById(int messageId) {

    }
}
