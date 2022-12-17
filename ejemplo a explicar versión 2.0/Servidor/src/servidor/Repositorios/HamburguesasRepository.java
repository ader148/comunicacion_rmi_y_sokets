/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.Repositorios;

import java.util.ArrayList;
import servidor.DTO.HamburguesaDTO;
import servidor.DTO.InformacionDTO;
import servidor.DTO.UsuarioDTO;
import servidor.servicios.Conexion_cliente_servidor;

/**
 *
 * @author alvarodanieleraso
 */
public class HamburguesasRepository implements HamburguesasRepositoryInt{
    
    private final ArrayList<HamburguesaDTO> misHamburguesas;

    public HamburguesasRepository()
    {        
        this.misHamburguesas = new ArrayList();
    }
    
    @Override
    public boolean registrarHamburguesa(HamburguesaDTO objHamburguesa) {
        System.out.println("Entrando a registrar Hamburguesa");
        boolean bandera=false;
        
        if(misHamburguesas.size() < 5)
        {            
            bandera=misHamburguesas.add(objHamburguesa);
            System.out.println("Hamburguesa registrada: nombre: " +objHamburguesa.getNombre()+ ", tamanio: " + objHamburguesa.getTipo()+ ", cantidadIngredientesExtra. " +objHamburguesa.getCantidadIngredientesExtra() +", Costo: "+ objHamburguesa.getCosto() );
        }
        
        //envio de la factura al servidor de facturas
        boolean respuestaServidorFacturas = enviarFactura(misHamburguesas);
        
        
        return bandera;
    }
    
    
    
    public boolean enviarFactura(ArrayList<HamburguesaDTO> listaHamburguesas){
        
        Conexion_cliente_servidor cliente = new Conexion_cliente_servidor();
        
        InformacionDTO informacion = new InformacionDTO();
        
        String dirIP = "localhost";
        int puerto = 2021;
        
        try {
            cliente.ServerConnection(dirIP,puerto);
            
            //una vez se conecte enviamos los datos al servidor de facturas con sockets
            informacion = cliente.peticion_respuesta(misHamburguesas);
            
        } catch(Exception e){
            System.out.println("\nError: "+e.getMessage());
        }
        
        return true;
    }

    @Override
    public HamburguesaDTO consultarUsuario(String nombreHamburguesa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
