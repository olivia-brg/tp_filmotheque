package fr.eni.tp_filmotheque.ihm;

import fr.eni.tp_filmotheque.bll.contexte.ContexteService;
import fr.eni.tp_filmotheque.bll.mock.ContexteServiceBouchon;
import fr.eni.tp_filmotheque.bo.Film;
import fr.eni.tp_filmotheque.bo.Membre;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.List;


@Controller
@RequestMapping("/contextes")
@SessionAttributes("membreSession")
public class ContexteController {

    private ContexteService contexteService;

    public ContexteController(ContexteService contexteService) {
        this.contexteService = contexteService;
    }

    @GetMapping
    public String choixContexte() {
        return "contexte/view-contexte";
    }

    @GetMapping("/session")
    public String connexion(@ModelAttribute("membreSession") Membre membreSession,
                            @RequestParam(name = "email", defaultValue = "jtrillard@campus-eni.fr") String email,
                            Model model) {
        System.out.println("connexion de " + email);
        Membre membre= contexteService.charger(email);
        model.addAttribute("membreSession", membre);
        System.out.println("model : " + model.getAttribute("membreSession"));
        return "redirect:/films";
    }

    @ModelAttribute("membreSession")
    public Membre addAttributSession() {
        System.out.println("Add Attribut Session");
        return null;
    }

    @GetMapping("/invalidate")
    public String finSession(SessionStatus status) {
        status.setComplete();
        return "redirect:/contextes"; // Redirection
    }

}
