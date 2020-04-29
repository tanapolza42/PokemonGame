import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ShopGUI extends JFrame {
    private Trainer trainer;
    private String name;
    private Shop shop;

    public ShopGUI(Trainer trainer){
        super("Pokemon Game");
        this.trainer = trainer;
        this.name = trainer.getName();
        this.shop = trainer.getShop();

        setVisible(true);
        setSize(1280,900);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("POKEMON SHOP MODE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //BUY BUTTON
        JLabel background;
        JButton buyPotion = new JButton("Potion!");
        JButton buyEnergy = new JButton("Energy!");
        JButton buyPokeball = new JButton("Pokeball!");
        JButton buyBerry = new JButton("Berry!");
        JButton back = new JButton("Back");
        JFrame frame = new JFrame();

        //COIN LINKER
        JLabel coin = new JLabel(Integer.toString(shop.get_coin()));
        coin.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        coin.setBounds(200,30,150,50);

        //BUY BUTTON
        buyPotion.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        buyPotion.setBounds(1000,200,150,50);

        buyEnergy.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        buyEnergy.setBounds(1000,400,150,50);

        buyPokeball.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        buyPokeball.setBounds(1000,600,150,50);

        buyBerry.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        buyBerry.setBounds(1000,800,150,50);

        back.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        back.setBounds(1200,850,80,50);


        Container c = getContentPane();
        ImageIcon bg = new ImageIcon("storeshop.png");
        c.setLayout(new FlowLayout());
        background = new JLabel(bg);
        background.setLayout(null);

        c.add(background);
        pack();

        background.add(buyPotion);
        background.add(buyEnergy);
        background.add(buyPokeball);
        background.add(buyBerry);
        background.add(back);
        background.add(coin);

        buyPotion.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               
                if(shop.get_coin() >= 20){
                    shop.add_potion(1,20);
                        System.out.println("Buy Potion");
                    System.out.println("Coin: "+ shop.get_coin() + "\n"+"Potion: "+ shop.get_potion());
                    coin.setText(" "+ shop.get_coin());
                }else{
                    System.out.println("Not Enough Coins");
                    JOptionPane.showMessageDialog(frame,"NOT ENOUGH COIN.","SHOP GUI WARNING!!",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        buyEnergy.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(shop.get_coin() >= 30){
                    shop.add_energydrink(1,30);
                        System.out.println("Buy Energy");
                    System.out.println("Coin: "+ shop.get_coin() + "\n"+"Energy: "+ shop.get_energydrink());
                    coin.setText(" "+ shop.get_coin());
                }else{
                    System.out.println("Not Enough Coins");
                    JOptionPane.showMessageDialog(frame,"NOT ENOUGH COIN.","SHOP GUI WARNING!!",JOptionPane.ERROR_MESSAGE);
                }
            
            }
        });

        buyPokeball.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(shop.get_coin() >= 50){
                    shop.add_pokeball(1, 50);
                        System.out.println("Buy Pokeball");
                    System.out.println("Coin: "+ shop.get_coin() + "\n"+"Pokeball: "+ shop.get_pokeball());
                    coin.setText(" "+ shop.get_coin());
                }else{
                    System.out.println("Not Enough Coins");
                    JOptionPane.showMessageDialog(frame,"NOT ENOUGH COIN.","SHOP GUI WARNING!!",JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        buyBerry.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(shop.get_coin() >= 10){
                    shop.add_fruity(1, 10);
                        System.out.println("Buy Berry");
                    System.out.println("Coin: "+ shop.get_coin() + "\n"+"Berry: "+ shop.get_fruity());
                    coin.setText(" "+ shop.get_coin());
                }else{
                    System.out.println("Not Enough Coins");
                    JOptionPane.showMessageDialog(frame,"NOT ENOUGH COIN.","SHOP GUI WARNING!!",JOptionPane.ERROR_MESSAGE);
                }
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