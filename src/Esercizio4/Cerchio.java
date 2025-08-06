package Esercizio4;

public class Cerchio extends Figura {

    private double raggio;

    public Cerchio(double raggio){
        this.raggio = raggio;
    }
    
    @Override
    public double calcolaArea(){
        area = PI_GRECO*raggio*raggio;
        return area;
    }


}
