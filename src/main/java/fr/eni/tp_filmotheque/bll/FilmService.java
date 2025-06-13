package fr.eni.tp_filmotheque.bll;

import fr.eni.tp_filmotheque.bo.Film;
import fr.eni.tp_filmotheque.bo.Genre;
import fr.eni.tp_filmotheque.bo.Participant;

import java.util.List;

public interface FilmService {
    List<Film> consulterFilms();
    Film consulterFilmParId(long id);
    List<Genre> consulterGenres();
    List<Participant> consulterParticipants();
    Genre consulterGenreParId(long id);
    Participant consulterParticipantParId(long id);
    void creerFilm(Film film);
}
