package com.web.managevol.controllers;

import com.web.managevol.entities.*;
import com.web.managevol.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class VolController {

    @Autowired
    VolRepository volRepository;

    /*
        Lister les vols
     */
    @GetMapping("/vols")
    public List<Vol> index(){
        List<Vol> vols = new ArrayList<>();
        volRepository.findAll()
                .forEach(vols::add);
        return vols;
    }

    /*
       Lister les vols
    */
    @GetMapping("/vol/{id}")
    public Vol getVol(@PathVariable int id){
        return volRepository.findById(id).get();
    }

    /*
        Ajouter un vol
     */
    @PostMapping(value = "/vol/add")
    public void addVol(@Valid @RequestBody Vol vol){
        System.out.println("Create vol: " );
        volRepository.save(vol);
    }

    /*
       Supprimer un vol
    */
    @DeleteMapping(value = "/vol/delete/{id}")
    public void delete(@PathVariable int id){
        System.out.println("Create vol: " + id);
        volRepository.deleteById(id);
    }


}
