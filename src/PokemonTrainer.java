import java.util.ArrayList;
import java.util.List;

public class PokemonTrainer {
    private String trainerName;
    List<Pokemon> pokemons = new ArrayList<>();

    public PokemonTrainer(String trainerName, List<Pokemon> pokemons){
        this.trainerName = trainerName;
        this.pokemons = pokemons;
    }

    public String getName(){
        return this.trainerName;
    }

    public void setName(String trainerName){
        this.trainerName = trainerName;
    }

    public List<Pokemon> getPokemons(){
       return this.pokemons;
    }
}
