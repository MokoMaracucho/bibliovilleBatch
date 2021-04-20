package com.oc.bibliovilleBatch.Entity;

public class Livre {

    private Long idLivre;
    private String nomLivre;
    private Boolean disponibiliteLivre;

    public Livre() {
    }

    public Livre(Long idLivre, String nomLivre, Boolean disponibiliteLivre) {
        this.idLivre = idLivre;
        this.nomLivre = nomLivre;
        this.disponibiliteLivre = disponibiliteLivre;
    }

    public Livre(String nomLivre, Boolean disponibiliteLivre) {
        this.nomLivre = nomLivre;
        this.disponibiliteLivre = disponibiliteLivre;
    }

    public Long getIdLivre() {
        return idLivre;
    }

    public void setIdLivre(Long idLivre) {
        this.idLivre = idLivre;
    }

    public String getNomLivre() {
        return nomLivre;
    }

    public void setNomLivre(String nomLivre) {
        this.nomLivre = nomLivre;
    }

    public Boolean getDisponibiliteLivre() {
        return disponibiliteLivre;
    }

    public void setDisponibiliteLivre(Boolean disponibiliteLivre) {
        this.disponibiliteLivre = disponibiliteLivre;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "idLivre=" + idLivre +
                ", nomLivre='" + nomLivre + '\'' +
                ", disponibiliteLivre=" + disponibiliteLivre +
                '}';
    }
}
