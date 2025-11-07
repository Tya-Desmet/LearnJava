package FrenchVersion.Week1.CompteurVoyelle;

import java.util.Scanner;

public class CompteurVoyelle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int voyelle = 0;
        int consonne = 0;
        String mot;

        System.out.println("Bonjour et bienvenue dans notre compteur de voyelle");

        System.out.println("Veuillez choisir votre mot");

        mot = sc.nextLine();

        for (int i = 0; i < mot.length(); i++){
            char lettre = mot.charAt(i);

            if(lettre == 'a' || lettre == 'e' || lettre == 'i' || lettre == 'o' || lettre == 'u' || lettre == 'y'){
                voyelle++;
            } else {
                consonne++;
            }

        }

        System.out.println("La phrase contiens: " + consonne + " Consomnes et " + voyelle + " Voyelle ");

    }
}
