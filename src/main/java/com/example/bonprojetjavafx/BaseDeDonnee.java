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

    public ArrayList<Hebergement> getListeHebergements() {
        return listeHebergements;
    }

    public ArrayList<Appartement> getListeAppart() {
        return listeAppart;
    }

    public ArrayList<Chalet> getListeChalet() {
        return listeChalet;
    }

    public ArrayList<Hotel> getListeHotel() {
        return listeHotel;
    }

    public ArrayList<Villa> getListeVilla() {
        return listeVilla;
    }

    public ArrayList<Reservation> getListeReservations() {
        return listeReservations;
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
                float distanceAppartCentreAppart=rsAppart.getFloat("D_Appart_Centre");
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
                String lienAppart ="pas d'image";
                listeAppart.add(new Appartement(idAppart, nomAppart, prixAppart, lieuAppart, distanceAppartCentreAppart, nbM2Appart, nbPersAppart, noteClientAppart, wifiAppart, climAppart, animauxAppart, parkingAppart, fumeurAppart, numEtageAppart, balconAppart, nbChambreAppart, nbSdbAppart,lienAppart));
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
                float distanceChaletPisteChalet=rsChalet.getFloat("D_Chalet_Piste");
                float distanceChaletCentreChalet=rsChalet.getFloat("D_Chalet_Centre");
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
                String lienChalet ="pas d'image";
                listeChalet.add(new Chalet(idChalet, nomChalet, prixChalet, lieuChalet, distanceChaletCentreChalet, nbM2Chalet, nbPersChalet, noteClientChalet, wifiChalet, climChalet, animauxChalet, parkingChalet, fumeurChalet, chemineeChalet, localSkiChalet, distanceChaletPisteChalet, nbChambresChalet, nbSDBChalet,lienChalet));
            }

            Statement stmtHotel = conn.createStatement();
            ResultSet rsHotel = stmtHotel.executeQuery("SELECT * FROM Hotel");
            while(rsHotel.next()){
                int idHotel=rsHotel.getInt("ID");
                String nomHotel=rsHotel.getString("Nom");
                int prixHotel=rsHotel.getInt("Prix");
                String lieuHotel=rsHotel.getString("Lieu");
                int nbEtoileHotel=rsHotel.getInt("NB_Etoile");
                boolean petitDejHotel=rsHotel.getBoolean("Petit_Dej");
                boolean restaurantHotel=rsHotel.getBoolean("Restaurant");
                String companieHotel=rsHotel.getString("Marque");
                float distanceHotelCentreHotel=rsHotel.getFloat("D_Hotel_Centre");
                int nbM2Hotel=rsHotel.getInt("NB_M2");
                int nbPersHotel=rsHotel.getInt("NB_Pers");
                float noteClientHotel=rsHotel.getFloat("Note_Client");
                boolean wifiHotel=rsHotel.getBoolean("WIFI");
                boolean climHotel=rsHotel.getBoolean("Clim");
                boolean animauxHotel=rsHotel.getBoolean("Animaux");
                boolean parkingHotel=rsHotel.getBoolean("Parking");
                boolean fumeurHotel=rsHotel.getBoolean("Fumeur");
                String lienHotel ="pas d'image";
                listeHotel.add(new Hotel(idHotel, nomHotel, prixHotel, lieuHotel, distanceHotelCentreHotel, nbM2Hotel, nbPersHotel, noteClientHotel, wifiHotel, climHotel, animauxHotel, parkingHotel, fumeurHotel, nbEtoileHotel, petitDejHotel, restaurantHotel, companieHotel, lienHotel));
            }

            Statement stmtVilla = conn.createStatement();
            ResultSet rsVilla = stmtVilla.executeQuery("SELECT * FROM Villa");
            while(rsVilla.next()){
                int idVilla=rsVilla.getInt("ID");
                String nomVilla=rsVilla.getString("Nom");
                int prixVilla=rsVilla.getInt("Prix");
                String lieuVilla=rsVilla.getString("Lieu");
                boolean piscineVilla=rsVilla.getBoolean("Piscine");
                float distanceVillaMerVilla=rsVilla.getFloat("D_Villa_Mer");
                float distanceVillaCentreVilla=rsVilla.getFloat("D_Villa_Centre");
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
                String lienVilla ="pas d'image";
                listeVilla.add(new Villa(idVilla, nomVilla, prixVilla, lieuVilla, distanceVillaCentreVilla, nbM2Villa, nbPersVilla, noteClientVilla, wifiVilla, climVilla, animauxVilla, parkingVilla, fumeurVilla, piscineVilla, distanceVillaMerVilla, nbChambresVilla, nbSDBVilla,lienVilla));
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
    public void filtrage(ArrayList<Boolean> listeBool, String choixVille, String nbAdultes, String nbEnfants) {
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
        if(listeFiltre.isEmpty()) {
            for (Hebergement h : listeHebergements)
                if (h.getLieu().equals(choixVille))
                    listeFiltre.add(h);
        }
        else if (!(listeFiltre.isEmpty())&& !(choixVille.isEmpty())) {
            Iterator<Hebergement> it = listeFiltre.iterator();
            while (it.hasNext()) {
                Hebergement h = it.next();
                if (!h.getLieu().equals(choixVille)) {
                    it.remove();
                }
            }
        }
        System.out.println("Avant filtrage NBpers");
        for(Hebergement item : listeFiltre)
            System.out.println(item.getNom());

        int nbFinal=0;

        if(!(nbAdultes.isEmpty()) && !(nbEnfants.isEmpty())){
            int nombreAdultes=Integer.parseInt(nbAdultes);
            int nombreEnfants=Integer.parseInt(nbEnfants);
            nbFinal=nombreAdultes+nombreEnfants;
        }
        else if(!(nbAdultes.isEmpty()) && (nbEnfants.isEmpty())){
            nbFinal=Integer.parseInt(nbAdultes);
        }
        else if((nbAdultes.isEmpty()) && !(nbEnfants.isEmpty())){
            nbFinal=Integer.parseInt(nbEnfants);
        }
        if(nbFinal!=0){
            Iterator<Hebergement> ite = listeFiltre.iterator();
            while (ite.hasNext()) {
                Hebergement he = ite.next();
                if (he.getNbPersonnes()!=nbFinal) {
                    ite.remove();
                }
            }
        }
        System.out.println("Après le filtre personnes : ");
        for(Hebergement item : listeFiltre)
            System.out.println(item.getNom());
    }
    public void InscriptionClient(Client iencli) {

        String url = "jdbc:mysql://localhost/projet ";
        String user = "root";
        String password = "";
        boolean exist = false;
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            Scanner sc = new Scanner(System.in);
            ResultSet resConnexion = stmt.executeQuery("select * from Connexion_Client");

            //lire un élément de la bdd
            while (resConnexion.next()) {
                if ((resConnexion.getString("Email").compareTo(iencli.getEmail()) == 0) || (resConnexion.getString("Pseudo").compareTo(iencli.getPseudo()) == 0) && (resConnexion.getString("Password").compareTo(iencli.getPassword()) == 0)) {
                    exist = true;
                }
            }
            if (exist) {
                System.out.println("ERREUR 404 ! PSEUDO OU ADRESSE MAIL DEJA UTILISÉ ! ");
            }
            if (!exist) {
                String query = "INSERT INTO Connexion_Client (Prenom, Nom, Email, Pseudo, Password) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement statement = conn.prepareStatement(query);
                statement.setString(1, iencli.getPrenom());
                statement.setString(2, iencli.getNom());
                statement.setString(3, iencli.getEmail());
                statement.setString(4, iencli.getPseudo());
                statement.setString(5, iencli.getPassword());
                statement.executeUpdate();
                System.out.println("ligne ajouter.");
            }
            conn.close();
        } catch (Exception e) {
            System.err.println("Exception relevée...");
            System.err.println(e.getMessage());
        }
    }
    public boolean Connexion_Client(Client yenkli) {

        boolean verif=false;
        Scanner sc = new Scanner(System.in);
        System.out.println(yenkli.getPseudo());
        System.out.println(yenkli.getPassword());
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/projet", "root", "");
            //lire un élément de la bdd
            Statement stConnexion = con.createStatement();
            ResultSet resConnexion = stConnexion.executeQuery("select * from Connexion_Client");

            //lire un élément de la bdd
            while(resConnexion.next()){
                //System.out.println("Pays : " + resHotel.getString("pays"));
                if ((resConnexion.getString("Email").compareTo(yenkli.getPseudo())==0) || (resConnexion.getString("Pseudo").compareTo(yenkli.getPseudo())==0) && (resConnexion.getString("Password").compareTo(yenkli.getPassword())==0)){
                    System.out.println("a");
                    return true;
                }
                else {
                    System.out.println("b");
                    verif=false;
                }
            }
            con.close();

        } catch (Exception e){
            System.out.println("Error :" + e.getMessage());
        }
        return verif;
    }
    public boolean Connexion_Admin(Administrateur ad) {

        boolean verif=false;
        Scanner sc = new Scanner(System.in);
        System.out.println(ad.getLogin());
        System.out.println(ad.getMotDePasse());
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/projet", "root", "");
            //lire un élément de la bdd
            Statement stConnexion = con.createStatement();
            ResultSet resConnexion = stConnexion.executeQuery("select * from Connexion_Admin");

            //lire un élément de la bdd
            while(resConnexion.next()){
                //System.out.println("Pays : " + resHotel.getString("pays"));
                if ((resConnexion.getString("Login").compareTo(ad.toString())==0) || (resConnexion.getString("MotDePasse").compareTo(ad.getMotDePasse())==0)){
                    System.out.println("a");
                    return true;
                }
                else {
                    System.out.println("b");
                    verif=false;
                }
            }
            con.close();

        } catch (Exception e){
            System.out.println("Error :" + e.getMessage());
        }
        return verif;
    }
    public void ajoutligneChalet(Chalet newchalet){
        String url = "jdbc:mysql://localhost:8889/bdd";
        String user = "root";
        String password = "root";

        Random rand = new Random();
        int min = 50;
        int max = 300;
        int randomNumber = rand.nextInt((max - min) + 1) + min;

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            String queryC = "INSERT INTO Chalet (ID, Nom, Prix, Lieu, Local_Ski, Cheminer, D_Chalet_Piste, D_Chalet_Centre, NB_CHAMBRE, NB_SDB, NB_M2, NB_Personne, Note_Client, Wifi, Climatisation, Fumeur, Animaux, Parking) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statementC = conn.prepareStatement(queryC);
            statementC.setInt(1, randomNumber);
            statementC.setString(2, newchalet.getNom());
            statementC.setInt(3, newchalet.getPrix());
            statementC.setString(4, newchalet.getLieu());
            statementC.setBoolean(5, newchalet.isLocalSki());
            statementC.setBoolean(6, newchalet.isCheminer());
            statementC.setFloat(7, newchalet.getDistance_piste());
            statementC.setFloat(8, newchalet.getDistanceCentre());
            statementC.setInt(9, newchalet.getNbChambres());
            statementC.setInt(10, newchalet.getNbSDB());
            statementC.setInt(11, newchalet.getM2());
            statementC.setInt(12, newchalet.getNbPersonnes());
            statementC.setFloat(13, newchalet.getNote());
            statementC.setBoolean(14, newchalet.isWifi());
            statementC.setBoolean(15, newchalet.isClim());
            statementC.setBoolean(16, newchalet.isFumeur());
            statementC.setBoolean(17, newchalet.isAnimaux());
            statementC.setBoolean(18, newchalet.isParking());
            statementC.executeUpdate();
            System.out.println("Hébergement ajouté.");
            conn.close();
        } catch (Exception e) {
            System.err.println("Exception relevée...");
            System.err.println(e.getMessage());
        }
    }
    public void ajoutligneHotel(Hotel newhotel){
        String url = "jdbc:mysql://localhost:8889/bdd";
        String user = "root";
        String password = "root";

        Random rand = new Random();
        int min = 50;
        int max = 300;
        int randomNumber = rand.nextInt((max - min) + 1) + min;
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            String queryH = "INSERT INTO Hotel (ID, Nom, Prix, Lieu, NB_Etoile, Petit_Dej, Restaurant, Marque, D_Hotel_Centre, NB_M2, NB_Pers, Note_Client, WIFI, Clim, Animaux, Parking, Fumeur, Lien) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statementH = conn.prepareStatement(queryH);
            statementH.setInt(1, randomNumber);
            statementH.setString(2, newhotel.getNom());
            statementH.setInt(3, newhotel.getPrix());
            statementH.setString(4, newhotel.getLieu());
            statementH.setFloat(5, newhotel.getNb_etoile());
            statementH.setBoolean(6, newhotel.isPetitDej());
            statementH.setBoolean(7, newhotel.isRestaurant());
            statementH.setString(8, newhotel.getCompagnie());
            statementH.setFloat(9, newhotel.getDistanceCentre());
            statementH.setInt(10, newhotel.getM2());
            statementH.setInt(11, newhotel.getNbPersonnes());
            statementH.setFloat(12, newhotel.getNote());
            statementH.setBoolean(13, newhotel.isWifi());
            statementH.setBoolean(14, newhotel.isClim());
            statementH.setBoolean(15, newhotel.isAnimaux());
            statementH.setBoolean(16, newhotel.isParking());
            statementH.setBoolean(17, newhotel.isFumeur());
            statementH.setString(18, "pas d'image");
            statementH.executeUpdate();
            System.out.println("Hébergement ajouté.");
            conn.close();
        } catch (Exception e) {
            System.err.println("Exception relevée...");
            System.err.println(e.getMessage());
        }
    }
    public void ajoutligneAppart(Appartement newappart){
        String url = "jdbc:mysql://localhost:8889/bdd";
        String user = "root";
        String password = "root";

        Random rand = new Random();
        int min = 50;
        int max = 300;
        int randomNumber = rand.nextInt((max - min) + 1) + min;
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            String queryA = "INSERT INTO Appartement (ID, Nom, Prix, Lieu, Num_Etage, Balcon, D_Appart_Centre, NB_Chambre, NB_SDB, NB_M2, NB_Personne, Note_Client, Wifi, Climatisation, Fumeur, Animaux, Parking) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statementA = conn.prepareStatement(queryA);
            statementA.setInt(1, randomNumber);
            statementA.setString(2, newappart.getNom());
            statementA.setInt(3, newappart.getPrix());
            statementA.setString(4, newappart.getLieu());
            statementA.setFloat(5, newappart.getEtage());
            statementA.setBoolean(6, newappart.isBalcon());
            statementA.setFloat(7, newappart.getDistanceCentre());
            statementA.setInt(8, newappart.getNbChambres());
            statementA.setInt(9, newappart.getNbSDB());
            statementA.setInt(10, newappart.getM2());
            statementA.setInt(11, newappart.getNbPersonnes());
            statementA.setFloat(12, newappart.getNote());
            statementA.setBoolean(13, newappart.isWifi());
            statementA.setBoolean(14, newappart.isClim());
            statementA.setBoolean(15, newappart.isAnimaux());
            statementA.setBoolean(16, newappart.isParking());
            statementA.setBoolean(17, newappart.isFumeur());
            //statementA.setString(18, "pas d'image");
            statementA.executeUpdate();
            System.out.println("Hébergement ajouté.");
            conn.close();
        } catch (Exception e) {
            System.err.println("Exception relevée...");
            System.err.println(e.getMessage());
        }
    }
    public void ajoutligneVilla(Villa newvilla){
        String url = "jdbc:mysql://localhost:8889/bdd";
        String user = "root";
        String password = "root";

        Random rand = new Random();
        int min = 50;
        int max = 300;
        int randomNumber = rand.nextInt((max - min) + 1) + min;
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            String queryV = "INSERT INTO Villa (ID, Nom, Prix, Lieu, Piscine, D_Villa_Mer, D_Villa_Centre, NB_CHAMBRE, NB_SDB, NB_M2, NB_Personne, Note_Client, Wifi, Climatisation, Fumeur, Animaux, Parking) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statementV = conn.prepareStatement(queryV);
            statementV.setInt(1, randomNumber);
            statementV.setString(2, newvilla.getNom());
            statementV.setInt(3, newvilla.getPrix());
            statementV.setString(4, newvilla.getLieu());
            statementV.setBoolean(5, newvilla.isPiscine());
            statementV.setFloat(6, newvilla.getDistance_mer());
            statementV.setFloat(7, newvilla.getDistanceCentre());
            statementV.setInt(8, newvilla.getNbChambres());
            statementV.setInt(9, newvilla.getNbSDB());
            statementV.setInt(10, newvilla.getM2());
            statementV.setInt(11, newvilla.getNbPersonnes());
            statementV.setFloat(12, newvilla.getNote());
            statementV.setBoolean(13, newvilla.isWifi());
            statementV.setBoolean(14, newvilla.isClim());
            statementV.setBoolean(15, newvilla.isAnimaux());
            statementV.setBoolean(16, newvilla.isParking());
            statementV.setBoolean(17, newvilla.isFumeur());
            //statementA.setString(18, "pas d'image");
            statementV.executeUpdate();
            System.out.println("Hébergement ajouté.");
            conn.close();
        } catch (Exception e) {
            System.err.println("Exception relevée...");
            System.err.println(e.getMessage());
        }
    }

}

