import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private static final List<String> attacks = Arrays.asList("Inferno", "PyroBall", "FireLash", "FlameThrower");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "fire");
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void inferno(Pokemon attackPokemon, Pokemon defencePokemon) {
        System.out.println(attackPokemon.getName() + " attacks " + defencePokemon.getName() + " with inferno");
        double damage = damage(defencePokemon, 15);
        }
        private double damage (Pokemon enemy, int damage){
        double multiplier = switch (enemy.getType()) {
            case "electric" -> 1.1;
            case "grass" -> 2.5;
            case "water" -> 1.5;
            case "fire" -> 0.5;
            default -> 1.0;
        };
        return damage * multiplier;
    }
}
