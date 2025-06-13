package fr.eni.tp_filmotheque.bo;

public abstract class Personne {
    private long id;
    private String nom;
    private String prenom;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}
