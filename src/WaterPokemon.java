import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    public List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCannon", "rainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound, "water");
    }

    public List<String> getAttacks(){
        return attacks;
    }

    public void surf(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with surf");
        double damage = damage(enemy, 15);
        System.out.println(enemy.getName() + " loses " + damage + "hp");
        enemy.setHp(-damage);
        System.out.println(enemy.getName() + " Has " + enemy.getHp() + "hp left");
    }

    void hydroPump(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydro pump");
        double damage = damage(enemy, 23);
        System.out.println(enemy.getName() + " loses " + damage + "hp");
        enemy.setHp(-damage);
        System.out.println(enemy.getName() + " Has " + enemy.getHp() + "hp left");
    }
    void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with hydro canon");
        double damage = damage(enemy, 30);
        System.out.println(enemy.getName() + " loses " + damage + "hp");
        enemy.setHp(-damage);
        System.out.println(enemy.getName() + " Has " + enemy.getHp() + "hp left");
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        if (enemy.getType().equals("electric")){
            System.out.println("has no effect on " + enemy.getName());
        }
        else {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with rain dance");
        double damage = damage(enemy, 15);
        System.out.println(enemy.getName() + " loses " + damage + "hp");
        enemy.setHp(-damage);
        System.out.println(enemy.getName() + " Has " + enemy.getHp() + "hp left");
        }
        if (enemy.getType().equals("grass")){
            System.out.println("hp boosted with 10hp");
            enemy.setHp(15);
        }
    }

    private double damage (Pokemon enemy, int damage){
        double multiplier = switch (enemy.getType()) {
            case "fire" -> 1.1;
            case "water" -> 2.5;
            case "grass" -> 1.5;
            case "electric" -> 0.5;
            default -> 1.0;
        };
        return damage * multiplier;
    }
}
