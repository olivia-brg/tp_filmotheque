package fr.eni.tp_filmotheque.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Film implements Serializable {

    private static final long serialVersionUID = 1L;
    private long id;
    private String nom;
    private int annee;
    private int duree;
    private String synopsis;
    private List<Avis> avis;
    private Genre genre;
    private List<Personne> acteurs;
    private Personne realisateur;



    public Film(long id, String nom, int annee, int duree, String synopsis) {
        this();
        this.id = id;
        this.nom = nom;
        this.annee = annee;
        this.duree = duree;
        this.synopsis = synopsis;
    }

    public Film(String nom, int annee, int duree, String synopsis) {
        this();
        this.nom = nom;
        this.annee = annee;
        this.duree = duree;
        this.synopsis = synopsis;
    }

    public Film() {
        acteurs = new ArrayList<>();
        avis = new ArrayList<>();
    }

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

    public int getAnnee() {
        return annee;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getDuree() {
        return duree;
    }
    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getSynopsis() {
        return synopsis;
    }
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public List<Avis> getAvis() {
        return avis;
    }
    public void setAvis(Avis avis) {
        this.avis.add(avis);
        avis.setFilm(this);
    }

    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<Personne> getActeurs() {
        return acteurs;
    }
    public void setActeurs(Personne acteur) {
        this.acteurs.add(acteur);
    }

    public Personne getRealisateur() {
        return realisateur;
    }
    public void setRealisateur(Personne realisateur) {
        this.realisateur = realisateur;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Film (");
        builder.append(id);
        builder.append(")\n\ttitre : ");
        builder.append(nom);
        builder.append("[annee : ");
        builder.append(annee);
        builder.append(", duree : ");
        builder.append(duree);
        builder.append(" minutes]\n\tSynopsis : ");
        builder.append(synopsis);
        builder.append("\n\trealisateur : ");
        builder.append(realisateur);
        builder.append("\n\tacteurs : ");
        builder.append(acteurs);
        builder.append("\n\tgenre : ");
        builder.append(genre);
        builder.append("\n\tAvis : ");
        builder.append(avis);
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Film film)) return false;
        return id == film.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
