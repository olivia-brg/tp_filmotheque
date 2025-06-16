package fr.eni.tp_filmotheque.ihm;

import fr.eni.tp_filmotheque.bll.FilmService;
import fr.eni.tp_filmotheque.bo.Film;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class FilmController {
    FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping({ "/","/films" })
    public String afficherFilms(Model model) {
        List<Film> films = filmService.consulterFilms();
        model.addAttribute("films", films);
        return "index";
    }

    @GetMapping("/films/detail")
    public String afficherUnFilm(@RequestParam(name="id") long id, Model model) {
        Film current = null;
        if (id > 0) {// L'identifiant en base commencera en 1
            current = filmService.consulterFilmParId(id);
            if (current != null) {
                System.out.println(current);
                model.addAttribute("film", current);
                return "movie-detail";
            }
            else{
                System.out.println("Film inconnu!!");
                return "film-not-found";
            }
        } else {
            System.out.println("Identifiant inconnu");
            return "film-not-found";
        }
    }


}
