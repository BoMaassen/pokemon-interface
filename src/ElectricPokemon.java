import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    public List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound, "electric");
    }

    public List<String> getAttacks(){
        return attacks;
    }

    public void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder punch");
        double damage = damage(enemy, 15);
        System.out.println(enemy.getName() + " loses " + damage + "hp");
        enemy.setHp(-damage);
        System.out.println(enemy.getName() + " Has " + enemy.getHp() + "hp left");
    }

    public void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with electro ball");
        double damage = damage(enemy, 23);
        System.out.println(enemy.getName() + " loses " + damage + "hp");
        enemy.setHp(-damage);
        System.out.println(enemy.getName() + " Has " + enemy.getHp() + "hp left");
    }
    public void thunder(Pokemon name, Pokemon enemy){
        if (enemy.getType().equals("electric")){
            System.out.println("hp boosted with 10hp");
            enemy.setHp(15);
        }
        else {
            System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder");
            double damage = damage(enemy, 30);
            System.out.println(enemy.getName() + " loses " + damage + "hp");
            enemy.setHp(-damage);
            System.out.println(enemy.getName() + " Has " + enemy.getHp() + "hp left");
        }

    }

    public void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with volt tackle");
        double damage = damage(enemy, 20);
        System.out.println(enemy.getName() + " loses " + damage + "hp");
        enemy.setHp(-damage);
        System.out.println(enemy.getName() + " Has " + enemy.getHp() + "hp left");
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
