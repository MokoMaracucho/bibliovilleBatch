package com.oc.bibliovilleBatch.Entity;

import java.time.LocalDate;

public class Mail {

    private Long idMail;
    private Utilisateur utilisateurMail;
    private Livre livreMail;
    private Emprunt empruntMail;

    public Mail() {
    }

    public Mail(Long idMail, Utilisateur utilisateurMail, Livre livreMail, Emprunt empruntMail) {
        this.idMail = idMail;
        this.utilisateurMail = utilisateurMail;
        this.livreMail = livreMail;
        this.empruntMail = empruntMail;
    }

    public Mail(Utilisateur utilisateurMail, Livre livreMail, Emprunt empruntMail) {
        this.utilisateurMail = utilisateurMail;
        this.livreMail = livreMail;
        this.empruntMail = empruntMail;
    }

    public Long getIdMail() {
        return idMail;
    }

    public void setIdMail(Long idMail) {
        this.idMail = idMail;
    }

    public Utilisateur getUtilisateurMail() {
        return utilisateurMail;
    }

    public void setUtilisateurMail(Utilisateur utilisateurMail) {
        this.utilisateurMail = utilisateurMail;
    }

    public Livre getLivreMail() {
        return livreMail;
    }

    public void setLivreMail(Livre livreMail) {
        this.livreMail = livreMail;
    }

    public Emprunt getEmpruntMail() {
        return empruntMail;
    }

    public void setEmpruntMail(Emprunt empruntMail) {
        this.empruntMail = empruntMail;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "idMail=" + idMail +
                ", utilisateurMail=" + utilisateurMail +
                ", livreMail=" + livreMail +
                ", empruntMail=" + empruntMail +
                '}';
    }
}
