package com.company.devoir.poo.gestionHeuresComplementaires.enseignant;

abstract public class Enseignant {

    private String nom;
    private int heuresEffectuees;
    private int heuresComplementaires;
    private final double prixHeureComplementaire = 35;

    //region Constructeur
    public Enseignant(){

    }

    public Enseignant(String nom, int heuresEffectuees) {
        this.setNom(nom);
        this.setHeuresEffectuees(heuresEffectuees);
    }
    //endregion

    /**
     * Methode qui retourne le nom de l enseignant
     *
     * @return : String
     */
    public String nom(){
        return this.getNom();
    }

    /**
     * Methode qui retourne le nombre d heure complementaire d un enseignant
     *
     * @return : int
     */
    public int heureComp(){
        return this.getHeuresComplementaires();
    }

    /**
     * Methode qui retourne la retribution d un enseignant
     *
     * @return : int
     */
    public double retribution(){
        return this.getHeuresComplementaires() * this.getPrixHeureComplementaire();
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "nom='" + nom + '\'' +
                ", heures=" + heuresEffectuees +
                '}';
    }

    //region Getter/Setter
    public String getNom() {
        return nom;
    }

    private void setNom(String nom) {
        this.nom = nom;
    }

    private int getHeuresEffectuees() {
        return heuresEffectuees;
    }

    private void setHeuresEffectuees(int heuresEffectuees) {
        this.heuresEffectuees = heuresEffectuees;
    }

    public double getPrixHeureComplementaire() {
        return prixHeureComplementaire;
    }

    public int getHeuresComplementaires() {
        return heuresComplementaires;
    }

    public void setHeuresComplementaires(int heuresComplementaires) {
        this.heuresComplementaires = heuresComplementaires;
    }

    //endregion
}
