import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private static final List<String> attacks = Arrays.asList("ThunderPunch", "ElectroBall", "Thunder", "VoltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "electric");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
