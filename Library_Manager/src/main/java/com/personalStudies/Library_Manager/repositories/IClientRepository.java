package com.personalStudies.Library_Manager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.personalStudies.Library_Manager.entities.Client;

public interface IClientRepository extends JpaRepository<Client, Long>{

}
