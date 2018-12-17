package com.web.managevol.controllers;

import com.web.managevol.entities.*;
import com.web.managevol.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class ReservationController {


    @Autowired
    ReservationRepository reservationRepository;

    /*
        Lister les reservations
     */
    @GetMapping("/reservations")
    public List<Reservation> index(){
        List<Reservation> reservations = new ArrayList<>();
        reservationRepository.findAll()
                .forEach(reservations::add);
        return reservations;
    }

    /*
        Ajouter une reservation
     */
    @PostMapping(value = "/reservation/add")
    public void addVol(@Valid @RequestBody Reservation reservation){
        System.out.println("Create method " );
        System.out.println("Create Reservation: " );
        reservationRepository.save(reservation);
    }

    /*
    Supprimer un vol
 */
    @DeleteMapping(value = "/reservation/delete/{id}")
    public void delete(@PathVariable int id){
        System.out.println("Create vol: " + id);
        reservationRepository.deleteById(id);
    }


}
