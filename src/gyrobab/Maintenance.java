package gyrobab;

import java.util.Date;

public class Maintenance {
    private Gyropode gyropode;
    private Date dateDebut;
    private Date dateFin;
    private String description;

    public Maintenance(Gyropode gyropode, Date dateDebut, Date dateFin, String description) {
        this.gyropode = gyropode;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.description = description;
    }

    // Getters
    public Gyropode getGyropode() {
        return this.gyropode;
    }

    public Date getDateDebut() {
        return this.dateDebut;
    }

    public Date getDateFin() {
        return this.dateFin;
    }

    public String getDescription() {
        return this.description;
    }

    // Setters
    public void setGyropode(Gyropode gyropode) {
        this.gyropode = gyropode;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void effectuerMaintenance() {
        System.out.println("Maintenance en cours pour le gyropode: " + gyropode.getNumeroSerie());
        System.out.println("Début: " + dateDebut);
        System.out.println("Fin prévue: " + dateFin);
        System.out.println("Description: " + description);
    }
}
