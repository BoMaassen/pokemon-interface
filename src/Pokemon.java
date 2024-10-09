import java.util.ArrayList;
import java.util.List;

public abstract class Pokemon {
    private String name;
    private int level;
    private int hp;
    private String food;
    private String sound;


    public Pokemon (String name, int level, int hp, String food, String sound){
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getFood(){
        return this.food;
    }
    public void setFood(String food){
        this.food = food;
    }
    public String getSound(){
        return this.sound;
    }
    public void setSound(String sound){
        this.sound = sound;
    }
    public int getLevel(){
        return this.level;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public int getHp(){
        return this.hp;
    }
    public void setHp(int hp){
        this.hp = hp;
    }


}
