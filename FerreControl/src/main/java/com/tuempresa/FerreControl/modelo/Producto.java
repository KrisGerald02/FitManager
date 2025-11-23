package com.tuempresa.FerreControl.modelo;

import javax.persistence.*;
import javax.validation.constraints.Min;

import org.openxava.annotations.*;
import lombok.*;

@Entity @Getter @Setter
public class Producto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Hidden
    private int idProducto;

    @Column(length=50) @Required
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @DescriptionsList(descriptionProperties="nombre")
    @Required
    private CategoriaProducto categoria;

    @Min(0)
    private double precioVenta;

    @Min(0)
    private int stock;

    @Min(0)
    @Column(nullable=false)
    private int stockMinimo = 0; // Para alertas de bajo stock

    @Column(length=20)
    private String unidadMedida;

    public void aumentarStock(int cantidad){
        if(cantidad <= 0) throw new IllegalArgumentException("El cantidad debe ser mayor a 0");
        this.stock += cantidad;
    }

    public void disminuirStock(int cantidad){
        if(cantidad <= 0) throw new IllegalArgumentException("El cantidad debe ser mayor a 0");
        if(stock - cantidad < 0) {
            throw new IllegalArgumentException("Stock insuficiente para la operacion");
        }
        this.stock -= cantidad;
    }

    @Depends("stock, stockMinimo")
    public boolean isBajoStock() {
        return stockMinimo > 0 && stock <= stockMinimo;
    }
}