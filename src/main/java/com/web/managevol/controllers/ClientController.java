package com.web.managevol.controllers;


import org.springframework.web.bind.annotation.RestController;
import com.web.managevol.entities.*;
import com.web.managevol.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class ClientController {

    @Autowired
    ClientRepository clientRepository;

    //Lister les clients
    @GetMapping("/clients")
    public List<Client> index(){
        return clientRepository.findAll();
    }

    //Ajouter un vol
    @PostMapping("/client/add")
    public void addVol(@Valid @RequestBody Client client){
        clientRepository.save(client);
    }

    /*
       Supprimer un client
    */
    @DeleteMapping(value = "/client/delete/{id}")
    public void delete(@PathVariable int id){
        System.out.println("delete client: "+ id );
        clientRepository.deleteById(id);
    }

}
