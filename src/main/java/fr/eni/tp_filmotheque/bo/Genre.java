package fr.eni.tp_filmotheque.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Genre implements Serializable {

    private static final long serialVersionUID = 1L;
    private long id;
    private String titre;
    private List<Film> films =  new ArrayList<Film>();

    public Genre(long id, String titre) {
        this.id = id;
        this.titre = titre;
    }

    public Genre(String titre) {
        this.titre = titre;
    }

    public Genre() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(Film film) {
        this.films.add(film);
        film.setGenre(this);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(titre);
        builder.append(" (");
        builder.append(id);
        builder.append(")");
        return builder.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Genre genre)) return false;
        return id == genre.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
