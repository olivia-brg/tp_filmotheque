package fr.eni.tp_filmotheque.bo;

import java.util.List;

public class Genre {
    private long id;
    private String titre;
    private List<Film> films;

    public Genre(long id, String titre, List<Film> films) {
        this.id = id;
        this.titre = titre;
        this.films = films;
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
        final StringBuffer sb = new StringBuffer("Genre{");
        sb.append("id=").append(id);
        sb.append(", titre='").append(titre).append('\'');
        sb.append(", films=").append(films);
        sb.append('}');
        return sb.toString();
    }
}
