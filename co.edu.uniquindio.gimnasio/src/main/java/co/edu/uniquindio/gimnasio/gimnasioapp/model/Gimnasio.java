package co.edu.uniquindio.gimnasio.gimnasioapp.model;

import java.util.ArrayList;

public class Gimnasio {
    private String nombre;
    private ArrayList<Persona> listaPersonas = new ArrayList<>();
    private ArrayList<Plan> listaPlan = new ArrayList<>();
    private ArrayList<Reserva> listaReserva = new ArrayList<>();
    private ArrayList<Membresia> listamembresia = new ArrayList<>();
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public Gimnasio(){}

    public Gimnasio(String nombre) {
        this.nombre = nombre;
    }
    //CRUD USUARIO
    public ArrayList<Usuario> mostrarUsuarios(){
        return listaUsuarios;
    }
    public Usuario crearUsuario(Usuario usuario){
        Usuario usuarioEncontrado = obtenerUsuario(usuario.getIdentificacion());
        if(usuarioEncontrado == null){
            Usuario usuarioNuevo = new Usuario();
            usuarioNuevo.setNombre(usuario.getNombre());
            usuarioNuevo.setApellido(usuario.getApellido());
            usuarioNuevo.setEdad(usuario.getEdad());
            usuarioNuevo.setTelefono(usuario.getTelefono());
            usuarioNuevo.setIdentificacion(usuario.getIdentificacion());

            getListaUsuarios().add(usuario);

            return usuario;
        }else{
            return null;
        }
    }
    public boolean borrarusuario(String identificacion){
        Usuario usuarioEncontrado = obtenerUsuario(identificacion);
        if(usuarioEncontrado != null){
            getListaUsuarios().remove(usuarioEncontrado);
            return true;
        }
        return false;
    }


    public Usuario obtenerUsuario(String identificacion){
        Usuario usuarioEncontrado = null;
        for(Persona persona : getListaUsuarios()){
            if(persona.getIdentificacion().equals(identificacion) && persona instanceof Usuario){
                usuarioEncontrado = (Usuario) persona;
                break;
            }
        }
        return usuarioEncontrado;
    }
    //--------------------------------------
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

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
}
