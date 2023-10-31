package com.example.ApiRestTaller.Service;

import com.example.ApiRestTaller.Entity.Habitaciones;

import java.util.List;

public interface HabitacionesService {

public List<Habitaciones> consultarHabitaciones();

public Habitaciones crearHabitaciones(Habitaciones habitaciones);

public Habitaciones modificarHabitaciones(Habitaciones habitaciones);

public Habitaciones buscarHabitaciones(int id);

public void eliminarHabitacion(int id);
}
