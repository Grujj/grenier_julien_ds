package com.company.devoir.poo.gestionHeuresComplementaires.enseignant;

public class EnseignantFac extends Enseignant implements ISeuilHeuresComplementaires {

    public EnseignantFac() {
    }

    /**
     * Constructeur qui gere les heures complementaires
     *
     * @param nom : String
     * @param heuresEffectuees : int
     */
    public EnseignantFac(String nom, int heuresEffectuees) {
        super(nom, heuresEffectuees);

        if(heuresEffectuees > this.SEUIL_ENSEIGNANT)
            this.setHeuresComplementaires(heuresEffectuees - this.SEUIL_ENSEIGNANT);
    }
}
