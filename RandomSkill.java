import java.util.*;

public class RandomSkill {
    
    public static ArrayList<Skill> ranSkill(){

        ArrayList<Skill> Skills = new ArrayList<Skill>();
        int numofskill = 8;
        

        for(int i = 0; i < numofskill; i++){
            int num = (int)(Math.random() * 8);
            int count = 0;
            if(num == 1){
                for(Skill s: Skills){
                    if(s.get_skillname().equals("NormalAttack"))
                        count++;
                }
                if(count == 0){
                    Skills.add(new NormalAttack());
                }
            }else if(num == 2){
                for(Skill s: Skills){
                    if(s.get_skillname().equals("Electrify"))
                        count++;
                }
                if(count == 0){
                    Skills.add(new Electrify());
                }

            }else if(num == 3){
                for(Skill s: Skills){
                    if(s.get_skillname().equals("Firer"))
                        count++;
                }
                if(count == 0){
                    Skills.add(new Firer());
                }

            }else if(num == 4){
                for(Skill s: Skills){
                    if(s.get_skillname().equals("Blizzard"))
                        count++;
                }
                if(count == 0){
                    Skills.add(new Blizzard());
                }

            }else if(num == 5){
                for(Skill s: Skills){
                    if(s.get_skillname().equals("Sandstorm"))
                        count++;
                }
                if(count == 0){
                    Skills.add(new Sandstorm());
                }

            }else if(num == 6){
                for(Skill s: Skills){
                    if(s.get_skillname().equals("Spark"))
                        count++;
                }
                if(count == 0){
                    Skills.add(new Spark());
                }

            }else if(num == 7){
                for(Skill s: Skills){
                    if(s.get_skillname().equals("Thunder"))
                        count++;
                }
                if(count == 0){
                    Skills.add(new Thunder());
                }

            }else if(num == 8){
                for(Skill s: Skills){
                    if(s.get_skillname().equals("Barrage"))
                        count++;
                }
                if(count == 0){
                    Skills.add(new Barrage());
                }
            }
        }
    return Skills; 
    }
}