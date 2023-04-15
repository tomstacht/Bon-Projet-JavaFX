package classes;

public class Villa extends Logement{
    private boolean piscine;
    private int distance_mer;
    public boolean getPiscine() {
        return piscine;
    }
    public void setPiscine(boolean piscine) {
        this.piscine = piscine;
    }
    public int getDistance_mer() {
        return distance_mer;
    }
    public void setDistance_mer(int distance_mer) {
        this.distance_mer = distance_mer;
    }
    public Villa() {
    }

}
