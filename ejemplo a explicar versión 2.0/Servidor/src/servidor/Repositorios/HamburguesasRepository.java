/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.Repositorios;

import java.util.ArrayList;
import servidor.DTO.HamburguesaDTO;
import servidor.DTO.UsuarioDTO;

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
        
        return bandera;
    }

    @Override
    public HamburguesaDTO consultarUsuario(String nombreHamburguesa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
