import java.util.*;

public class PokemonRandom {

    public static ArrayList<Pokemon> getPokemons(int num){
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        if (num < 1){
            return pokemons;
        }
        int pokemonNumber = (int)(Math.random() * num + 1);

            for(int i=0; i<pokemonNumber; ++i){
                int type = (int)(Math.random() * 6);
                    if (type == 0){
                        pokemons.add(new Pikachu("Wild Pikachu"));
                    }else if(type == 1){
                        pokemons.add(new Raichu("Wild Raichu"));
                    }else if(type == 2){
                        pokemons.add(new Kabigon("Wild Kabigon"));
                    }else if(type == 3){
                        pokemons.add(new Bulbasaur("Wild Bulbasaur"));
                    }else if(type == 4){
                        pokemons.add(new Charmander("Wild Charmander"));
                    }else if(type == 5){
                        pokemons.add(new Pidgey("Wild Pidgey"));
                    }
            }
            return pokemons;
    }
}