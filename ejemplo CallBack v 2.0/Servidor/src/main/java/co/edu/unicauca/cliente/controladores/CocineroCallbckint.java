/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.cliente.controladores;

import co.edu.unicauca.DTO.HamburguesaDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author alvarodanieleraso
 */
public interface CocineroCallbckint extends  Remote{
    
    public void notificar(String mensaje, HamburguesaDTO objHamburguesa) throws RemoteException;
    
}
