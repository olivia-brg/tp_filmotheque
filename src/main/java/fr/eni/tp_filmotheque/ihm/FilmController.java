package fr.eni.tp_filmotheque.ihm;

import fr.eni.tp_filmotheque.bll.FilmService;
import fr.eni.tp_filmotheque.bo.Film;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class FilmController {
    FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    public void afficherFilms() {
        System.out.println("\nTous les films : ");
        List<Film> films = filmService.consulterFilms();
        films.forEach(System.out::println);
    }

    public void afficherUnFilm(long id) {
        if (id > 0) {// L'identifiant en base commencera en 1
            Film current = filmService.consulterFilmParId(id);
            if (current != null)
                System.out.println(current);
            else
                System.out.println("Film inconnu!!");
        } else {
            System.out.println("Identifiant inconnu");
        }
    }


}
