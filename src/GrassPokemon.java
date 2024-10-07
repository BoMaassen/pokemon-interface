import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{
    private static final List<String> attacks = Arrays.asList("LeafStorm", "SolarBeam", "LeechSeed", "LeaveBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "grass");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
