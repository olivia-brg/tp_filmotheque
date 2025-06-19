package fr.eni.tp_filmotheque.bll.contexte;

import fr.eni.tp_filmotheque.bo.Membre;

public interface ContexteService {
    Membre charger(String email);
}
