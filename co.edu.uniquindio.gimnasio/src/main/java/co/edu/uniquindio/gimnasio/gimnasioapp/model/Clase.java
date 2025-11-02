package co.edu.uniquindio.gimnasio.gimnasioapp.model;

import java.time.LocalTime;
import java.util.ArrayList;

public class Clase {
    private String nombre;
    private TipoClases tipoClase;
    private LocalTime horaInicio;
    private int cupoMaximo;
    private Entrenador entrenadorAsignado;
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public Clase(String nombre, TipoClases tipoClase, LocalTime horaInicio, int cupoMaximo, Entrenador entrenadorAsignado, ArrayList<Usuario> listaUsuarios) {
        this.nombre = nombre;
        this.tipoClase = tipoClase;
        this.horaInicio = horaInicio;
        this.cupoMaximo = cupoMaximo;
        this.entrenadorAsignado = entrenadorAsignado;
        this.listaUsuarios = listaUsuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoClases getTipoClase() {
        return tipoClase;
    }

    public void setTipoClase(TipoClases tipoClase) {
        this.tipoClase = tipoClase;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public Entrenador getEntrenadorAsignado() {
        return entrenadorAsignado;
    }

    public void setEntrenadorAsignado(Entrenador entrenadorAsignado) {
        this.entrenadorAsignado = entrenadorAsignado;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public void asignarEntrenador(Entrenador entrenador) {
        this.entrenadorAsignado = entrenador;
        System.out.println("✅ Entrenador asignado a la clase: " + nombre);
    }
    public void inscribirUsuario(Usuario usuario) {
        this.listaUsuarios.add(usuario);
        System.out.println("👤 Usuario registrado en la clase: " + nombre);
    }
}
