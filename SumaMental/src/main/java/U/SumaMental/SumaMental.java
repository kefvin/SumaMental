package U.SumaMental;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.Timer;

public class SumaMental {

	int segons = 0;
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SumaMental window = new SumaMental();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SumaMental() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Timer timer = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				segons++;
				
			}
	});
		int resoltes = 0;
		Random rand = new Random();
		
		//Crear el label donde mostrar las operaciones 
		//y el input donde poner el resultado y mirar que esté bien
		int suma = rand.nextInt(13) + rand.nextInt(13) ;
		int resta = rand.nextInt(13) - rand.nextInt(13) ;
		int multiplicacio = rand.nextInt(13) - rand.nextInt(13) ;
			
	}
	
	

}
