package classes;

public class Logement extends Hebergement{
    protected boolean wifi;
    protected boolean clim;
    protected boolean animaux;
    protected boolean parking;

    public boolean getWifi() {
        return wifi;
    }
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
    public boolean getClim() {
        return clim;
    }
    public void setClim(boolean clim) {
        this.clim = clim;
    }
    public boolean getAnimaux() {
        return animaux;
    }
    public void setAnimaux(boolean animaux) {
        this.animaux = animaux;
    }
    public boolean getParking() {
        return parking;
    }
    public void setParking(boolean parking) {
        this.parking = parking;
    }
    public Logement() {
    }

}
