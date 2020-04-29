import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PokemonGame extends JFrame{
    public PokemonGame(){
        super("POKEMON GAME");
        Container c = getContentPane();
                
        JLabel background;
        ImageIcon bg = new ImageIcon("bgg.jpg");
        JButton start = new JButton();

        start.setIcon(new ImageIcon("btstart.png"));

        //bg
        c.setLayout(new FlowLayout());
        background = new JLabel(bg);
        background.setLayout(null);
        c.add(background);
        pack();
        
        start.setFont(new Font("Layiji MaHaNiYom V1.5 OT", Font.BOLD, 20));
        start.setBounds(500,700,300,90);
        
        background.add(start);

        start.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String name = JOptionPane.showInputDialog(null, "Enter Your Name: ", "SET NAME", JOptionPane.PLAIN_MESSAGE);
                    if(name != null){
                        setVisible(false);
                        Trainer t = new Trainer(name);
                        MainGame mg = new MainGame(t);
                    }
            }
        });
        setSize(1280,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        new PokemonGame();
    }

}