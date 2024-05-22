package gyrobab;

import java.util.Date;

public class Reservation {
    private int id;
    private Utilisateur utilisateur;
    private Gyropode gyropode;
    private Date dateDebut;
    private Date dateFin;
    private boolean estActive;

    public Reservation(int id, Utilisateur utilisateur, Gyropode gyropode, Date dateDebut, Date dateFin) {
        this.id = id;
        this.utilisateur = utilisateur;
        this.gyropode = gyropode;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.estActive = true;
    }

    // Getters
    public int getId() { return id; }
    public Utilisateur getUtilisateur() { return this.utilisateur; }
    public Gyropode getGyropode() { return this.gyropode; }
    public Date getDateDebut() { return this.dateDebut; }
    public Date getDateFin() { return this.dateFin; }
    public boolean isEstActive() { return this.estActive; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setUtilisateur(Utilisateur utilisateur) { this.utilisateur = utilisateur; }
    public void setGyropode(Gyropode gyropode) { this.gyropode = gyropode; }
    public void setDateDebut(Date dateDebut) { this.dateDebut = dateDebut; }
    public void setDateFin(Date dateFin) { this.dateFin = dateFin; }
    public void setEstActive(boolean estActive) { this.estActive = estActive; }

    public void annulerReservation() {
        this.estActive = false;
        System.out.println("La réservation a été annulée.");
    }

    public void afficherDetails() {
        System.out.println("\nDétails de la Réservation:");
        System.out.println("Utilisateur: " + utilisateur.getEmail());
        System.out.println("Gyropode: " + gyropode.getNumeroSerie());
        System.out.println("Début: " + dateDebut);
        System.out.println("Fin: " + dateFin);
        System.out.println("Statut: " + (estActive ? "Active" : "Annulée"));
    }
}
