package fr.eni.tp_filmotheque.ihm;

import fr.eni.tp_filmotheque.bll.FilmService;
import fr.eni.tp_filmotheque.bo.Film;
import fr.eni.tp_filmotheque.bo.Genre;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping({ "/","/films" })
@SessionAttributes("genresEnSession")
public class FilmController {
    FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping
    public String afficherFilms(Model model) {
        List<Film> films = filmService.consulterFilms();
        model.addAttribute("films", films);
        return "index";
    }

    @GetMapping("/detail")
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

    @PostMapping("/detail")
    public String modifierFilm(@RequestParam(required = true) String genre,
                               @RequestParam(required = true) String annee,
                               @RequestParam(required = true) String nom,
                               @RequestParam(required = true) String real,
                               @RequestParam(required = true) int duree,
                               @RequestParam(required = true) String acteur,
                               @RequestParam(required = true) String synopsis){
        System.out.println("Modification d'un film");
        System.out.println("genre: "+genre);
        System.out.println("annee: "+annee);
        System.out.println("titre: "+nom);
        System.out.println("realisateur: "+real);
        System.out.println("duree: "+duree);
        System.out.println("acteurs: "+ acteur);
        System.out.println("synopsis: "+synopsis);
        return "redirect:/films";
    }

    @ModelAttribute("genresEnSession")
    public List<Genre> chargerGenres() {
        System.out.println(filmService.consulterGenres());
        return filmService.consulterGenres();
    }

    @GetMapping("/creer")
    public String creerFilm(@ModelAttribute("genresEnSession") List<Genre> genres, Model model) {
        model.addAttribute("genres", genres);
        return "nouveau-film";
    }
}
