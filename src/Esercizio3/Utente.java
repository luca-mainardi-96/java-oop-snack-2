package Esercizio3;

public class Utente {
    private String nome;
    private static int numeroUtenti;

    public Utente(String nome){
        numeroUtenti++;
    }

    public static int getNumeroUtenti(){
        return numeroUtenti;
    }

}
