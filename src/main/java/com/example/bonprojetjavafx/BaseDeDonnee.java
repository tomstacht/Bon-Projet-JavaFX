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
        String url = "jdbc:mysql://localhost:8889/projet";
        String user = "root";
        String password = "";
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

    public void initHebergements(){
        String url = "jdbc:mysql://localhost:8889/bdd";
        String user = "root";
        String password = "root";

        try{
            Connection conn = DriverManager.getConnection(url, user, password);

            Statement stmtAppart = conn.createStatement();
            ResultSet rsAppart = stmtAppart.executeQuery("SELECT * FROM Appartement");
            while(rsAppart.next()){
                int idAppart=rsAppart.getInt("ID");
                String nomAppart=rsAppart.getString("Nom");
                int prixAppart=rsAppart.getInt("Prix");
                String lieuAppart=rsAppart.getString("Lieu");
                int numEtageAppart=rsAppart.getInt("Num_Etage");
                boolean balconAppart=rsAppart.getBoolean("Balcon");
                float distanceAppartCentreAppart=rsAppart.getFloat("D_Appart-Centre");
                int nbChambreAppart=rsAppart.getInt("NB_Chambre");
                int nbSdbAppart=rsAppart.getInt("NB_SDB");
                int nbM2Appart=rsAppart.getInt("NB_M2");
                int nbPersAppart=rsAppart.getInt("NB_Personne");
                float noteClientAppart=rsAppart.getFloat("Note_Client");
                boolean wifiAppart=rsAppart.getBoolean("Wifi");
                boolean climAppart=rsAppart.getBoolean("Climatisation");
                boolean fumeurAppart=rsAppart.getBoolean("Fumeur");
                boolean animauxAppart=rsAppart.getBoolean("Animaux");
                boolean parkingAppart=rsAppart.getBoolean("Parking");
                listeAppart.add(new Appartement(idAppart, nomAppart, prixAppart, lieuAppart, distanceAppartCentreAppart, nbM2Appart, nbPersAppart, noteClientAppart, wifiAppart, climAppart, animauxAppart, parkingAppart, fumeurAppart, numEtageAppart, balconAppart, nbChambreAppart, nbSdbAppart));
            }

            Statement stmtChalet = conn.createStatement();
            ResultSet rsChalet = stmtChalet.executeQuery("SELECT * FROM Chalet");
            while(rsChalet.next()){
                int idChalet=rsChalet.getInt("ID");
                String nomChalet=rsChalet.getString("Nom");
                int prixChalet=rsChalet.getInt("Prix");
                String lieuChalet=rsChalet.getString("Lieu");
                boolean localSkiChalet=rsChalet.getBoolean("Local_Ski");
                boolean chemineeChalet=rsChalet.getBoolean("Cheminer");
                float distanceChaletPisteChalet=rsChalet.getFloat("D_Chalet-Piste");
                float distanceChaletCentreChalet=rsChalet.getFloat("D_Chalet-Centre");
                int nbChambresChalet=rsChalet.getInt("NB_CHAMBRE");
                int nbSDBChalet=rsChalet.getInt("NB_SDB");
                int nbM2Chalet=rsChalet.getInt("NB_M2");
                int nbPersChalet=rsChalet.getInt("NB_Personne");
                float noteClientChalet=rsChalet.getFloat("Note_Client");
                boolean wifiChalet=rsChalet.getBoolean("Wifi");
                boolean climChalet=rsChalet.getBoolean("Climatisation");
                boolean fumeurChalet=rsChalet.getBoolean("Fumeur");
                boolean animauxChalet=rsChalet.getBoolean("Animaux");
                boolean parkingChalet=rsChalet.getBoolean("Parking");
                listeChalet.add(new Chalet(idChalet, nomChalet, prixChalet, lieuChalet, distanceChaletCentreChalet, nbM2Chalet, nbPersChalet, noteClientChalet, wifiChalet, climChalet, animauxChalet, parkingChalet, fumeurChalet, chemineeChalet, localSkiChalet, distanceChaletPisteChalet, nbChambresChalet, nbSDBChalet));
            }

            Statement stmtHotel = conn.createStatement();
            ResultSet rsHotel = stmtHotel.executeQuery("SELECT * FROM Hotel");
            while(rsHotel.next()){
                int idHotel=rsHotel.getInt("ID");
                String nomHotel=rsHotel.getString("Nom");
                int prixHotel=rsHotel.getInt("Prix");
                String lieuHotel=rsHotel.getString("Lieu");
                int nbEtoileHotel=rsHotel.getInt("NB_Etoile");
                boolean petitDejHotel=rsHotel.getBoolean("Petit-Dej");
                boolean restaurantHotel=rsHotel.getBoolean("Restaurant");
                String companieHotel=rsHotel.getString("Marque");
                float distanceHotelCentreHotel=rsHotel.getFloat("D_Hotel-Centre");
                int nbM2Hotel=rsHotel.getInt("NB_M2");
                int nbPersHotel=rsHotel.getInt("NB_Pers");
                float noteClientHotel=rsHotel.getFloat("Note_Client");
                boolean wifiHotel=rsHotel.getBoolean("WIFI");
                boolean climHotel=rsHotel.getBoolean("Clim");
                boolean animauxHotel=rsHotel.getBoolean("Animaux");
                boolean parkingHotel=rsHotel.getBoolean("Parking");
                boolean fumeurHotel=rsHotel.getBoolean("Fumeur");
                listeHotel.add(new Hotel(idHotel, nomHotel, prixHotel, lieuHotel, distanceHotelCentreHotel, nbM2Hotel, nbPersHotel, noteClientHotel, wifiHotel, climHotel, animauxHotel, parkingHotel, fumeurHotel, nbEtoileHotel, petitDejHotel, restaurantHotel, companieHotel));
            }

            Statement stmtVilla = conn.createStatement();
            ResultSet rsVilla = stmtVilla.executeQuery("SELECT * FROM Villa");
            while(rsVilla.next()){
                int idVilla=rsVilla.getInt("ID");
                String nomVilla=rsVilla.getString("Nom");
                int prixVilla=rsVilla.getInt("Prix");
                String lieuVilla=rsVilla.getString("Lieu");
                boolean piscineVilla=rsVilla.getBoolean("Piscine");
                float distanceVillaMerVilla=rsVilla.getFloat("D_Villa-Mer");
                float distanceVillaCentreVilla=rsVilla.getFloat("D_Villa-Centre");
                int nbChambresVilla=rsVilla.getInt("NB_CHAMBRE");
                int nbSDBVilla=rsVilla.getInt("NB_SDB");
                int nbM2Villa=rsVilla.getInt("NB_M2");
                int nbPersVilla=rsVilla.getInt("NB_Personne");
                float noteClientVilla=rsVilla.getFloat("Note_Client");
                boolean wifiVilla=rsVilla.getBoolean("Wifi");
                boolean climVilla=rsVilla.getBoolean("Climatisation");
                boolean fumeurVilla=rsVilla.getBoolean("Fumeur");
                boolean animauxVilla=rsVilla.getBoolean("Animaux");
                boolean parkingVilla=rsVilla.getBoolean("Parking");
                listeVilla.add(new Villa(idVilla, nomVilla, prixVilla, lieuVilla, distanceVillaCentreVilla, nbM2Villa, nbPersVilla, noteClientVilla, wifiVilla, climVilla, animauxVilla, parkingVilla, fumeurVilla, piscineVilla, distanceVillaMerVilla, nbChambresVilla, nbSDBVilla));
            }

            listeHebergements.clear();
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
    public void filtrageBox(ArrayList<Boolean> listeBool) {
        ArrayList<Hebergement> listeFiltre = new ArrayList<>();
        ArrayList<Integer> listeintermediaire= new ArrayList<>();

        for(Hebergement h : listeHebergements){
            for(int i=0;i<listeBool.size();i++){
                if(listeBool.get(i)==true && i==0 && h instanceof Hotel)
                {
                    listeintermediaire=((Hotel) h).satisfaitFiltreHotel(listeBool);
                    if(listeintermediaire.get(0)==1){//verif =1 dans le satistfait
                        listeFiltre.add(h);
                    }
                }
                if(listeBool.get(i)==true && i==1 && h instanceof Villa)
                {
                    listeintermediaire=((Villa) h).satisfaitFiltreVilla(listeBool);
                    if(listeintermediaire.get(0)==1){//verif =1 dans le satistfait
                        listeFiltre.add(h);
                    }
                }
                if(listeBool.get(i)==true && i==2 && h instanceof Chalet)
                {
                    listeintermediaire=((Chalet) h).satisfaitFiltreChalet(listeBool);
                    if(listeintermediaire.get(0)==1){//verif =1 dans le satistfait
                        listeFiltre.add(h);
                    }
                }
                if(listeBool.get(i)==true && i==3 && h instanceof Appartement)
                {
                    listeintermediaire=((Appartement) h).satisfaitFiltreAppart(listeBool);
                    if(listeintermediaire.get(0)==1){//verif =1 dans le satistfait
                        listeFiltre.add(h);
                    }
                }


        }
        }

        for(Hebergement elem : listeFiltre)
            System.out.println(elem.getNom());
    }
    public void InscriptionClient(String firstname,String lastname,String username, String email, String wordtopass){

        String url = "jdbc:mysql://localhost/projet ";
        String user = "root";
        String password = "";
        boolean exist=false;
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            Scanner sc = new Scanner(System.in);
            ResultSet resConnexion = stmt.executeQuery("select * from Connexion_Client");

            //lire un élément de la bdd
            while(resConnexion.next()){
                if ((resConnexion.getString("Email").compareTo(email)==0) || (resConnexion.getString("Pseudo").compareTo(username)==0) && (resConnexion.getString("Password").compareTo(wordtopass)==0))
                {
                    exist=true;
                }
            }
            if(exist)
            {
                System.out.println("ERREUR 404 ! PSEUDO OU ADRESSE MAIL DEJA UTILISÉ ! ");
            }
            if(!exist)
            {
                String query = "INSERT INTO Connexion_Client (Prenom, Nom, Email, Pseudo, Password) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement statement = conn.prepareStatement(query);
                statement.setString(1, firstname);
                statement.setString(2, lastname);
                statement.setString(3, email);
                statement.setString(4, username);
                statement.setString(5, wordtopass);
                statement.executeUpdate();
                System.out.println("ligne ajouter.");
            }
            conn.close();
        }  catch (Exception e) {
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

