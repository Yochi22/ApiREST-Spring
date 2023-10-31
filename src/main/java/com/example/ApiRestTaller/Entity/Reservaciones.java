package com.example.ApiRestTaller.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "reservacion")
public class Reservaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "id_habitacion")
    private int id_habitacion;

    @Column(name = "fecha_entrada")
    private Date fecha_entrada;

    @Column(name = "fecha_salida")
    private Date fecha_salida;

    @Column(name = "total_reservacion")
    private double total_reservacion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(int id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public Date getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(Date fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public double getTotal_reservacion() {
        return total_reservacion;
    }

    public void setTotal_reservacion(double total_reservacion) {
        this.total_reservacion = total_reservacion;
    }
}
