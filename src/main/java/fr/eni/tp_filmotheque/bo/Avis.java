package fr.eni.tp_filmotheque.bo;

import java.io.Serializable;
import java.util.Objects;

public class Avis implements Serializable {

    private static final long serialVersionUID = 1L;
    private long id;
    private int note;
    private String comment;
    private Film film;
    private Membre membre;

    public Avis(long id, int note, String comment, Film film, Membre membre) {
        this.id = id;
        this.note = note;
        this.comment = comment;
        this.film = film;
        this.membre = membre;
    }

    public Avis(long id, int note, String comment, Membre membre) {
        this.id = id;
        this.note = note;
        this.comment = comment;
        this.membre = membre;
    }

    public Avis(int note, String comment, Film film, Membre membre) {
        this.note = note;
        this.comment = comment;
        this.film = film;
        this.membre = membre;
    }

    public Avis() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
        film.setAvis(this);
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
        membre.setAvis(this);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Avis de ");
        builder.append(membre);
        builder.append(" - note=");
        builder.append(note);
        builder.append(", commentaire=");
        builder.append(comment);
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Avis avis)) return false;
        return id == avis.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
