package Esercizio4;

public class Main {
    public static void main(String[] args) {
        
        Figura f1 = new Cerchio(125);
        Figura f2 = new Rettangolo(100, 75);

        System.out.println(f1.calcolaArea());
        System.out.println(f2.calcolaArea());

    }
}