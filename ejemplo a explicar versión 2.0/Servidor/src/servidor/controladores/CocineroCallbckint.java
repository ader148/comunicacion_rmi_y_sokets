/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.controladores;

import servidor.DTO.HamburguesaDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author alvarodanieleraso
 */
public interface CocineroCallbckint extends  Remote{
    
    public void notificar(String mensaje, HamburguesaDTO objHamburguesa) throws RemoteException;
    
}
