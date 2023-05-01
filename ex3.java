import java.util.*;
import java.lang.*;
import java.io.*;

public class CountNames {
    public static int[] countOccurrences(String[] names) {
        Map<String, Integer> nameMap = new HashMap<>();
        for (String name : names) {
            // retirer les accents et majuscules
            String normalized = Normalizer.normalize(name.toLowerCase(), Normalizer.Form.NFD)
                    .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");

            // check si prénom est déjà dans la map, sinon l'ajouter avec une valeur de 1 et si le prénom existe déjà, incrémenter sa valeur de 1
            nameMap.put(normalized, nameMap.getOrDefault(normalized, 0) + 1);
        }

        // convertir la map en tableau de valeurs
        int[] occurrences = new int[nameMap.size()];
        int i = 0;
        for (int count : nameMap.values()) {
            occurrences[i++] = count;
        }
        return occurrences;
    }

    public static void main(String[] args) {
        String[] names = {"Alexis", "BREwen", "Théo", "Theo", "Lucas", "Yann", "yaNn", "Osman", "osmaN"};
        int[] occurrences = countOccurrences(names);
        System.out.println(Arrays.toString(occurrences)); // [1, 1, 2, 1, 2, 2]
    }
}