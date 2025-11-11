package FrenchVersion.Week2.TrouverLesNombre;


public class TrouverLesNombre {
    public static int[] tab = {10, 20, 18, 5, 12} ;

    public static void main(String[] args) {

        System.out.println("Voici la somme du tableau " + sumTab(tab));
        System.out.println("Voici la moyenne des notes du tableaux " + averageTab(tab));


    }
    public static int sumTab(int[] letab) {

        int somme = 0;
        for (int nombre : letab) {
            somme += nombre;
        }
        return somme;
    }

    public static int averageTab (int[] letab){
        int somme = 0;

        int divisionPer = letab.length;

        for (int nombre : letab) {
            somme += nombre;
        }

        int average = somme / divisionPer;

        return average;

    }
}
