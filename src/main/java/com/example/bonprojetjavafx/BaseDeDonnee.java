package com.example.bonprojetjavafx;
import java.sql.*;
import java.util.*;
public class BaseDeDonnee {
    String type_Logement;

    ArrayList<String> searchHotel = new ArrayList<>();
    ArrayList<String> searchVilla = new ArrayList<>();
    ArrayList<String> searchAppart = new ArrayList<>();
    ArrayList<String> searchChalet = new ArrayList<>();


    public void ajouterTable() {
        String url = "jdbc:mysql://localhost:8889/bdd";
        String user = "root";
        String password = "root";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            Statement stmt = conn.createStatement();
            Scanner sc = new Scanner(System.in);

            System.out.println("Saisissez le nom de la nouvelle table : ");
            String titre = sc.nextLine();

            System.out.print("Saisissez le nombre de colonnes de la nouvelle table : ");
            int nbColonnes = sc.nextInt();
            sc.nextLine();

            String sql = "CREATE TABLE " + titre + " (";
            for (int i = 0; i < nbColonnes; i++) {
                System.out.print("Saisissez le titre de la colonne " + (i + 1) + " : ");

                if (i != 0)
                    sc.nextLine();

                String titreColonne = sc.nextLine();
                System.out.println("Quel est le type de donnée que vous allez stocker ? ");
                System.out.println("1. Booléen");
                System.out.println("2. Entier");
                System.out.println("3. Réel");
                System.out.println("4. Chaine de caractères");
                int choix = sc.nextInt();

                switch (choix) {
                    case 1:
                        sql += titreColonne + " " + "BOOLEAN" + ",";
                        break;

                    case 2:
                        sql += titreColonne + " " + "INT" + ",";
                        break;

                    case 3:
                        sql += titreColonne + " " + "FLOAT" + ",";
                        break;

                    case 4:
                        sql += titreColonne + " " + "VARCHAR(50)" + ",";
                        break;
                }
            }
            sql = sql.substring(0, sql.length() - 1) + ")";

            stmt.executeUpdate(sql);

            System.out.println("Table créée !");

            conn.close();
        } catch (Exception e) {
            System.err.println("Exception relevée... ");
            System.err.println(e.getMessage());
        }
    }
    public void supprimerTable() {
        String url = "jdbc:mysql://localhost:3306/projet";
        String user = "root";
        String password = "root";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            Scanner sc = new Scanner(System.in);

            System.out.println("Saisissez le nom de la table à supprimer : ");
            String titre = sc.nextLine();

            String sql = "DROP TABLE " + titre + " ";
            stmt.executeUpdate(sql);

            System.out.println("Table supprimée.");

            conn.close();
        } catch (Exception e) {
            System.err.println("Exception relevée...");
            System.err.println(e.getMessage());
        }
    }
    public void ajouterLigne() {
        String url = "jdbc:mysql://localhost:3306/projet ";
        String user = "root";
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            Scanner sc = new Scanner(System.in);
            String query = "INSERT INTO villa (piscine, distanceMer, prix) VALUES (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);

            System.out.println("Quel est le type de logement que vous allez creer ? ");
            System.out.println("1. Hotel");
            System.out.println("2. Appartement");
            System.out.println("3. Chalet");
            System.out.println("4. Villa");
            System.out.println("5. Maison");
            int choix = sc.nextInt();

            switch (choix) {
                case 1:

                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    System.out.println("Vous avez choisi d'ajouter une Villa");
                    System.out.println("Saisir true si il y a une piscine / false si il n'y en a pas");
                    boolean piscine = sc.nextBoolean();
                    System.out.println("Saisir la distance de la mer (int)");
                    int distanceMer = sc.nextInt();
                    System.out.println("Saisir le prix (float)");
                    float prix = sc.nextFloat();
                    statement.setBoolean(1, piscine);
                    statement.setInt(2, distanceMer);
                    statement.setFloat(3, prix);
                    statement.executeUpdate();
                    break;
            }
            System.out.println("ligne ajouter.");
            conn.close();
        } catch (Exception e) {
            System.err.println("Exception relevée...");
            System.err.println(e.getMessage());
        }
    }
    public void rechercheFiltre(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ou souhaitez-vous aller ?");
        String ville = sc.nextLine();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/proyecto", "root", "root");
            //lire un élément de la bdd
            Statement stHotel = con.createStatement();
            ResultSet resHotel = stHotel.executeQuery("select * from Hotel");

            Statement stVilla = con.createStatement();
            ResultSet resVilla = stVilla.executeQuery("select * from Villa");

            Statement stAppart = con.createStatement();
            ResultSet resAppart = stAppart.executeQuery("select * from Appartement");

            Statement stChalet = con.createStatement();
            ResultSet resChalet = stChalet.executeQuery("select * from Chalet");

            //ajouter un élément dans la bdd
            //String query = "INSERT INTO Hotel (pays, ville, nom_hotel, nb_etoile) values ('usa','nyc','manhattan','5')";
            //PreparedStatement statement = con.prepareStatement(query);
            //statement.executeUpdate();


            //lire un élément de la bdd
            while(resHotel.next()){
                //System.out.println("Pays : " + resHotel.getString("pays"));
                if (resHotel.getString("Lieu").compareTo(ville)==0){
                    searchHotel.add(resHotel.getString("Nom"));
                }
                /*if (resHotel.getString("Nom").compareTo("...")==0){
                    searchHotel.add(resHotel.getString("Nom"));
                }
                if (resHotel.getString("NB_Etoile") == ...){
                    searchHotel.add(resHotel.getString("Nom"));
                }
                if (resHotel.getString("Petit-Dej") == ...){
                    searchHotel.add(resHotel.getString("Nom"));
                }
                if (resHotel.getString("Restaurant") == ...){
                    searchHotel.add(resHotel.getString("Nom"));
                }
                if (resHotel.getString("Type_Lit") == ...){
                    searchHotel.add(resHotel.getString("Nom"));
                }
                if (resHotel.getString("Marque").compareTo("...")==0){
                    searchHotel.add(resHotel.getString("Nom"));
                }
                if (resHotel.getString("NB_Pers") == ...){
                    searchHotel.add(resHotel.getString("Nom"));
                }
                if (resHotel.getString("Note_Client") == ...){
                    searchHotel.add(resHotel.getString("Nom"));
                }*/
            }

            while(resVilla.next()){
                //System.out.println("Pays : " + resHotel.getString("pays"));
                if (resVilla.getString("Lieu").compareTo(ville)==0){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                /*if (resVilla.getString("Nom").compareTo(...)==0){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                if (resVilla.getString("Prix") == ...){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                if (resVilla.getString("Piscine") == ...){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                if (resVilla.getString("NB_Chambre") == ...){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                if (resVilla.getString("NB_SDB") == ...){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                if (resVilla.getString("NB_Personne") == ...){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                if (resVilla.getString("Note_Client") == ...){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                if (resVilla.getString("Wifi") == ...){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                if (resVilla.getString("Climatisation") == ...){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                if (resVilla.getString("Fumeur") == ...){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                if (resVilla.getString("Animaux") == ...){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                if (resVilla.getString("Parking") == ...){
                    searchVilla.add(resVilla.getString("Nom"));
                }*/

            }

            while(resAppart.next()){
                //System.out.println("Pays : " + resHotel.getString("pays"));
                if (resAppart.getString("Lieu").compareTo(ville)==0){
                    searchAppart.add(resAppart.getString("Nom"));
                }
                /*if (resAppart.getString("Nom").compareTo(...)==0){
                    searchAppart.add(resAppart.getString("Nom"));
                }
                if (resAppart.getString("Prix") == ...){
                    searchAppart.add(resAppart.getString("Nom"));
                }
                if (resAppart.getString("NB_Chambre") == ...){
                    searchAppart.add(resAppart.getString("Nom"));
                }
                if (resAppart.getString("NB_SDB") == ...){
                    searchAppart.add(resAppart.getString("Nom"));
                }
                if (resAppart.getString("NB_Personne") == ...){
                    searchAppart.add(resAppart.getString("Nom"));
                }
                if (resAppart.getString("Note_Client") == ...){
                    searchAppart.add(resAppart.getString("Nom"));
                }
                if (resAppart.getString("Wifi") == ...){
                    searchAppart.add(resAppart.getString("Nom"));
                }
                if (resAppart.getString("Climatisation") == ...){
                    searchAppart.add(resAppart.getString("Nom"));
                }
                if (resAppart.getString("Fumeur") == ...){
                    searchAppart.add(resAppart.getString("Nom"));
                }
                if (resAppart.getString("Animaux") == ...){
                    searchAppart.add(resAppart.getString("Nom"));
                }
                if (resAppart.getString("Parking") == ...){
                    searchAppart.add(resAppart.getString("Nom"));
                }*/
            }

            while(resChalet.next()){
                //System.out.println("Pays : " + resHotel.getString("pays"));
                if (resChalet.getString("Lieu").compareTo(ville)==0){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                /*if (resChalet.getString("Nom").compareTo(ville)==0){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("Prix") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("Local_Ski") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("Cheminer") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("D_Chalet-Piste") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("NB_Chambre") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("NB_SDB") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("NB_Personne") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("Note_Client") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("Wifi") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("Climatisation") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("Fumeur") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("Animaux") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("Parking") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }*/
            }

            con.close();

        } catch (Exception e){
            System.out.println("Error :" + e.getMessage());
        }
        System.out.println("C3");

        System.out.println("Voici les hotels présents à "+ville+ " : ");
        for (String s : searchHotel) {
            System.out.println(s);
        }

        System.out.println("Voici les villas présentes à "+ville+ " : ");
        for (String s : searchVilla) {
            System.out.println(s);
        }

        System.out.println("Voici les appartements présents à "+ville+ " : ");
        for (String s : searchAppart) {
            System.out.println(s);
        }

        System.out.println("Voici les chalets présents à "+ville+ " : ");
        for (String s : searchChalet) {
            System.out.println(s);
        }

    }
    public void InscriptionClient(){

        String url = "jdbc:mysql://localhost/proyecto ";
        String user = "root";
        String password = "root";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            Scanner sc = new Scanner(System.in);
            String query = "INSERT INTO Connexion_Client (Prenom, Nom, Email, Pseudo, Password) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);

            System.out.println("Quel est votre prénom ?");
            String prenom = sc.nextLine();
            System.out.println("Quel est votre nom ?");
            String nom = sc.nextLine();
            System.out.println("Quel est votre adresse mail ?");
            String email = sc.nextLine();
            System.out.println("Quel est votre pseudo ?");
            String pseudo = sc.nextLine();
            System.out.println("Quel est votre mot de passe ?");
            String mdp = sc.nextLine();

            statement.setString(1, prenom);
            statement.setString(2, nom);
            statement.setString(3, email);
            statement.setString(4, pseudo);
            statement.setString(5, mdp);

            statement.executeUpdate();


            System.out.println("ligne ajouter.");
            conn.close();
        } catch (Exception e) {
            System.err.println("Exception relevée...");
            System.err.println(e.getMessage());
        }
    }
    public void Connexion_Client() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir votre adresse mail ou votre pseudo : ");
        String identification = sc.nextLine();
        System.out.println("Veuillez saisir votre mot de passe : ");
        String mdp = sc.nextLine();


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/proyecto", "root", "root");
            //lire un élément de la bdd
            Statement stConnexion = con.createStatement();
            ResultSet resConnexion = stConnexion.executeQuery("select * from Connexion_Client");

            //lire un élément de la bdd
            while(resConnexion.next()){
                //System.out.println("Pays : " + resHotel.getString("pays"));
                if ((resConnexion.getString("Email").compareTo(identification)==0) || (resConnexion.getString("Pseudo").compareTo(identification)==0) && (resConnexion.getString("Password").compareTo(mdp)==0)){
                    System.out.println("Bienvenue sur votre compte client " + resConnexion.getString("Prenom") + " " + resConnexion.getString("Nom") + " !!!");
                }
                else {
                    System.out.println("Vous n'avez pas encore de compte, je vous invite à en créer un :)");
                }
            }
            con.close();

        } catch (Exception e){
            System.out.println("Error :" + e.getMessage());
        }

    }

}

