package com.example.bonprojetjavafx;
import java.sql.*;
import java.util.*;
import classes.*;
public class BaseDeDonnee {
    String type_Logement;

    ArrayList<Hebergement> listeHebergements = new ArrayList<Hebergement>();
    ArrayList<Appartement> listeAppart = new ArrayList<Appartement>();
    ArrayList<Chalet> listeChalet = new ArrayList<Chalet>();
    ArrayList<Hotel> listeHotel = new ArrayList<Hotel>();
    ArrayList<Villa> listeVilla = new ArrayList<Villa>();

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

    public void initBdd(){
        String url = "jdbc:mysql://localhost:8889/bdd";
        String user = "root";
        String password = "root";

        try{
            Connection conn = DriverManager.getConnection(url, user, password);

            Statement stmtAppart = conn.createStatement();
            ResultSet rsAppart = stmtAppart.executeQuery("SELECT * FROM Appartement");
            while(rsAppart.next()){
                int id=rsAppart.getInt("ID");
                String nom=rsAppart.getString("Nom");
                int prix=rsAppart.getInt("Prix");
                String lieu=rsAppart.getString("Lieu");
                int numEtage=rsAppart.getInt("Num_Etage");
                boolean balcon=rsAppart.getBoolean("Balcon");
                float distanceAppartCentre=rsAppart.getFloat("D_Appart-Centre");
                int nbChambre=rsAppart.getInt("NB_Chambre");
                int nbSdb=rsAppart.getInt("NB_SDB");
                int nbM2=rsAppart.getInt("NB_M2");
                int nbPers=rsAppart.getInt("NB_Personne");
                float noteClient=rsAppart.getFloat("Note_Client");
                boolean wifi=rsAppart.getBoolean("Wifi");
                boolean clim=rsAppart.getBoolean("Climatisation");
                boolean fumeur=rsAppart.getBoolean("Fumeur");
                boolean animaux=rsAppart.getBoolean("Animaux");
                boolean parking=rsAppart.getBoolean("Parking");
                listeAppart.add(new Appartement(id, nom, prix, lieu, distanceAppartCentre, nbM2, nbPers, noteClient, wifi, clim, animaux, parking, fumeur, numEtage, balcon, nbChambre, nbSdb));
            }

            Statement stmtChalet = conn.createStatement();
            ResultSet rsChalet = stmtChalet.executeQuery("SELECT * FROM Chalet");
            while(rsChalet.next()){
                int id=rsChalet.getInt("ID");
                String nom=rsChalet.getString("Nom");
                int prix=rsChalet.getInt("Prix");
                String lieu=rsChalet.getString("Lieu");
                boolean localSki=rsChalet.getBoolean("Local_Ski");
                boolean cheminee=rsChalet.getBoolean("Cheminer");
                float distanceChaletPiste=rsChalet.getFloat("D_Chalet-Piste");
                float distanceChaletCentre=rsChalet.getFloat("D_Chalet-Centre");
                int nbChambres=rsChalet.getInt("NB_CHAMBRE");
                int nbSDB=rsChalet.getInt("NB_SDB");
                int nbM2=rsChalet.getInt("NB_M2");
                int nbPers=rsChalet.getInt("NB_Personne");
                float noteClient=rsChalet.getFloat("Note_Client");
                boolean wifi=rsChalet.getBoolean("Wifi");
                boolean clim=rsChalet.getBoolean("Climatisation");
                boolean fumeur=rsChalet.getBoolean("Fumeur");
                boolean animaux=rsChalet.getBoolean("Animaux");
                boolean parking=rsChalet.getBoolean("Parking");
                listeChalet.add(new Chalet(id, nom, prix, lieu, distanceChaletCentre, nbM2, nbPers, noteClient, wifi, clim, animaux, parking, fumeur, cheminee, localSki, distanceChaletPiste, nbChambres, nbSDB));
            }

            Statement stmtHotel = conn.createStatement();
            ResultSet rsHotel = stmtHotel.executeQuery("SELECT * FROM Hotel");
            while(rsHotel.next()){
                int id=rsHotel.getInt("ID");
                String nom=rsHotel.getString("Nom");
                int prix=rsHotel.getInt("Prix");
                String lieu=rsHotel.getString("Lieu");
                int nbEtoile=rsHotel.getInt("NB_Etoile");
                boolean petitDej=rsHotel.getBoolean("Petit-Dej");
                boolean restaurant=rsHotel.getBoolean("Restaurant");
                String companie=rsHotel.getString("Marque");
                float distanceHotelCentre=rsHotel.getFloat("D_Hotel-Centre");
                int nbM2=rsHotel.getInt("NB_M2");
                int nbPers=rsHotel.getInt("NB_Pers");
                float noteClient=rsHotel.getFloat("Note_Client");
                boolean wifi=rsHotel.getBoolean("WIFI");
                boolean clim=rsHotel.getBoolean("Clim");
                boolean animaux=rsHotel.getBoolean("Animaux");
                boolean parking=rsHotel.getBoolean("Parking");
                boolean fumeur=rsHotel.getBoolean("Fumeur");
                listeHotel.add(new Hotel(id, nom, prix, lieu, distanceHotelCentre, nbM2, nbPers, noteClient, wifi, clim, animaux, parking, fumeur, nbEtoile, petitDej, restaurant, companie));
            }

            Statement stmtVilla = conn.createStatement();
            ResultSet rsVilla = stmtVilla.executeQuery("SELECT * FROM Villa");
            while(rsVilla.next()){
                int id=rsVilla.getInt("ID");
                String nom=rsVilla.getString("Nom");
                int prix=rsVilla.getInt("Prix");
                String lieu=rsVilla.getString("Lieu");
                boolean piscine=rsVilla.getBoolean("Piscine");
                float distanceVillaMer=rsVilla.getFloat("D_Villa-Mer");
                float distanceVillaCentre=rsVilla.getFloat("D_Villa-Centre");
                int nbChambres=rsVilla.getInt("NB_CHAMBRE");
                int nbSDB=rsVilla.getInt("NB_SDB");
                int nbM2=rsVilla.getInt("NB_M2");
                int nbPers=rsVilla.getInt("NB_Personne");
                float noteClient=rsVilla.getFloat("Note_Client");
                boolean wifi=rsVilla.getBoolean("Wifi");
                boolean clim=rsVilla.getBoolean("Climatisation");
                boolean fumeur=rsVilla.getBoolean("Fumeur");
                boolean animaux=rsVilla.getBoolean("Animaux");
                boolean parking=rsVilla.getBoolean("Parking");
                listeVilla.add(new Villa(id, nom, prix, lieu, distanceVillaCentre, nbM2, nbPers, noteClient, wifi, clim, animaux, parking, fumeur, piscine, distanceVillaMer, nbChambres, nbSDB));
            }

            listeHebergements.addAll(listeHotel);
            listeHebergements.addAll(listeAppart);
            listeHebergements.addAll(listeChalet);
            listeHebergements.addAll(listeVilla);

        } catch (Exception e) {
            System.err.println("Exception relevée...");
            System.err.println(e.getMessage());
        }
    }
    public void ajouterLigne() {
        String url = "jdbc:mysql://localhost:8889/bdd";
        String user = "root";
        String password = "root";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            int choix=0;

            // if click sur ajout hotel, choix=1, click sur ajout appart, choix=2...

            switch (choix) {
                case 1:
                    String queryH = "INSERT INTO Hotel (ID, Nom, Prix, Lieu, NB_Etoile, Petit-Dej, Restaurant, Marque, D_Hotel-Centre, NB_CHAMBRE, NB_SDB, NB_M2, NB_Pers, Note_Client) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement statementH = conn.prepareStatement(queryH);
                    //remplissage
                    statementH.executeUpdate();
                    break;

                case 2:
                    String queryA = "INSERT INTO Appartement (ID, Nom, Prix, Lieu, Num_Etage, Balcon, D_Appart-Centre, NB_Chambre, NB_SDB, NB_M2, NB_Personne, Note_Client, Wifi, Climatisation, Fumeur, Animaux, Parking) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement statementA = conn.prepareStatement(queryA);
                    //remplissage
                    statementA.executeUpdate();
                    break;

                case 3:
                    String queryC = "INSERT INTO Chalet (ID, Nom, Prix, Lieu, Local_Ski, Cheminer, D_Chalet-Piste, D_Chalet-Centre, NB_CHAMBRE, NB_SDB, NB_M2, NB_Personne, Note_Client, Wifi, Climatisation, Fumeur, Animaux, Parking) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement statementC = conn.prepareStatement(queryC);
                    //remplissage
                    statementC.executeUpdate();
                    break;

                case 4:
                    String queryV = "INSERT INTO Villa (ID, Nom, Prix, Lieu, Piscine, D_Villa-Mer, D_Villa-Centre, NB_CHAMBRE, NB_SDB, NB_M2, NB_Personne, Note_Client, Wifi, Climatisation, Fumeur, Animaux, Parking) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement statementV = conn.prepareStatement(queryV);
                    //remplissage
                    statementV.executeUpdate();
                    break;
            }
            System.out.println("Hébergement ajouté.");
            conn.close();
        } catch (Exception e) {
            System.err.println("Exception relevée...");
            System.err.println(e.getMessage());
        }
    }
    public void filtrageBox(ArrayList<Boolean> listeBool){
        ArrayList<Hebergement> listeFiltre = new ArrayList<>();
        listeFiltre.clear();
        listeFiltre.addAll(listeHebergements);

        for(int i=0;i<listeBool.size();i++){
            if(listeBool.get(0)==false){
                for(int j=0;j<listeFiltre.size();j++){
                    if(listeFiltre.get(j) instanceof Hotel){
                        listeFiltre.remove(listeFiltre.get(j));
                    }
                }
            }
            if(listeBool.get(1)==false){
                for(int j=0;j<listeFiltre.size();j++){
                    if(listeFiltre.get(j) instanceof Villa){
                        listeFiltre.remove(listeFiltre.get(j));
                    }
                }
            }
            if(listeBool.get(2)==false){
                for(int j=0;j<listeFiltre.size();j++){
                    if(listeFiltre.get(j) instanceof Chalet){
                        listeFiltre.remove(listeFiltre.get(j));
                    }
                }
            }
            if(listeBool.get(3)==false){
                for(int j=0;j<listeFiltre.size();j++){
                    if(listeFiltre.get(j) instanceof Appartement){
                        listeFiltre.remove(listeFiltre.get(j));
                    }
                }
            }/*
            if(listeBool.get(5)==false){
                for(int j=0;j<listeFiltre.size();j++){
                    if(listeFiltre.get(j).getPrix()<150){
                        listeFiltre.remove(listeFiltre.get(j));
                    }
                }
            }
            if(listeBool.get(6)==false){
                for(int j=0;j<listeFiltre.size();j++){
                    if(listeFiltre.get(j).getPrix()<300 && listeFiltre.get(j).getPrix()>150){
                        listeFiltre.remove(listeFiltre.get(j));
                    }
                }
            }
            if(listeBool.get(7)==false){
                for(int j=0;j<listeFiltre.size();j++){
                    if(listeFiltre.get(j).getPrix()>300){
                        listeFiltre.remove(listeFiltre.get(j));
                    }
                }
            }*/

        }

        /*for(Hebergement item: listeFiltre)
        {
            System.out.println("Aziz");
            if(listeBool.get(0)==false && (item instanceof Hotel))
            {
                System.out.println("hotel supprime");
                //listeFiltre.remove(item);
            }else if(listeBool.get(1)==false && (item instanceof Villa))
            {
                System.out.println("villa suprimee");
                //listeFiltre.remove(item);
            }
        }*/

        for(int k=0;k<listeFiltre.size();k++)
        {
            System.out.println("kader");
            System.out.println(listeFiltre.get(k).getNom()+"/");
        }
        System.out.println(listeFiltre.size());


    }
    public void InscriptionClient(String firstname,String lastname,String username, String email, String wordtopass){

        String url = "jdbc:mysql://localhost/projet ";
        String user = "root";
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            Scanner sc = new Scanner(System.in);
            String query = "INSERT INTO Connexion_Client (Prenom, Nom, Email, Pseudo, Password) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);

            /*System.out.println("Quel est votre prénom ?");
            String prenom = sc.nextLine();
            System.out.println("Quel est votre nom ?");
            String nom = sc.nextLine();
            System.out.println("Quel est votre adresse mail ?");
            String email = sc.nextLine();
            System.out.println("Quel est votre pseudo ?");
            String pseudo = sc.nextLine();
            System.out.println("Quel est votre mot de passe ?");
            String mdp = sc.nextLine();*/

            statement.setString(1, firstname);
            statement.setString(2, lastname);
            statement.setString(3, email);
            statement.setString(4, username);
            statement.setString(5, wordtopass);

            statement.executeUpdate();


            System.out.println("ligne ajouter.");
            conn.close();
        } catch (Exception e) {
            System.err.println("Exception relevée...");
            System.err.println(e.getMessage());
        }
    }
    public boolean Connexion_Client(String identification,String mdp) {

        boolean verif=false;
        Scanner sc = new Scanner(System.in);
        System.out.println(identification);
        System.out.println(mdp);

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/projet", "root", "");
            //lire un élément de la bdd
            Statement stConnexion = con.createStatement();
            ResultSet resConnexion = stConnexion.executeQuery("select * from Connexion_Client");

            //lire un élément de la bdd
            while(resConnexion.next()){
                //System.out.println("Pays : " + resHotel.getString("pays"));
                if ((resConnexion.getString("Email").compareTo(identification)==0) || (resConnexion.getString("Pseudo").compareTo(identification)==0) && (resConnexion.getString("Password").compareTo(mdp)==0)){
                    //System.out.println("Bienvenue sur votre compte client " + resConnexion.getString("Prenom") + " " + resConnexion.getString("Nom") + " !!!");
                    verif=true;
                }
                else {
                    verif=false;
                }
            }
            con.close();

        } catch (Exception e){
            System.out.println("Error :" + e.getMessage());
        }
        return verif;
    }
}

