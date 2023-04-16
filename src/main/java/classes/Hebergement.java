package classes;
import java.util.ArrayList;
import java.util.Scanner;

public class  Hebergement {

    protected int id;
    protected String nom;
    protected int prix;
    protected String lieu;
    protected float distanceCentre;
    protected int m2;
    protected int nbPersonnes;
    protected float note;
    protected boolean wifi;
    protected boolean clim;
    protected boolean animaux;
    protected boolean parking;
    protected boolean fumeur;
    private String image;

    public String getImage() {
        return image;
    }

    public Hebergement() {
    }

    public Hebergement(int id, String nom, int prix, String lieu, float distanceCentre, int m2, int nbPersonnes, float note, boolean wifi, boolean clim, boolean animaux, boolean parking, boolean fumeur, String image) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.lieu = lieu;
        this.distanceCentre = distanceCentre;
        this.m2 = m2;
        this.nbPersonnes = nbPersonnes;
        this.note = note;
        this.wifi = wifi;
        this.clim = clim;
        this.animaux = animaux;
        this.parking = parking;
        this.fumeur = fumeur;
        this.image = image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public float getDistanceCentre() {
        return distanceCentre;
    }

    public void setDistanceCentre(float distanceCentre) {
        this.distanceCentre = distanceCentre;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public int getNbPersonnes() {
        return nbPersonnes;
    }

    public void setNbPersonnes(int nbPersonnes) {
        this.nbPersonnes = nbPersonnes;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isClim() {
        return clim;
    }

    public void setClim(boolean clim) {
        this.clim = clim;
    }

    public boolean isAnimaux() {
        return animaux;
    }

    public void setAnimaux(boolean animaux) {
        this.animaux = animaux;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public boolean isFumeur() {
        return fumeur;
    }

    public void setFumeur(boolean fumeur) {
        this.fumeur = fumeur;
    }

    /*public boolean satisfaitFiltres(ArrayList<Boolean> listeBool){
        boolean satisfactionFinale=false;

        for(int i=0;i<listeBool.size();i++){
            {
                satisfactionFinale=sat



            }
            if(listeBool.get(i)==true && i==0 && this instanceof Villa){
                if(listeBool.get(i)==true && i==0 && this.getPrix()<150)
                    if
            }

        }
        return satisfactionFinale;
    }*/
}
