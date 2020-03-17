package com.daniel.czajka.userdataservice.service;

import com.daniel.czajka.userdataservice.entity.Messages;

import java.util.List;

public interface MessagesService {

    public List<Messages> findAll();

    public Messages findById(int messageId);

    public void save(Messages newMessage);

    public void deleteById(int messageId);
}
