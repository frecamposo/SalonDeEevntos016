
package Controlador;

import Modelo.Evento;
import java.util.ArrayList;


public class RegistroEventos {
    private static ArrayList<Evento> lista_eventos;

    public RegistroEventos() {
        if (lista_eventos==null) {
            lista_eventos=new ArrayList<>();
        }
    }
    
    public boolean agregarEvento(Evento ev){
        if (existeEvento(ev.getNumero())==false) {
            lista_eventos.add(ev);
            return true;
        }
        return false;
    }
    private boolean existeEvento(int numero) {
        for (Evento item : lista_eventos) {
            if (item.getNumero()==numero) {
                return true;
            }
        }
        return false;        
    }
    public ArrayList<Evento> listarEventos(){
        return lista_eventos;
    }
    public boolean eliminarEvento(int numero){
        for (Evento item : lista_eventos) {
            if (item.getNumero()==numero) {
                lista_eventos.remove(item);
                return true;
            }
        }
        return false;
    }
    
    
}
