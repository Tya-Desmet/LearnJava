package FrenchVersion.Week2.RechercheTableau;

public class RechercheTableaux {
    public static int[] tab = {10, 20, 18, 5, 12} ;

    public static void main(String[] args) {

        int userChoice = 1;

        rechercheNbrTableaux(tab,userChoice);


    }

    public static void rechercheNbrTableaux( int[] cherche, int userChoice) {
        boolean find = false;

        for (int i : cherche ) {

            if (i == userChoice) {
                find = true;
                break;
            }
        }

        if (find) {
            System.out.println("Le nombre choisi " + userChoice + " existe bien !");
        } else {
            System.out.println("Le nombre " + userChoice + " n'existe pas dans le tableau.");
        }
    }
}
