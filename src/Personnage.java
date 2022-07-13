abstract class Personnage {
    private String nom;
    private int pointsVie;
    private int x;
    private int y;
    private int vitesse;
    private int sous;

    public Personnage(String nom, int x, int y, int v){
        this.nom = nom;
        this.x = x;
        this.y = y;
        this.pointsVie = 100;
        this.vitesse = v;
        this.sous = 0;
    }


    public int getPointsVie() {
        return pointsVie;
    }

    public void setPointsVie(int pointsVie) {
        this.pointsVie = pointsVie;
    }

    public int getSous() {
        return sous;
    }

    public void setSous(int sous) {
        this.sous = sous;
    }

    public void seDeplacer(int dx, int dy, int t){
        this.x = (int) (this.x + dx * this.vitesse * t / Math.sqrt(dx * dx + dy * dy));
        this.y = (int) (this.y + dy * this.vitesse * t / Math.sqrt(dx * dx + dy * dy));
    }

    public abstract String parler();
}
