package classes;

import java.util.ArrayList;

public class Villa extends Hebergement{
    private boolean piscine;
    private float distance_mer;
    private int nbChambres;
    private int nbSDB;

    public Villa(int id, String nom, int prix, String lieu, float distanceCentre, int m2, int nbPersonnes, float note, boolean wifi, boolean clim, boolean animaux, boolean parking, boolean fumeur, boolean piscine, float distance_mer, int nbChambres, int nbSDB) {
        super(id, nom, prix, lieu, distanceCentre, m2, nbPersonnes, note, wifi, clim, animaux, parking, fumeur);
        this.piscine = piscine;
        this.distance_mer = distance_mer;
        this.nbChambres = nbChambres;
        this.nbSDB = nbSDB;
    }

    public boolean isPiscine() {
        return piscine;
    }

    public void setPiscine(boolean piscine) {
        this.piscine = piscine;
    }

    public float getDistance_mer() {
        return distance_mer;
    }

    public void setDistance_mer(float distance_mer) {
        this.distance_mer = distance_mer;
    }

    public int getNbChambres() {
        return nbChambres;
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }

    public int getNbSDB() {
        return nbSDB;
    }

    public void setNbSDB(int nbSDB) {
        this.nbSDB = nbSDB;
    }

    public ArrayList<Integer> satisfaitFiltreVilla(ArrayList<Boolean> listeBool) {
        int variableV = 0;
        ArrayList<Integer> visuVilla =new ArrayList<>();
        int prixV = 0;
        int etoilesV=0;
        int noteV=0;
        int nb_boolV = 0;
        int verifV=0;

        for (int i = 0; i < listeBool.size(); i++) {
            if (listeBool.get(i) == true && i == 4 && this.getPrix() < 150) {
                prixV=0;
                variableV++;
            }
            if (listeBool.get(i) == true && i == 5 && this.getPrix() > 150 && this.getPrix() < 300) {
                prix=1;
                variableV++;
            }
            if (listeBool.get(i) == true && i == 6 && this.getPrix() > 300) {
                prix=2;
                variableV++;
            }
            if (listeBool.get(i) == true && i == 11 && this.getNote() < 8) {
                note=0;
                variableV++;
            }
            if (listeBool.get(i) == true && i == 12 && this.getNote() > 8) {
                note=1;
                variableV++;
            }
            if (listeBool.get(i) == true && i == 13 && this.isPiscine() == true) {
                variableV++;
            }
            if (listeBool.get(i) == true && i == 14 && this.isWifi() == true) {
                variableV++;
            }
            if (listeBool.get(i) == true && i == 15 && this.isClim() == true) {
                variableV++;
            }
            if (listeBool.get(i) == true && i == 16 && this.isFumeur() == true) {
                variableV++;
            }
            if (listeBool.get(i) == true && i == 17 && this.isAnimaux() == true) {
                variableV++;
            }
            if (listeBool.get(i) == true && i == 18 && this.isParking() == true) {
                variableV++;
            }
        }
        for(int j=4;j<listeBool.size();j++)
        {
            if(listeBool.get(j)==true){
                nb_boolV++;
            }
        }
        if(nb_boolV<=variableV) {
            verifV = 1;
        }
        visuVilla.add(verifV);
        visuVilla.add(prix);
        visuVilla.add(etoilesV);
        visuVilla.add(noteV);
        return visuVilla;
    }

}
