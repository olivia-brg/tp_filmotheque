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
import java.util.Objects;


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
                            @RequestParam(name = "email", defaultValue = "") String email,
                            Model model) {
        Membre membre = contexteService.charger(email);
        model.addAttribute("membreSession", Objects.requireNonNullElseGet(membre, Membre::new));
        return "redirect:/films";
    }

    @ModelAttribute("membreSession")
    public Membre addAttributSession() {
        return new Membre();
    }

    @GetMapping("/cloture")
    public String finSession(SessionStatus status) {
        status.setComplete();
        return "redirect:/contextes"; // Redirection
    }

}
