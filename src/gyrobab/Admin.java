package gyrobab;

import java.util.Scanner;

public class Admin {
    public void menu(Scanner scanner) {
        System.out.println("\nAdministration:");
        System.out.println("1. Gérer utilisateurs");
        System.out.println("2. Gérer gyropodes");
        System.out.println("3. Voir statistiques");
        System.out.println("4. Retour");
        System.out.print("Votre choix: ");
        int choix = scanner.nextInt();
        scanner.nextLine();

        switch (choix) {
            case 1:
                // Implémenter la gestion des utilisateurs
                break;
            case 2:
                // Implémenter la gestion des gyropodes
                break;
            case 3:
                // Implémenter la visualisation des statistiques
                break;
            case 4:
                return;
            default:
                System.out.println("Option invalide. Veuillez réessayer.");
        }
    }
}
