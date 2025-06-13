package fr.eni.tp_filmotheque.bo;

import java.util.ArrayList;
import java.util.List;

public class Membre extends Personne {

    private static final long serialVersionUID = 1L;
    private String pseudo;
    private String motDePasse;
    private boolean admin;
    private List<Avis> avis = new ArrayList<Avis>();

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public List<Avis> getAvis() {
        return avis;
    }

    public void setAvis(Avis avis) {
        this.avis.add(avis);
        avis.setMembre(this);
    }

    public Membre(long id, String nom, String prenom, String pseudo, String motDePasse) {
        super(id, nom, prenom);
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.admin = false;
    }

    public Membre(String nom, String prenom, String pseudo, String motDePasse) {
        super(nom, prenom);
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.admin = false;
    }

    public Membre(String pseudo, String motDePasse) {
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.admin = false;
    }

    public Membre(long id, String nom, String prenom, String pseudo) {
        super(id, nom, prenom);
    }

    public Membre(String nom, String prenom, String pseudo) {
        super(nom, prenom);
    }

    public Membre(String pseudo) {}

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append(" - Membre (pseudo=");
        builder.append(pseudo);
        builder.append(", admin=");
        builder.append(admin);
        builder.append(") ");
        return builder.toString();
    }
}
