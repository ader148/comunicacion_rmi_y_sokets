package co.edu.unicauca.modelo;

import co.edu.unicauca.servicios.HamburguesaDTO;
import co.edu.unicauca.servicios.InformacionComputador;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import co.edu.unicauca.servicios.InformacionDTO;
import java.util.ArrayList;


public class GestorDeHilo extends Thread{
    
    private InformacionDTO messageObj;
    private Socket objSocketCliente;
       
    public GestorDeHilo(Socket objSocket){
        this.objSocketCliente = objSocket;
    }
    
    @Override
    public void run() {
        try {
            System.out.println("id del hilo generado:"+Thread.currentThread().getId());
            System.out.println("Atendiendo hilo de cliente");
            DataInputStream flujoEntrada;
            DataOutputStream flujoSalida;
            String message;            
            flujoEntrada=new DataInputStream(objSocketCliente.getInputStream());
            flujoSalida=new DataOutputStream(objSocketCliente.getOutputStream());
                message = flujoEntrada.readUTF();//se bloquea el servidor
                
                //convertimos el mensaje a un objeto
                messageObj = GestionJSON.JsonToObject(message);
                
                
                //esto es lo que recibi desde el servidor central
                //se espera que reciba la factura como tal 
                //System.out.println("estos es lo que recibio del servidor de facturas");
                //System.out.println(message);
                
                //ahora sacalos los datos y mostramos la factura 
                
                System.out.println("===== Listado de hamburguesas compradas =====");
                
                //recorrido del array list
                //tremos la lista de hamburguesas
                ArrayList<HamburguesaDTO> listaHamburguesas = (ArrayList<HamburguesaDTO>) messageObj.getHamburguesas();
                
                for (int i=0;i<listaHamburguesas.size();i++) {
                    
                    System.out.println("Hamburguesa no: " + i+1);
                    
                    HamburguesaDTO objHamburguesaDTOdeLista = listaHamburguesas.get(i);
                    System.out.println("Identificador: " + objHamburguesaDTOdeLista.getNombre());
                    System.out.println("Tipo: " + objHamburguesaDTOdeLista.getTipo());
                    System.out.println("Cantidad de ingredientes extra: " + objHamburguesaDTOdeLista.getCantidadIngredientesExtra());
                    System.out.println("Costo: " + objHamburguesaDTOdeLista.getCosto());
                    
                 }
                
                System.out.println("Subtotal: " + messageObj.getSubtotalPedido());
                System.out.println("Valor Iva: " + messageObj.getIvaPedido());
                System.out.println("Total del pedido: " + messageObj.getSubtotalPedido());
                
                
                System.out.println("===============================================");
                
                /*if(message.equals("caracteristicas")){
                    message = InformacionComputador.atenderPeticion();
                    flujoSalida.writeUTF(message);
                }*/
            
                //message = InformacionComputador.atenderPeticion();                  
                /*if(message.equals("caracteristicas")){
                         flujoSalida.writeUTF(message);
                }*/
                
                flujoSalida.writeUTF("se recibio la factura");
            
            objSocketCliente.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
