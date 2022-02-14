package com.tutorial.java.OOP;

    class Montre{
        private int heure, min;
        private Personne p;

        Montre(int h, int m){
            this.heure = h;
            this.min = m;
        }

        public int getHeure() {
            return heure;
        }

        public void setHeure(int heure) {
            this.heure = heure;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public Personne getP() {
            return p;
        }

        public void setP(Personne p) {
            this.p = p;
        }

        void avance(){
            if(this.min==59){
                if(this.heure == 23) this.heure = 0;
                else this.heure = this.heure++;
                this.min = 0;
            }
            else this.min++;
        }

    }
    class Personne{
        private String nom;
        private Montre m;

        Personne(String nom){
            this.nom = nom;
            this.m = null;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public Montre getM() {
            return m;
        }

        public void setM(Montre m) {
            this.m = m;
        }

        void porteMontre(Montre m){
            if(m.getP()==null && this.m==null){
                this.m = m;
                m.setP(this);
            }
        }

        void enleveMontre(){
            Montre m = this.m;
            this.m = null;
            if(m!=null) {
                m.setP(null);
            }
        }

        String donneHeure(){
            if(this.m != null) {
                return this.m.getHeure() + "h" + this.m.getMin();
            }
            else return "";
        }

}

class Exercice3OOP {
    public static void main(String[] args){

        Montre m = new Montre(22,59);
        m.avance();
        Personne p = new Personne("Malek");

        p.porteMontre(m);
        System.out.println(p.getM().getHeure());
        System.out.println(m.getP().getNom());
        System.out.println(p.donneHeure());

        p.enleveMontre();
        System.out.println(p.getM());
        System.out.println(m.getP());
    }
}
