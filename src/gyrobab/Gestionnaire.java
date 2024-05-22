package gyrobab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gestionnaire {
    private List<Gyropode> gyropodes;

    public Gestionnaire() {
        this.gyropodes = new ArrayList<>();
    }

    public void ajouterGyropode(Scanner scanner) {
        System.out.print("Entrez le numéro de série: ");
        String numeroSerie = scanner.nextLine();
        System.out.print("Entrez la couleur: ");
        String couleur = scanner.nextLine();
        Gyropode gyropode = new Gyropode(numeroSerie, couleur, true);
        gyropodes.add(gyropode);
        System.out.println("Gyropode ajouté avec succès: " + numeroSerie);
    }

    public void modifierGyropode(Scanner scanner) {
        System.out.print("Entrez le numéro de série du gyropode à modifier: ");
        String numeroSerie = scanner.nextLine();
        for (Gyropode g : gyropodes) {
            if (g.getNumeroSerie().equals(numeroSerie)) {
                System.out.print("Entrez la nouvelle couleur: ");
                String couleur = scanner.nextLine();
                g.setCouleur(couleur);
                System.out.println("Gyropode " + numeroSerie + " modifié.");
                return;
            }
        }
        System.out.println("Gyropode non trouvé.");
    }

    public void supprimerGyropode(Scanner scanner) {
        System.out.print("Entrez le numéro de série du gyropode à supprimer: ");
        String numeroSerie = scanner.nextLine();
        Gyropode toRemove = null;
        for (Gyropode g : gyropodes) {
            if (g.getNumeroSerie().equals(numeroSerie)) {
                toRemove = g;
                break;
            }
        }
        if (toRemove != null) {
            gyropodes.remove(toRemove);
            System.out.println("Gyropode " + numeroSerie + " supprimé.");
        } else {
            System.out.println("Gyropode non trouvé.");
        }
    }
}
