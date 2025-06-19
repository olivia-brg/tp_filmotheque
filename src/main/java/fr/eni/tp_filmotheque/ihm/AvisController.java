package fr.eni.tp_filmotheque.ihm;

import fr.eni.tp_filmotheque.bll.FilmService;
import fr.eni.tp_filmotheque.bo.Avis;
import fr.eni.tp_filmotheque.bo.Film;
import fr.eni.tp_filmotheque.bo.Membre;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/avis")
@SessionAttributes({"membreSession"})
public class AvisController {

    FilmService filmService;

    public AvisController(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/creer")
    public Object ajouterAvis(@RequestParam(name="idFilm") long id,
                              @ModelAttribute("membreSession") Membre membreSession,
                              Avis avis,
                              Model model) {
        System.out.println("test");
        Film current = null;
        if (id > 0) {
            current = filmService.consulterFilmParId(id);
            if (current != null) {
                current.setAvis(new Avis(avis.getNote(), avis.getCommentaire(), membreSession));
                return new ModelAndView("ajouter-avis", "avis", avis);
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
