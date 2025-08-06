package Esercizio2;

public class ContoBancario {

    private int numeroConto;
    private double saldo;

    public ContoBancario(int numeroConto){
        if(numeroConto<=0){
            System.out.println("Numero di conto non valido.");
        }else{
            this.numeroConto = numeroConto;
        }
    }

    public double deposita(double importo){
        if(importo < 0){
            System.out.println("Impossibile depositare importi negativi.");
            return saldo;
        }else{
            saldo = saldo + importo;
            return saldo;
        }
    }

    public double preleva(double importo){
        if(importo<0){
            System.out.println("Impossibile prelevare importi negativi.");
            return saldo;
        }else if(saldo-importo<0){
            System.out.println("Disponibilità insufficiente.");
            return saldo;
        }else{
            saldo = saldo - importo;
            return saldo;
        }
    }

    public double getSaldo(){
        return saldo;
    }



}
