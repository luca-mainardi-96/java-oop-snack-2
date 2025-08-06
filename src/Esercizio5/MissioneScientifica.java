package Esercizio5;

public class MissioneScientifica extends MissioneSpaziale {

    private String obiettivo;

    public MissioneScientifica(String nomeMissione, String obiettivo){
        super(nomeMissione);
        this.obiettivo = obiettivo;
    }

    @Override
    public String stampaDettagli(){
        return super.stampaDettagli() + "\nObiettivo: " + obiettivo;
    }
}
