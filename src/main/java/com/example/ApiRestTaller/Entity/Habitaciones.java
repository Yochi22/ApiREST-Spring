package com.example.ApiRestTaller.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "habitaciones")
public class Habitaciones {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name = "id")
private int id;

@Column(name = "numero_habitacion")
private int numero_habitacion;

@Column(name = "precio")
private double precio;

@Column(name = "estado")
private String estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero_habitacion() {
        return numero_habitacion;
    }

    public void setNumero_habitacion(int numero_habitacion) {
        this.numero_habitacion = numero_habitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

