package fr.eni.tp_filmotheque.bo;

public class Avis {
    private long id;
    private int note;
    private String comment;
    private Film film;

    public Avis(int note, String comment) {
        this.note = note;
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
        film.setAvis(this);
    }


}
