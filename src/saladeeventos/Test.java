
package saladeeventos;

import Controlador.RegistroEventos;
import Modelo.Ceremonia;
import Modelo.EnumTipoCeremonia;
import Modelo.EnumTipoFiesta;
import Modelo.Fiesta;
import Modelo.Salon;
import java.util.Scanner;


public class Test {
    public static RegistroEventos reg_eventos;
    public static Scanner teclado=new Scanner(System.in);
    
    public static void main(String[] args) {
        reg_eventos=new RegistroEventos();        
        boolean ciclo=true;
        while (ciclo) {            
            System.out.println("Menu Principal");
            System.out.println("1) Agregar evento");
            System.out.println("2) Listar eventos");
            System.out.println("3) Eliminar evento");
            System.out.println("4) Salir");
            try {
                System.out.println("Seleccione: (1-4):");
                int opcion=teclado.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Agregar");
                        agregarEvento();
                        break;
                    case 2:
                        System.out.println("Listar");
                        break;
                    case 3:
                        System.out.println("Eliminar");
                        break;
                    case 4:
                        ciclo=false;
                        break;
                    default:
                        System.out.println("ingreso mal el numero");
                }
            } catch (Exception e) {
                System.out.println("no ingreso un numero");
                System.out.println(e.getMessage());
            }
        }
        
    }

    private static void agregarEvento() {
        System.out.println("Indique el tipo de evento");
        System.out.println("1) ceremonia");
        System.out.println("2) fiesta");
        System.out.println("3) salir");
        try {            
            String opcion=input("seleccione una opcion:");
            switch (opcion) {
                case "1":
                    agregarCeremonia();
                    break;
                case "2":
                    agregarFiesta();                    
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static String input(String texto){
        System.out.println(texto);
        try {
            String op=teclado.next();
            return op;
        } catch (Exception e) {
            return null;
        }
    }

    private static void agregarCeremonia() {
        System.out.println("indique el tipo de ceremonia:");
        System.out.println("1) Gala, 2) Premiacion, 3) Corporativa");
        int op = Integer.parseInt(input("seleccione (1-3)"));
        EnumTipoCeremonia tipoCeremonia;
        switch (op) {
            case 1:
                tipoCeremonia=EnumTipoCeremonia.Gala;
                break;
            case 2:
                tipoCeremonia=EnumTipoCeremonia.Premiacion;
                break;
            case 3:
                tipoCeremonia=EnumTipoCeremonia.Corporativa;
            default:
                System.out.println("por defecto dejo Gala");
                tipoCeremonia=EnumTipoCeremonia.Gala;
        }
        int num_ceremonia=Integer.parseInt(input("Ingrese Numero Ceremonia:"));
        String nom_ceremonia= input("Ingrese nombre de ceremonia:");
        int valor_x_persona=Integer.parseInt(input("Ingrese Valor por persona:"));
        int num_personas= Integer.parseInt(input("ingrese numero de personas"));
        String nombre_salon=input("indique el nombre del salon:");
        int capacidad_salon=Integer.parseInt(input("indique capacidad del salon:"));
        
        Ceremonia c=new Ceremonia(tipoCeremonia, 
                num_ceremonia, 
                nom_ceremonia, 
                valor_x_persona, 
                num_personas, 
                new Salon(nombre_salon, capacidad_salon)
        );
        
        boolean resp = reg_eventos.agregarEvento(c);
        
        if (resp) {
            System.out.println("Agrego Ceremonia");
        } else {
            System.out.println("No Agrego Ceremonia");
        }
    }

    private static void agregarFiesta() {
        System.out.println("indique el tipo de Fiesta:");
        System.out.println("1) Cumpleaños, 2) Despedidas, 3) BabyShower");
        int op = Integer.parseInt(input("seleccione (1-3)"));
        EnumTipoFiesta tipoFiesta;
        switch (op) {
            case 1:
                tipoFiesta=EnumTipoFiesta.Cumpleaños;
                break;
            case 2:
                tipoFiesta=EnumTipoFiesta.Despedidas;
                break;
            case 3:
                tipoFiesta=EnumTipoFiesta.BabyShower;
            default:
                System.out.println("por defecto dejo Cumpleaños");
                tipoFiesta=EnumTipoFiesta.Cumpleaños;
        }
        int num_fiesta=Integer.parseInt(input("Ingrese Numero fiesta:"));
        String nom_fiesta= input("Ingrese nombre de fiesta:");
        int valor_x_persona=Integer.parseInt(input("Ingrese Valor por persona:"));
        int num_personas= Integer.parseInt(input("ingrese numero de personas"));
        String nombre_salon=input("indique el nombre del salon:");
        int capacidad_salon=Integer.parseInt(input("indique capacidad del salon:"));
        
        Fiesta f=new Fiesta(tipoFiesta, 
                num_fiesta, 
                nom_fiesta, 
                valor_x_persona, 
                num_personas, 
                new Salon(nombre_salon, capacidad_salon)
        );
        
        boolean resp = reg_eventos.agregarEvento(f);
        
        if (resp) {
            System.out.println("Agrego Fiesta");
        } else {
            System.out.println("No Agrego Fiesta");
        }
    }
    
}
