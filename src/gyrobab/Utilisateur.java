package gyrobab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utilisateur {
    private static List<Utilisateur> tousLesUtilisateurs = new ArrayList<>();

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
    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getEmail() { return email; }
    public String getMotDePasse() { return motDePasse; }
    public List<Reservation> getReservations() { return reservations; }

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

    public static Utilisateur creerCompte(Scanner scanner, int userId) {
        System.out.print("Entrez votre nom: ");
        String nom = scanner.nextLine();
        System.out.print("Entrez votre prénom: ");
        String prenom = scanner.nextLine();
        System.out.print("Entrez votre email: ");
        String email = scanner.nextLine();
        if (emailExiste(email)) {
            System.out.println("Un compte avec cet email existe déjà.");
            return null;
        }
        System.out.print("Créez un mot de passe: ");
        String motDePasse = scanner.nextLine();

        Utilisateur nouvelUtilisateur = new Utilisateur(userId, nom, prenom, email, motDePasse);
        tousLesUtilisateurs.add(nouvelUtilisateur);
        return nouvelUtilisateur;
    }
    public static List<Utilisateur> getTousLesUtilisateurs() {
        return tousLesUtilisateurs;
    }
    public static boolean emailExiste(String email) {
        for (Utilisateur utilisateur : tousLesUtilisateurs) {
            if (utilisateur.getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;
    }
}
