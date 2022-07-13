public class Magicien extends Personnage implements Retrait, TypePerso{

    public int getMagie() {
        return magie;
    }

    public void setMagie(int magie) {
        if(magie >= 0){
            this.magie = magie;
        }
    }

    private int magie;

    public Magicien(String nom, int x, int y, int v) {
        super(nom, x, y, v);
    }

    @Override
    public String parler() {
        return null;
    }

    @Override
    public void retirer(Personnage personnage) {
        if (personnage.getPointsVie() < this.magie){
            personnage.setPointsVie(personnage.getPointsVie() - this.magie);
        } else {
            personnage.setPointsVie(personnage.getPointsVie() - this.magie);
        }
    }
}
