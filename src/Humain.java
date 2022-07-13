import java.util.List;

public class Humain extends Personnage{
    private List<TypePerso> type;
    public Humain(String nom, int x, int y) {
        super(nom, x, y, 5);
    }

    @Override
    public String parler() {
        return "Bonjour";
    }
}
