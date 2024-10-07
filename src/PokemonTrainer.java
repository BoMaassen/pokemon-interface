import java.util.List;

public class PokemonTrainer {
    private String playerName;
    private List <Pokemon> pokemons;

    public PokemonTrainer(String playerName, List <Pokemon> pokemons){
        this.playerName = playerName;
        this.pokemons = pokemons;
    }

    public String getName(){
        return playerName;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}
