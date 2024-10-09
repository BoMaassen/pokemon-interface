import java.util.ArrayList;
import java.util.List;

public class PokemonTrainer {
    private String name;
    List<Pokemon> pokemons = new ArrayList<>();

    public PokemonTrainer(String name, List<Pokemon> pokemons){
        this.name = name;
        this.pokemons = pokemons;
    }

}
