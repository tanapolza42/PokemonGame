import java.rmi.activation.ActivationDesc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.*;

public class Pkmstat1 extends JFrame{

    private Trainer trainer;
    private ArrayList<Pokemon> pokemons;
    private String name;
    
    public Pkmstat1(Trainer trainer){
        super("Pokemon Game");
        this.pokemons = trainer.getBag();
        this.trainer = trainer;
        this.name = trainer.getName();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(644, 900);
        setVisible(true);

        Container c = getContentPane();
        c.setLayout(null);

        JLabel background;
        ImageIcon bg = new ImageIcon("pokedekpikachu.png");
            c.setLayout(new FlowLayout());
            background = new JLabel(bg);
            background.setLayout(null);


        
        JButton back = new JButton("Back");
        back.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        back.setBounds(1200,850,80,50);

        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Back To MainGame");
                    Trainer t = new Trainer(name);
                    MainGame mg = new MainGame(t);
                    setVisible(false);
            }
        });

        JLabel name = new JLabel(pokemons.get(0).getName());
        name.setBounds(0,0,80,40);
        JLabel hp = new JLabel("HP: " + pokemons.get(0).getHP());
        hp.setBounds(0,50,80,40);
        JLabel mp = new JLabel("MP: " + pokemons.get(0).getMANA());
        mp.setBounds(0,300,80,40);

        c.add(background);
        background.add(name);
        background.add(hp);
        background.add(mp);
    }

    

}