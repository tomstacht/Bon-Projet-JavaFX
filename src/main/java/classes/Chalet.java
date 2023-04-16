package classes;

import java.util.ArrayList;

public class Chalet extends Hebergement{

    private boolean cheminer;
    private boolean localSki;
    private float distance_piste;
    private int nbChambres;
    private int nbSDB;

    public Chalet() {
    }

    public boolean isCheminer() {
        return cheminer;
    }

    public void setCheminer(boolean cheminer) {
        this.cheminer = cheminer;
    }

    public float getDistance_piste() {
        return distance_piste;
    }

    public void setDistance_piste(float distance_piste) {
        this.distance_piste = distance_piste;
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

    public boolean isLocalSki() {
        return localSki;
    }

    public void setLocalSki(boolean localSki) {
        this.localSki = localSki;
    }

    public Chalet(int id, String nom, int prix, String lieu, float distanceCentre, int m2, int nbPersonnes, float note, boolean wifi, boolean clim, boolean animaux, boolean parking, boolean fumeur, boolean cheminer, boolean localSki, float distance_piste, int nbChambres, int nbSDB, String image) {
        super(id, nom, prix, lieu, distanceCentre, m2, nbPersonnes, note, wifi, clim, animaux, parking, fumeur,image);
        this.cheminer = cheminer;
        this.localSki = localSki;
        this.distance_piste = distance_piste;
        this.nbChambres = nbChambres;
        this.nbSDB = nbSDB;
    }

    public ArrayList<Integer> satisfaitFiltreChalet(ArrayList<Boolean> listeBool) {
        int variableC = 0;
        ArrayList<Integer> visuChalet =new ArrayList<>();
        int prixC = 0;
        int etoilesC=0;
        int noteC=0;
        int nb_boolC = 0;
        int verifC=0;

        for (int i = 0; i < listeBool.size(); i++) {
            if (listeBool.get(i) == true && i == 4 && this.getPrix() < 150) {
                prixC=0;
                variableC++;
            }
            if (listeBool.get(i) == true && i == 5 && this.getPrix() > 150 && this.getPrix() < 300) {
                prixC=1;
                variableC++;
            }
            if (listeBool.get(i) == true && i == 6 && this.getPrix() > 300) {
                prixC=2;
                variableC++;
            }
            if (listeBool.get(i) == true && i == 11 && this.getNote() < 8) {
                noteC=0;
                variableC++;
            }
            if (listeBool.get(i) == true && i == 12 && this.getNote() > 8) {
                noteC=1;
                variableC++;
            }
            if (listeBool.get(i) == true && i == 14 && this.isWifi() == true) {
                variableC++;
            }
            if (listeBool.get(i) == true && i == 15 && this.isClim() == true) {
                variableC++;
            }
            if (listeBool.get(i) == true && i == 16 && this.isFumeur() == true) {
                variableC++;
            }
            if (listeBool.get(i) == true && i == 17 && this.isAnimaux() == true) {
                variableC++;
            }
            if (listeBool.get(i) == true && i == 18 && this.isParking() == true) {
                variableC++;
            }
            if (listeBool.get(i) == true && i == 19 && this.isLocalSki() == true) {
                variableC++;
            }
            if (listeBool.get(i) == true && i == 20 && this.isCheminer() == true) {
                variableC++;
            }
        }
        for(int j=4;j<listeBool.size();j++)
        {
            if(listeBool.get(j)==true){
                nb_boolC++;
            }
        }
        if(nb_boolC<=variableC) {
            verifC = 1;
        }
        visuChalet.add(verifC);
        visuChalet.add(prixC);
        visuChalet.add(etoilesC);
        visuChalet.add(noteC);
        return visuChalet;
    }
}
