package co.edu.uniquindio.gimnasio.gimnasioapp.model;

import java.util.ArrayList;



public class Entrenador extends Persona{
    private Membresia membresia;
    private ArrayList<Clase> listaClases = new ArrayList<>();
    public Entrenador(String nombre,String apellido, String identificacion, int edad, String telefono) {
        super(nombre, apellido, identificacion, edad, telefono);
    }
    public ArrayList<Clase> getListaClases() {
        return listaClases;
    }
    public static Entrenador registrarEntrenador (){
        String nombre = ClaseUtil.leerStringConsola("Ingrese el nombre del cliente: ");
        String apellido = ClaseUtil.leerStringConsola("Ingrese el apellido del cliente");
        String id= ClaseUtil.leerStringConsola("Ingrese el id del cliente");
        int edad = ClaseUtil.leerEntero("Ingrese la edad del entrenador: ");
        String telefono = ClaseUtil.leerStringConsola("Ingrese el telefono del entrenador: ");
        Entrenador entrenador = new Entrenador(nombre, apellido, id, edad, telefono);
        return entrenador;
}
    public static Entrenador obtenerEntrenador(Gimnasio gimnasio, String identificacion) {
        Entrenador buscarId = null;
        for(int i=0;i<gimnasio.getListaEntrenadores().size();i++){
            if(gimnasio.getListaEntrenadores().get(i).getIdentificacion().equals(identificacion) ){
                buscarId = gimnasio.getListaEntrenadores().get(i);
            }
        }
        return buscarId;
    }
    public static void modificarEntrenador(Entrenador entrenador){
        String nombre = ClaseUtil.leerStringConsola("Ingrese el nombre del Entrenador: ");
        String apellido = ClaseUtil.leerStringConsola("Ingrese el apellido del Entrenador: ");
        String identificacion = ClaseUtil.leerStringConsola("Ingrese la identificacion del Entrenador: ");
        int edad = ClaseUtil.leerEntero("Ingrese la edad del entrenador: ");
        String telefono = ClaseUtil.leerStringConsola("Ingrese el telefono del entrenador: ");
        entrenador.setNombre(nombre);
        entrenador.setApellido(apellido);
        entrenador.setIdentificacion(identificacion);
        entrenador.setEdad(edad);
        entrenador.setTelefono(telefono);
    }

}
