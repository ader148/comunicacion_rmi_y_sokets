/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.DTO;

import java.util.List;

/**
 *
 * @author alvarodanieleraso
 */
public class InformacionDTO {
    
    private List<HamburguesaDTO> Hamburguesas;
    private float subtotalPedido;
    private float ivaPedido;
    private float totalPedido;

    public List<HamburguesaDTO> getHamburguesas() {
        return Hamburguesas;
    }

    public void setHamburguesas(List<HamburguesaDTO> Hamburguesas) {
        this.Hamburguesas = Hamburguesas;
    }

    public float getSubtotalPedido() {
        return subtotalPedido;
    }

    public void setSubtotalPedido(float subtotalPedido) {
        this.subtotalPedido = subtotalPedido;
    }

    public float getIvaPedido() {
        return ivaPedido;
    }

    public void setIvaPedido(float ivaPedido) {
        this.ivaPedido = ivaPedido;
    }

    public float getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(float totalPedido) {
        this.totalPedido = totalPedido;
    }
    
    
}
