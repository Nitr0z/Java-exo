package hotel;

public class ChambreDouble extends Chambre {
    private String bar; 
    private int capaciteBaignoire; 

    // constructeur
    public ChambreDouble(String nom, int taille, boolean wifi, double note, String bar, int capaciteBaignoire) {
        super(nom, taille, wifi, note);  // appel au constructeur de la classe mère pour initialiser les variables communes à toutes les chambres
        this.bar = bar;
        this.capaciteBaignoire = capaciteBaignoire;
    }

    // getters et setters pour les variables de la classe
    public String getbar() {
        return bar;
    }

    public void setbar(String bar) {
        this.bar = bar;
    }

    public int getCapaciteBaignoire() {
        return capaciteBaignoire;
    }

    public void setCapaciteBaignoire(int capaciteBaignoire) {
        this.capaciteBaignoire = capaciteBaignoire;
    }

    // méthode pour afficher les caractéristiques de la chambre double
    public void afficher(){
        super.afficher();  // appel à la méthode afficher() de la classe mère pour afficher les caractéristiques communes à toutes les chambres
        System.out.println("bar : " + bar);  // affichage de la présence ou non d'un bar dans la chambre
        System.out.println("capacite baignoire : " + capaciteBaignoire + "L");  // affichage de la capacité de la baignoire dans la chambre
    }
}