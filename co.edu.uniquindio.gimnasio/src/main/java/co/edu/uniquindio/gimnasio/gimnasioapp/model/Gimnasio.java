package co.edu.uniquindio.gimnasio.gimnasioapp.model;

import java.util.ArrayList;

public class Gimnasio {
    private String nombre;
    private ArrayList<Persona> listaPersonas = new ArrayList<>();
    private ArrayList<Plan> listaPlan = new ArrayList<>();
    private ArrayList<Reserva> listaReserva = new ArrayList<>();
    private ArrayList<Membresia> listamembresia = new ArrayList<>();
    private ArrayList<Entrenador> listaEntrenadores;

    public Gimnasio(){}

    public Gimnasio(String nombre, ArrayList<Persona> listaPersonas, ArrayList<Plan> listaPlan, ArrayList<Reserva> listaReserva, ArrayList<Entrenador> listaEntrenadores, ArrayList<Membresia> listamembresia) {
        this.nombre = nombre;
        this.listaPersonas = listaPersonas;
        this.listaPlan = listaPlan;
        this.listaReserva = listaReserva;
        this.listaEntrenadores = listaEntrenadores;
        this.listamembresia = listamembresia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public ArrayList<Plan> getListaPlan() {
        return listaPlan;
    }

    public void setListaPlan(ArrayList<Plan> listaPlan) {
        this.listaPlan = listaPlan;
    }

    public ArrayList<Reserva> getListaReserva() {
        return listaReserva;
    }

    public void setListaReserva(ArrayList<Reserva> listaReserva) {
        this.listaReserva = listaReserva;
    }

    public ArrayList<Membresia> getListamembresia() {
        return listamembresia;
    }

    public void setListamembresia(ArrayList<Membresia> listamembresia) {
        this.listamembresia = listamembresia;
    }

    public ArrayList<Entrenador> getListaEntrenadores() {
        return listaEntrenadores;
    }
}
