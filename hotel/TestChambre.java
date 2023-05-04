package hotel;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class TestChambre {
    public static void main(String[] args) {
        // creation d'une chambre simple
        Chambre v1 = new ChambreSimple("Adonis Cassen", 50, false, 78, 2, 4);
        System.out.println("-------------------- Chambre Simple ----------------------");
        v1.afficher();

        // creation d'une chambre double
        Chambre v2 = new ChambreDouble("Olyda", 80, true, 89, "biere", 60);
        System.out.println("--------------------- Chambre Double-------------------------");
        v2.afficher();

        // creation d'une personne
        Personne p = new Personne("Dupont", "Lilas Guipavas", "30");
        System.out.println("------------------------Création personne ----------------------");
        p.afficher();

        // affectation de la personne sur la chambre simple
        v1.setProprietaire(p);
        System.out.println("---------------- Chambre simple avec proprio--------------------");
        v1.afficher();

        // ajout des options sur la chambre simple
        List<Option> options = new ArrayList<Option>();
        options.add(new Option("climatisation", 1000));
        options.add(new Option("rideau electrique", 500));
        options.add(new Option("Cuisine", 2000));
        v1.ajouterListeOptions(options);

        System.out.println("----------------- Chambre Simple FULL CONFIG -------------------");
        v1.afficher();
    }
}
