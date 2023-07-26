package com.personalStudies.Library_Manager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.personalStudies.Library_Manager.entities.Client;
import com.personalStudies.Library_Manager.repositories.IClientRepository;

@Service
public class ClientService {

    @Autowired
    private IClientRepository clientRepository;

    @Transactional (readOnly = true)
    public void registerClient(Client entity) {
        System.out.println(entity);
        clientRepository.save(entity);
    }
}