import java.util.List;

public class PokemonGymOwner extends PokemonTrainer {
    private String town;

    public PokemonGymOwner(String trainerName, String town, List<Pokemon> pokemons) {
        super(trainerName, pokemons);
        this.town = town;
    }
    public String getTown(){
        return this.town;
    }

}
