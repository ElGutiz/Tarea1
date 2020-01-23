import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PrincipalRadio {

	private JFrame frame;
	private int i;
	private JButton[] btn =new JButton[12];
	private int a = 7;
	private int b = 5;
	private JButton btnAmfm;
	private JButton btnOnoff;
	private JButton btnavanzar;
	private JLabel lblEmisora;
	private JLabel lblFrecuencia;
	
	iRadio radito = new cRadio();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalRadio window = new PrincipalRadio();
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
	public PrincipalRadio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		 Listener listener = new Listener();
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 575, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0};
		gridBagLayout.rowHeights = new int[]{0};
		gridBagLayout.columnWeights = new double[]{Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
	
		
		lblFrecuencia = new JLabel("AM");
		lblFrecuencia.setForeground(Color.WHITE);
		lblFrecuencia.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 38));
		GridBagConstraints gbc_lblFrecuencia = new GridBagConstraints();
		gbc_lblFrecuencia.gridheight = 2;
		gbc_lblFrecuencia.gridwidth = 3;
		gbc_lblFrecuencia.insets = new Insets(0, 0, 5, 5);
		gbc_lblFrecuencia.gridx = 9;
		gbc_lblFrecuencia.gridy = 0;
		frame.getContentPane().add(lblFrecuencia, gbc_lblFrecuencia);
		
		lblEmisora = new JLabel("530");
		lblEmisora.setBackground(new Color(240, 240, 240));
		lblEmisora.setForeground(Color.WHITE);
		lblEmisora.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 24));
		GridBagConstraints gbc_lblEmisora = new GridBagConstraints();
		gbc_lblEmisora.fill = GridBagConstraints.VERTICAL;
		gbc_lblEmisora.gridwidth = 6;
		gbc_lblEmisora.gridheight = 2;
		gbc_lblEmisora.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmisora.gridx = 12;
		gbc_lblEmisora.gridy = 0;
		frame.getContentPane().add(lblEmisora, gbc_lblEmisora);
		
		btnOnoff = new JButton("On/Off");
		btnOnoff.addActionListener(listener);
		btnOnoff.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 20));
		btnOnoff.setForeground(new Color(255, 0, 0));
		btnOnoff.setBackground(new Color(0, 0, 0));
		GridBagConstraints gbc_btnOnoff = new GridBagConstraints();
		gbc_btnOnoff.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnOnoff.gridwidth = 7;
		gbc_btnOnoff.insets = new Insets(0, 0, 5, 5);
		gbc_btnOnoff.gridx = 10;
		gbc_btnOnoff.gridy = 2;
		frame.getContentPane().add(btnOnoff, gbc_btnOnoff);
		
		btnAmfm = new JButton("AM/FM");
		btnAmfm.addActionListener(listener);
		btnAmfm.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 20));
		btnAmfm.setForeground(new Color(255, 0, 0));
		btnAmfm.setBackground(new Color(0, 0, 0));
		GridBagConstraints gbc_btnAmfm = new GridBagConstraints();
		gbc_btnAmfm.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAmfm.gridwidth = 7;
		gbc_btnAmfm.insets = new Insets(0, 0, 5, 5);
		gbc_btnAmfm.gridx = 10;
		gbc_btnAmfm.gridy = 3;
		frame.getContentPane().add(btnAmfm, gbc_btnAmfm);
		
		radioImage = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/rad2.gif")).getImage();
		radioImage.setIcon(new ImageIcon(img));
		GridBagConstraints gbc_radioImage = new GridBagConstraints();
		gbc_radioImage.gridwidth = 2;
		gbc_radioImage.gridheight = 3;
		gbc_radioImage.insets = new Insets(0, 0, 5, 5);
		gbc_radioImage.gridx = 7;
		gbc_radioImage.gridy = 1;
		frame.getContentPane().add(radioImage, gbc_radioImage);
		btnOnoff.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 20));
		btnOnoff.setBackground(new Color(0, 0, 0));
		GridBagConstraints gbc_btnOnoff = new GridBagConstraints();
		gbc_btnOnoff.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnOnoff.gridwidth = 7;
		gbc_btnOnoff.insets = new Insets(0, 0, 5, 5);
		gbc_btnOnoff.gridx = 14;
		gbc_btnOnoff.gridy = 2;
		frame.getContentPane().add(btnOnoff, gbc_btnOnoff);
		
		btnavanzar = new JButton(">>>");
		btnavanzar.addActionListener(listener);
		btnavanzar.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 20));
		btnavanzar.setForeground(new Color(255, 0, 0));
		btnavanzar.setBackground(new Color(0, 0, 0));
		GridBagConstraints gbc_btnavanzar = new GridBagConstraints();
		gbc_btnavanzar.insets = new Insets(0, 0, 5, 5);
		gbc_btnavanzar.fill = GridBagConstraints.BOTH;
		gbc_btnavanzar.gridwidth = 7;
		gbc_btnavanzar.gridx = 10;
		gbc_btnavanzar.gridy = 4;
		frame.getContentPane().add(btnavanzar, gbc_btnavanzar);
		
		for (i=0; i<12; i++){
		btn[i]= new JButton(Integer.toString(i));
		btn[i].addActionListener(listener);
		btn[i].setFont(new Font("Segoe UI Emoji", Font.BOLD, 20));
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.fill = GridBagConstraints.BOTH;
		gbc_btn1.insets = new Insets(0, 0, 5, 5);
		gbc_btn1.gridx = a;
		gbc_btn1.gridy = b;
		frame.getContentPane().add(btn[i], gbc_btn1);
		btn[i].setForeground(new Color(255, 0, 0));
		btn[i].setBackground(new Color(0, 0, 0));
		if(i == 5) {
			b = 6;
			a = 6;}
		a++;
		}
		
		for(i = 0; i < 12; i++) 
			btn[i].setEnabled(false);
		btnAmfm.setEnabled(false);
		btnavanzar.setEnabled(false);
				
	}
	
	private class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource() == btnOnoff){
				if(radito.estado() == false) {
					for(i = 0; i < 12; i++) 
						btn[i].setEnabled(false);
					btnAmfm.setEnabled(false);
					btnavanzar.setEnabled(false);
					radito.onOff();	
				}else {
					for(i = 0; i < 12; i++) 
						btn[i].setEnabled(true);
					btnAmfm.setEnabled(true);
					btnavanzar.setEnabled(true);
					radito.onOff();	
				}
			}
			
			
			if(e.getSource() == btnavanzar) {
				radito.avanzar();
				lblEmisora.setText(radito.estacionActual());
			}
			
			if(e.getSource() == btnAmfm) {
				radito.cambiarFrecuencia();
				lblEmisora.setText(radito.estacionActual());
				if(lblFrecuencia.getText() == "AM")
					lblFrecuencia.setText("FM");
				else
					lblFrecuencia.setText("AM");
			}
			
			for(i=0 ; i < 12; i++) {
				if (e.getSource() == btn[i]) {
					radito.guardar(i);
					radito.seleccionarEmisora(i);
					//btn[i].setText(radito.estacionActual());
					lblEmisora.setText(radito.estacionActual());
				}
			}
		}
		
	}

}
