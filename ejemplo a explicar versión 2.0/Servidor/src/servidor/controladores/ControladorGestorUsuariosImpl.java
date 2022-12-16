
package servidor.controladores;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import servidor.DTO.UsuarioDTO;
import servidor.Repositorios.UsuariosRepositoryInt;

public class ControladorGestorUsuariosImpl extends UnicastRemoteObject implements ControladorGestorUsuariosInt{
    
    private final UsuariosRepositoryInt objUsuariosRepository;

    public ControladorGestorUsuariosImpl(UsuariosRepositoryInt objUsuariosRepository) throws RemoteException
    {
        super(); //se asigna un puerto de escucha al OR
        this.objUsuariosRepository=objUsuariosRepository;
    }

    @Override
    public boolean registrarUsuario(UsuarioDTO objUsuario) throws RemoteException
    {
        return this.objUsuariosRepository.registrarUsuario(objUsuario);
    }
    
    @Override
    public int consultarCantidadUsuarios() throws RemoteException
    {
       return this.objUsuariosRepository.consultarCantidadUsuarios();
    }

    @Override
    public UsuarioDTO consultarUsuario(int identificacion) throws RemoteException {
        return this.objUsuariosRepository.consultarUsuario(identificacion);
    }
}
