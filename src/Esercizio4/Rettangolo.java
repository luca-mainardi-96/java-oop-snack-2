package Esercizio4;

public class Rettangolo extends Figura {

    private double base;
    private double altezza;

    //public final Rettangolo(double base, double altezza)
    public Rettangolo(double base, double altezza){
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea(){
        area = base* altezza;
        return area;
    }

}
