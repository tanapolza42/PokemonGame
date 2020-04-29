import java.rmi.activation.ActivationDesc;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PokemonStat extends JFrame{
    private Trainer trainer;
    private String name;
    private Shop shop;
    private ArrayList<Pokemon> bag;
    
    public PokemonStat(Trainer trainer){
            super("Pokkemon Game");
            this.trainer = trainer;
            this.name = trainer.getName();
            this.shop = trainer.getShop();
            this.bag = trainer.getBag();

            setVisible(true);
            setSize(1280, 900);
            setResizable(false);
            setLocationRelativeTo(null);
            setTitle("POKEMON INVENTORY MODE");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Container c = getContentPane();

            JLabel background;
            JButton back = new JButton("Back");

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

            back.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
            back.setBounds(1200,850,80,50);

            ImageIcon bg = new ImageIcon("inventorybg.png");
            c.setLayout(new FlowLayout());
            background = new JLabel(bg);
            background.setLayout(null);
            background.setBounds(0,0,1280,900);
            
            c.add(background);
            pack();

            background.add(back);
            background.add(coin);
            background.add(potion);
            background.add(energy);
            background.add(pokeball);
            background.add(fruity);
            pack();

            int i=0;

            JButton pkm[] = {new JButton(), new JButton(), new JButton(), new JButton(), new JButton(), new JButton()};
            int y = 300;
            for(Pokemon p: trainer.getBag()){
                pkm[i].setFont(new Font("Comic Sans MS", Font.BOLD, 20));
                pkm[i].setText(" " + p.getName());
                pkm[i].setBounds(150,y,250,40);
                background.add(pkm[i]);
                y = y + 70;
                i++;
            }
        
            pkm[0].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    new PokemonStatus(trainer.getBag().get(0));
                }
            });

            pkm[1].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    PokemonStatus ps = new PokemonStatus(trainer.getBag().get(1));
                    
                }
            });

            pkm[2].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    PokemonStatus ps = new PokemonStatus(trainer.getBag().get(2));
                }
            });

            pkm[3].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    PokemonStatus ps = new PokemonStatus(trainer.getBag().get(3));
                }
            });

            pkm[4].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    PokemonStatus ps = new PokemonStatus(trainer.getBag().get(4));
                }
            });

            pkm[5].addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    PokemonStatus ps = new PokemonStatus(trainer.getBag().get(5));
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