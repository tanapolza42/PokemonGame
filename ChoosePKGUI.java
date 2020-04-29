import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ChoosePKGUI extends JFrame {
    private Trainer trainer;
    private String name;
    private Shop shop;
    private ArrayList<Pokemon> bag;
    private int no = 0;
    private int pkmno = 0;
    private int enemyno = 0;
    private Pokemon enemy;

    public ChoosePKGUI(Trainer trainer){
        super("Pokemon Game");
        this.trainer = trainer;
        this.name = trainer.getName();
        this.shop = trainer.getShop();
        this.bag = trainer.getBag();

        enemy = new Pikachu("Wild Pikachu");

        setVisible(true);
        setSize(1280,900);
        setResizable(false);
        setTitle("POKEMON CHOOSER MODE");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        JLabel background;
        JButton back = new JButton("Back");
        JButton ok = new JButton("ok");

        //COIN LINKER
        JLabel coin = new JLabel(Integer.toString(shop.get_coin()));
        coin.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        coin.setBounds(200,60,150,50);

        JLabel potion = new JLabel(Integer.toString(shop.get_potion()));
        potion.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        potion.setBounds(180,820,150,50);

        JLabel energy = new JLabel(Integer.toString(shop.get_energydrink()));
        energy.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        energy.setBounds(450,820,150,50);

        JLabel pokeball = new JLabel(Integer.toString(shop.get_pokeball()));
        pokeball.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        pokeball.setBounds(780,820,150,50);
        
        JLabel fruity = new JLabel(Integer.toString(shop.get_fruity()));
        fruity.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        fruity.setBounds(1090,820,150,50);

        ok.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        ok.setBounds(580,735,80,50);

        back.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        back.setBounds(1200,850,80,50);

        ImageIcon bg = new ImageIcon("choosebg.png");
        c.setLayout(new FlowLayout());
        background = new JLabel(bg);
        background.setLayout(null);
        background.setBounds(0,0,1280,900);
        
        c.add(background);
        pack();

        background.add(back);
        background.add(ok);
        // background.add(coin);
        // background.add(potion);
        // background.add(energy);
        // background.add(pokeball);
        // background.add(fruity);
        pack();

        int i=0;

        JButton pkm[] = {new JButton(), new JButton(), new JButton(), new JButton(), new JButton(), new JButton()};
        JButton enemypkm[] = {new JButton(), new JButton(), new JButton(), new JButton(), new JButton(), new JButton()};

        //mypkm
        int y = 300;
        for(Pokemon p: trainer.getBag()){
            pkm[i].setFont(new Font("Comic Sans MS", Font.BOLD, 20));
            pkm[i].setText(" " + p.getName());
            pkm[i].setBounds(150,y,250,40);
            background.add(pkm[i]);
            y = y + 70;
            i++;
        }
        
        //test
        ArrayList<Pokemon> pokemons = PokemonRandom.getPokemons(5);
        int z = 300;
        i = 0;
        for(Pokemon p: pokemons){
            enemypkm[i].setFont(new Font("Comic Sans MS", Font.BOLD, 20));
            enemypkm[i].setText(" " + p.getName());
            enemypkm[i].setBounds(880,z,250,40);
            background.add(enemypkm[i]);
            z = z + 70;
            i++;
        }

        //mypkm
        pkm[0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println(" " + trainer.getBag().get(0));
                pkmno = 0;
            }
        });

        pkm[1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println(" " + trainer.getBag().get(1));
                pkmno = 1;
            }
        });

        pkm[2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pkmno = 2;
            }
        });

        pkm[3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println(" " + trainer.getBag().get(3));
                pkmno = 3;
            }
        });

        pkm[4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println(" " + trainer.getBag().get(4));
                pkmno = 4;
            }
        });

        pkm[5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println(" " + trainer.getBag().get(5));
                pkmno = 5;
            }
        });


        //enemy
        enemypkm[0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println(" " + pokemons.get(0));
                enemyno = 0;
            }
        });

        enemypkm[1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println(" " + pokemons.get(1));
                enemyno = 1;
            }
        });

        enemypkm[2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println(" " + pokemons.get(2));
                enemyno = 2;
            }
        });

        enemypkm[3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println(" " + pokemons.get(3));
                enemyno = 3;
            }
        });

        enemypkm[4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println(" " + pokemons.get(4));
                enemyno = 4;
            }
        });

        enemypkm[5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println(" " + pokemons.get(5));
                enemyno = 5;
            }
        });

        ok.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Back To MainGame");
                if(pkmno == 0 && enemyno == 0){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(0),pokemons.get(0));
                }else if(pkmno == 0 && enemyno == 1){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(0),pokemons.get(1));
                }else if(pkmno == 0 && enemyno == 2){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(0),pokemons.get(2));
                }else if(pkmno == 0 && enemyno == 3){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(0),pokemons.get(3));
                }else if(pkmno == 0 && enemyno == 4){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(0),pokemons.get(4));
                }else if(pkmno == 0 && enemyno == 5){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(0),pokemons.get(5));
                }else if(pkmno == 1 && enemyno == 0){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(1),pokemons.get(0));
                }else if(pkmno == 1 && enemyno == 1){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(1),pokemons.get(1));
                }else if(pkmno == 1 && enemyno == 2){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(1),pokemons.get(2));
                }else if(pkmno == 1 && enemyno == 3){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(1),pokemons.get(3));
                }else if(pkmno == 1 && enemyno == 4){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(1),pokemons.get(4));
                }else if(pkmno == 1 && enemyno == 5){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(1),pokemons.get(5));
                }else if(pkmno == 2 && enemyno == 0){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(2),pokemons.get(0));
                }else if(pkmno == 2 && enemyno == 1){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(2),pokemons.get(1));
                }else if(pkmno == 2 && enemyno == 2){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(2),pokemons.get(2));
                }else if(pkmno == 2 && enemyno == 3){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(2),pokemons.get(3));
                }else if(pkmno == 2 && enemyno == 4){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(2),pokemons.get(4));
                }else if(pkmno == 2 && enemyno == 5){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(2),pokemons.get(5));
                }else if(pkmno == 3 && enemyno == 0){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(3),pokemons.get(0));
                }else if(pkmno == 3 && enemyno == 1){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(3),pokemons.get(1));
                }else if(pkmno == 3 && enemyno == 2){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(3),pokemons.get(2));
                }else if(pkmno == 3 && enemyno == 3){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(3),pokemons.get(3));
                }else if(pkmno == 3 && enemyno == 4){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(3),pokemons.get(4));
                }else if(pkmno == 3 && enemyno == 5){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(3),pokemons.get(5));
                }else if(pkmno == 4 && enemyno == 0){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(4),pokemons.get(0));
                }else if(pkmno == 4 && enemyno == 1){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(0),pokemons.get(0));
                }else if(pkmno == 4 && enemyno == 2){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(4),pokemons.get(2));
                }else if(pkmno == 4 && enemyno == 3){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(4),pokemons.get(3));
                }else if(pkmno == 4 && enemyno == 4){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(4),pokemons.get(4));
                }else if(pkmno == 4 && enemyno == 5){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(4),pokemons.get(5));
                }else if(pkmno == 5 && enemyno == 0){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(5),pokemons.get(0));
                }else if(pkmno == 5 && enemyno == 1){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(5),pokemons.get(1));
                }else if(pkmno == 5 && enemyno == 2){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(5),pokemons.get(2));
                }else if(pkmno == 5 && enemyno == 3){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(5),pokemons.get(3));
                }else if(pkmno == 5 && enemyno == 4){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(5),pokemons.get(4));
                }else if(pkmno == 5 && enemyno == 5){
                    BattleGUI beat = new BattleGUI(trainer,trainer.getBag().get(5),pokemons.get(5));
                }
                    setVisible(false);
            }
        });
        

        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Back To MainGame");
                    MainGame mg = new MainGame(trainer);
                    setVisible(false);
            }
        });

    }
}