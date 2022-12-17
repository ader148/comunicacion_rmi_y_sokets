/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.servicios;


import servidor.utilidades.UtilidadesRegistroS;
import servidor.utilidades.UtilidadesConsola;
import java.rmi.RemoteException;
//import servidor.Repositorios.UsuariosRepository;
import servidor.Repositorios.HamburguesasRepository;
//import servidor.controladores.ControladorGestorUsuariosImpl;
import servidor.controladores.ControladorGestorHamburguesaImpl;

import co.edu.unicauca.servidor.controladores.ControladorServidorCocineroImpl;


public class ServidorDeObjetos
{
    public static void main(String args[]) throws RemoteException
    {        
         
        int numPuertoRMIRegistry = 0;
        String direccionIpRMIRegistry = "";
                       
        System.out.println("Cual es el la dirección ip donde se encuentra  el rmiRegistry ");
        direccionIpRMIRegistry = UtilidadesConsola.leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el rmiRegistry ");
        numPuertoRMIRegistry = UtilidadesConsola.leerEntero(); 
     
        //UsuariosRepository objRepository = new UsuariosRepository();
        HamburguesasRepository objRepository = new HamburguesasRepository();
        
        //ControladorGestorUsuariosImpl objRemoto = new ControladorGestorUsuariosImpl(objRepository);//se leasigna el puerto de escucha del objeto remoto
        ControladorGestorHamburguesaImpl objRemoto = new ControladorGestorHamburguesaImpl(objRepository);//se leasigna el puerto de escucha del objeto remoto
        
        ControladorServidorCocineroImpl objRemoto2 = new ControladorServidorCocineroImpl();//se leasigna el puerto de escucha del objeto remoto
        
        
        try
        {
            
           UtilidadesRegistroS.arrancarNS(numPuertoRMIRegistry);
           
           //registramos el objeto remoto del cliente
           UtilidadesRegistroS.RegistrarObjetoRemoto(objRemoto, direccionIpRMIRegistry, numPuertoRMIRegistry, "controladorGestionUsuarios");            
           
           //arrancamos otro ns para el objeto de cocineros
           //UtilidadesRegistroS.arrancarNS(2022);
           //registramos el objeto remoto del cocinero
           //UtilidadesRegistroS.RegistrarObjetoRemoto(objRemoto2, direccionIpRMIRegistry, 2022, "ServidorCocinero");  
           
           //UtilidadesRegistroS.arrancarNS(2022);
           UtilidadesRegistroS.RegistrarObjetoRemoto(objRemoto2, direccionIpRMIRegistry, 2020, "ServidorCocinero");  
           
        } catch (Exception e)
        {
            System.err.println("No fue posible Arrancar el NS o Registrar el objeto remoto" +  e.getMessage());
        }
        
        
    }
}
