package Esercizio2;

public class App {
    public static void main(String[] args) {
        ContoBancario c1 = new ContoBancario(1);
        c1.deposita(1500);
        c1.preleva(1200);

        ContoRisparmio c2 = new ContoRisparmio(2, 2);
        c2.deposita(11500);
        c2.preleva(1000);
        c2.applicaInteressi();

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
    }
}


// L'incapsulamento serve per limitare l'accesso alle variabili di Contobancario e ContoRisparmio, altrimenti sarebbero state facilmente modificabili,
// ad esempio riassegnandole. In questo caso anche un setter sarebbe stato sbagliato perché permette di inserire valori sbagliati.
// con un metodo pubblico che permette di modificare i valori di saldo si possono modificare i valori di saldo preservando
// lo stato interno delle istanze che sono state create, creando due metodi che funzionano come due setter custom, ma che permettono solo
//due  operazioni definite e controllate.
