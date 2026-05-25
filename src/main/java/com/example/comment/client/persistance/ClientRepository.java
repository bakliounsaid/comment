package com.example.comment.client.persistance;

import com.example.comment.client.models.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Integer> {
    ClientEntity findClientByEmail(String email);

}
