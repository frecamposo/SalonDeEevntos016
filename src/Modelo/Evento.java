
package Modelo;


public abstract class Evento {
    private int numero;//entre 1 y 1000
    private String nombre;// mayor a 5 caracteres
    private int valorPorPersona;// entre 5600 y 12000
    private int numeroPersonas;// entre 50 y 230
    private Salon salon;//colaboracion de clases

    public Evento() {
    }

    public Evento(int numero, String nombre, int valorPorPersona, int numeroPersonas, Salon salon) {
        setNumero(numero);
        setNombre(nombre);
        setValorPorPersona(valorPorPersona);
        setNumeroPersonas(numeroPersonas);
        this.salon = salon;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero>=1 && numero<=1000) {
            this.numero = numero;
        } else {
            throw new 
                IllegalArgumentException("numero entre 1 y 1000");
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length()>=5) {
            this.nombre = nombre;
        } else {
            throw new
                IllegalArgumentException("nombre > 5");
        }
        
    }

    public int getValorPorPersona() {
        return valorPorPersona;
    }

    public void setValorPorPersona(int valorPorPersona) {
        if (valorPorPersona>=5600 && valorPorPersona<=12000) {
            this.valorPorPersona = valorPorPersona;
        } else {
            throw new
                IllegalArgumentException("valor x pers entre 5600 y 12000");
        }
        
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        if (numeroPersonas>=50 && numeroPersonas<=230) {
            this.numeroPersonas = numeroPersonas;
        } else {
            throw new 
                IllegalArgumentException("numero de personas entre 50 y 230");
        }
        
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

    @Override
    public String toString() {
        return "Evento{" + "numero=" + numero + ", nombre=" + nombre + ", valorPorPersona=" + valorPorPersona + ", numeroPersonas=" + numeroPersonas + ", salon=" + salon + '}';
    }
    
    public abstract int calcularValorTotal();
}
