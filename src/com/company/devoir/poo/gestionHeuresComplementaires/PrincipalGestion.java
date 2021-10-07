package com.company.devoir.poo.gestionHeuresComplementaires;

import com.company.devoir.poo.gestionHeuresComplementaires.enseignant.EnseignantFac;
import com.company.devoir.poo.gestionHeuresComplementaires.enseignant.EtudiantTroisiemeCycle;
import com.company.devoir.poo.gestionHeuresComplementaires.enseignant.IntervenantExterieur;

public class PrincipalGestion {

    public static void main() {

        /* Initialisation des enseignants et etudiants */
        EnseignantFac enseignantFac = new EnseignantFac("Gerard", 200);
        IntervenantExterieur intervenantExterieur = new IntervenantExterieur("Paul", 40);
        EtudiantTroisiemeCycle etudiantTroisiemeCycle = new EtudiantTroisiemeCycle("Louis", 103, true);
        EtudiantTroisiemeCycle etudiantTroisiemeCycleSansEmployeur = new EtudiantTroisiemeCycle("Pierre", 105, false);

        /* Demonstration avec un enseignant de fac, un intervenant exterieur, un etudiant employe et un etudiant sans employeur */
        System.out.println(enseignantFac + " - Retribution : " + enseignantFac.retribution());
        System.out.println(intervenantExterieur + " - Retribution : " + intervenantExterieur.retribution());
        System.out.println(etudiantTroisiemeCycle + " - Retribution : " + etudiantTroisiemeCycle.retribution());
        System.out.println(etudiantTroisiemeCycleSansEmployeur + " - Retribution : " + etudiantTroisiemeCycleSansEmployeur.retribution());

        /* Pour introduire les etudiants de troisieme cycle, j'ai cree la classe EtudiantTroisiemeCycle et ajouter une interface qui gere les seuils d heures complementaires */
        /* Cela n a pas posé probleme d introduire les etudiants sans employeurs en surchargeant retribution et en integrant le fait d etre employe */
    }
}
