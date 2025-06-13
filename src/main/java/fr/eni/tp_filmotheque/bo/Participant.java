package fr.eni.tp_filmotheque.bo;

import java.util.ArrayList;
import java.util.List;

public class Participant extends Personne {

    private List<Film> films = new ArrayList<Film>();

    public Participant(long id, String nom, String prenom) {
        super(id, nom, prenom);
    }

    public Participant(String nom, String prenom) {
        super(nom, prenom);
    }

    public Participant() {}

    public List<Film> getFilms() {
        return films;
    }

    public void setRealFilm(Film film) {
        this.films.add(film);
        film.setRealisateur(this);
    }

    public void setActeurFilm(Film film) {
        this.films.add(film);
        film.setActeurs(this);
    }

    @Override
    public long getId() {
        return super.getId();
    }
}
