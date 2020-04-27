import java.util.*;

public class Trainer {
    private ArrayList<Pokemon> bag;
    private Scanner sc;
    private String name;

    private Shop shop = new Shop();

    Print printPokemon = new Print();
    
    public Trainer(String name){
        bag = new ArrayList<Pokemon>();
        bag.add(new Pikachu("Pikachu of Satochi"));
        //bag.add(new Bulbasaur("Wild Bulbsaur"));
        //bag.add(new Raichu("Wild Raichu"));
        //bag.add(new Pidgey("Wild Pidgey"));
        //bag.add(new Charmander("Wild Charmander"));
        //bag.add(new Kabigon("Wild Kabigon"));

        sc = new Scanner(System.in);
        this.name = name;
    }

    public Shop getShop(){
        return shop;
    }

    public ArrayList<Pokemon> getBag(){
        return bag;
    }

    public String getName(){
        return this.name;
    }

    public void set_Bag(ArrayList<Pokemon> bag){
        this.bag = bag;
    }
    
    public void printshop(){
        System.out.println("- - - - -All Item In Your Bag.- - - - -");
        System.out.println("- Coins : " + shop.get_coin());
        System.out.println("- Fruity : " + shop.get_fruity());
        System.out.println("- Potion :" + shop.get_potion());
        System.out.println("- Energy Drink : " + shop.get_energydrink());
        System.out.println("- Pokeball : " + shop.get_pokeball()); 
    }
    
    public void play(){
        String cmd = "";
        String pkmName = "";
        String playerName = "";

        Fight battle = new Fight();

        int no = 0;
        int cm = 0;
        int shoper = 0;

        System.out.print("\n\nPlease Enter Your Name: ");
        playerName = sc.nextLine();
        System.out.print("\n\nHello " + playerName + " !!");
        System.out.print("\n\nPlease Enter Your Pokemon Name: ");
        pkmName = sc.nextLine();
        
        do{
            System.out.println("\n\n--------Please Enter Your Command---------");
            System.out.println("--> [Print] : Check your Pokemon in Bag.");
            System.out.println("--> [Catch] : Catch Pokemon Around You");
            System.out.println("--> [Shop]  : Buy More Item!!");
            System.out.println("--> [Quit]  : Exit Game!");
            System.out.print("\n[COMMAND MODE]Enter Command: ");
            cmd = sc.nextLine();
            if(cmd.equals("Print")){
                System.out.println("[1] : Show All In Bag.");
                System.out.println("[2] : Change Pokemon Name.");
                System.out.print("\n[COMMAND MODE]Enter Command: ");
                cm = sc.nextInt();
                
                if(cm == 1){
                    printPokemon.play(bag);
                    printshop();
                    sc.nextLine();
                }else if(cm == 2){
                    System.out.println("Please Select Your Pokemon To Change Pokemon Name");
                    no = sc.nextInt();
                    Pokemon myPokemon = bag.get(no-1);
                    System.out.println("Please Enter Your Pokemon Name : ");
                    pkmName = sc.nextLine();
                    myPokemon.new_game(pkmName);
                }
                
            }else if(cmd.equals("Catch")){
                System.out.print("Select Your Pokemon in Bag: ");
                battle.play(bag,shop);
            }else if(cmd.equals("Shop")){
                System.out.println("- - - - - Choose What You Want - - - - -");
                System.out.println("[1] Potion          1 EA : 20 Coins");
                System.out.println("[2] Energy Drink    1 EA : 30 Coins");
                System.out.println("[3] Pokeball        1 EA : 50 Coins");
                System.out.println("[4] Fruity          1 EA : 10 Coins");
                System.out.println("[5] Exit Shop");
                System.out.print("[Shop It!!]: ");
                
                shoper = sc.nextInt();
                
                do{
                    if(shoper == 1){
                        System.out.print("Enter Piece of Potion: ");
                        shoper = sc.nextInt();
                        if(shop.get_coin() >= (shoper * 20)){
                            shop.add_potion(shoper,20);
                        }else{
                            System.out.println("Sorry, Not Enough Coins");
                        }
                    }else if(shoper == 2){
                        System.out.print("Enter Piece of Energy Drink: ");
                        shoper = sc.nextInt();
                        if(shop.get_coin() >= (shoper * 30)){
                            shop.add_energydrink(shoper,30);
                        }else{
                            System.out.println("Sorry, Not Enough Coins");
                        }
                    }else if(shoper == 3){
                        System.out.print("Enter Piece of Pokeball: ");
                        shoper = sc.nextInt();
                        if(shop.get_coin() >= (shoper * 50)){
                            shop.add_pokeball(shoper,50);
                        }else{
                            System.out.println("Sorry, Not Enough Coins");
                        }
                    }else if(shoper == 4){
                        System.out.print("Enter Piece of Fruity: ");
                        shoper = sc.nextInt();
                        if(shop.get_coin() >= (shoper * 10)){
                            shop.add_fruity(shoper,50);
                        }else{
                            System.out.println("Sorry, Not Enough Coins");
                        }
                    }
                }while(shoper > 5 && shoper < 1);
            }
        }while(!cmd.equals("Quit"));
    }

}
