/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.cliente.controladores;

import co.edu.unicauca.DTO.HamburguesaDTO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author alvarodanieleraso
 */
public class CocineroCallbckImpl extends UnicastRemoteObject implements CocineroCallbckint{

    public CocineroCallbckImpl() throws RemoteException {
        super();	
    }
    
    @Override
    public void notificar(String mensaje, HamburguesaDTO objHamburguesa) throws RemoteException {
        System.out.println("Mensaje enviado del servidor: " + mensaje);       
        //System.out.println("Cantidad de usuarios conectados: " + cantidadUsuarios );
        
        //aqui debemos lanzar la interfaz y actulizar el pedido que llega
    }
    
}
