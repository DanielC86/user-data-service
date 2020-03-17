package com.daniel.czajka.userdataservice.dao;

import com.daniel.czajka.userdataservice.entity.Messages;

import java.util.List;

public interface MessagesDAO {

    public List<Messages> findAll();

    public Messages findById(int messageId);

    public void saveMessage(Messages newMessage);

    public void deleteById(int messageId);
}
