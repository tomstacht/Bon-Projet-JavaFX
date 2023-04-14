package classes;

public class Appartement extends Logement{
    private int etage;
    private boolean balcon;
    public int getEtage() {
        return etage;
    }
    public void setEtage(int etage) {
        this.etage = etage;
    }
    public boolean getBalcon() {
        return balcon;
    }
    public void setBalcon(boolean balcon) {
        this.balcon = balcon;
    }
    public Appartement() {
    }
}
