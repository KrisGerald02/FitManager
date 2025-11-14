package com.tuempresa.FerreControl.modelo;

import javax.persistence.*;
import javax.validation.constraints.Max;

import org.openxava.annotations.*;
import lombok.*;

@Entity @Getter @Setter
public class Proveedor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProveedor;

    @Column(length=20) @Required
    private String nombre;

    @Max(8)
    @Column(length=8)
    private String telefono;

    @Column(length=150)
    private String direccion;

    // 1..* para que OpenXava maneje bien proveedor - compra
    @OneToMany(mappedBy="proveedor")
    private java.util.Collection<Compra> compras;
}
