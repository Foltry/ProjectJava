package gyrobab;

public class Tarification {
    private double prixBase;
    private double reductionGroupe;
    private double reductionFrequent;

    public Tarification(double prixBase, double reductionGroupe, double reductionFrequent) {
        this.prixBase = prixBase;
        this.reductionGroupe = reductionGroupe;
        this.reductionFrequent = reductionFrequent;
    }

    // Getters
    public double getPrixBase() { return this.prixBase; }
    public double getReductionGroupe() { return this.reductionGroupe; }
    public double getReductionFrequent() { return this.reductionFrequent; }

    public void setPrixBase(double prixBase) { this.prixBase = prixBase; }
    public void setReductionGroupe(double reductionGroupe) { this.reductionGroupe = reductionGroupe; }
    public void setReductionFrequent(double reductionFrequent) { this.reductionFrequent = reductionFrequent; }

    public void afficherTarification() {
        System.out.println("Prix de base: " + prixBase);
        System.out.println("Réduction pour groupes: " + reductionGroupe);
        System.out.println("Réduction pour clients fréquents: " + reductionFrequent);
    }
}
