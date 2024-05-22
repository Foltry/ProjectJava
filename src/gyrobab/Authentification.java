package gyrobab;

import java.util.Scanner;

public class Authentification {

    public boolean login(Scanner scanner) {
        System.out.print("Entrez votre email: ");
        String email = scanner.nextLine();
        System.out.print("Entrez votre mot de passe: ");
        String motDePasse = scanner.nextLine();

        Utilisateur utilisateur = trouverUtilisateurParEmail(email);
        if (utilisateur != null && utilisateur.getMotDePasse().equals(motDePasse)) {
            System.out.println("Connexion réussie!");
            return true;
        } else {
            System.out.println("Échec de la connexion. Veuillez vérifier vos identifiants.");
            return false;
        }
    }

    private Utilisateur trouverUtilisateurParEmail(String email) {
        for (Utilisateur utilisateur : Utilisateur.getTousLesUtilisateurs()) {
            if (utilisateur.getEmail().equalsIgnoreCase(email)) {
                return utilisateur;
            }
        }
        return null;
    }
}
