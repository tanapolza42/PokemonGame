import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class PokemonGame {
    public static void main(String args[]){
        pokemon game = new pokemon(); 
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
                game.Normal_attacked(Enemy,mypk);

            }else if(Mode == 2){
                game.Double_attacked(Enemy,mypk);

            }else if(Mode == 3){
                game.Skill_attacked(Enemy,mypk);

            }else if(Mode == 4){
                game.Heal(Enemy,mypk);

            }else if(Mode == 5){
                game.Charge(Enemy,mypk);

            }else if(Mode == 6){
                System.out.println("Give Up!!");
                break;

            }else if(Mode > 3 || Mode < 1){
                System.out.println("Out of Action");
            }

            
            if(Enemy[0] <= 0){
                System.out.println("++++++++Enemy Was Passed Away.+++++++++");
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

}