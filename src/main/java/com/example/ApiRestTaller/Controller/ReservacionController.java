package com.example.ApiRestTaller.Controller;
import com.example.ApiRestTaller.Entity.Reservaciones;
import com.example.ApiRestTaller.Service.RSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Reservaciones")
public class ReservacionController {

    @Autowired
    private RSIMPL rsimpl;

    @GetMapping
    @RequestMapping(value= "consultarReservaciones", method = RequestMethod.GET)
    public ResponseEntity<?> consultarReservaciones() {
        List<Reservaciones> reservacionesList = this.rsimpl.consultarReservaciones();
        return ResponseEntity.ok(reservacionesList);
    }

    @PutMapping
    @RequestMapping(value = "modificarReservaciones", method = RequestMethod.PUT)
    public ResponseEntity<?> modificarReservaciones(@RequestBody Reservaciones reservaciones) {
        Reservaciones ReservacionModificada = this.rsimpl.modificarReservaciones(reservaciones);
        return ResponseEntity.status(HttpStatus.CREATED).body(ReservacionModificada);
    }

    @PutMapping
    @RequestMapping(value = "crearReservaciones", method = RequestMethod.POST)
    public ResponseEntity<?> crearReservaciones(@RequestBody Reservaciones reservaciones) {
        Reservaciones ReservacionesCrear = this.rsimpl.crearReservaciones(reservaciones);
        return ResponseEntity.status(HttpStatus.CREATED).body(ReservacionesCrear);
    }

    @GetMapping
    @RequestMapping(value = "buscarReservaciones/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> buscarReservaciones(@PathVariable int id){
        Reservaciones reservaciones = this.rsimpl.buscarReservaciones(id);
        return ResponseEntity.ok(reservaciones);

    }

    @DeleteMapping
    @RequestMapping(value = "eliminarReservacion/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarReservacion(@PathVariable int id) {
        this.rsimpl.eliminarReservacion(id);
        return ResponseEntity.ok().build();
    }
}
