package FrenchVersion.Week2.PlusGranPlusPetit;

public class PlusGrandPlusPetit {
    public static int[] tab = {10, 20, 18, 5, 12} ;

    public static void main(String[] args) {
        System.out.println("Voici le plus grand nombre du tableaux " + plusGrand(tab));
        System.out.println("Voici le plus petit nombre du tableaux " + plusPetit(tab));
    }

    public static int plusGrand(int[] letab) {
        int nombreGrand = 0;
        for (int i : letab ) {
            if (nombreGrand < i ) {
                nombreGrand = i;
            }
        }
        return nombreGrand;
    }

    public static int plusPetit(int[] letab) {
        int nombreGrand = 999;
        for (int i : letab ) {
            if (nombreGrand > i ) {
                nombreGrand = i;
            }
        }
        return nombreGrand;
    }



}
