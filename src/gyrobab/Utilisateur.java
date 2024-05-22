package gyrobab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    // Getters and Setters
    public int getId() { return this.id; }
    public String getNom() { return this.nom; }
    public String getPrenom() { return this.prenom; }
    public String getEmail() { return this.email; }
    public String getMotDePasse() { return this.motDePasse; }
    public List<Reservation> getReservations() { return this.reservations; }

    public void afficherProfil() {
        System.out.println("\nProfil de l'Utilisateur:");
        System.out.println("ID: " + id);
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Email: " + email);
        System.out.println("Nombre de réservations: " + reservations.size());
    }

    public static Utilisateur creerCompte(Scanner scanner, int userId) {
        System.out.print("Entrez votre nom: ");
        String nom = scanner.nextLine();
        System.out.print("Entrez votre prénom: ");
        String prenom = scanner.nextLine();
        System.out.print("Entrez votre email: ");
        String email = scanner.nextLine();
        System.out.print("Créez un mot de passe: ");
        String motDePasse = scanner.nextLine();

        Utilisateur nouvelUtilisateur = new Utilisateur(userId, nom, prenom, email, motDePasse);
        return nouvelUtilisateur;
    }
}
