import java.sql.*;


public class connexion {


    Connection connexion = null;
    Statement statement = null;
    ResultSet resultat = null;

    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connexion = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/JavaExamen?serverTimezone=UTC", "root", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connexion;
    }

//  public List<Client> getClients() {
//      List<Client> clients = new ArrayList<>();
//      try {
//          connexion = connect();
//          Statement st = connexion.createStatement();
//          resultat = st.executeQuery("SELECT * from Client");
//          while (resultat.next()) {
//              clients.add(new Client(resultat.getInt("id"),
//                      resultat.getString("nom"),
//                      resultat.getString("prenom"),
//                      resultat.getString("numero"),
//                      resultat.getBoolean("vip")));
//          }
//      } catch (SQLException e) {
//          System.err.println(e);
//      }
//      return clients;
//  }

//  public List<Hotel> getHotels() {
//      List<Hotel> hotels = new ArrayList<>();
//      try {
//          connexion = connect();
//          Statement st = connexion.createStatement();
//          resultat = st.executeQuery("SELECT * from Hotel");
//          while (resultat.next()) {
//              hotels.add(new Hotel(resultat.getInt("id"),
//                      resultat.getString("nom")));
//          }
//      } catch (SQLException e) {
//          System.err.println(e);
//      }
//      return hotels;
//  }

//  public void ajoutReservation(int idCli, int idHotel, int nbNuits) {
//      try {
//          connect();
//          statement = connexion.createStatement();
//          PreparedStatement p = connexion.prepareStatement("INSERT INTO Reservation (`clientId`,`hotelId`,`dateArrive`,`nuits`) VALUES (?, ?, NOW(), ?)");
//          p.setInt(1, idCli);
//          p.setInt(2, idHotel);
//          p.setInt(3, nbNuits);
//          p.executeUpdate();
//      } catch (Exception e) {
//          System.err.println(e);
//      }
//  }

//  public int nbReservation(int idCli) {
//      int count = 0;
//      try {
//          connexion = connect();
//          Statement st = connexion.createStatement();
//          resultat = st.executeQuery("SELECT COUNT(Reservation.id) as nbreservation from Reservation where Reservation.clientId = " + idCli);
//          while (resultat.next()) {
//              count = resultat.getInt("nbreservation");
//          }
//      } catch (SQLException e) {
//          System.err.println(e);
//      }
//      return count;
//  }

//  public int recupPrixTotal(Client client, int nbNuits) {
//      return recupPrix(client) * nbNuits;
//  }

//  public int recupPrix(Client client) {
//      int prix = 50;
//      int count = nbReservation(client.getId());
//      if (client.isVip()) {
//          prix = 40;
//      }
//      if (count > 10) {
//          prix = 0;
//      }
//      return prix;
//  }

}
