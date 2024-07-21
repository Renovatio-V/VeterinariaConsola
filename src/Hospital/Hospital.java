
package Hospital;

import Factura.DetalleFactura;
import Factura.Factura;
import Factura.Producto;
import Historial.DetalleClinico;
import Historial.HistorialClinico;
import consulta.Cliente;
import consulta.Consulta;
import consulta.Mascota;
import consulta.Veterinario;
import java.util.ArrayList;
import java.util.Scanner;


public class Hospital {
    static long cedula;
    static String nombre;
    static String apellido;
    static int edad;
    static String especialidad;
    static double sueldo;
    
    static int indice;
    static Cliente cliente;
    static Mascota mascota;
    static Veterinario veterinario;
    static Consulta consulta; 
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Mascota> mascotas = new ArrayList<>();
        
        ArrayList<Veterinario> veterinarios = new ArrayList<>();
        ArrayList<Consulta> consultas = new ArrayList<>();
        
        ArrayList<DetalleClinico> detallesClinicos = new ArrayList<>();
        ArrayList<HistorialClinico> historialClinico = new ArrayList<>();
        
        int opcion;
        
        do {  //Instrucciones!     
            System.out.println("------Menu------");
            System.out.println("1. Crear historial Clinica");
            System.out.println("2. Consultar clientes");
            System.out.println("3. Listar todos los clientes");
            System.out.println("4. Mostrar datos estaticos de una factura");
            System.out.println("5. Salir");
            opcion = Integer.parseInt(sc.nextLine());
            
            switch (opcion) {
                case 1://Crear historial Clinica
                    System.out.println("\nHistoria Clinica de la Mascota");
                    System.out.print("Numero de cedula de propietario: ");
                    cedula = Long.parseLong(sc.nextLine());
                    System.out.print("Nombre del Propietario: ");
                    nombre = sc.nextLine();
                    System.out.print("Apellido Propietario: ");
                    apellido = sc.nextLine();
                    System.out.print("Edad: ");
                    edad = Integer.parseInt(sc.nextLine());
                    clientes.add(new Cliente(cedula, nombre, apellido, edad));  //Añadir al arraylist
                    
//                    System.out.println("\n/Nuevo Propietario Añadido (+)"); //Confirmar 
//                    System.out.println(clientes.get(clientes.size()-1).toString());;
                    
                    //Datos Mascota
                    System.out.print("Digite el ID de la mascota: ");
                    long idMascota = Long.parseLong(sc.nextLine());
                    System.out.print("Especie: ");
                    String especie = sc.nextLine();
                    System.out.print("Raza: ");
                    String raza = sc.nextLine();
                    System.out.print("Nombre de la Mascota: ");
                    String nombreMascota = sc.nextLine();
                    mascotas.add(new Mascota(idMascota, especie, raza, nombreMascota));
                    
//                    System.out.println("\n/Nueva Mascota Añadida (+)"); //Confirmar 
//                    System.out.println(mascotas.get(mascotas.size()-1).toString());;
                    clientes.get(clientes.size()-1).addMascotas(mascotas.get(mascotas.size()-1));
                    
                    System.out.println("/Datos Ingresados Corretamente!");
                    System.out.println(clientes.get(clientes.size()-1).toString());
                    
                    break;
                case 2://Consultar clientes
                    System.out.println("-----Listar clientes-----");
                    if (clientes.isEmpty()) {
                        System.out.println("No tenemos clientes a listar");
                        break;                        
                    }                    
                    System.out.println("Ingrese el indice del cliente (0 a " + (clientes.size() - 1) + ")");
                    indice = Integer.parseInt(sc.nextLine());                    
                    if (indice < 0 || indice >= clientes.size()) {
                        System.out.println("Indice Invalido");
                        break;
                    }
                    cliente = clientes.get(indice);
                    System.out.println(cliente.toString());                    
                    
                    break;
                case 3: //Listar todos los clientes
                    System.out.println("------------------Listar Todos los Clientes------------------");
                    indice = 0;
                    for (Cliente cliente : clientes) {
                        System.out.println("Cliente número: " + indice + "\n" + cliente);
                        indice++;
                    }
                    
                    break;
                case 4://Detalle Factura
                    Cliente cliente1 = new Cliente(108833114, "Gardfield", "Torres", 27);
                    Mascota perro1 = new Mascota(103554, "Canino", "Doberman", "Patas");
                    cliente1.addMascotas(perro1);
                    
                    Veterinario veterinario = new Veterinario("Dermatologo", 50000, 1085544, "Jaime", "Rios", 29);
                    Consulta consulta = new Consulta(40, "El perro presenta un zarpullido bajo la oreja izquierda");
                    consulta.relacionConObjetos(perro1, veterinario);
                    
                    //Detalle Clinico
                    DetalleClinico detalleC1 = new DetalleClinico(consulta);
                    HistorialClinico historial1 = new HistorialClinico(detalleC1);
                    
                    //Productos 
                    Producto product1 = new Producto("Champu dermatologico", 73000);
                    Producto product2 = new Producto("Suplemento nutricional", 82100);
                    
                    //Cantidad productos, en Detalles de Factura >>
                    DetalleFactura detalle1 = new DetalleFactura(product1, 2);
                    DetalleFactura detalle2 = new DetalleFactura(product2, 2);
                    
                    //Creamos las Facturas
                    Factura factura1 = new Factura(1, consulta);
                    factura1.addDetalleFactura(detalle1);
                    factura1.addDetalleFactura(detalle2);
                    
                    System.out.println("--------------Informacion de Pago--------------");
                    System.out.println(factura1);
                    System.out.println("Salario del Veterinario: ");
                    veterinario.calcularSueldo();
                    
                    
                    
                    
                    break;
                case 5:
                    System.out.println("\nTerminando Programa ...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digitó una opcion Invalida!");
            }
            
            
        } while (opcion != 5);
        
        
        
    }
    
    
    
}
