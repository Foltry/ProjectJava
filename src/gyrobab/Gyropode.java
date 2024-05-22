package gyrobab;

public class Gyropode {
    private String numeroSerie;
    private String couleur;
    private boolean estDisponible;

    public Gyropode(String numeroSerie, String couleur, boolean estDisponible) {
        this.numeroSerie = numeroSerie;
        this.couleur = couleur;
        this.estDisponible = estDisponible;
    }

    public void afficherDetails() {
        System.out.println("Gyropode Série: " + numeroSerie);
        System.out.println("Couleur: " + couleur);
        System.out.println("Disponibilité: " + (estDisponible ? "Disponible" : "Non disponible"));
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setDisponible(boolean disponible) {
        this.estDisponible = disponible;
    }
}
