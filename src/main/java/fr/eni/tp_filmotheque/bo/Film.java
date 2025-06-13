package fr.eni.tp_filmotheque.bo;

import java.util.List;

public class Film {
    private long id;
    private String nom;
    private int annee;
    private int duree;
    private String synopsis;
    private List<Avis> avis;
    private Genre genre;

    public Film(long id, String nom, int annee, int duree, String synopsis) {
        this.id = id;
        this.nom = nom;
        this.annee = annee;
        this.duree = duree;
        this.synopsis = synopsis;
    }

    public Film(String nom, int annee, int duree, String synopsis) {
        this.nom = nom;
        this.annee = annee;
        this.duree = duree;
        this.synopsis = synopsis;
    }

    public Film() {}

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

    public void setAvis(List<Avis> avis) {
        this.avis = avis;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Film{");
        sb.append("id=").append(id);
        sb.append(", nom='").append(nom).append('\'');
        sb.append(", annee=").append(annee);
        sb.append(", duree=").append(duree);
        sb.append(", synopsis='").append(synopsis).append('\'');
        sb.append(", avis=").append(avis);
        sb.append(", genre=").append(genre);
        sb.append('}');
        return sb.toString();
    }
}
