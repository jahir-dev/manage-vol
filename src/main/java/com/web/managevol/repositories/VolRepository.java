package com.web.managevol.repositories;

import com.web.managevol.entities.Vol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface VolRepository extends JpaRepository<Vol, Integer> {


}
