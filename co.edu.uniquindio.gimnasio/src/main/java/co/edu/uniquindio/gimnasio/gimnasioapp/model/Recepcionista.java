package co.edu.uniquindio.gimnasio.gimnasioapp.model;

import java.util.ArrayList;

public class Recepcionista extends UsuarioSistema{
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();



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

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

}
