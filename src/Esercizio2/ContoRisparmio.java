package Esercizio2;

public class ContoRisparmio extends ContoBancario {

    private double tassoInteresse;

    public ContoRisparmio(int numeroConto, double tassoInteresse){
        super(numeroConto);
        this.tassoInteresse = tassoInteresse;
    }

    public double applicaInteressi(){
        double interessi = getSaldo()*tassoInteresse/100;
        deposita(interessi);
        return getSaldo();
    }
}
