package hotel;

// La classe ChambreSimple hérite de la classe abstraite Chambre
public class ChambreSimple extends Chambre
{
    private int lit;
    private int fenetre;

    // Le constructeur 
    public ChambreSimple(String nom, int taille, boolean wifi, double note, int lit, int fenetre) {
        // L'appel au constructeur de la classe mère (Chambre) initialise ses attributs
        super(nom, taille, wifi, note);
        // Initialisation des attributs spécifiques à la chambre simple
        this.lit = lit;
        this.fenetre = fenetre;
    }

    public int getlit() {
        return lit;
    }

    public void setlit(int lit) {
        this.lit = lit;
    }

    public int getfenetre() {
        return fenetre;
    }

    public void setfenetre(int fenetre) {
        this.fenetre = fenetre;
    }

    // La méthode afficher permet d'afficher les détails de la chambre simple
    public void afficher(){
        // Appel de la méthode afficher de la classe mère (Chambre) pour afficher les attributs communs
        super.afficher();
        // Affichage des attributs spécifiques à la chambre simple
        System.out.println("lit : " + lit );
        System.out.println("fenetre : " + fenetre);
    }
}