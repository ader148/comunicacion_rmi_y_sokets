package cliente.servicios;

import cliente.utilidades.UtilidadesRegistroC;
import cliente.vista.Menu;
import servidor.controladores.ControladorGestorHamburguesaInt;

public class ClienteDeObjetos
{

	//private static ControladorGestorUsuariosInt objRemoto;
        private static ControladorGestorHamburguesaInt objRemoto;  
        
	public static void main(String[] args)
	{
            int numPuertoRMIRegistry = 0;
            String direccionIpRMIRegistry = "";        
               
            System.out.println("Cual es el la dirección ip donde se encuentra  el rmiregistry ");
            direccionIpRMIRegistry = cliente.utilidades.UtilidadesConsola.leerCadena();
            System.out.println("Cual es el número de puerto por el cual escucha el rmiregistry ");
            numPuertoRMIRegistry = cliente.utilidades.UtilidadesConsola.leerEntero(); 
            
            objRemoto = (ControladorGestorHamburguesaInt) UtilidadesRegistroC.obtenerObjRemoto(direccionIpRMIRegistry,numPuertoRMIRegistry, "controladorGestionUsuarios");
            Menu objMenu= new Menu(objRemoto);
            objMenu.ejecutarMenuPrincipal();
		
	}
	
	
	
}

