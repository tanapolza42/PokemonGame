import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class MainGame extends JFrame {
    private Trainer trainer;
    private ArrayList<Pokemon> bag;
    private Shop shop;
    private String name;
    
    public MainGame(Trainer trainer){
        super("Pokemon Game");
        this.trainer = trainer;
        this.name = trainer.getName();

        Container c = getContentPane();

        JLabel trainerNameLabel = new JLabel(this.trainer.getName());
        JPanel header = new JPanel();
        JLabel pokemonName = new JLabel();
        JLabel trainername = new JLabel(name ,JLabel.CENTER);
        JButton firstPokemon = new JButton(trainer.getBag().get(0).getName() + "Status");
        JLabel background;
        
        JButton inventory = new JButton();
        JButton battle = new JButton();
        JButton shop = new JButton();
        JButton exit = new JButton();

        inventory.setIcon(new ImageIcon("btbag.png"));
        battle.setIcon(new ImageIcon("btbattle.png"));
        shop.setIcon(new ImageIcon("btshop.png"));
        exit.setIcon(new ImageIcon("btexit.png"));
        
        ImageIcon bg = new ImageIcon("bgg3.png");
        c.setLayout(new FlowLayout());
        background = new JLabel(bg);
        background.setLayout(null);
        background.setBounds(0,0,1280,900);
        c.add(background);
        c.setLayout(null);

        trainername.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
        trainername.setBounds(40,240,1200,100);
        header.add(trainername);
        background.add(trainername);

        battle.setBounds(500,350,300,90);
        inventory.setBounds(500,450,300,90);
        shop.setBounds(500,550,300,90);
        exit.setBounds(500,650,300,90);

        background.add(battle);
        background.add(inventory);
        background.add(shop);
        background.add(exit);

        battle.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    System.out.println("BATTLE");
                    ChoosePKGUI chooses = new ChoosePKGUI(trainer);
                    setVisible(false);
                }
            });

        inventory.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    System.out.println("INVENTORY");
                    PokemonStat pkstat = new PokemonStat(trainer);
                    setVisible(false);
                }
            });

        shop.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    System.out.println("SHOPPING");
                    ShopGUI sgui = new ShopGUI(trainer);
                    setVisible(false);
                }
            });

        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    System.out.println("EXIT GAME");
                    System.exit(0);
                }
            });


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280,900);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}