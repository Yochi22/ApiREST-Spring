package com.example.ApiRestTaller.Repository;

import com.example.ApiRestTaller.Entity.Habitaciones;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitacionRepo extends CrudRepository<Habitaciones, Integer> {

}
