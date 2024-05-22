package gyrobab;

import java.util.Scanner;

public class Authentification {
    private String emailEnregistre = "admin@example.com";
    private String motDePasseEnregistre = "admin123";

    public boolean login(Scanner scanner) {
        System.out.print("Entrez votre email: ");
        String email = scanner.nextLine();
        System.out.print("Entrez votre mot de passe: ");
        String motDePasse = scanner.nextLine();

        if (email.equals(emailEnregistre) && motDePasse.equals(motDePasseEnregistre)) {
            System.out.println("Connexion réussie!");
            return true;
        } else {
            System.out.println("Échec de la connexion. Veuillez vérifier vos identifiants.");
            return false;
        }
    }
}
