
public class main {
    /**
     * Tout client peut réserver une chambre d'hôtel au tarif de 50€/nuit.
     * Les clients VIP bénéficient d'une réduction de 20% (soit 40€/nuit).
     * Les clients VIP, ayant effectués plus de 10 réservations,
     * bénéficieront d'une réservation gratuite.
     * Créer les classes et les tables en BDD avec les données qui
     * vous sembleront utiles.
     */

    /**
     * Client -> nom prenom numero id client , vip
     * Hotel -> nom hotel , id hotel
     * <p>
     * Reservation -> id client & id hotel
     */

    public static void main(String[] args) {
        // test connexion
        connexion con = new connexion();
        con.connect();
        // test utilisateur

      //Utilisateur utilisateur = new Utilisateur();
      //int idClient = utilisateur.saisirClient();
      //while (!utilisateur.isValidClient(idClient)) {
      //    System.out.println("id client incorrect");
      //    idClient = utilisateur.saisirClient();
      //}

      //int idHotel = utilisateur.choixHotel();
      //int nbNuits = utilisateur.choixNbNuits();
      //int finalIdClient = idClient;
      //Client client = con.getClients().stream().filter(e -> e.getId() == finalIdClient).findFirst().get();
      //con.ajoutReservation(idClient, idHotel, nbNuits);
      //System.out.println("Le prix total est de : " + con.recupPrixTotal(client, nbNuits));
    }


}
