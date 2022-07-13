public class Voleur extends Personnage implements Retrait, TypePerso{

    public int getDexterite() {
        return dexterite;
    }

    public void setDexterite(int dexterite) {
        if (dexterite >= 0){
            this.dexterite = dexterite;
        }
    }

    private int dexterite;

    public Voleur(String nom, int x, int y, int v) {
        super(nom, x, y, v);
    }

    @Override
    public String parler() {
        return null;
    }

    @Override
    public void retirer(Personnage personnage) {
        if (personnage.getSous() < this.dexterite){
            personnage.setSous(personnage.getSous() - this.dexterite);
        }else {
            personnage.setSous(personnage.getSous() - this.dexterite);
        }
    }
}
