package com.example.ApiRestTaller.Controller;

import com.example.ApiRestTaller.Entity.Habitaciones;
import com.example.ApiRestTaller.Service.HSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Habitaciones")
public class HabitacionController {

    @Autowired
private HSIMPL hsimpl;

    @GetMapping
    @RequestMapping(value= "consultarHabitaciones", method = RequestMethod.GET)
    public ResponseEntity<?> consultarHabitaciones() {
        List<Habitaciones> habitacionesList = this.hsimpl.consultarHabitaciones();
        return ResponseEntity.ok(habitacionesList);
    }

    @PutMapping
    @RequestMapping(value = "modificarHabitaciones", method = RequestMethod.PUT)
    public ResponseEntity<?> modificarHabitacione(@RequestBody Habitaciones habitaciones) {
    Habitaciones habitacionModificada = this.hsimpl.modificarHabitaciones(habitaciones);
    return ResponseEntity.status(HttpStatus.CREATED).body(habitacionModificada);
    }

    @PutMapping
    @RequestMapping(value = "crearHabitaciones", method = RequestMethod.POST)
    public ResponseEntity<?> crearHabitaciones(@RequestBody Habitaciones habitaciones) {
        Habitaciones habitacionesCrear = this.hsimpl.crearHabitaciones(habitaciones);
        return ResponseEntity.status(HttpStatus.CREATED).body(habitacionesCrear);
    }

    @GetMapping
    @RequestMapping(value = "buscarHabitaciones/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> buscarHabitaciones(@PathVariable int id) {
       Habitaciones habitaciones = this.hsimpl.buscarHabitaciones(id);
        return ResponseEntity.ok(habitaciones);

    }

    @DeleteMapping
    @RequestMapping(value = "eliminarHabitacion/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarHabitacion(@PathVariable int id) {
        this.hsimpl.eliminarHabitacion(id);
        return ResponseEntity.ok("Se eliminó correctamente");
}
}
