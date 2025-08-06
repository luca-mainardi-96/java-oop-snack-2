package Esercizio1;

public class Veicolo {

    private int anno;
    private String marca;

    public Veicolo(){
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        if(anno <= 0){
            System.out.println("Inserisci una data valida.");
        }else{
            this.anno = anno;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String stampaInfo(){
        return "Marca: " + marca + "\nAnno: " + anno;
    }

}
