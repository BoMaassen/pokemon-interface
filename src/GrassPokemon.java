import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    public List<String> attacks = Arrays.asList("LeafStorm", "solarBeam", "leechSeed", "leafBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound, "grass");
    }

    public List<String> getAttacks(){
        return attacks;
    }

    public void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leaf storm");
        double damage = damage(enemy, 15);
        System.out.println(enemy.getName() + " loses " + damage + "hp");
        enemy.setHp(-damage);
        System.out.println(enemy.getName() + " Has " + enemy.getHp() + "hp left");
    }

    void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with solar beam");
        double damage = damage(enemy, 23);
        System.out.println(enemy.getName() + " loses " + damage + "hp");
        enemy.setHp(-damage);
        System.out.println(enemy.getName() + " Has " + enemy.getHp() + "hp left");
    }
    void leechSeed(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with leech seed");
        double damage = damage(enemy, 30);
        System.out.println(enemy.getName() + " loses " + damage + "hp and " + name.getName() + " gets " + damage + "hp");
        enemy.setHp(-damage);
        name.setHp(damage);
        System.out.println(enemy.getName() + " Has " + enemy.getHp() + "hp left. " + name.getName() + " has " + name.getHp() + "hp");
    }

    void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with volt leave blade");
        double damage = damage(enemy, 20);
        System.out.println(enemy.getName() + " loses " + damage + "hp");
        enemy.setHp(-damage);
        System.out.println(enemy.getName() + " Has " + enemy.getHp() + "hp left");
    }

    private double damage (Pokemon enemy, int damage){
        double multiplier = switch (enemy.getType()) {
            case "water" -> 1.1;
            case "electric" -> 2.5;
            case "fire" -> 1.5;
            case "grass" -> 0.5;
            default -> 1.0;
        };
        return damage * multiplier;
    }
}
