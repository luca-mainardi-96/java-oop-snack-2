package Esercizio5;

public class MissioneSpaziale {

    private String nomeMissione;
    private final int idMissione;
    private static int numMissioni = 0;

    public MissioneSpaziale(String nomeMissione){
        this.nomeMissione = nomeMissione;
        numMissioni++;
        this.idMissione = numMissioni;
    }

    public String stampaDettagli(){
        return "ID: " + idMissione + "\nNome: " + nomeMissione;
    }

    public static String getNumMissioni(){
        return "Numero di missioni: " + numMissioni;
    }

}
