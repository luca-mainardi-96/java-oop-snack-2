package Esercizio1;
public class App {
    public static void main(String[] args) throws Exception {
        
        Auto a1 = new Auto();

        a1.setAnno(2018);
        a1.setMarca("Renault");
        a1.setNumPorte(5);

        System.out.println(a1.stampaInfo());


    }
}
