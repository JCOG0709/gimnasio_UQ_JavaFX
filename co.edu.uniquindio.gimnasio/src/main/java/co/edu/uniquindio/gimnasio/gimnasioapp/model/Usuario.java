package co.edu.uniquindio.gimnasio.gimnasioapp.model;

import java.util.ArrayList;

public abstract class Usuario extends Persona{
    private Membresia memebresia;
    private ArrayList<Clase> listaClases = new ArrayList<>();
}
