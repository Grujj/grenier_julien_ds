package com.company.devoir.java;

import java.util.ArrayList;
import java.util.List;

public class DevoirJava {

    /**
     * Methode qui convertit les kilometres en miles (1 mile = 1,609km)
     *
     * @param km : double
     *
     * @return : double
     */
    public static double km_vers_mile(double km){
        return km / 1.609;
    }

    /**
     * Methode qui retourne le plus grand commun diviseur (pgcd)
     * de deux nombres entiers positifs
     *
     * @param a : int
     * @param b : int
     *
     * @return : int
     */
    public static int pgcd(int a, int b){

        /* Initialisation de la liste des denominateurs */
        List<Integer> denominateurs = new ArrayList<>();

        /* On determine le plus petit des deux nombres */
        int i = a <= b ? a : b;

        /* Boucle sur le plus petit nombre pour boucler le moins longtemps possible */
        for (i = 1; i <= a; i++)

            /* Si il y a un denominateur commun, ajoute a la liste */
            if(a % i == 0 && b % i == 0)
                denominateurs.add(i);

        /* Retourne le plus grand denominateur commun du tableau */
        return denominateurs.get(denominateurs.size() -1);
    }

    /**
     * Methode qui calcul la somme des n premiers nombre premier
     *
     * @param n : int
     *
     * @return : int
     */
    public static int sumNprem(int n){

        /* Initialisation du resultat de l addition et d une liste tampon */
        int sumNprem = 0;
        List<Integer> listTampon = new ArrayList<>();

        /* Boucle jusqu a la limite donnee */
        for(int i = 0; i <= n; i++){

            /* On boucle sur chaque chiffre entre 1 et la limite */
            for (int j = 1; j <= i; j++) {

                /* On recupere les donimateurs a reste 0 dans tampon */
                if (i % j == 0)
                    listTampon.add(j);
            }

            /* Si on ne recupere que deux denominateurs, c'est qu on a recupere
             * lui meme et 1, il est donc premier. On l'additionne au resultat
             */
            if(listTampon.size() <= 2)
                sumNprem += i;

            /* On vide la liste tampon */
            listTampon.clear();
        }

        /* On retourne la somme des nombres premiers jusqu a la limite */
        return sumNprem;
    }
}
