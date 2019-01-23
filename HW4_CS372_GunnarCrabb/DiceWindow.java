import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Thread;
public class DiceWindow extends JFrame{

    private static int numDice = 5;

    public static void main(String[] args) {
        new DiceWindow();
    }

    
    public DiceWindow() {
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        DiceRoller[] dr = new DiceRoller[numDice];
        for (int i=0; i < dr.length; i++) {
            JLabel l = new JLabel();
            l.setSize(100,100);
            l.setIcon(new ImageIcon(getClass().getResource("/images/dice-1-th.png")));
            dr[i] = new DiceRoller(l);
            this.add(l);
        }
        JButton roll = new JButton();
        roll.setBounds(350, 400, 100, 40);
        Font f = new Font("Rockwell Extra Bold", Font.BOLD, 12);
        roll.setFont(f);
        roll.setText("Roll!");
        roll.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

                Thread[] ts = new Thread[numDice];
                for (int i = 0; i < ts.length; i++) {
                    ts[i] = new Thread(dr[i]);
                    ts[i].start();
                    try {
                        Thread.sleep(100);
                    }
                    catch (InterruptedException ex) {;}
                }
                
            }
        });
        
       

        this.add(roll);
        this.setVisible(true);
        revalidate();

        
    }
}