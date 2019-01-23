
import java.util.Random;
import javax.swing.*;
import java.lang.Thread;

public class DiceRoller implements Runnable{

    private Random rand = new Random();
	private JLabel _label;
	private int randTime;
	private int randDie;
	
	public DiceRoller(JLabel label) {
        _label = label;
	}
	
	public void run() {
		randTime = rand.nextInt(10) + 10;
		for (int i = 1; i < randTime; i++) {
			
			randDie = rand.nextInt(6) + 1;
			
				if (randDie == 1) {
                    _label.setIcon(new ImageIcon(getClass().getResource("/images/dice-1-th.png")));
				}
				else if (randDie == 2) {
					_label.setIcon(new ImageIcon(getClass().getResource("/images/dice-2-th.png")));
				}
				else if (randDie == 3) {
					_label.setIcon(new ImageIcon(getClass().getResource("/images/dice-3-th.png")));
				}
				else if (randDie == 4) {
					_label.setIcon(new ImageIcon(getClass().getResource("/images/dice-4-th.png")));
				}
				else if (randDie == 5) {
					_label.setIcon(new ImageIcon(getClass().getResource("/images/dice-5-th.png")));
				}
				else if (randDie == 6) {
					_label.setIcon(new ImageIcon(getClass().getResource("/images/dice-6-th.png")));
				}
			
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException ex) {;}
		}
			
	}	
	public int getDieNumber() {
		return randDie;
	}
}
