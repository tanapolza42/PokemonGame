public class pokemon {
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