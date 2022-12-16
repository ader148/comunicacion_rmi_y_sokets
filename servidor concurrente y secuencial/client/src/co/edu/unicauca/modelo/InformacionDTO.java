
package co.edu.unicauca.modelo;

import java.util.List;


public class InformacionDTO {
    private String nombreUsuario;
    private String dirUsuario;
    private List<String> procesos;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getDirUsuario() {
        return dirUsuario;
    }

    public void setDirUsuario(String dirUsuario) {
        this.dirUsuario = dirUsuario;
    }

    public List<String> getProcesos() {
        return procesos;
    }

    public void setProcesos(List<String> procesos) {
        this.procesos = procesos;
    }
}
