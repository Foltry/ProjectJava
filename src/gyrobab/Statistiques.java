package gyrobab;

public class Statistiques {
    private int reservationsParJour;
    private String gyropodeLePlusReserve;

    // Constructeur, si nécessaire, pour initialiser
    public Statistiques() {
        this.reservationsParJour = 5;
        this.gyropodeLePlusReserve = "G123";
    }

    // Getters
    public int getReservationsParJour() {
        return this.reservationsParJour;
    }

    public String getGyropodeLePlusReserve() {
        return this.gyropodeLePlusReserve;
    }

    // Setters
    public void setReservationsParJour(int reservationsParJour) {
        this.reservationsParJour = reservationsParJour;
    }

    public void setGyropodeLePlusReserve(String gyropodeLePlusReserve) {
        this.gyropodeLePlusReserve = gyropodeLePlusReserve;
    }

    public void afficherStatistiques() {
        System.out.println("\nStatistiques de location:");
        System.out.println("Nombre de réservations par jour: " + reservationsParJour);
        System.out.println("Gyropode le plus réservé: " + gyropodeLePlusReserve);
    }
}
