import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class BattleGUI extends JFrame {
    private Trainer trainer;
    private String name;
    private Shop shop;
    private Pokemon pokemon;
    private Pokemon enemy;
    private ArrayList<Pokemon> bag;


    public BattleGUI(Trainer trainer,Pokemon pokemon, Pokemon enm){
        super("Pokemon Game");
        this.trainer = trainer;
        this.name = trainer.getName();
        this.shop = trainer.getShop();
        this.bag = trainer.getBag();
        this.pokemon = pokemon;

        enemy = enm;

        setVisible(true);
        setSize(1280,900);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("POKEMON BATTLE MODE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.println(" " + pokemon);

        Container c = getContentPane();
        
        JButton back = new JButton("Back");
        JButton potion = new JButton("POTION");
        JButton energy = new JButton("ENERGY");
        JButton pokeball = new JButton("POKEBALL");
        JButton berry = new JButton("BERRY");

        JButton norAttack = new JButton("ATTACK");
        JButton Attack = new JButton("SKILL1");
        JButton Attack2 = new JButton("SKILL2");
        JButton Attack3 = new JButton("SKILL3");
        JButton Attack4 = new JButton("SKILL4");

        int id = pokemon.getID();
        int idenm = enemy.getID();
        //SET POKEMON
        JLabel pk1;
        JLabel pk2;
        ImageIcon bg0 = new ImageIcon("new_beatpikachu.png");
        ImageIcon bg1 = new ImageIcon("new_beatraichu.png");
        ImageIcon bg2 = new ImageIcon("new_beatbulbasaur.png");
        ImageIcon bg3 = new ImageIcon("new_beatcharmander.png");
        ImageIcon bg4 = new ImageIcon("new_beatkabigon.png");
        ImageIcon bg5 = new ImageIcon("new_beatpidgey.png");

        
        JLabel potions = new JLabel(Integer.toString(shop.get_potion()));
            potions.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
            potions.setBounds(90,765,30,30);

        JLabel energys = new JLabel(Integer.toString(shop.get_energydrink()));
            energys.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
            energys.setBounds(225,765,30,30);

        JLabel pokeballs = new JLabel(Integer.toString(shop.get_pokeball()));
            pokeballs.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
            pokeballs.setBounds(360,765,30,30);
            
        JLabel fruitys = new JLabel(Integer.toString(shop.get_fruity()));
            fruitys.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
            fruitys.setBounds(495,765,30,30);

        JLabel background;

        JLabel pkname = new JLabel(pokemon.getName());
        JLabel hp = new JLabel("" + (pokemon.getHP()) + "/" + pokemon.getmaxHp() + " HP");
        JLabel mana = new JLabel("" + pokemon.getMANA() + "/" + pokemon.getmaxMp() + " MP");

        JLabel enmname = new JLabel(enemy.getName());
        JLabel enmhp = new JLabel("" + (enemy.getHP()) + "/" + enemy.getmaxHp() + " HP");
        JLabel enmmana = new JLabel("" + enemy.getMANA() + "/" + enemy.getmaxMp() + " MP");

        JFrame frame = new JFrame();



        //pkmstat
        pkname.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        pkname.setBounds(311,480,200,50);
        hp.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        hp.setBounds(315,508,100,50);
        mana.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        mana.setBounds(315,535,100,50);

        //enemystat
        enmname.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        enmname.setBounds(950,480,200,50);
        enmhp.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        enmhp.setBounds(950,508,100,50);
        enmmana.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        enmmana.setBounds(950,535,100,50);



        // bt bag set
        potion.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        potion.setBounds(0,850,130,30);

        energy.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        energy.setBounds(130,850,130,30);

        pokeball.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        pokeball.setBounds(260,850,140,30);

        berry.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        berry.setBounds(390,850,130,30);

        back.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        back.setBounds(1200,850,80,50);

        // bt attack set 
        norAttack.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        norAttack.setBounds(550,850,130,30);

        Attack.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        Attack.setBounds(680,850,130,30);

        Attack2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        Attack2.setBounds(810,850,130,30);

        Attack3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        Attack3.setBounds(940,850,130,30);

        Attack4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        Attack4.setBounds(1070,850,130,30);

        ImageIcon bg = new ImageIcon("battlebg.png");
        c.setLayout(new FlowLayout());
        background = new JLabel(bg);
        background.setLayout(null);

        //set PKM location
        pk1 = new JLabel(bg0);
        pk1.setLayout(null);
        pk1.setBounds(179,177,331,476);

        pk2 = new JLabel(bg0);
        pk2.setLayout(null);
        pk2.setBounds(810,177,331,476);

        if(id == 0){
            pk1.setIcon(bg0);
        }else if(id == 1){
            pk1.setIcon(bg1);
        }else if(id == 2){
            pk1.setIcon(bg2);
        }else if(id == 3){
            pk1.setIcon(bg3);
        }else if(id == 4){
            pk1.setIcon(bg4);
        }else if(id == 5){
            pk1.setIcon(bg5);
        }

        if(idenm == 0){
            pk2.setIcon(bg0);
        }else if(idenm == 1){
            pk2.setIcon(bg1);
        }else if(idenm == 2){
            pk2.setIcon(bg2);
        }else if(idenm == 3){
            pk2.setIcon(bg3);
        }else if(idenm == 4){
            pk2.setIcon(bg4);
        }else if(idenm == 5){
            pk2.setIcon(bg5);
        }
        
        c.add(background);
        pack();

        //show stat mypkm
        background.add(pkname);
        background.add(hp);
        background.add(mana);

        //show stat enmpkm
        background.add(enmname);
        background.add(enmhp);
        background.add(enmmana);

        //counter stock
        background.add(potions);
        background.add(energys);
        background.add(pokeballs);
        background.add(fruitys);

        //add PKM BEAT
        background.add(pk1);
        background.add(pk2);

        //bt Bag
        background.add(back);
        background.add(potion);
        background.add(energy);
        background.add(pokeball);
        background.add(berry);

        //bt Attack
        background.add(norAttack);
        background.add(Attack);
        background.add(Attack2);
        background.add(Attack3);
        background.add(Attack4);


        potion.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(shop.get_potion() >= 1 && ((pokemon.getHP()+50) <= pokemon.getmaxHp())){
                    System.out.println("USE POTION");
                    shop.use_potion(pokemon);
                    potions.setText(" " + shop.get_potion());
                    hp.setText("" + (pokemon.getHP()) + "/" + pokemon.getmaxHp() + " HP");
                    System.out.println("" + (pokemon.getHP()) + "/" + pokemon.getmaxHp() + " HP");
                }else{
                    JOptionPane.showMessageDialog(frame,"OUT OF POTION Or MAX HP!!","BATTLE GUI WARNING",JOptionPane.ERROR_MESSAGE);
                }
                
                setVisible(true);
                }
        });
        
        energy.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(shop.get_energydrink() >= 1 && ((pokemon.getMANA()+50) <= pokemon.getmaxMp())){
                    System.out.println("USE ENERGY");
                    shop.use_energydrink(pokemon);
                    energys.setText(" " + shop.get_energydrink());
                    mana.setText("" + (pokemon.getMANA()) + "/" + pokemon.getmaxMp() + " MP");
                }else{
                    JOptionPane.showMessageDialog(frame,"OUT OF ENERGY DRINK Or MAX MP!!","BATTLE GUI WARNING",JOptionPane.ERROR_MESSAGE);
                }
                setVisible(true);
                }
        });

        pokeball.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int rand = (int)(Math.random() * 2) + 1;
                System.out.println("rand: " + rand);
                if(shop.get_pokeball() >= 1){
                    System.out.println("USE POKEBALL");
                        if(rand == 1 && (enemy.getHP() < 100)){
                            shop.use_pokeballs(trainer.getBag(),enemy);
                            enemy.rehp();
                            enemy.remp();
                            pokemon.remp();
                            pokemon.rehp();
                            shop.add_coin(50);
                            pokeballs.setText(" " + shop.get_pokeball());
                            JOptionPane.showMessageDialog(frame,"YOU GOT IT!!","BATTLE GUI WARNING",JOptionPane.ERROR_MESSAGE);
                            MainGame mg = new MainGame(trainer);
                            setVisible(false);
                        }else if(rand == 2){
                            shop.use_pokeballs_fail(trainer.getBag(),enemy);
                            pokeballs.setText(" " + shop.get_pokeball());
                            JOptionPane.showMessageDialog(frame,"CATCH IT FAIL!!","BATTLE GUI WARNING",JOptionPane.ERROR_MESSAGE);
                        }
                
                }else{
                    JOptionPane.showMessageDialog(frame,"OUT OF POKEBALL!!","BATTLE GUI WARNING",JOptionPane.ERROR_MESSAGE);
                }

                }
                
        });

        berry.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(shop.get_fruity() >= 1 && ( (pokemon.getHP()+10) <= (pokemon.getmaxHp()))){
                    System.out.println("USE BERRY");
                    shop.use_fruity(pokemon);
                    fruitys.setText(" " + shop.get_fruity());
                    hp.setText("" + pokemon.getHP() + "/" + pokemon.getmaxHp() + " HP");
                }else{
                    JOptionPane.showMessageDialog(frame,"OUT OF BERRY Or MAX HP!!","BATTLE GUI WARNING",JOptionPane.ERROR_MESSAGE);
                }
                setVisible(true);
                }
        });

        norAttack.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Normal Attack");
                
                if(pokemon.getHP() <= 0){
                    JOptionPane.showMessageDialog(frame,"GAME OVER.","GWarning!!",JOptionPane.ERROR_MESSAGE);
                    MainGame mg = new MainGame(trainer);
                }else if(pokemon.getHP() >= 0){
                    //pokemon.damage(0,30);
                    enemy.damage((int)(Math.random() * 30)+5,0);
                    pokemon.damage(10,0);
                }
                if(enemy.getHP() <= 0){
                    JOptionPane.showMessageDialog(frame,"YOU GOT IT!!","Congrat!!",JOptionPane.ERROR_MESSAGE);
                    enemy.rehp();
                    enemy.remp();
                    pokemon.remp();
                    pokemon.rehp();
                    shop.add_coin(50);
                    bag.add(enemy);
                    MainGame mg = new MainGame(trainer);
                }

                //pkm stat
                hp.setText("" + pokemon.getHP() + "/" + pokemon.getmaxHp() + " HP");
                mana.setText("" + (pokemon.getMANA()) + "/" + pokemon.getmaxMp() + " MP");
                //enm stat
                enmhp.setText("" + enemy.getHP() + "/" + enemy.getmaxHp() + " HP");
                enmmana.setText("" + (enemy.getMANA()) + "/" + enemy.getmaxMp() + " MP");
            }
        });

        Attack.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("SKILL 1");
                
                if(pokemon.getHP() <= 0){
                    JOptionPane.showMessageDialog(frame,"GAME OVER.","GWarning!!",JOptionPane.ERROR_MESSAGE);
                    MainGame mg = new MainGame(trainer);
                }else if(pokemon.getMANA() <= 10){
                    JOptionPane.showMessageDialog(frame,"NOT ENOUGH MANA.","Warning!!",JOptionPane.ERROR_MESSAGE);
                }else if((pokemon.getMANA() >= 10) && (pokemon.getHP() >= 0)){
                    pokemon.damage(0,10);
                    enemy.damage((int)(Math.random() * 60)+20,0);
                    pokemon.damage((int)(Math.random() * 40)+5,0);
                }
                if(enemy.getHP() <= 0){
                    JOptionPane.showMessageDialog(frame,"YOU GOT IT!!","Congrat!!",JOptionPane.ERROR_MESSAGE);
                    enemy.rehp();
                    enemy.remp();
                    pokemon.remp();
                    pokemon.rehp();
                    shop.add_coin(50);
                    bag.add(enemy);
                    MainGame mg = new MainGame(trainer);
                }

                //pkm stat
                hp.setText("" + pokemon.getHP() + "/" + pokemon.getmaxHp() + " HP");
                mana.setText("" + (pokemon.getMANA()) + "/" + pokemon.getmaxMp() + " MP");
                //enm stat
                enmhp.setText("" + enemy.getHP() + "/" + enemy.getmaxHp() + " HP");
                enmmana.setText("" + (enemy.getMANA()) + "/" + enemy.getmaxMp() + " MP");
            }
        });

        Attack2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("SKILL 2");
                
                if(pokemon.getHP() <= 0){
                    JOptionPane.showMessageDialog(frame,"GAME OVER.","GWarning!!",JOptionPane.ERROR_MESSAGE);
                    MainGame mg = new MainGame(trainer);
                }else if(pokemon.getMANA() <= 20){
                    JOptionPane.showMessageDialog(frame,"NOT ENOUGH MANA.","Warning!!",JOptionPane.ERROR_MESSAGE);
                }else if(pokemon.getMANA() >= 20 && pokemon.getHP() >= 0){
                    pokemon.damage(0,20);
                    enemy.damage((int)(Math.random() * 60)+20,0);
                    pokemon.damage((int)(Math.random() * 40)+5,0);
                }
                if(enemy.getHP() <= 0){
                    JOptionPane.showMessageDialog(frame,"YOU GOT IT!!","Congrat!!",JOptionPane.ERROR_MESSAGE);
                    enemy.rehp();
                    enemy.remp();
                    pokemon.remp();
                    pokemon.rehp();
                    shop.add_coin(50);
                    bag.add(enemy);
                    MainGame mg = new MainGame(trainer);
                }

                //pkm stat
                hp.setText("" + pokemon.getHP() + "/" + pokemon.getmaxHp() + " HP");
                mana.setText("" + (pokemon.getMANA()) + "/" + pokemon.getmaxMp() + " MP");
                //enm stat
                enmhp.setText("" + enemy.getHP() + "/" + enemy.getmaxHp() + " HP");
                enmmana.setText("" + (enemy.getMANA()) + "/" + enemy.getmaxMp() + " MP");
            }
        });

        Attack3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("SKILL 3");

                if(pokemon.getHP() <= 0){
                    JOptionPane.showMessageDialog(frame,"GAME OVER.","GWarning!!",JOptionPane.ERROR_MESSAGE);
                    MainGame mg = new MainGame(trainer);
                }else if(pokemon.getMANA() <= 30){
                    JOptionPane.showMessageDialog(frame,"NOT ENOUGH MANA.","Warning!!",JOptionPane.ERROR_MESSAGE);
                }else if(pokemon.getMANA() >= 30 && pokemon.getHP() >= 0){
                    pokemon.damage(0,30);
                    enemy.damage((int)(Math.random() * 60)+20,0);
                    pokemon.damage((int)(Math.random() * 40)+5,0);
                } 
                if(enemy.getHP() <= 0){
                    JOptionPane.showMessageDialog(frame,"YOU GOT IT!!","Congrat!!",JOptionPane.ERROR_MESSAGE);
                    enemy.rehp();
                    enemy.remp();
                    pokemon.remp();
                    pokemon.rehp();
                    shop.add_coin(50);
                    bag.add(enemy);
                    MainGame mg = new MainGame(trainer);
                }

                //pkm stat
                hp.setText("" + pokemon.getHP() + "/" + pokemon.getmaxHp() + " HP");
                mana.setText("" + (pokemon.getMANA()) + "/" + pokemon.getmaxMp() + " MP");
                //enm stat
                enmhp.setText("" + enemy.getHP() + "/" + enemy.getmaxHp() + " HP");
                enmmana.setText("" + (enemy.getMANA()) + "/" + enemy.getmaxMp() + " MP");
            }
        });

        Attack4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("SKILL 4");

                if(pokemon.getHP() <= 0){
                    JOptionPane.showMessageDialog(frame,"GAME OVER.","GWarning!!",JOptionPane.ERROR_MESSAGE);
                    MainGame mg = new MainGame(trainer);
                }else if(pokemon.getMANA() <= 40){
                    JOptionPane.showMessageDialog(frame,"NOT ENOUGH MANA.","Warning!!",JOptionPane.ERROR_MESSAGE);
                }else if(pokemon.getMANA() >= 40 && pokemon.getHP() >= 0){
                    pokemon.damage(0,40);
                    enemy.damage((int)(Math.random() * 60)+20,0);
                    pokemon.damage((int)(Math.random() * 40)+5,0);
                }
                if(enemy.getHP() <= 0){
                    JOptionPane.showMessageDialog(frame,"YOU GOT IT!!","Congrat!!",JOptionPane.ERROR_MESSAGE);
                    enemy.rehp();
                    pokemon.rehp();
                    shop.add_coin(50);
                    bag.add(enemy);
                    MainGame mg = new MainGame(trainer);
                }

                //pkm stat
                hp.setText("" + pokemon.getHP() + "/" + pokemon.getmaxHp() + " HP");
                mana.setText("" + (pokemon.getMANA()) + "/" + pokemon.getmaxMp() + " MP");
                //enm stat
                enmhp.setText("" + enemy.getHP() + "/" + enemy.getmaxHp() + " HP");
                enmmana.setText("" + (enemy.getMANA()) + "/" + enemy.getmaxMp() + " MP");
            }
        });

        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Back To MainGame");
                    ChoosePKGUI cs = new ChoosePKGUI(trainer);
                    setVisible(false);
            }
        });
    
    }
}