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
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

		
		JLabel quant = new JLabel("Quant dóna...");
		quant.setFont(new Font("Dialog", Font.BOLD, 26));
		quant.setBounds(122, 53, 203, 45);
		frame.getContentPane().add(quant);

		JLabel operacio = new JLabel("......");
		operacio.setFont(new Font("Dialog", Font.BOLD, 15));
		operacio.setBounds(132, 110, 159, 37);
		frame.getContentPane().add(operacio);

		resultat = new JTextField();
		resultat.setBounds(142, 167, 151, 25);
		frame.getContentPane().add(resultat);
		resultat.setColumns(10);

		JButton btnRespon = new JButton("Respon!");
		btnRespon.addMouseListener(new MouseAdapter() {
			

			@Override
			public void mouseClicked(MouseEvent e) {
				String respostaS =  resultat.getText();
				double respostaD = Double.parseDouble(respostaS);
				if(respostaP == respostaD){
					encertat++;
				}
			}
		});
		
		// todo lo de debajo de esto no puede estar dentro de la función initialize
		btnRespon.setBounds(163, 212, 117, 25);
		frame.getContentPane().add(btnRespon);

		Timer timer = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				segons++;

			}
		});
		int encertat = 0;
		double respostaP;
		int primer;
		int segon;
		String pintaOperacio;
		boolean si = true;

		while (si) {
			switch (encertat) {
			case 0:
				primer = genera();
				segon = genera();
				pintaOperacio = primer + " + " + segon;
				pinta(pintaOperacio, operacio);
				respostaP = primer + segon;
				break;
			case 1:
				primer = genera();
				segon = genera();
				pintaOperacio = primer + " - " + segon;
				pinta(pintaOperacio, operacio);
				respostaP = primer - segon;
				break;
			case 2:
				primer = genera();
				segon = genera();
				pintaOperacio = primer + " x " + segon;
				pinta(pintaOperacio, operacio);
				respostaP = primer * segon;
				break;
			case 3:
				si=false;
				break;
			}
		}
	}

	public int genera() {

		Random rand = new Random();

		return rand.nextInt(13);

	}

	public void pinta(String op, JLabel operacio) {
		operacio.setText(op);
	}
}
