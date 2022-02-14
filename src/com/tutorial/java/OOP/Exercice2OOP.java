package com.tutorial.java.OOP;

import java.util.ArrayList;


    class Ingredient{

        private String nom_aliment;
        private String etat;
        private int quantite;
        private String unite;

        Ingredient(String n, String e, int q, String unite){
            this.nom_aliment = n;
            this.etat = e;
            this.quantite = q;
            this.unite = unite;
        }


        public String getNom_aliment() {
            return nom_aliment;
        }

        public void setNom_aliment(String nom_aliment) {
            this.nom_aliment = nom_aliment;
        }

        public String getEtat() {
            return etat;
        }

        public void setEtat(String etat) {
            this.etat = etat;
        }

        public int getQuantite() {
            return quantite;
        }

        public void setQuantite(int quantite) {
            this.quantite = quantite;
        }

        public String getUnite() {
            return unite;
        }

        public void setUnite(String unite) {
            this.unite = unite;
        }
    }

    class Plat{
        private String nom;
        private ArrayList<Ingredient> ingredients;

        Plat(String n){
            this.nom = n;
            this.ingredients = new ArrayList<Ingredient>();
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public void setIngredients(ArrayList<Ingredient> ingredients) {
            this.ingredients = ingredients;
        }

        ArrayList<Ingredient> getIngredients(){
            return this.ingredients;
        }
        void addIngredient(Ingredient i){
            this.ingredients.add(i);
        }
    }

    class IngredientACuire extends Ingredient{
        private int temperature;

        IngredientACuire(String n, String e,  int q, String unite, int t){
            super(n,e,q,unite);
            this.temperature = t;
        }

        public int getTemperature() {
            return temperature;
        }

        public void setTemperature(int temperature) {
            this.temperature = temperature;
        }

        void cuire(){
            this.setEtat("cuit");
        }
    }

    class IngredientADecouper extends Ingredient {

        IngredientADecouper(String n, String e, int q, String unite) {
            super(n, e, q, unite);
        }

        void decouper() {
            this.setEtat("decoupe");
        }
    }


    class Exercice2OOP {
        public static void main(String[] args){
            Plat p = new Plat("Choucroute");
            System.out.println(p.getIngredients().size());
            p.addIngredient(new Ingredient("choucroute","cuite",500,"g"));
            p.addIngredient(new Ingredient("lard","cuit_entier",150,"g"));
            p.addIngredient(new Ingredient("saucisse","cuite_entiere",2,
                    "cardinalite"));
            System.out.println(p.getIngredients().size());

            for (Ingredient ing:p.getIngredients()) {
                System.out.println(ing.getNom_aliment());
            }

            IngredientACuire ingredientACuire = new IngredientACuire("choucroute","à cuire",500,"g", 200);
            System.out.println(ingredientACuire.getEtat());
            ingredientACuire.cuire();
            System.out.println(ingredientACuire.getEtat());

            IngredientADecouper ingredientADecouper = new IngredientADecouper("choucroute","cuit",500,"g");
            System.out.println(ingredientADecouper.getEtat());
            ingredientADecouper.decouper();
            System.out.println(ingredientADecouper.getEtat());
        }
    }

