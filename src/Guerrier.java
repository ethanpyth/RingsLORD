public class Guerrier extends Personnage implements Retrait, TypePerso{

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        if (force >= 0){
            this.force = force;
        }
    }

    private int force;

    public Guerrier(String nom, int x, int y, int v) {
        super(nom, x, y, v);
    }

    @Override
    public String parler() {
        return null;
    }


    @Override
    public void retirer(Personnage personnage) {
        if (personnage.getPointsVie() < this.force){
            personnage.setPointsVie(personnage.getPointsVie() - this.force);
        } else {
            personnage.setPointsVie(personnage.getPointsVie() - this.force);
        }
    }
}
