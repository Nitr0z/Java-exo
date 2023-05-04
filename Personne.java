package hotel;

public class Personne {

    private String nom;
    private String adresse;
    private String telephone;

    // Le constructeur a
    public Personne(String nom, String adresse, String telephone) {
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    // La méthode qui affiche les propriétés de la personne.
    public void afficher(){
        System.out.println("nom : " + nom);
        System.out.println("adresse : " + adresse);
        System.out.println("telephone : " + telephone);
    }
}