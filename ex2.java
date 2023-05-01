// exo : https://www.codechef.com/problems/ONP?tab=statement

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception { 
    Scanner input = new Scanner(System.in) ;
    
    // on demande le nombre de tests à faire
    int t = input.nextInt() ;
    
    while (t-- > 0){
        // saisir une chaîne de caractères x
        String x = input.next() ;
        // on crée une chaîne de caractères "str" pour stocker la chaîne après l'extraction des opérateurs
        String str = "";
        // on stocke les opérateurs dans un stack
        Stack <Character> stack = new Stack<>() ;

        // on utilise une boucle for pour parcourir chaque caractère de x
        for(int i=0; i<x.length(); i++){
            
            // on stocke chaque caractere de la chaîne x dans la variable c
            Character c = x.charAt(i) ;
            
            // si le caractère est * ou + ou ^ ou - ou / on l'ajoute à notre stack
            if(c=='*' || c=='+' || c=='^' || c=='-' || c=='/'){
                stack.push(c) ;
            // si c'est une parenthèse ouvrante, on passe au suivant
            }else if(c=='('){
                continue;
            // si c'est une parenthèse fermante, le dernier opérateur ajouté au stack est retiré et ajouté à la chaîne str
            }else if(c==')'){
                str+= stack.pop();
            // si le caractere n'est pas un opérateur ni une parenthèse, on l'ajoute simplement à str
            }else{
                str+=c ;
            }
        }
        System.out.println(str);
        }
    }
}