package fr.eni.tp_filmotheque.bo;

import java.io.Serializable;
import java.util.Objects;

public abstract class Personne implements Serializable {

    private static final long serialVersionUID = 1L;
    private long id;
    private String nom;
    private String prenom;

    public Personne(long id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne() {}


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(prenom);
        builder.append(" ");
        builder.append(nom);
        builder.append(" (");
        builder.append(id);
        builder.append(") ");
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Personne personne)) return false;
        return id == personne.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
