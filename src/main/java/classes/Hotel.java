package classes;

public class Hotel extends Hebergement{
    private float nb_etoile;
    private boolean petitDej;
    private boolean restaurant;
    private String compagnie;

    public Hotel(int id, String nom, int prix, String lieu, float distanceCentre, int m2, int nbPersonnes, float note, boolean wifi, boolean clim, boolean animaux, boolean parking, boolean fumeur, float nb_etoile, boolean petitDej, boolean restaurant, String compagnie) {
        super(id, nom, prix, lieu, distanceCentre, m2, nbPersonnes, note, wifi, clim, animaux, parking, fumeur);
        this.nb_etoile = nb_etoile;
        this.petitDej = petitDej;
        this.restaurant = restaurant;
        this.compagnie = compagnie;
    }

    public Hotel() {

    }

    public float getNb_etoile() {
        return nb_etoile;
    }

    public void setNb_etoile(float nb_etoile) {
        this.nb_etoile = nb_etoile;
    }

    public boolean isPetitDej() {
        return petitDej;
    }

    public void setPetitDej(boolean petitDej) {
        this.petitDej = petitDej;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }

    public String getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(String compagnie) {
        this.compagnie = compagnie;
    }
}
