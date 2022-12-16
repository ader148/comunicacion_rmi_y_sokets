/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.controladores;

import java.rmi.RemoteException;
import servidor.DTO.HamburguesaDTO;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author alvarodanieleraso
 */
public class ControladorGestorHamburguesaImpl extends UnicastRemoteObject implements ControladorGestorHamburguesaInt{

    @Override
    public boolean registrarHamburguesa(HamburguesaDTO objHamburguesa) throws RemoteException {
       return true;
    }

    @Override
    public HamburguesaDTO consultarHamburguesaDTO(String nombreHamburguesa) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
