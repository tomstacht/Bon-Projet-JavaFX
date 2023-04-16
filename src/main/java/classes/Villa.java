package classes;

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

    public Villa() {

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
}
