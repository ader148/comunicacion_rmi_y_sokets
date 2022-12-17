package co.edu.unicauca.modelo;

import co.edu.unicauca.servicios.InformacionComputador;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class GestorDeHilo extends Thread{
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
                
                //esto es lo que recibi desde el servidor central
                //se espera que reciba la factura como tal 
                System.out.println("estos es lo que recibio del servidor de facturas");
                System.out.println(message);
                
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
