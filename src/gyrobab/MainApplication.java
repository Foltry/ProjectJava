package gyrobab;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Authentification auth = new Authentification();
        Admin admin = new Admin();
        Gestionnaire gestionnaire = new Gestionnaire();
        Statistiques stats = new Statistiques();

        System.out.println("Bienvenue dans le système de gestion de Gyropodes!");
        while (true) {
            System.out.println("\nChoisissez une option:");
            System.out.println("1. Connexion utilisateur");
            System.out.println("2. Connexion administrateur");
            System.out.println("3. Quitter");
            System.out.print("Votre choix: ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    auth.login(scanner);
                    break;
                case 2:
                    admin.menu(scanner);
                    break;
                case 3:
                    System.out.println("Merci d'avoir utilisé notre système. À bientôt!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }
}
