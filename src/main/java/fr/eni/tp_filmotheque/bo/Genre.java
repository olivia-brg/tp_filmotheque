package fr.eni.tp_filmotheque.bo;

import java.util.List;

public class Genre {
    private long id;
    private String titre;
    private List<Film> films;

    public Genre(String titre) {
        this.titre = titre;
    }

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
}
