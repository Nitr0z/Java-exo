package hotel;
import java.util.List;
import java.util.ArrayList;

public abstract class Chambre
{
    private String nom;             // nom de la chambre
    private int taille;             // taille de la chambre en mètres carrés
    private boolean wifi;           // présence ou absence de wifi dans la chambre
    private double note;            // note de la chambre (sur 100)
    private Personne proprietaire;  // propriétaire de la chambre (un objet de la classe Personne)
    private List<Option> options;   // liste des options de la chambre (une liste d'objets de la classe Option)

    // le constructeur
    public Chambre(String nom, int taille, boolean wifi, double note) {
        this.nom = nom;
        this.taille = taille;
        this.wifi = wifi;
        this.note = note;
        this.proprietaire = new Personne("","", "");  // le propriétaire est initialisé avec des valeurs vides
        this.options = new ArrayList<Option>();       // la liste des options est initialisée avec une liste vide
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void Wifi(){
        if(wifi == false){
            wifi = true;
        }
    }

    public boolean getWifi(){
        return wifi;
    }

    public void Note(float valeur){
        if(wifi == true){
            note = note + valeur;
        }
    }

    public double getNote(){
        return note;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getTaille() {
        return taille;
    }

    public void setProprietaire(Personne proprietaire){
        this.proprietaire = proprietaire;
    }

    public void ajouterOption(Option option){
        this.options.add(option);
    }

    public void ajouterListeOptions(List<Option> option){
        this.options.addAll(option);
    }

    // la méthode afficher permet d'afficher les informations de la chambre
    public void afficher(){
        System.out.println("nom : " + nom);
        System.out.println("Taille : " + taille + "m²");
        System.out.println("Wifi : " + wifi);
        System.out.println("Note : " + note + "/100");
        System.out.println("--------Proprio-------");
        proprietaire.afficher();
        System.out.println("--------Options-------");
        for(Option option : options){
            option.afficher();
        }
    }
}


