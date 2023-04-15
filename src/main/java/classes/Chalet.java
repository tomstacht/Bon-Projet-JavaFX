package classes;

public class Chalet extends Hebergement{

    private boolean cheminer;
    private boolean localSki;
    private float distance_piste;
    private int nbChambres;
    private int nbSDB;

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

    public Chalet(int id, String nom, int prix, String lieu, float distanceCentre, int m2, int nbPersonnes, float note, boolean wifi, boolean clim, boolean animaux, boolean parking, boolean fumeur, boolean cheminer, boolean localSki, float distance_piste, int nbChambres, int nbSDB) {
        super(id, nom, prix, lieu, distanceCentre, m2, nbPersonnes, note, wifi, clim, animaux, parking, fumeur);
        this.cheminer = cheminer;
        this.localSki = localSki;
        this.distance_piste = distance_piste;
        this.nbChambres = nbChambres;
        this.nbSDB = nbSDB;
    }
}
