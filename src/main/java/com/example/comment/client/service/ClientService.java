package com.example.comment.client.service;


import com.example.comment.client.models.ClientEntity;
import com.example.comment.client.models.exceptiuon.DuplicateException;
import com.example.comment.client.persistance.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ClientService {

     private final ClientRepository clientRepository;
      public ClientService (ClientRepository clientRepository)
      {
          this.clientRepository = clientRepository;
      }

    public void addClient(ClientEntity clientEntity) throws DuplicateException
     {
             ClientEntity client = this.clientRepository.findClientByEmail(clientEntity.getEmail());
             if(client == null) {
                 clientRepository.save(clientEntity);
             }
             else {
                 throw new DuplicateException("Client with email " + clientEntity.getEmail() + " already exists.");
             }
     }

    public List<ClientEntity> getClients(Integer id) {
        if (id != null) {
            return clientRepository.findById(id)
                    .map(List::of)
                    .orElse(List.of());
        }
        return clientRepository.findAll();
    }
}
