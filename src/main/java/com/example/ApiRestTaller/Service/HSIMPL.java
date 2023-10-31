package com.example.ApiRestTaller.Service;

import com.example.ApiRestTaller.Entity.Habitaciones;
import com.example.ApiRestTaller.Repository.HabitacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HSIMPL implements HabitacionesService {

@Autowired

private HabitacionRepo habitacion;

@Override
public List<Habitaciones> consultarHabitaciones() {
return (List<Habitaciones>) this.habitacion.findAll();
}


@Override
    public Habitaciones crearHabitaciones(Habitaciones habitaciones){
    return this.habitacion.save(habitaciones);
}

@Override
    public Habitaciones modificarHabitaciones(Habitaciones habitaciones){
    List<Habitaciones> Habitaciones = consultarHabitaciones();
    return this.habitacion.save(habitaciones);
}

@Override
    public Habitaciones buscarHabitaciones(int id){
    return this.habitacion.findById(id).get();
}

@Override
    public void eliminarHabitacion(int id){
     this.habitacion.deleteById(id);
}






}