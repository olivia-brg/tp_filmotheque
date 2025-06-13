package fr.eni.tp_filmotheque.bo;

public class Membre extends Personne {
    private String pseudo;
    private String motDePasse;
    private boolean admin;

    public Membre(String nom, String prenom, String pseudo, String motDePasse, boolean admin) {
        super(nom, prenom);
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.admin = admin;
    }




}
