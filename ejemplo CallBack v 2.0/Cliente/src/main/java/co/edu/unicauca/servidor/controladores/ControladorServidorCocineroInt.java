/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.servidor.controladores;

import co.edu.unicauca.DTO.HamburguesaDTO;
import co.edu.unicauca.cliente.controladores.CocineroCallbckint;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author alvarodanieleraso
 */
public interface ControladorServidorCocineroInt extends Remote{
    
    public boolean registrarReferenciaCocinero(CocineroCallbckint cocinero) throws RemoteException;
    public void enviarMensaje(String mensaje, HamburguesaDTO objHamburguesa)throws RemoteException;
    
}
