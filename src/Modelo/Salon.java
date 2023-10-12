
package Modelo;


public class Salon {
    private String nombre;
    private int capacidad;

    public Salon() {
    }

    public Salon(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Salon{" + "nombre=" + nombre + ", capacidad=" + capacidad + '}';
    }
    
    
}
