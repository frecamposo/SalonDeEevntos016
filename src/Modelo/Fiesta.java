
package Modelo;


public class Fiesta extends Evento{
    private EnumTipoFiesta tipoFiesta;

    public Fiesta() {
    }

    public Fiesta(EnumTipoFiesta tipoFiesta, int numero, String nombre, int valorPorPersona, int numeroPersonas, Salon salon) {
        super(numero, nombre, valorPorPersona, numeroPersonas, salon);
        this.tipoFiesta = tipoFiesta;
    }

    public EnumTipoFiesta getTipoFiesta() {
        return tipoFiesta;
    }

    public void setTipoFiesta(EnumTipoFiesta tipoFiesta) {
        this.tipoFiesta = tipoFiesta;
    }

    @Override
    public String toString() {
        return super.toString()+ " Fiesta{" + "tipoFiesta=" + tipoFiesta + '}';
    }

    @Override
    public int calcularValorTotal() {
        int impuesto=0;
        switch (getTipoFiesta()) {
            case BabyShower:
                impuesto=35000;
                break;
            case Cumpleaños:
                impuesto=50000;
                break;
            default:
                impuesto=40000;
        }
        int t= (getNumeroPersonas()
                *getValorPorPersona())+impuesto;
        return t;
    }
    
}
