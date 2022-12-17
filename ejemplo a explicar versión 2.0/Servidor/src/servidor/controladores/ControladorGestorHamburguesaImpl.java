/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.controladores;

import java.rmi.RemoteException;
import servidor.DTO.HamburguesaDTO;
import java.rmi.server.UnicastRemoteObject;
import servidor.Repositorios.HamburguesasRepositoryInt;

/**
 *
 * @author alvarodanieleraso
 */
public class ControladorGestorHamburguesaImpl extends UnicastRemoteObject implements ControladorGestorHamburguesaInt{
    
    private final HamburguesasRepositoryInt objHamburguesasRepository;
    

    public ControladorGestorHamburguesaImpl(HamburguesasRepositoryInt objHamburguesasRepository) throws RemoteException
    {
        super(); //se asigna un puerto de escucha al OR
        this.objHamburguesasRepository=objHamburguesasRepository;   
    }
    
    
    @Override
    public boolean registrarHamburguesa(HamburguesaDTO objHamburguesa) throws RemoteException {
       return this.objHamburguesasRepository.registrarHamburguesa(objHamburguesa);
    }

    @Override
    public HamburguesaDTO consultarHamburguesaDTO(String nombreHamburguesa) throws RemoteException {
        return this.objHamburguesasRepository.consultarUsuario(nombreHamburguesa);
    }
    
}
