package com.company.devoir.poo.gestionHeuresComplementaires.enseignant;

import com.company.devoir.poo.gestionHeuresComplementaires.enseignant.Enseignant;

public class IntervenantExterieur extends Enseignant {

    public IntervenantExterieur() {
    }

    /**
     * Constructeur qui gere les heures complementaires
     *
     * @param nom : String
     * @param heuresEffectuees : int
     */
    public IntervenantExterieur(String nom, int heuresEffectuees) {
        super(nom, heuresEffectuees);
        this.setHeuresComplementaires(heuresEffectuees);
    }
}
