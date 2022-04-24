package com.example.ecole2.entite;

public class Formation {
    private String acronyme;
    private String intitule;
    private String adresseImage;
    private String link;
    private String videoUrl;
    private String dureeMois;
    private String dateDebut;
    private String description;
    public Formation() {}
    public Formation(String acronyme, String intitule, String link) {
        this.acronyme = acronyme;
        this.intitule = intitule;
        this.link = link;

    }
    public String getAcronyme() {
        return acronyme;
    }
    public void setAcronyme(String acronyme) {
        this.acronyme = acronyme;
    }
    public String getIntitule() {
        return intitule;
    }
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    public String getAdresseImage() {
        return adresseImage;
    }
    public void setAdresseImage(String adresseImage) {
        this.adresseImage = adresseImage;
    }
    public String getLink() {
            return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public String getVideoUrl() {
        return videoUrl;
    }
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
    public String getDateDebut() {
        return dateDebut;
    }
    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }
    public String getDureeMois() {
        return dureeMois;
    }
    public void setDureeMois(String dureeMois) {
        this.dureeMois = dureeMois;
    }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() {
        return "Intitule" + intitule;
    }
}
