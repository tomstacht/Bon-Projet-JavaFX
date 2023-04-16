package classes;

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
}
