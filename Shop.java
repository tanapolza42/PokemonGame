import java.util.*;


public class Shop{
    private int coin = 500;
    private int potion = 5;
    private int energydrink = 5;
    private int fruity = 5;
    private int pokeball = 5;

    public int get_coin(){
       return this.coin;
    }

    public void add_coin(int money){
        this.coin = this.coin + money;
    }

    public void pay_coin(int money){
        this.coin = this.coin - money;
    }

    public int get_fruity(){
        return this.fruity;
    }

    public void add_fruity(int num, int money){
        this.fruity = this.fruity + num;
        this.coin = this.coin - (money*num);
    }

    public void use_fruity(Pokemon p){
        this.fruity = this.fruity - 1;
        p.healHP(20);
    }

    public int get_potion(){
        return this.potion;
    }

    public void add_potion(int num, int money){
        this.potion = this.potion + num;
        this.coin = this.coin - (money*num);
    }

    public void use_potion(Pokemon p){
        this.potion = this.potion - 1;
        p.healHP(50);
    }

    public int get_energydrink(){
        return this.energydrink;
    }

    public void add_energydrink(int num, int money){
        this.energydrink = this.energydrink + num;
        this.coin = this.coin - (money*num);
    }

    public void use_energydrink(Pokemon p){
        this.energydrink = this.energydrink - 1;
        p.healMANA(50);
    }

    public int get_pokeball(){
        return this.pokeball;
    }    

    public void add_pokeball(int num, int money){
        this.pokeball = this.pokeball + num;
        this.coin = this.coin - (money*num);
    }

    public boolean use_pokeball(ArrayList<Pokemon> bag, Pokemon wildPokemon){
        this.pokeball = this.pokeball - 1;
        if(wildPokemon.getHP() < 100){
            int random = (int)(Math.random()*1) + 1;
            System.out.println("random 1: " + random );
            if(random == 1){
                System.out.println("-------------------------------");
                System.out.println("Catched it Sucess !!");
                System.out.println("-------------------------------");
                bag.add(wildPokemon);
                return true;
            }
            else if(random == 2){
                System.out.println("-------------------------------");
                System.out.println("Catched it Fail !!");
                System.out.println("-------------------------------");
                return false;
            }
            
        }
        else if(wildPokemon.getHP() < (wildPokemon.getHP() / 2)){
            int random = (int)(Math.random()* 1) + 1;
            System.out.println("random 2: " + random ); 
            if(random == 1){
                System.out.println("-------------------------------");
                System.out.println("Catched it Sucess !!");
                System.out.println("-------------------------------");
                bag.add(wildPokemon);
                return true;
            }
            else if (random == 2){
                System.out.println("-------------------------------");
                System.out.println("Catched it Fail !!");
                System.out.println("-------------------------------");
                return false;
            }
        }
        else{
            System.out.println("-------------------------------");
            System.out.println("Catched it Fail !!");
            System.out.println("-------------------------------");
            return false;
        }
    return false;
    }

    public boolean use_pokeballs(ArrayList<Pokemon> bag, Pokemon wildPokemon){
        this.pokeball = this.pokeball - 1;
        bag.add(wildPokemon);
        return true;
    }
    public boolean use_pokeballs_fail(ArrayList<Pokemon> bag, Pokemon wildPokemon){
        this.pokeball = this.pokeball - 1;
        return true;
    }

}