package Esercizio1;

public class Auto extends Veicolo {

    private int numPorte;

    public Auto(){
    }

    public int getNumPorte() {
        return numPorte;
    }

    public void setNumPorte(int numPorte) {
        if(numPorte <= 0){
            System.out.println("Inserisci un valore valido.");
         }else{
            this.numPorte=numPorte;
         }
    }

    @Override
    public String stampaInfo(){
        return super.stampaInfo() + "\nNumero di porte: " + numPorte;
    }

}
