package co.edu.uniquindio.gimnasio.gimnasioapp.model;

import java.time.LocalDate;

public abstract class Membresia {
    private String tipo;
    private  double costo;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private boolean activa;
    private PeriodoMembresia periodoMembresia;

    public Membresia(){}
    public Membresia(String tipo, double costo, LocalDate fechaInicio,
                     LocalDate fechaFinal, boolean estado, PeriodoMembresia periodoMembresia) {
        this.tipo = tipo;
        this.costo = costo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.activa = activa;
        this.periodoMembresia = periodoMembresia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean estado) {
        this.activa = estado;
    }

    public PeriodoMembresia getPeriodoMembresia() {
        return periodoMembresia;
    }

    public void setPeriodoMembresia(PeriodoMembresia periodoMembresia) {
        this.periodoMembresia = periodoMembresia;
    }
}
