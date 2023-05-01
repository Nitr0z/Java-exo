import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static String getLastMatchingName(String[] names, int numChars) {
        // check le tableau de noms à partir de la fin pour trouver le dernier nom qui correspond au nombre de caractères donné
        for (int i = names.length - 1; i >= 0; i--) {
            // check si le nombre de caractères du nom est égal à celui donné en entrée
            if (names[i].length() == numChars) {
                return names[i]; // on renvoie le nom
            }
        }
        return null; // si aucun nom ne correspond, on renvoie null
    }

    public static void main(String[] args) {
        String[] names = {"Alexis", "BREwen", "Théo", "Theo", "Lucas", "Yann", "yaNn", "Osman", "osmaN"};
        int numChars = 4;
        String lastMatchingName = getLastMatchingName(names, numChars);
        System.out.println(lastMatchingName); // yaNn
    }
}