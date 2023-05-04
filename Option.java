package hotel;

public class Option {
    private String nom;   // nom de l'option
    private double prix;  // prix de l'option en euros

    // constructeur
    public Option(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    // methodes d'accès en lecture et écriture des variables d'instance
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }

    // méthode pour afficher les informations de l'option
    public void afficher(){
        System.out.println("Nom de l'option: " + nom);
        System.out.println("Prix de l'option: " + prix + " euros");
    }
}