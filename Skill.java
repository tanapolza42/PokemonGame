import java.util.*;

public class Skill {
    private String NameSkill = "";
    private int damage = 0;
    private int mana = 0;
    
    public Skill(){

    }

    public Skill(String NameSkill, int damage, int mana){
        this.NameSkill = NameSkill;
        this.damage = damage;
        this.mana = mana;
    }

    public String get_skillname(){
        return NameSkill;
    }

    public int get_damage(){
        return damage;
    }

    public int get_mana(){
        return mana;
    }

}