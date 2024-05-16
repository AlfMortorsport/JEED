package com.example.Spring.data.Repository;

import com.example.Spring.data.Model.Mesum;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MusumRepository  extends JpaRepository <Mesum,Long >{
    Mesum save (Mesum musum);
    List<Mesum> findAll();
}