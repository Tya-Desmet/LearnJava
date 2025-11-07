package FrenchVersion.Week1.NombreAleatoire;

import java.util.Scanner;

public class NombreAleatoire {


    public static int max = 100;
    public static int min = 1;


    public static void main(String[] args) {
        // le scanner qui va lire les données entrer par l'user
        Scanner sc = new Scanner(System.in);

        // Génère le nombre aléatoire
         int number = (int) (Math.random() * ( max - min ) + min );

         System.out.println("Veuillez entrez un nombre:");

         int choixuser;

        do {
           choixuser = sc.nextInt();
           if (choixuser != number){
               System.out.println(choixuser + " n'est pas le bon nombre choisi veuillez ressayer");
           } else {
               System.out.println(" Bravo vous avez trouver le nombre");
           }

        } while (choixuser != number);

        sc.close();
    }
}
