package EJERC1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class v1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblSegundoNumero;
	private JLabel lblTercerNumero;
	private JTextField txtn1;
	private JTextField txtn2;
	private JTextField txtn3;
	private JButton btnNewButton;
	private JButton btnSumaEnteros;
	private JButton btnSumaReales;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					v1 frame = new v1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public v1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("primer numero:");
			lblNewLabel.setBounds(25, 22, 99, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblSegundoNumero = new JLabel("segundo numero:");
			lblSegundoNumero.setBounds(25, 58, 99, 14);
			contentPane.add(lblSegundoNumero);
		}
		{
			lblTercerNumero = new JLabel("tercer numero (opcional):");
			lblTercerNumero.setBounds(25, 97, 128, 14);
			contentPane.add(lblTercerNumero);
		}
		{
			txtn1 = new JTextField();
			txtn1.setBounds(163, 19, 86, 20);
			contentPane.add(txtn1);
			txtn1.setColumns(10);
		}
		{
			txtn2 = new JTextField();
			txtn2.setColumns(10);
			txtn2.setBounds(163, 55, 86, 20);
			contentPane.add(txtn2);
		}
		{
			txtn3 = new JTextField();
			txtn3.setColumns(10);
			txtn3.setBounds(163, 94, 86, 20);
			contentPane.add(txtn3);
		}
		{
			btnNewButton = new JButton("suma 2 enteros");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(293, 18, 115, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnSumaEnteros = new JButton("suma 3 enteros");
			btnSumaEnteros.addActionListener(this);
			btnSumaEnteros.setBounds(293, 54, 115, 23);
			contentPane.add(btnSumaEnteros);
		}
		{
			btnSumaReales = new JButton("suma 2 reales");
			btnSumaReales.addActionListener(this);
			btnSumaReales.setBounds(293, 93, 115, 23);
			contentPane.add(btnSumaReales);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(25, 122, 382, 128);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSumaReales) {
			do_btnSumaReales_actionPerformed(e);
		}
		if (e.getSource() == btnSumaEnteros) {
			do_btnSumaEnteros_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		try {
			int n1=Integer.parseInt(txtn1.getText());
			int n2=Integer.parseInt(txtn2.getText());
			CALCULADORA C = new CALCULADORA(n1, n2);
			txtS.setText("");
			txtS.append("\nLa suma es: "+C.sumar(n1, n2));
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this,"Ingrese numeros enteros");
		}
		
	}
	protected void do_btnSumaEnteros_actionPerformed(ActionEvent e) {
		try {
			int n1=Integer.parseInt(txtn1.getText());
			int n2=Integer.parseInt(txtn2.getText());
			int n3=Integer.parseInt(txtn3.getText());
			CALCULADORA C = new CALCULADORA(n1, n2, n3);
			txtS.setText("");
			txtS.append("\nLa suma de 3 enteros es:"+C.sumar(n1, n2, n3));
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "Ingrese numeros enteros");
		}
		
		
	}
	protected void do_btnSumaReales_actionPerformed(ActionEvent e) {
		try {
			double num1= Double.parseDouble(txtn1.getText());
			double num2= Double.parseDouble(txtn2.getText());
			CALCULADORA C = new CALCULADORA (num1, num2);
			txtS.setText("");
			txtS.append("\nLa suma de dos numeros reales es: "+C.sumar(num1, num2));
		} catch (Exception e2) {
	       JOptionPane.showMessageDialog(this, "Ingrese numeros");  	             
		}
		
	}
}
