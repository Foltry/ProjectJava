package gyrobab;

import java.util.Date;

public class Saison {
    private int id;
    private String nom;
    private Date dateDebut;
    private Date dateFin;
    private Tarification tarification;

    public Saison(int id, String nom, Date dateDebut, Date dateFin, Tarification tarification) {
        this.id = id;
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.tarification = tarification;
    }

    public int getId() { return this.id; }
    public String getNom() { return this.nom; }
    public Date getDateDebut() { return this.dateDebut; }
    public Date getDateFin() { return this.dateFin; }
    public Tarification getTarification() { return this.tarification; }


    public void setId(int id) { this.id = id; }
    public void setNom(String nom) { this.nom = nom; }
    public void setDateDebut(Date dateDebut) { this.dateDebut = dateDebut; }
    public void setDateFin(Date dateFin) { this.dateFin = dateFin; }
    public void setTarification(Tarification tarification) { this.tarification = tarification; }

    public void afficherDetails() {
        System.out.println("Saison: " + nom);
        System.out.println("Début: " + dateDebut);
        System.out.println("Fin: " + dateFin);
        tarification.afficherTarification();
    }
}
