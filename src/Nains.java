import java.util.ArrayList;

public class Nains extends Personnage{
    private ArrayList<TypePerso> types;
    public Nains(String nom, int x, int y) {
        super(nom, x, y, 2);
    }

    @Override
    public String parler() {
        return "Groumpf";
    }
}
