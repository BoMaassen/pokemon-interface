public abstract class Pokemon {
    private final String name;
    private final int level;
    private int hp;
    private final String food;
    private final String sound;
    private final String type;

    public Pokemon (String name, int level, int hp, String food, String sound, String type){
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public String getFood(){
        return food;
    }

    public String getSound(){
        return sound;
    }

    public int getLevel(){
        return level;
    }

    public int getHp(){
        return hp;
    }
    public void setHp(double change) {
        this.hp += change;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    public String getType(){
        return type;
    }


}
