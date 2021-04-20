package com.oc.bibliovilleBatch.Entity;

import java.time.LocalDate;

public class Emprunt {

    private Long idEmprunt;
    private LocalDate dateEmprunt;
    private LocalDate dateRestitution;
    private Boolean prolongationEmprunt;

    public Emprunt() {
    }

    public Emprunt(Long idEmprunt, LocalDate dateEmprunt, LocalDate dateRestitution, Boolean prolongationEmprunt) {
        this.idEmprunt = idEmprunt;
        this.dateEmprunt = dateEmprunt;
        this.dateRestitution = dateRestitution;
        this.prolongationEmprunt = prolongationEmprunt;
    }

    public Emprunt(LocalDate dateEmprunt, LocalDate dateRestitution, Boolean prolongationEmprunt) {
        this.dateEmprunt = dateEmprunt;
        this.dateRestitution = dateRestitution;
        this.prolongationEmprunt = prolongationEmprunt;
    }

    public Long getIdEmprunt() {
        return idEmprunt;
    }

    public void setIdEmprunt(Long idEmprunt) {
        this.idEmprunt = idEmprunt;
    }

    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(LocalDate dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public LocalDate getDateRestitution() {
        return dateRestitution;
    }

    public void setDateRestitution(LocalDate dateRestitution) {
        this.dateRestitution = dateRestitution;
    }

    public Boolean getProlongationEmprunt() {
        return prolongationEmprunt;
    }

    public void setProlongationEmprunt(Boolean prolongationEmprunt) {
        this.prolongationEmprunt = prolongationEmprunt;
    }

    @Override
    public String toString() {
        return "Emprunt{" +
                "idEmprunt=" + idEmprunt +
                ", dateEmprunt=" + dateEmprunt +
                ", dateRestitution=" + dateRestitution +
                ", prolongationEmprunt=" + prolongationEmprunt +
                '}';
    }
}
