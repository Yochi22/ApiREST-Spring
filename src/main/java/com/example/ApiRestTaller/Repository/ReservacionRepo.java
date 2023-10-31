package com.example.ApiRestTaller.Repository;

import com.example.ApiRestTaller.Entity.Reservaciones;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservacionRepo extends CrudRepository<Reservaciones, Integer> {

}
