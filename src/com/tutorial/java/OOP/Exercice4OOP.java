package com.tutorial.java.OOP;

abstract class Enseignant {

    private String nom,prenom;
    private int heuresCours;
    private int charges = 1;

    public Enseignant(String nom, String prenom, int heuresCours) {
        this.nom = nom;
        this.prenom = prenom;
        this.heuresCours = heuresCours;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getHeuresCours() {
        return heuresCours;
    }

    public void setHeuresCours(int heuresCours) {
        this.heuresCours = heuresCours;
    }

    public int getCharges() {
        return charges;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }

    public abstract float cout();
}

class EnseignantChercheur extends Enseignant {
    public EnseignantChercheur(String nom, String prenom, int heuresCours) {
        super(nom,prenom,heuresCours);
    }
    public float cout() {
        return (2000*12+(this.getHeuresCours()-192)*40)*getCharges();
    }
}
class Vacataire extends Enseignant {

    private String organisme;

    public Vacataire(String nom, String prenom, int heuresCours, String organisme) {
        super(nom,prenom,heuresCours);
        this.organisme = organisme;
    }

    public float cout() {
        return (40*this.getHeuresCours())*getCharges();
    }
}
class Doctorant extends Enseignant {

    public Doctorant(String nom, String prenom, int heuresCours) {
        super(nom,prenom,heuresCours);
    }

    public float cout() {

        if (this.getHeuresCours() > 96) {
            return (96 * 30) * getCharges();
        } else {
            return (30 * this.getHeuresCours()) * getCharges();
        }
    }
}
public class Exercice4OOP {
    public static void main(String[] args) {
        EnseignantChercheur ec = new EnseignantChercheur("test","test",500);
        System.out.println(ec.cout());

        Vacataire vacataire = new Vacataire("Sarah", "Smith", 95, "IEEE");
        System.out.println(vacataire.cout());

        Doctorant doctorant = new Doctorant("John", "Doe", 10);
        System.out.println(doctorant.cout());

    }
}
