package com.example.ecole2.entite;

public class Message {
    private int id;
    private String formation;
    private String email;
    private String message;
    private String nom;
    private String prenom;

    public Message(){}
    public Message(String email, String message, String nom, String prenom){
        this.email = email;
        this.message = message;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() { return id; }

    public String getMail(){
        return email;
    }

    public void setMail(String mail){
        this.email = mail;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
}
