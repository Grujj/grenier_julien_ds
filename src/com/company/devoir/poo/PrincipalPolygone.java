package com.company.devoir.poo;

public class PrincipalPolygone {

    public static void main() {

        System.out.println("Exercice Polygone :");

        /* Instanciation de deux polygones */
        Polygone poly1 = new Polygone(3, 1);
        Polygone poly2 = new Polygone(4, 2);

        /* Test accesseurs et mutateurs */
        System.out.println("----------------------------------------");
        System.out.println("Test accesseurs et mutateurs");
        System.out.println("Avant set :" + poly1.getCotes());
        poly1.setCotes(6);
        System.out.println("Apres set :" + poly1.getCotes());

        /* Affichage des caracteristiques des deux polygones */
        System.out.println("----------------------------------------");
        System.out.println("Affichage toString :");
        System.out.println(poly1.toString());
        System.out.println(poly2.toString());

        /* Methode presqueClone */
        System.out.println("----------------------------------------");
        System.out.println("Methode preque clone :");
        System.out.println(PrincipalPolygone.presqueClone(poly2, 3));

        /* Plus petit */
        System.out.println("----------------------------------------");
        System.out.println("Plus petit :");
        System.out.println(PrincipalPolygone.plusPetit(poly1, poly2));
    }

    /**
     * Methode qui cree un nouveau polygone en ajoutant/enlevant
     * des cotes a un polygone deja existant
     *
     * @param poly : Polygone
     * @param cotes : int
     */
    public static Polygone presqueClone(Polygone poly, int cotes){
        return new Polygone(poly.getCotes() + cotes, poly.getLongueurDeCotes());
    }

    /**
     * Methode qui compare deux polygones et retourne clui ayant le plus petit perimetre
     * renvoi le premier polygone en cas d egalite
     *
     * @param poly1 : Polygone
     * @param poly2 : Polygone
     *
     * @return : Polygone
     */
    public static Polygone plusPetit(Polygone poly1, Polygone poly2){

        double perimetre1 = poly1.getCotes() * poly1.getLongueurDeCotes();
        double perimetre2 = poly2.getCotes() * poly2.getLongueurDeCotes();
        return perimetre1 <= perimetre2 ? poly1 : poly2;
    }
}
