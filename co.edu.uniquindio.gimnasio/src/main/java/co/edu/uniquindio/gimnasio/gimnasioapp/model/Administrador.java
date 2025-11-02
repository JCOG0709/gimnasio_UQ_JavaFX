package co.edu.uniquindio.gimnasio.gimnasioapp.model;

public class Administrador extends UsuarioSistema{
    private Gimnasio gimnasio;  // relación con Gimnasio (para acceder a entrenadores, clases)

    public Administrador(String nombre,String apellido, String id, int edad, String telefono, String contrasena, Gimnasio gimnasio) {
        super(nombre,apellido, id, edad, telefono, contrasena);
        this.gimnasio = gimnasio;
    }

    public void registrarEntrenador() {

        Entrenador nuevo = Entrenador.registrarEntrenador(); // <-- se encarga Entrenador

        gimnasio.getListaEntrenadores().add(nuevo);

        System.out.println("\n✅ Entrenador agregado al gimnasio correctamente.");
    }

    public void modificarEntrenador() {
        String id = Utilidades.leerStringConsola("Ingrese la identificacion del entrenador a modificar: ");
        Entrenador resultado = Entrenador.obtenerEntrenador(gimnasio, id);
        if(resultado != null) {
            Entrenador.modificarEntrenador(resultado);
            System.out.println("✅ Entrenador modificado correctamente.");
        } else {
            System.out.println("❌ No existe un entrenador con ese ID.");
        }
    }
    public void eliminarEntrenador() {
        String id = Utilidades.leerStringConsola("Ingrese la identificacion del entrenador a eliminar: ");
        Entrenador resultado = Entrenador.obtenerEntrenador(gimnasio, id);
        if(resultado != null) {
            gimnasio.getListaEntrenadores().remove(resultado);
            System.out.println("✅ Entrenador eliminado correctamente.");
        } else {
            System.out.println("❌ No existe un entrenador con ese ID.");
        }
    }
    public void asignarEntrenadorClases(){
        String id = Utilidades.leerStringConsola("Ingrese la identificacion del entrenador a asignar: ");
        Entrenador resultado = Entrenador.obtenerEntrenador(gimnasio, id);
        if(resultado != null) {
            String nombreClase = Utilidades.leerStringConsola("Ingrese el nombre de la clase: ");
            Clase clase = gimnasio.obtenerClase(nombreClase);
            if(clase != null){
                clase.asignarEntrenador(resultado);
                System.out.println("✅ Entrenador asignado correctamente.");}
            else{
                System.out.println("❌ la clase no fue encontrada");
            }
        } else {
            System.out.println("❌ No existe un entrenador con ese ID.");
        }

    }

}
