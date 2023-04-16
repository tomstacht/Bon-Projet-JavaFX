package classes;

public class Client {
    private String Prenom;
    private String Nom;
    private String Email;
    private String Pseudo;
    private String Password;

    public Client(String prenom, String nom, String email, String pseudo, String password) {
        Prenom = prenom;
        Nom = nom;
        Email = email;
        Pseudo = pseudo;
        Password = password;
    }

    public Client() {

    }

    public String getPrenom() {
        return Prenom;
    }
    public void setPrenom(String prenom) {
        Prenom = prenom;
    }
    public String getNom() {
        return Nom;
    }
    public void setNom(String nom) {
        Nom = nom;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getPseudo() {
        return Pseudo;
    }
    public void setPseudo(String pseudo) {
        Pseudo = pseudo;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
}
