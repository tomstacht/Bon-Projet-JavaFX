package classes;

public class Reservation {
    private int idReservation;
    private String nom;
    private String ville;
    private String pseudo;
    private String mail;
    private String dateDebut;
    private String dateFin;

    public Reservation(int idReservation, String nom, String ville, String pseudo, String mail, String dateDebut, String dateFin) {
        this.idReservation = idReservation;
        this.nom = nom;
        this.ville = ville;
        this.pseudo = pseudo;
        this.mail = mail;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }
}
