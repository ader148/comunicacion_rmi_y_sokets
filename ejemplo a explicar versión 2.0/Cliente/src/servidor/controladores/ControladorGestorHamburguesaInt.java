/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.controladores;

import java.rmi.Remote;
import java.rmi.RemoteException;
import servidor.DTO.HamburguesaDTO;
import servidor.DTO.UsuarioDTO;

/**
 *
 * @author alvarodanieleraso
 */
public interface ControladorGestorHamburguesaInt extends Remote{
    
    //Definicion del primer método remoto
    public boolean registrarHamburguesa(HamburguesaDTO objHamburguesa) throws RemoteException;
    
    //Definicion del segundo método remoto
    public HamburguesaDTO consultarHamburguesaDTO(String nombreHamburguesa)throws RemoteException;
    
    
}
