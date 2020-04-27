import java.util.*;

public class Fight{
    public static void play(ArrayList<Pokemon> bag, Shop shop) {
        Scanner sc = new Scanner(System.in);
        Print printPokemon = new Print();
        int no = 0;
        int control = 0;

        ArrayList<Pokemon> pokemons = PokemonRandom.getPokemons(5);
        System.out.println("\n\n------------ Time To Fight ------------");
        printPokemon.play(pokemons);
        
        System.out.print("\n\nSelect Pokemon Enemy Number or Run(-1) To Fight: ");
        no = sc.nextInt();
        if(no < 0){
            sc.nextLine();
            return;
        }
        Pokemon wildPokemon = pokemons.get(no-1);
        System.out.println("\n\n------------ Pokemon in bag: ------------");
        printPokemon.play(bag);
        System.out.print("\nSelect Your Pokemon in bag: ");

        no = sc.nextInt();

        Pokemon myPokemon = bag.get(no-1);
        ArrayList<Skill> skills = myPokemon.getSkill();
        ArrayList<Skill> skillsbot = wildPokemon.getSkill();

        boolean status = false;
        do{
            System.out.println("\n\nSelect Command to Control Your Pokemon: ");
            System.out.println("1. Attack : Attack To Enemy");
            System.out.println("2. Item   : Use Your Item");
            System.out.println("3. Change : Change Your Pokemon");
            System.out.println("4. Run    : End Fight");
            System.out.print(">>> ");

            control = sc.nextInt();
            // sc.nextLine();

            if(control == 1){
                System.out.println("\n-------Plase Select a Pokemon Skill!------");
                System.out.println("= Skill 1: " + skills.get(0).get_skillname() + " \tDamage: " + skills.get(0).get_damage() + " MP: " + skills.get(0).get_mana());
                System.out.println("= Skill 2: " + skills.get(1).get_skillname() + " \tDamage: " + skills.get(1).get_damage() + " MP: " + skills.get(1).get_mana());
                System.out.println("= Skill 3: " + skills.get(2).get_skillname() + " \tDamage: " + skills.get(2).get_damage() + " MP: " + skills.get(2).get_mana());
                System.out.println("= Skill 4: " + skills.get(3).get_skillname() + " \tDamage: " + skills.get(3).get_damage() + " MP: " + skills.get(3).get_mana());
                System.out.print(">>>  ");
                no = sc.nextInt();
                
                if(myPokemon.getHP() > 0){
                    if(no == 1){
                        if(myPokemon.getMANA() > 0){
                            System.out.println("\nUse Skill: " + skills.get(0).get_skillname());
                            myPokemon.attack1(wildPokemon, myPokemon, skills.get(0));
                        }
                        else{
                            System.out.println("Low MP Plaese use MP Potion");
                        }
                    }
                    else if(no == 2){
                        if(myPokemon.getMANA() > 0){
                            System.out.println("\nUse Skill: " + skills.get(1).get_skillname());
                            myPokemon.attack2(wildPokemon, myPokemon, skills.get(1));
                        }
                        else{
                            System.out.println("Low MP Plaese use MP Potion");
                        }
                    }
                    else if(no == 3){
                        if(myPokemon.getMANA() > 0){
                            System.out.println("\nUse Skill: " + skills.get(2).get_skillname());
                            myPokemon.attack3(wildPokemon, myPokemon, skills.get(2));
                        }
                        else{
                            System.out.println("Low MP Plaese use MP Potion");
                        }
                    }
                    else if(no == 4){
                        if(myPokemon.getMANA()> 0){
                            System.out.println("\nUse Skill: " + skills.get(3).get_skillname());
                            myPokemon.attack4(wildPokemon, myPokemon, skills.get(3));
                        }
                        else{
                            System.out.println("Low MP Plaese use MP Potion");
                        }
                    }
                }
                else{
                    System.out.println("Not HP !");
                    status = false;
                }

                if(wildPokemon.getHP() > 0){
                    System.out.println("\nEnemy Turn");
                    int bot = (int)(Math.random() * 3) + 1;
                    if(bot == 1){
                        if(myPokemon.getMANA() > 0){
                            System.out.println("Skill 1: " + skillsbot.get(0).get_skillname() + " \tDamage: " + skillsbot.get(0).get_damage() + " MP: " + skillsbot.get(0).get_mana());
                            wildPokemon.attack1(myPokemon, wildPokemon, skillsbot.get(0));
                        }
                        else{
                            System.out.println("Can't Attack");
                        }
                    }
                    else if(bot == 2){
                        if(myPokemon.getMANA() > 0){
                            System.out.println("Skill 1: " + skillsbot.get(1).get_skillname() + " \tDamage: " + skillsbot.get(1).get_damage() + " MP: " + skillsbot.get(1).get_mana());
                            wildPokemon.attack2(myPokemon, wildPokemon, skillsbot.get(1));
                        }
                        else{
                            System.out.println("Can't Attack");
                        }
                    }
                    else if(bot == 3){
                        if(myPokemon.getMANA() > 0){
                            System.out.println("Skill 1: " + skillsbot.get(2).get_skillname() + " \tDamage: " + skillsbot.get(2).get_damage() + " MP: " + skillsbot.get(2).get_mana());
                            wildPokemon.attack3(myPokemon, wildPokemon, skillsbot.get(2));
                        }
                        else{
                            System.out.println("Can't Attack");
                        }
                    }
                    else if(bot == 4){
                        if(myPokemon.getMANA()> 0){
                            System.out.println("Skill 1: " + skillsbot.get(3).get_skillname() + " \tDamage: " + skillsbot.get(3).get_damage() + " MP: " + skillsbot.get(3).get_mana());
                            wildPokemon.attack4(myPokemon, wildPokemon, skillsbot.get(3));
                        }
                        else{
                            System.out.println("Can't Attack");
                        }
                    }
                }
                else{
                    System.out.println("Not HP !");
                    status = false;
                }

                if(myPokemon.getHP() == 0){
                    status = false;
                    break;
                }
                else if(wildPokemon.getHP() == 0){
                    status = true;
                    break;
                }
                    
            }
            else if(control == 2){
                do{
                    System.out.println("\nPlase Select Your Item");
                    System.out.println("1. Berry           : Heal + 20 HP" + "\t(" + shop.get_fruity() + ")");
                    System.out.println("2. Potion          : Heal + 50 HP" + "\t(" + shop.get_potion() + ")");
                    System.out.println("3. Energy Potion   : Heal + 50 MP" + "\t(" + shop.get_energydrink() + ")");
                    System.out.println("4. Pokeball        : Catch The enemy" + "\t(" + shop.get_pokeball() + ")");
                    System.out.println("5. Cancel");
                    System.out.print(">>> ");
                    no = sc.nextInt();
                    if(no == 1){
                        if(shop.get_fruity() > 0){
                            shop.use_fruity(myPokemon);
                            break;
                        }
                        else{
                            System.out.println("Berry not enough Plase Try Agian!");
                        }
                    }
                    else if(no == 2){
                        if(shop.get_potion() > 0){
                            shop.use_potion(myPokemon);
                            break;
                        }
                        else{
                            System.out.println("Potion not enough Plase Try Agian!");
                        }
                    }
                    else if(no == 3){
                            if(shop.get_energydrink() > 0){
                                shop.use_energydrink(myPokemon);
                                break;
                            }
                            else{
                                System.out.println("Energy Potion not enough Plase Try Agian!");
                            }
                    }
                    else if(no == 4){
                        if(shop.get_pokeball() > 0){
                            shop.use_pokeball(bag, wildPokemon);
                            break;
                        }
                        else{
                            System.out.println("Pokeball not enough Plase Try Agian!");
                        }
                    }else if(no == 5){
                        break;
                    }
                    else{
                        System.out.println("Not Command Plase Try Agian!");
                    }
                }while(true);
            }
            else if(control == 3){
                System.out.println("\n\nChange Pokemon in Bag");
                printPokemon.play(bag);
                System.out.print("Plase Select Your Pokemon");
                no = sc.nextInt();
                myPokemon = bag.get(no-1);

            }
            else if(control == 4){
                System.out.println("\n\nRun!!");
                break;
            }
              
        }while(true);

        if(status){
            System.out.println(myPokemon.getName() + " is win");
            int rm = (int)(Math.random() * 2) + 1;
            int coin = (int)(Math.random() * 100);
            if(rm == 1){
                shop.add_coin(coin);
                bag.add(wildPokemon);
                System.out.println("You get " + coin + " Pokecoin");

            }
        }
        else{
            System.out.println(wildPokemon.getName() + " is Win");
        }
        
    }   

}