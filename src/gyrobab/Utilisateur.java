package gyrobab;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    private List<Reservation> reservations;

    public Utilisateur(int id, String nom, String prenom, String email, String motDePasse) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.reservations = new ArrayList<>();
    }

    // Getters
    public int getId() { return this.id; }
    public String getNom() { return this.nom; }
    public String getPrenom() { return this.prenom; }
    public String getEmail() { return this.email; }
    public String getMotDePasse() { return this.motDePasse; }
    public List<Reservation> getReservations() { return this.reservations; }

    // Setters
    public void setId(int id) { this.id = id; }
    public void setNom(String nom) { this.nom = nom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public void setEmail(String email) { this.email = email; }
    public void setMotDePasse(String motDePasse) { this.motDePasse = motDePasse; }

    public void afficherProfil() {
        System.out.println("Profil de l'Utilisateur:");
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Email: " + email);
        System.out.println("Nombre de réservations: " + reservations.size());
    }

    public void ajouterReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void afficherReservations() {
        if (reservations.isEmpty()) {
            System.out.println("Aucune réservation.");
        } else {
            for (Reservation r : reservations) {
                r.afficherDetails();
            }
        }
    }
}
