package classes;

import java.util.ArrayList;

public class Appartement extends Hebergement{
    private int etage;
    private boolean balcon;
    private int nbChambres;
    private int nbSDB;

    public Appartement() {

    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public boolean isBalcon() {
        return balcon;
    }

    public void setBalcon(boolean balcon) {
        this.balcon = balcon;
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

    public Appartement(int id, String nom, int prix, String lieu, float distanceCentre, int m2, int nbPersonnes, float note, boolean wifi, boolean clim, boolean animaux, boolean parking, boolean fumeur, int etage, boolean balcon, int nbChambres, int nbSDB) {
        super(id, nom, prix, lieu, distanceCentre, m2, nbPersonnes, note, wifi, clim, animaux, parking, fumeur);
        this.etage = etage;
        this.balcon = balcon;
        this.nbChambres = nbChambres;
        this.nbSDB = nbSDB;
    }

    public ArrayList<Integer> satisfaitFiltreAppart(ArrayList<Boolean> listeBool) {
        int variableA = 0;
        ArrayList<Integer> visuVilla =new ArrayList<>();
        int prixA = 0;
        int etoilesA=0;
        int noteA=0;
        int nb_boolA = 0;
        int verifA=0;

        for (int i = 0; i < listeBool.size(); i++) {
            if (listeBool.get(i) == true && i == 4 && this.getPrix() < 150) {
                prixA=0;
                variableA++;
            }
            if (listeBool.get(i) == true && i == 5 && this.getPrix() > 150 && this.getPrix() < 300) {
                prixA=1;
                variableA++;
            }
            if (listeBool.get(i) == true && i == 6 && this.getPrix() > 300) {
                prixA=2;
                variableA++;
            }
            if (listeBool.get(i) == true && i == 11 && this.getNote() < 8) {
                noteA=0;
                variableA++;
            }
            if (listeBool.get(i) == true && i == 12 && this.getNote() > 8) {
                noteA=1;
                variableA++;
            }
            if (listeBool.get(i) == true && i == 14 && this.isWifi() == true) {
                variableA++;
            }
            if (listeBool.get(i) == true && i == 15 && this.isClim() == true) {
                variableA++;
            }
            if (listeBool.get(i) == true && i == 16 && this.isFumeur() == true) {
                variableA++;
            }
            if (listeBool.get(i) == true && i == 17 && this.isAnimaux() == true) {
                variableA++;
            }
            if (listeBool.get(i) == true && i == 18 && this.isParking() == true) {
                variableA++;
            }
        }
        for(int j=4;j<listeBool.size();j++)
        {
            if(listeBool.get(j)==true){
                nb_boolA++;
            }
        }
        if(nb_boolA<=variableA) {
            verifA = 1;
        }
        visuVilla.add(verifA);
        visuVilla.add(prixA);
        visuVilla.add(etoilesA);
        visuVilla.add(noteA);
        return visuVilla;
    }
}
