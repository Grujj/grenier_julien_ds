package com.company;

import com.company.devoir.java.DevoirJava;
import com.company.devoir.poo.PrincipalPolygone;
import com.company.devoir.poo.gestionHeuresComplementaires.PrincipalGestion;

public class Main {

    public static void main(String[] args) {

        // Exo Devoir Java : 1)
        System.out.println("Devoir Java : 1)");
        System.out.println(DevoirJava.km_vers_mile(1.609));


        // Exo Devoir Java : 2)
        System.out.println("Devoir Java : 2)");
        System.out.println(DevoirJava.pgcd(12, 120));

        // Exo Devoir Java : 3)
        System.out.println("Devoir Java : 3)");
        System.out.println(DevoirJava.sumNprem(15));

        // Exo Devoir POO
        PrincipalPolygone.main();

        // Exo Gestion
        PrincipalGestion.main();
    }
}
