package co.edu.uniquindio.gimnasio.gimnasioapp.utils;

import co.edu.uniquindio.gimnasio.gimnasioapp.model.*;

public class DataUtil {

    public static Gimnasio inicializarDatos(){
        Gimnasio gimnasio = new Gimnasio("Gimnacio Uq");

        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Sebastian");
        estudiante1.setApellido("Garcia");
        estudiante1.setEdad(20);
        estudiante1.setTelefono("3167844799");
        estudiante1.setIdentificacion("1001");

        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Sebastian");
        estudiante2.setApellido("Cortez");
        estudiante2.setEdad(20);
        estudiante2.setTelefono("3103010283");
        estudiante2.setIdentificacion("1002");

        Estudiante estudiante3 = new Estudiante();
        estudiante3.setNombre("Camilo");
        estudiante3.setApellido("Ortiz");
        estudiante3.setEdad(20);
        estudiante3.setTelefono("3004751613");
        estudiante3.setIdentificacion("1003");

        TrabajadorUQ trabajadorUQ1 = new TrabajadorUQ();
        trabajadorUQ1.setNombre("Camilo");
        trabajadorUQ1.setApellido("Ortiz");
        trabajadorUQ1.setEdad(40);
        trabajadorUQ1.setTelefono("3100000000");
        trabajadorUQ1.setIdentificacion("1004");

        Externo externo1 = new Externo();
        externo1.setNombre("Camilo");
        externo1.setApellido("Ortiz");
        externo1.setEdad(35);
        externo1.setTelefono("31600000000");
        externo1.setIdentificacion("1005");

        gimnasio.getListaPersonas().add(estudiante1);
        gimnasio.getListaPersonas().add(estudiante2);
        gimnasio.getListaPersonas().add(estudiante3);
        gimnasio.getListaPersonas().add(trabajadorUQ1);
        gimnasio.getListaPersonas().add(externo1);

        return gimnasio;
    }
}
