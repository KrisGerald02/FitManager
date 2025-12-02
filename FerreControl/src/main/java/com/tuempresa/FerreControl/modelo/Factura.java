package com.tuempresa.FerreControl.modelo;

import java.math.*;
import java.time.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

@Entity
@View(
        members =
                "anyo, numero;" +
                        "fecha, cliente;" +
                        "detalles { detalles }" +
                        "importeTotal"
)
public class Factura extends Identifiable {

    @Column(length=4)
    private int anyo;

    @Column(length=6)
    private int numero;

    @Required
    private LocalDate fecha;

    @ManyToOne(fetch=FetchType.LAZY)
    @DescriptionsList(descriptionProperties="nombreCompleto")
    private Cliente cliente;

    @ElementCollection
    @ListProperties("producto.nombre, cantidad, precio, importe")
    private Collection<DetalleFactura> detalles;

    @ReadOnly               // <-- ya no lo editas a mano
    @Money
    private BigDecimal importeTotal;

    // --------- CÁLCULO AUTOMÁTICO DEL TOTAL ---------
    @PrePersist
    @PreUpdate
    private void calcularImporteTotal() {
        if (detalles == null || detalles.isEmpty()) {
            importeTotal = BigDecimal.ZERO;
            return;
        }

        BigDecimal total = BigDecimal.ZERO;
        for (DetalleFactura d : detalles) {
            if (d != null && d.getImporte() != null) {
                total = total.add(d.getImporte());
            }
        }
        importeTotal = total;
    }
    // ------------------------------------------------

    // getters y setters normales

    public int getAnyo() { return anyo; }
    public void setAnyo(int anyo) { this.anyo = anyo; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Collection<DetalleFactura> getDetalles() { return detalles; }
    public void setDetalles(Collection<DetalleFactura> detalles) { this.detalles = detalles; }

    public BigDecimal getImporteTotal() { return importeTotal; }
    public void setImporteTotal(BigDecimal importeTotal) { this.importeTotal = importeTotal; }
}

