package classes;

public class Administrateur {
    private String Login;
    private String MotDePasse;

    public Administrateur(String login, String motDePasse) {
        Login = login;
        MotDePasse = motDePasse;
    }
    public Administrateur() {
    }
    public String getLogin() {
        return Login;
    }
    public String getMotDePasse() {
        return MotDePasse;
    }
    public void setLogin(String login) {
        Login = login;
    }
    public void setMotDePasse(String motDePasse) {
        MotDePasse = motDePasse;
    }
}
