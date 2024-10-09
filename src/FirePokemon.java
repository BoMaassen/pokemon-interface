import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon{
    private final List<String> attacks = Arrays.asList("inferno", "pyroBall", "fireLash", "flameThrower");

    public FirePokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound, "fire");
    }

    List<String> getAttacks() {
        return attacks;
    }

    public void fireLash(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with fire lash");
        double damage = damage(enemy, 15);
        System.out.println(enemy.getName() + " loses " + damage + "hp");
        enemy.setHp(-damage);
        System.out.println(enemy.getName() + " Has " + enemy.getHp() + "hp left");
    }

    public void flameThrower(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with flame thrower");
        double damage = damage(enemy, 23);
        System.out.println(enemy.getName() + " loses " + damage + "hp");
        enemy.setHp(-damage);
        System.out.println(enemy.getName() + " Has " + enemy.getHp() + "hp left");
    }
    public void pyroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with pyro ball");
        double damage = damage(enemy, 30);
        System.out.println(enemy.getName() + " loses " + damage + "hp");
        enemy.setHp(-damage);
        System.out.println(enemy.getName() + " Has " + enemy.getHp() + "hp left");
    }

    public void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with inferno");
        double damage = damage(enemy, 20);
        System.out.println(enemy.getName() + " loses " + damage + "hp");
        enemy.setHp(-damage);
        System.out.println(enemy.getName() + " Has " + enemy.getHp() + "hp left");
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
