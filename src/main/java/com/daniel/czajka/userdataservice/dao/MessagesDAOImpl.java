package com.daniel.czajka.userdataservice.dao;

import com.daniel.czajka.userdataservice.entity.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository("MessagesDAO")
public class MessagesDAOImpl implements MessagesDAO{

    //define entity manager
    private EntityManager entityManager;

    //setup constructor injection
    @Autowired
    public MessagesDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<Messages> findAll() {

        //create query
        TypedQuery<Messages> messagesQuery = entityManager.createQuery("from Messages", Messages.class);

        //execute query
        List<Messages> messages = messagesQuery.getResultList();

        //get the result
        return messages;
    }

    @Override
    public Messages findById(int messageId) {
        return null;
    }

    @Override
    public void saveMessage(Messages newMessage) {

    }

    @Override
    public void deleteById(int messageId) {

    }
}
