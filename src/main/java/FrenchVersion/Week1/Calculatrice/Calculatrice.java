package FrenchVersion.Week1.Calculatrice;

import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        int premier;
        int second;
        int resultCalcul;


        do {
            System.out.println("Bienvenu dans votre calculatrice veuillez choisir une opération:");
            System.out.println("0: Quitter");
            System.out.println("1: Addition");
            System.out.println("2: Soustraction");
            System.out.println("3: Division");
            System.out.println("4: Multiplication");

            choice = sc.nextInt();


                switch (choice) {
                    case 1:
                        System.out.println("Vous avez choisi l'addition");
                        System.out.println("Veuillez choisir un premier chiffre");
                        premier = sc.nextInt();
                        System.out.println("Veuillez choisir un second chiffre");
                        second = sc.nextInt();

                        resultCalcul = premier + second;

                        System.out.println("Le resultat de: " + premier  +" + " + second + " est " + resultCalcul);
                        break;
                    case 2:
                        System.out.println("Vous avez choisi la soustraction");
                        System.out.println("Veuillez choisir un premier chiffre");
                        premier = sc.nextInt();
                        System.out.println("Veuillez choisir un second chiffre");
                        second = sc.nextInt();

                        resultCalcul = premier - second;

                        System.out.println("Le resultat de: " + premier  +" - " + second + " est " + resultCalcul);
                        break;

                    case 3:
                        System.out.println("Vous avez choisi la division");
                        System.out.println("Veuillez choisir un premier chiffre");
                        premier = sc.nextInt();
                        System.out.println("Veuillez choisir un second chiffre");
                        second = sc.nextInt();
                        if ( second == 0){
                            System.out.println("division par 0 impossible");
                            break;
                        }

                        resultCalcul = premier / second;

                        System.out.println("Le resultat de: " + premier  +" / " + second + " est " + resultCalcul);
                        break;

                    case 4:
                        System.out.println("Vous avez choisi la multiplication");
                        System.out.println("Veuillez choisir un premier chiffre");
                        premier = sc.nextInt();
                        System.out.println("Veuillez choisir un second chiffre");
                        second = sc.nextInt();

                        resultCalcul = premier * second;

                        System.out.println("Le resultat de: " + premier  +" * " + second + " est " + resultCalcul);
                        break;

                    default:
                        System.out.println("Choix invalide, veuillez réessayer !");
                }




        } while (choice != 0);
        sc.close();
        System.out.println("Vous quittez notre programme !");
    }
}
