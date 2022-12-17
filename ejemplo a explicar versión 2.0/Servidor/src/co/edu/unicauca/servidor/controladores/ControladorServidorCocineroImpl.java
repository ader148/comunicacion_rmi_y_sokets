/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.servidor.controladores;

import servidor.controladores.*;
import co.edu.unicauca.servidor.controladores.ControladorServidorCocineroInt;
import servidor.DTO.HamburguesaDTO;
import servidor.controladores.CocineroCallbckint;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alvarodanieleraso
 */
public class ControladorServidorCocineroImpl extends UnicastRemoteObject implements ControladorServidorCocineroInt{

    
    private final List<CocineroCallbckint> cocineros;//lista que almacena la referencia remota de los cocineros

    public ControladorServidorCocineroImpl() throws RemoteException {
        super();
        cocineros= new ArrayList();
    }
    
    
    @Override
    public boolean registrarReferenciaCocinero(CocineroCallbckint cocinero) throws RemoteException {
       //método que unicamente puede ser accedido por un hilo
	System.out.println("Invocando al método registrar usuario desde el servidor");
        boolean bandera=false;
        if (!cocineros.contains(cocinero))
        {
            bandera=cocineros.add(cocinero);  
        }        
        return bandera;    
    }

    @Override
    public void enviarMensaje(String mensaje, HamburguesaDTO objHamburguesa) throws RemoteException {
       //notificarUsuarios("un cliente envio el siguiente mensaje: " + mensaje);
        notificarCocineros(mensaje, objHamburguesa);
    }
    
    private void notificarCocineros(String mensaje, HamburguesaDTO hamburguesa) throws RemoteException 
    {
        System.out.println("Invocando al método notificar cocineros desde el servidor");
        for (CocineroCallbckint objCocinero: cocineros){
            objCocinero.notificar(mensaje, hamburguesa);
        }
        
        
    }
    
}
