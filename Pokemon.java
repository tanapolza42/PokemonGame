import java.util.*;

public abstract class Pokemon {
    private ArrayList<Skill> skills = RandomSkill.ranSkill();
    protected String name;
    
    protected int hp;
    protected int mana;

    protected int max_hp;
    protected int max_mana;

    protected int currentHP;
    protected int currentMANA;

    protected int id;


    public Pokemon(String name){
        this.name = name;
        this.hp = 0;
    }

    public Pokemon(String name,int maxHP, int maxMANA, int id){
        this.name = name;
        this.hp = (int)(Math.random() * maxHP) + 150;
        this.mana = maxMANA;
        this.max_hp = hp;
        this.max_mana = mana;
        this.id = id;
    }

    public boolean healHP(int heal){
        if(this.hp < 0){
            return false;
        }else if(this.hp > 0 && this.hp < max_hp){
            int doneHeal = this.hp + heal;
            this.hp = doneHeal;
            return true;
        }
        return true;
    }

    public boolean healMANA(int heal){
        if(this.mana < 0){
            return false;
        }else if(this.mana > 0 && this.mana < max_mana){
            int doneMANA = this.mana + heal;
            this.mana = doneMANA;
            return true;
        }
        return true;
    }

    public int getmaxHp(){
        return max_hp;
    }

    public int getmaxMp(){
        return max_mana;
    }

    public int getMANA(){
        return mana;
    }

    public int getHP(){
        return hp;
    }

    public int getID(){
        return id;
    }

    public void getid(int id){
        this.id = id;
    }

    public void rehp(){
        this.hp = max_hp;
    }

    public void remp(){
        this.mana = max_mana;
    }

    public String getName(){
        return name;
    }

    public void pkmrename(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }

    public ArrayList<Skill> getSkill(){
        return skills;
    }

    public void new_game(String name){
        this.name = name;
    }

    public void damage(int value, int mn){
        if(hp == 0 || mana == 0){
            //return false;
        }

        currentHP = hp - value;
        currentMANA = mana - mn;

        if(currentHP >= 0){
            this.hp = currentHP;
        }
        else{
            this.hp = 0;
        }

        if(currentMANA >= 0){
            this.mana = currentMANA;
        }
        else{
            this.mana = 0;
        } 
        //return true;
    }

    public abstract void attack1(Pokemon enemy, Pokemon myPokemon, Skill sk);
    public abstract void attack2(Pokemon enemy, Pokemon myPokemon, Skill sk);
    public abstract void attack3(Pokemon enemy, Pokemon myPokemon, Skill sk);
    public abstract void attack4(Pokemon enemy, Pokemon myPokemon, Skill sk);
}