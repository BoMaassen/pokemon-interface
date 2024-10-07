import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private static final List<String> attacks = Arrays.asList("Surf", "HydroPump", "HydroCanon", "RainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "water");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
