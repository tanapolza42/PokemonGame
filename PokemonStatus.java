import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PokemonStatus extends JFrame {
    Pokemon pokemon;
    private Trainer trainer;
    private ArrayList<Pokemon> bag;

    public PokemonStatus(Pokemon pokemon){
        super("Pokemon Status:" + pokemon.getName());
        this.pokemon = pokemon;

        System.out.println("ID: " + pokemon.getID());

        Container c = getContentPane();

        JLabel background;

        int id = pokemon.getID();

        ImageIcon bg0 = new ImageIcon("pokedekpikachu.png");
        ImageIcon bg1 = new ImageIcon("pokedekraichu.png");
        ImageIcon bg2 = new ImageIcon("pokedekbulbasaur.png");
        ImageIcon bg3 = new ImageIcon("pokedekchamander.png");
        ImageIcon bg4 = new ImageIcon("pokedekkabigon.png");
        ImageIcon bg5 = new ImageIcon("pokedekpidgey.png");

        background = new JLabel(bg0);
        System.out.println("ID: " + pokemon.getID());
        background.setLayout(null);
        background.setBounds(0,0,644,900);
        c.add(background);
        pack();

        if(id == 0){
            background.setIcon(bg0);
        }else if(id == 1){
            background.setIcon(bg1);
        }else if(id == 2){
            background.setIcon(bg2);
        }else if(id == 3){
            background.setIcon(bg3);
        }else if(id == 4){
            background.setIcon(bg4);
        }else if(id == 5){
            background.setIcon(bg5);
        }


        JLabel pkname = new JLabel(pokemon.getName());
        JLabel hp = new JLabel("" + pokemon.getHP() + " HP");
        JLabel mana = new JLabel("" +pokemon.getMANA() + " MP");
        JButton back = new JButton("X");
        JButton rename = new JButton("RENAME");
        
        

        pkname.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        pkname.setBounds(270,550,200,50);
        hp.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        hp.setBounds(290,591,100,50);
        mana.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        mana.setBounds(290,635,100,50);

        back.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        back.setBounds(550,815,80,50);

        rename.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        rename.setBounds(220,800,200,50);

        background.add(pkname);
        background.add(hp);
        background.add(mana);

        //bt
        background.add(back); 
        background.add(rename);

        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Back To MainGame");
                    setVisible(false);
            }
        });

        rename.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String namepk = JOptionPane.showInputDialog(null, "Rename Pokemon: ","RENAME", JOptionPane.PLAIN_MESSAGE);
                System.out.println("Rename");
                if(namepk != null){
                    pokemon.pkmrename(namepk);
                    System.out.println("Rename Done");
                    pkname.setText(pokemon.getName());
                }
            }
        });
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(644,900);
        setLocationRelativeTo(null);
        setTitle("POKEMON STATUS");
        setVisible(true);

    }
}