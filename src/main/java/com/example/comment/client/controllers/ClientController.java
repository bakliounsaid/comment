package com.example.comment.client.controllers;

import com.example.comment.client.models.ClientEntity;
import com.example.comment.client.models.exceptiuon.DuplicateException;
import com.example.comment.client.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")

public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService)
    {
        this.clientService = clientService;
    }

    @GetMapping
    public List<ClientEntity> getClients(@RequestParam(required = false) Integer id) throws DuplicateException {
        return clientService.getClients(id);
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(value = "/add",consumes = "application/json")
    public String addClient(@RequestBody ClientEntity client)
    {
        clientService.addClient(client);
        return "client added successfully";
    }

}