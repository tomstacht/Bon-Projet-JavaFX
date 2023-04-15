package classes;
import java.util.Scanner;

public class  Hebergement {
    protected String id;//
    protected float prix_location;//
    protected String ville;//
    protected String nom;//
    protected int distance_centre;
    protected float note_client;
    protected int nb_mettreCaree;
    protected int nb_personne;

    protected int nb_etoile;
    protected int nb_chambres;



    public Hebergement() {
    }

    public String getId() {
        return id;
    }

    public float getPrix_location() {
        return prix_location;
    }

    public String getVille() {
        return ville;
    }

    public String getNom() {
        return nom;
    }

    public int getDistance_centre() {
        return distance_centre;
    }

    public float getNote_client() {
        return note_client;
    }

    public int getNb_mettreCaree() {
        return nb_mettreCaree;
    }

    public int getNb_personne() {
        return nb_personne;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setPrix_location(float prix_location) {
        this.prix_location = prix_location;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setDistance_centre(int distance_centre) {
        this.distance_centre = distance_centre;
    }
    public void setNote_client(float note_client) {
        this.note_client = note_client;
    }
    public void setNb_mettreCaree(int nb_mettreCaree) {
        this.nb_mettreCaree = nb_mettreCaree;
    }
    public void setNb_personne(int nb_personne) {
        this.nb_personne = nb_personne;
    }

}
