package co.edu.unicauca.presentacion;

import co.edu.unicauca.modelo.FabricaServidor;
import co.edu.unicauca.modelo.PlantillaServidor;
import java.util.Scanner;

public class VistaDelServidor {
   
    public static void main(String[] args) {
        try (Scanner objScanner = new Scanner(System.in)) {
            String tipo="";
            int puerto=0;
            FabricaServidor fabrica = new FabricaServidor();
            System.out.println("======== Seleccione el tipo de servidor ==========");  //concurrente
            //System.out.println("Digite el tipo de servidor que desea utilizar");
            //System.out.println("\nsecuencial \t concurrente");
            //tipo = objScanner.nextLine();
            tipo = "concurrente";
            //System.out.println("\nDigite el puerto de escucha: ");  //2021
            //puerto = objScanner.nextInt();
            puerto = 2021;
            PlantillaServidor objServidor = fabrica.obtenerTipoServidor(tipo);
            objServidor.inicializarServidor(puerto);
            objServidor.ejecutarServidor();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
