package Esercizio5;

public class Main {
    public static void main(String[] args) {
        
        MissioneScientifica m1 = new MissioneScientifica("ExoMars", "Ricerca di vita su Marte");
        MissioneScientifica m2 = new MissioneScientifica("Hubble Repair", "Manutenzione telescopio spaziale");
        MissioneScientifica m3 = new MissioneScientifica("Artemis Bio", "Studio effetti della microgravità sul DNA");
        MissioneScientifica m4 = new MissioneScientifica("Voyager 3", "Analisi radiazioni cosmiche");

        MissioneCommerciale m5 = new MissioneCommerciale("Starlink Deployment", "SpaceX");
        MissioneCommerciale m6 = new MissioneCommerciale("Blue Origin Cargo", "Blue Origin");
        MissioneCommerciale m7 = new MissioneCommerciale("Orbital Tourism 1", "Virgin Galactic");
        MissioneCommerciale m8 = new MissioneCommerciale("Lunar Mining", "Planetary Resources");

        System.out.println(m1.stampaDettagli());
        System.out.println(m2.stampaDettagli());
        System.out.println(m3.stampaDettagli());
        System.out.println(m4.stampaDettagli());
        System.out.println(m5.stampaDettagli());
        System.out.println(m6.stampaDettagli());
        System.out.println(m7.stampaDettagli());
        System.out.println(m8.stampaDettagli());
        
        System.out.println(MissioneSpaziale.getNumMissioni());



    }
}
