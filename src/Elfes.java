import java.util.List;

public class Elfes extends Personnage{
    private List<TypePerso> types;
    public Elfes(String nom, int x, int y) {
        super(nom, x, y, 7);
    }

    @Override
    public String parler() {
        return "Eldarie";
    }
}
