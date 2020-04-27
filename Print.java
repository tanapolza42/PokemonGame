import java.util.*;

public class Print{
    public void play(ArrayList<Pokemon> pokemons){
        int number = 1;
        System.out.println("- - - - -Pokemon In Your Bag- - - - -");
        for(Pokemon p: pokemons){
            System.out.println("  "+ number + " " + p + " HP: " + p.getHP());
            number++;
        }
    }
}