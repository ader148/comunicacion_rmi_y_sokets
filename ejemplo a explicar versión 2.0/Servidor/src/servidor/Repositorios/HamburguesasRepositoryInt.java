/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.Repositorios;
import servidor.DTO.HamburguesaDTO;


/**
 *
 * @author alvarodanieleraso
 */
public interface HamburguesasRepositoryInt {
    
    public boolean registrarHamburguesa(HamburguesaDTO objHamburguesa);
    public HamburguesaDTO consultarUsuario(String nombreHamburguesa);
    
}
