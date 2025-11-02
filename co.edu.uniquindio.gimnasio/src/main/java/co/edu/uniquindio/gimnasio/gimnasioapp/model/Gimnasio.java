package co.edu.uniquindio.gimnasio.gimnasioapp.model;

import java.util.ArrayList;

public class Gimnasio {
    private String nombre;
    private ArrayList<Persona> listaPersonas = new ArrayList<>();
    private ArrayList<Plan> listaPlan = new ArrayList<>();
    private ArrayList<Reserva> listaReserva = new ArrayList<>();
    private ArrayList<Membresia> listamembresia = new ArrayList<>();
    private ArrayList<Entrenador> listaEntrenadores;
    private ArrayList<Clase> listaClases;
    private ArrayList<Usuario> listaUsuarios;

    public Gimnasio(){}

    public Gimnasio(String nombre, ArrayList<Persona> listaPersonas, ArrayList<Reserva> listaReserva, ArrayList<Plan> listaPlan, ArrayList<Membresia> listamembresia, ArrayList<Entrenador> listaEntrenadores, ArrayList<Clase> listaClases, ArrayList<Usuario> listaUsuarios) {
        this.nombre = nombre;
        this.listaPersonas = listaPersonas;
        this.listaReserva = listaReserva;
        this.listaPlan = listaPlan;
        this.listamembresia = listamembresia;
        this.listaEntrenadores = listaEntrenadores;
        this.listaClases = listaClases;
        this.listaUsuarios = listaUsuarios;
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

    public ArrayList<Clase> getListaClases() {
        return listaClases;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public Clase obtenerClase(String nombreClase){
        Clase clase = null;
        for(int i=0;i<getListaClases().size();i++){
            if(getListaClases().get(i).getNombre().equals(nombreClase)){
                clase = getListaClases().get(i);
            }
        }
        return clase;
    }
    public Usuario obtenerUsuario(String identificacion){
        Usuario usuario = null;
        for(int i=0;i<getListaUsuarios().size();i++){
            if(getListaUsuarios().get(i).getIdentificacion().equals(identificacion)){
                usuario = getListaUsuarios().get(i);
            }
        }
        return usuario;
    }


}
