package classes;

/*
type lit retire dans hotel
 */
public class Hotel extends Hebergement{
    private float nb_etoile;
    private boolean petitDej;
    private boolean restaurant;
    private String compagnie;

    public float getNb_etoile() {
        return nb_etoile;
    }
    public void setNb_etoile(float nb_etoile) {
        this.nb_etoile = nb_etoile;
    }
    public boolean getPetitDej() {
        return petitDej;
    }
    public void setPetitDej(boolean petitDej) {
        this.petitDej = petitDej;
    }
    public boolean getRestaurant() {
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
    public Hotel() {
    }
}
