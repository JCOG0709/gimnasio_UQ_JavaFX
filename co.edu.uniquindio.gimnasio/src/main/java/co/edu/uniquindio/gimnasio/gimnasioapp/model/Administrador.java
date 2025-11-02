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

    public void ModificarEntrenador() {
        String id = ClaseUtil.leerStringConsola("Ingrese la identificacion del entrenador a modificar: ");
        Entrenador resultado = Entrenador.obtenerEntrenador(gimnasio, id);
        if(resultado != null) {
            Entrenador.modificarEntrenador(resultado);
            System.out.println("✅ Entrenador modificado correctamente.");
        } else {
            System.out.println("❌ No existe un entrenador con ese ID.");
        }
    }


}
