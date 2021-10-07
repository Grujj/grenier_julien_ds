package com.company.devoir.poo.gestionHeuresComplementaires.enseignant;

public class EtudiantTroisiemeCycle extends Enseignant implements ISeuilHeuresComplementaires{

    private boolean employe;

    public EtudiantTroisiemeCycle() {
    }

    /**
     * Constructeur qui gere les heures complementaires et si il est employe
     * @param nom
     * @param heuresEffectuees
     * @param employe
     */
    public EtudiantTroisiemeCycle(String nom, int heuresEffectuees, boolean employe) {
        super(nom, heuresEffectuees);
        this.employe = employe;

        if(heuresEffectuees > this.SEUIL_TROISIEME_CYCLE)
            this.setHeuresComplementaires(heuresEffectuees - this.SEUIL_TROISIEME_CYCLE);
    }

    /**
     * Methode qui calcule la retribution d un etudiant de troisieme cycle
     *
     * @param employe : boolean
     *
     * @return : double
     */
    public double retribution() {
        return employe ? super.retribution() : super.retribution() * 0.92;
    }

    @Override
    public String toString() {
        return "EtudiantTroisiemeCycle{" +
                "employe=" + employe +
                "} " + super.toString();
    }

    //region Getter/Setter
    private boolean isEmploye() {
        return employe;
    }

    private void setEmploye(boolean employe) {
        this.employe = employe;
    }
    //endregion
}
