
public class Pidgey extends Pokemon{
    public Pidgey(String name){
        super(name,400,200,5);
    }
    
    public void attack1(Pokemon enemy, Pokemon myPokemon, Skill sk){
        System.out.println("[ATTACK MODE]:Pokemon " + name + " attack[1] " + enemy.getName());
        enemy.damage(0,sk.get_damage());
        myPokemon.damage(sk.get_mana(), 0);
        System.out.println(name + " HP: " + super.getHP() + " MP: " + super.getMANA());
        System.out.println(enemy.getName() + " HP : " + enemy.getHP());
        System.out.println("---------------------------------------------");
    }

    public void attack2(Pokemon enemy, Pokemon myPokemon, Skill sk){
        System.out.println("[ATTACK MODE]:Pokemon " + name + " attack[2] " + enemy.getName());
        enemy.damage(0,sk.get_damage());
        myPokemon.damage(sk.get_mana(), 0);
        System.out.println(name + " HP: " + super.getHP() + " MP: " + super.getMANA());
        System.out.println(enemy.getName() + " HP : " + enemy.getHP());
        System.out.println("---------------------------------------------");
    }

    public void attack3(Pokemon enemy, Pokemon myPokemon, Skill sk){
        System.out.println("[ATTACK MODE]:Pokemon " + name + " attack[3] " + enemy.getName());
        enemy.damage(0,sk.get_damage());
        myPokemon.damage(sk.get_mana(), 0);
        System.out.println(name + " HP: " + super.getHP() + " MP: " + super.getMANA());
        System.out.println(enemy.getName() + " HP : " + enemy.getHP());
        System.out.println("---------------------------------------------");
    }

    public void attack4(Pokemon enemy, Pokemon myPokemon, Skill sk){
        System.out.println("[ATTACK MODE]:Pokemon " + name + " attack[4] " + enemy.getName());
        enemy.damage(0,sk.get_damage());
        myPokemon.damage(sk.get_mana(), 0);
        System.out.println(name + " HP: " + super.getHP() + " MP: " + super.getMANA());
        System.out.println(enemy.getName() + " HP : " + enemy.getHP());
        System.out.println("---------------------------------------------");
    }

}