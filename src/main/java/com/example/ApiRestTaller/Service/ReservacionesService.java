package com.example.ApiRestTaller.Service;

import com.example.ApiRestTaller.Entity.Habitaciones;
import com.example.ApiRestTaller.Entity.Reservaciones;

import java.util.List;

public interface ReservacionesService {

    public List<Reservaciones> consultarReservaciones();

    public Reservaciones crearReservaciones(Reservaciones reservaciones);

    public Reservaciones modificarReservaciones(Reservaciones reservaciones);

    public Reservaciones buscarReservaciones(int id);

    public void eliminarReservacion(int id);
}
