package cliente.vista;

import cliente.utilidades.UtilidadesConsola;
import java.rmi.RemoteException;
import servidor.DTO.UsuarioDTO;
import servidor.DTO.HamburguesaDTO;
import servidor.controladores.ControladorGestorUsuariosInt;

public class Menu {
    
    private final ControladorGestorUsuariosInt objRemoto;
    
    public Menu(ControladorGestorUsuariosInt objRemoto)
    {
        this.objRemoto=objRemoto;
    }
    
    public void ejecutarMenuPrincipal()
    {
        int opcion = 0;
        do
        {
            /*System.out.println("==Menu==");
            System.out.println("1. Registrar Usuario");			
            System.out.println("2. Consultar Cantidad de Usuarios");
            System.out.println("3. Consultar usuario");
            System.out.println("4. Salir");*/
            
            System.out.println("==Menu compra hamburguesa==");
            System.out.println("1. Comprar Hamburguesa");			
            System.out.println("2. Consultar hamburguesas vendidas");
            System.out.println("3. Salir");

            opcion = UtilidadesConsola.leerEntero();

            switch(opcion)
            {
                case 1:
                        Opcion1();
                        break;
                case 2:
                        Opcion2();
                        break;	
                case 3:
                        Opcion3();
                        break;
                case 4:
                        System.out.println("Salir...");
                        break;
                default:
                        System.out.println("Opción incorrecta");
            }

        }while(opcion != 4);
    }

    private void Opcion1() 
    {
        //try
        //{
               /*System.out.println("==Registro del Cliente==");
                System.out.println("Ingrese la identificacion");
                int id = UtilidadesConsola.leerEntero();
                System.out.println("Ingrese el nombre completo ");
                String nombres = UtilidadesConsola.leerCadena();
                System.out.println("Ingrese los apellidos ");
                String apellidos = UtilidadesConsola.leerCadena();
                UsuarioDTO objUsuario= new UsuarioDTO(id, nombres, apellidos);

                boolean valor = objRemoto.registrarUsuario(objUsuario);//invocación del método remoto
                if(valor)
                        System.out.println("Registro realizado satisfactoriamente...");
                else
                        System.out.println("no se pudo realizar el registro...");*/
            
            
                int opcionSizeHamburguesa = 0;
                String tamanioHamburguesa = "";
                    
                    //Tamaño hamburguesa
                
                    System.out.println("== Por favor selecciona un tamaño de hamburguesa ==");
                    System.out.println(" 1 -- pequeña");
                    System.out.println(" 2 -- mediana");
                    System.out.println(" 3 -- grande");
                    
                    opcionSizeHamburguesa = UtilidadesConsola.leerEntero();
                    
                    switch(opcionSizeHamburguesa)
                        {
                        case 1:
                             tamanioHamburguesa = "pequeña";
                             break;
                        case 2:
                             tamanioHamburguesa = "mediana";
                             break;
                        case 3:
                             tamanioHamburguesa = "grande";
                             break;
                        default:
                            System.out.println("Opción incorrecta");
                            break;
                    }
                    
                    //Ingredientes extra
                    
                    int TieneIngredientesExtraOption;  // ( 0 -- no ) ( 1 --si ) 
                    String TieneIngredientesExtra = "";
                    
                    System.out.println("== Deseas añadir algun ingrediente extra ==");
                    System.out.println("== Por favor selecciona una opcion ==");
                    System.out.println("== 1 -- Si ==");
                    System.out.println("== 2 -- No ==");
                    
                    TieneIngredientesExtraOption = UtilidadesConsola.leerEntero();
                    
                    switch(TieneIngredientesExtraOption)
                        {
                        case 1:
                             TieneIngredientesExtra = "si";
                             break;
                        case 2:
                             TieneIngredientesExtra = "no";
                             break;
                        default:
                            System.out.println("Opción incorrecta");
                            break;
                        }
                    
                    //si desea agregar ingredientes extra se los pedimos
                    //en un string separado por comas
                    String ingredientesExtra = ""; 
                    if(TieneIngredientesExtra == "si"){
                        System.out.println("== Por favor ingrese los ingredientes extra separados por comas ==");
                        
                        ingredientesExtra = UtilidadesConsola.leerCadena();
                    }
                    
                    int NumeroDeIngredientesExtra = 0;
                    String[] partes = ingredientesExtra.split(",");
                    for (int i = 1; i < partes.length; i++) {
                        NumeroDeIngredientesExtra ++;
                    }
                    
                    //para prueba
                    System.out.println("numero de ingredientes extra");
                    System.out.println(NumeroDeIngredientesExtra+1);
                    
                    
                    String nombrePersonalizadoHamburguesa;
                    
                    System.out.println("==Digite el nombre personalizado para su hamburguesa==");
                    
                    nombrePersonalizadoHamburguesa = UtilidadesConsola.leerCadena();
                    
                    
                    //calculamos el costo de la hamburguesa
                    
                    //pequeña $8.000
                    //mediana $10.000
                    //grande $15.000
                    //valor de ingrediente extra $1.000
                    float valorHamburguesa = 0;
                    
                    if(tamanioHamburguesa == "pequeña"){
                        valorHamburguesa += 8000;
                    }else if(tamanioHamburguesa == "mediana"){
                        valorHamburguesa += 10000;
                    }else if(tamanioHamburguesa == "grande"){
                        valorHamburguesa += 15000;
                    }
                    
                    //sumamos el valor de los ingredientes extra 
                    valorHamburguesa += NumeroDeIngredientesExtra * 1000;
                    
                    HamburguesaDTO objHamburguesaDTO = new HamburguesaDTO(nombrePersonalizadoHamburguesa,tamanioHamburguesa,NumeroDeIngredientesExtra,valorHamburguesa); 
                    
                    boolean valor = objRemoto.registrarUsuario(objUsuario); //invocación del método remoto
                    if(valor)
                            System.out.println("Registro realizado satisfactoriamente...");
                    else
                            System.out.println("no se pudo realizar el registro...");
            
                    
        //}
        //catch(RemoteException e)
        //{
        //        System.out.println("La operacion no se pudo completar, intente nuevamente...");
        //}
    }



    private void Opcion2()
    {	
            try
            {
                    System.out.println("==Numero de usuarios==");
                    int tamanio  = objRemoto.consultarCantidadUsuarios();
                    System.out.println("El numero de usuarios registrados es de: "+ tamanio);
            }
            catch(RemoteException e)
            {
                    System.out.println("La operación no se pudo completar, intente nuevamente...");
                    System.out.println("Excepcion generada: " + e.getMessage());
            }	
    }

    private void Opcion3() 
    {
        try
        {
            System.out.println("==Consulta de un Cliente==");
            System.out.println("Ingrese la identificacion");
            int id = UtilidadesConsola.leerEntero();			

            UsuarioDTO objUsuario= objRemoto.consultarUsuario(id);
            if(objUsuario!=null)
            {
                    System.out.println("Nombres: " + objUsuario.getNombres());
                    System.out.println("Apellidos: " + objUsuario.getApellidos());
            }
            else
                    System.out.println("Usuario no encontrado");
        }
        catch(RemoteException e)
        {
                System.out.println("La operacion no se pudo completar, intente nuevamente...");
        }
    }
}
