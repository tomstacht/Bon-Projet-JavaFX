package classes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel extends Hebergement {
    private float nb_etoile;
    private boolean petitDej;
    private boolean restaurant;
    private String compagnie;

    public Hotel(int id, String nom, int prix, String lieu, float distanceCentre, int m2, int nbPersonnes, float note, boolean wifi, boolean clim, boolean animaux, boolean parking, boolean fumeur, float nb_etoile, boolean petitDej, boolean restaurant, String compagnie, String image) {
        super(id, nom, prix, lieu, distanceCentre, m2, nbPersonnes, note, wifi, clim, animaux, parking, fumeur, image);
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

    public ArrayList<Integer> satisfaitFiltreHotel(ArrayList<Boolean> listeBool) {
        int variable = 0;
        ArrayList<Integer> visu =new ArrayList<>();
        int prix = 0;
        int etoiles=0;
        int note=0;
        int nb_bool = 0;
        int verif=0;

        for (int i = 0; i < listeBool.size(); i++) {
            if (listeBool.get(i) == true && i == 4 && this.getPrix() < 150) {
                prix=0;
                variable++;
            }
            if (listeBool.get(i) == true && i == 5 && this.getPrix() > 150 && this.getPrix() < 300) {
                prix=1;
                variable++;
            }
            if (listeBool.get(i) == true && i == 6 && this.getPrix() > 300) {
                prix=2;
                variable++;
            }
            if (listeBool.get(i) == true && i == 7 && this.getNb_etoile() < 4) {
                etoiles=0;
                variable++;
            }
            if (listeBool.get(i) == true && i == 8 && this.getNb_etoile() > 4) {
                etoiles=1;
                variable++;
            }
            if (listeBool.get(i) == true && i == 9 && this.isPetitDej() == true) {
                variable++;
            }
            if (listeBool.get(i) == true && i == 10 && this.isRestaurant() == true) {
                variable++;
            }
            if (listeBool.get(i) == true && i == 11 && this.getNote() < 8) {
                note=0;
                variable++;
            }
            if (listeBool.get(i) == true && i == 12 && this.getNote() > 8) {
                note=1;
                variable++;
            }
            if (listeBool.get(i) == true && i == 14 && this.isWifi() == true) {
                variable++;
            }
            if (listeBool.get(i) == true && i == 15 && this.isClim() == true) {
                variable++;
            }
            if (listeBool.get(i) == true && i == 16 && this.isFumeur() == true) {
                variable++;
            }
            if (listeBool.get(i) == true && i == 17 && this.isAnimaux() == true) {
                variable++;
            }
            if (listeBool.get(i) == true && i == 18 && this.isParking() == true) {
                variable++;
            }
        }
        for(int j=4;j<listeBool.size();j++)
        {
            if(listeBool.get(j)==true){
                nb_bool++;
            }
        }
        if(nb_bool<=variable) {
            verif = 1;
        }
        visu.add(verif);
        visu.add(prix);
        visu.add(etoiles);
        visu.add(note);
        return visu;
    }
}