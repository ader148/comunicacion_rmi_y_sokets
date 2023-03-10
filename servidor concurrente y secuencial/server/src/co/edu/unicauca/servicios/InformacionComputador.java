package co.edu.unicauca.servicios;

import java.util.logging.Level;
import java.util.logging.Logger;


public class InformacionComputador {
    public static String atenderPeticion(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
        }
        InformacionDTO_old informacion = new InformacionDTO_old();
        GestorPeticion peticion = new GestorPeticion();
        informacion.setNombreUsuario(peticion.getNombreUsuario());
        informacion.setDirUsuario(peticion.getDirectorioInicioUsuario());
        informacion.setProcesos(peticion.getProcesos());
        return ConversorJson.objectToJson(informacion);
    }
}
