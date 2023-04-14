package com.example.bonprojetjavafx;
public class Hotel extends Hebergement{
    private float nb_etoile;
    private boolean petitDej;
    private boolean restaurant;
    private String type_lit;
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
    public String getType_lit() {
        return type_lit;
    }
    public void setType_lit(String type_lit) {
        this.type_lit = type_lit;
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
