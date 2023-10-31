package com.example.ApiRestTaller.Service;
import com.example.ApiRestTaller.Entity.Reservaciones;
import com.example.ApiRestTaller.Repository.ReservacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RSIMPL implements ReservacionesService {

    @Autowired

    private ReservacionRepo reserva;

    @Override
    public List<Reservaciones> consultarReservaciones() {
        return (List<Reservaciones>) this.reserva.findAll();
    }


    @Override
    public Reservaciones crearReservaciones(Reservaciones reservaciones) {
        return this.reserva.save(reservaciones);
    }

    @Override
    public Reservaciones modificarReservaciones(Reservaciones reservaciones) {
        List<Reservaciones> Reservaciones = consultarReservaciones();
        return this.reserva.save(reservaciones);
    }

    @Override
    public Reservaciones buscarReservaciones(int id) {
        return this.reserva.findById(id).get();
    }

    @Override
    public void eliminarReservacion(int id) {
        this.reserva.deleteById(id);
    }
}