package co.edu.uniquindio.gimnasio.gimnasioapp.model;

import java.util.ArrayList;

public abstract class Usuario extends Persona{
    private Membresia membresia;
    private ArrayList<Clase> listaClases = new ArrayList<>();

    public Usuario(){}
    public Usuario(String nombre, String apellido, String identificacion, int edad, String telefono, Membresia membresia, ArrayList<Clase> listaClases) {
        super(nombre, apellido, identificacion, edad, telefono);
        this.membresia = membresia;
        this.listaClases = listaClases;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public ArrayList<Clase> getListaClases() {
        return listaClases;
    }

    public boolean tieneMembresiaActiva() {
        return membresia != null && membresia.isActiva();
    }
}

