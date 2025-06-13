package fr.eni.tp_filmotheque.bo;

public class Membre extends Personne {
    private String pseudo;
    private String motDePasse;
    private boolean admin;

    public Membre(long id, String nom, String prenom, String pseudo, String motDePasse, boolean admin) {
        super(id, nom, prenom);
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.admin = admin;
    }

    public Membre(String nom, String prenom, String pseudo, String motDePasse, boolean admin) {
        super(nom, prenom);
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.admin = admin;
    }

    public Membre(String pseudo, String motDePasse, boolean admin) {
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.admin = admin;
    }

    public Membre(long id, String nom, String prenom, String pseudo) {
        super(id, nom, prenom);
    }

    public Membre(String nom, String prenom, String pseudo) {
        super(nom, prenom);
    }

    public Membre(String pseudo) {}

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Membre{");
        sb.append("admin=").append(admin);
        sb.append(", pseudo='").append(pseudo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
