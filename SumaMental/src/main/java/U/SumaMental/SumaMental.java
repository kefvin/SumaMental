package U.SumaMental;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class SumaMental {

	int segons = 0;
	
	private JFrame frame;
	private JTextField resultat;

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
		frame.getContentPane().setLayout(null);
		
		int encertat = 0;
		//Crear el label donde mostrar las operaciones 
		//y el input donde poner el resultado y mirar que esté bien
		int suma;
		int resta;
		int multiplicacio;
		int primer;
		int segon;
		
		switch(encertat){
			case 0:
				primer = genera();
				segon = genera();
				String pintaOperacio = primer+" + "+segon;
				pinta(pintaOperacio); //Repetir estas dos últimas líneas y crear otro metodo para
									  //recojer lo que se escribe en el imput y puede que otro para 
									  //comparar que el resultado sea correcto
				suma = primer + segon;
				encertat++;
				break;
			case 1:
				primer = genera();
				segon = genera();
				resta = primer - segon;
				encertat++;
				break;
			case 2:
				primer = genera();
				segon = genera();
				multiplicacio = primer * segon;
				encertat++;
				break;
			
		}
		JLabel quant = new JLabel("Quant dóna...");
		quant.setFont(new Font("Dialog", Font.BOLD, 26));
		quant.setBounds(122, 53, 203, 45);
		frame.getContentPane().add(quant);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel.setBounds(145, 110, 148, 45);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel operacio = new JLabel("......");
		operacio.setFont(new Font("Dialog", Font.BOLD, 15));
		operacio.setBounds(132, 110, 159, 37);
		frame.getContentPane().add(operacio);
		
		resultat = new JTextField();
		resultat.setBounds(142, 167, 151, 25);
		frame.getContentPane().add(resultat);
		resultat.setColumns(10);
		
		Timer timer = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				segons++;
				
			}
	});
		
	}
	
	public int genera(){

		Random rand = new Random();
		
		return rand.nextInt(13);
		
	}
	
	public void pinta(String op){
		
	}
}
