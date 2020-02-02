import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class pokemon {
    public static void main(String args[]){
        Scanner myObj  = new Scanner(System.in);
        Random rand = new Random();
        
        int Enemy[]; // enemy hp
            Enemy = new int[2];
            Enemy[0] = 300; //HP
            Enemy[1] = 100; //SP

        int mypk[]; //pokemon
            mypk = new int[2];
            mypk[0] = 500; //HP
            mypk[1] = 150; //SP
    

            System.out.println("Status Of Fight"); // show status
            System.out.println("My Pokemon HP : "+ mypk[0]);
            System.out.println("My Pokemon SP : "+ mypk[1]);
            System.out.println("Enemy HP : "+ Enemy[0]);
            System.out.println("Enemy SP : "+ Enemy[1]);

        while(true){
            System.out.println("_________________________________________");
            System.out.println("Your Turn Fighting!!");
            System.out.println("Choose Your Action");
            System.out.println("1 : Attack");
            System.out.println("2 : Double Attack");
            System.out.println("3 : Skill Attack");
            System.out.println("4 : Heal");
            System.out.println("5 : Charge SP");
            System.out.println("6 : Surrender!!");
            
            System.out.print("Enter Your Pokemon Action : ");
            int Mode = myObj.nextInt(); //input for action
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            if(Mode == 1){
                Normal_attacked(Enemy,mypk);

            }else if(Mode == 2){
                Double_attacked(Enemy,mypk);

            }else if(Mode == 3){
                Skill_attacked(Enemy,mypk);

            }else if(Mode == 4){
                Heal(Enemy,mypk);

            }else if(Mode == 5){
                Charge(Enemy,mypk);

            }else if(Mode == 6){
                System.out.println("Give Up!!");
                break;

            }else if(Mode > 3 || Mode < 1){
                System.out.println("Out of Action");
            }

            
            if(Enemy[0] <= 0){
                System.out.println("++++++++Enemy Was Passed Away. +++++++++");
                break;
            }
            if(mypk[0] <= 0){   
                System.out.println("++++++++++++My Pokemon Death++++++++++++");
                break;
            }
            if(mypk[1]<= 0){
                System.out.println("___________My SP is not Enough___________");
                System.out.println("_______________Game Over!!_______________");
                break;
            }

            //attacked(yourPokemon);
            System.out.println("My Pokemon HP : " + mypk[0]);
            System.out.println("My Pokemon SP : " + mypk[1]); 
            System.out.println("Enemy HP : " + Enemy[0]);
            
        }
        
    } 

    public static int Normal_attacked(int x[],int y[]){
        x[0] = x[0] - 20;  //-hp20 from enemy
        System.out.println("( 20 Damage )");
        return 0;
    }

    public static int Double_attacked(int x[],int y[]){
        x[0] = x[0] - 40;  //-hp40 from enemy
        y[1] = y[1] - 20;  //-sp20 from mypk
        System.out.println("( 40 Damage and use 20SP )");
        
        return 0;
    }

    public static int Skill_attacked(int x[],int y[]){
        x[0] = x[0] - 60;  //-hp60 from enemy
        y[1] = y[1] - 40;  //-sp40 from mypk
        System.out.println("( 60 Damage and use 40SP )");
        
        return 0;
    }

    public static int Heal(int x[],int y[]){
        y[0] = y[0] + 50;  //+hp50 to mypk
        System.out.println("( Heal 50HP )");
        
        return 0;
    }
    public static int Charge(int x[],int y[]){
        y[1] = y[1] + 50;  //+sp50 to mypk
        y[0] = y[0] - 20;  //-hp20 from mypk
        System.out.println("( Charge 50SP and -20HP )");
        
        return 0;
    } 
}