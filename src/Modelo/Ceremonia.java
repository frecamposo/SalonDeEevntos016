
package Modelo;


public class Ceremonia extends Evento{
    private EnumTipoCeremonia tipoCeremonia;

    public Ceremonia() {
    }

    public Ceremonia(EnumTipoCeremonia tipoCeremonia, int numero, String nombre, int valorPorPersona, int numeroPersonas, Salon salon) {
        super(numero, nombre, valorPorPersona, numeroPersonas, salon);
        this.tipoCeremonia = tipoCeremonia;
    }

    public EnumTipoCeremonia getTipoCeremonia() {
        return tipoCeremonia;
    }

    public void setTipoCeremonia(EnumTipoCeremonia tipoCeremonia) {
        this.tipoCeremonia = tipoCeremonia;
    }

    @Override
    public String toString() {
        return super.toString()+" Ceremonia{" + "tipoCeremonia=" + tipoCeremonia + '}';
    }

    @Override
    public int calcularValorTotal() {
        int impuesto= 0;
        switch (getTipoCeremonia()) {
            case Corporativa:
                impuesto=2000 * getNumeroPersonas();
                break;
            case Gala:
                impuesto=3000 * getNumeroPersonas();
                break;                
            default:
                impuesto=1500 * getNumeroPersonas();
                
        }
        int total= (getValorPorPersona() 
                * getNumeroPersonas())+impuesto;
        return total;
    }
    
    
}
