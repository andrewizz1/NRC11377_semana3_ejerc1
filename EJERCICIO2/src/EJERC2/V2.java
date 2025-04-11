package EJERC2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V2 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtnum;
	private JButton btnNewButton;
	private JButton btnMillas;
	private JButton btnMinutosYSegundos;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V2 frame = new V2();
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
	public V2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Ingrese numero:");
			lblNewLabel.setBounds(27, 11, 93, 14);
			contentPane.add(lblNewLabel);
		}
		{
			txtnum = new JTextField();
			txtnum.setBounds(130, 8, 86, 20);
			contentPane.add(txtnum);
			txtnum.setColumns(10);
		}
		{
			btnNewButton = new JButton("Celsius a Fahrenheit.");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(125, 75, 172, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnMillas = new JButton("km a millas");
			btnMillas.addActionListener(this);
			btnMillas.setBounds(148, 109, 127, 23);
			contentPane.add(btnMillas);
		}
		{
			btnMinutosYSegundos = new JButton("segundos a minutos y segundos");
			btnMinutosYSegundos.addActionListener(this);
			btnMinutosYSegundos.setBounds(130, 143, 167, 23);
			contentPane.add(btnMinutosYSegundos);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(25, 204, 359, 126);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnMinutosYSegundos) {
			do_btnMinutosYSegundos_actionPerformed(e);
		}
		if (e.getSource() == btnMillas) {
			do_btnMillas_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
	    double celsius= Double.parseDouble(txtnum.getText());
	    CONVERSOR C = new CONVERSOR( celsius);
	    txtS.setText("");
	    txtS.append("\nConversión de celsius a fahrenheit: "+ C.convertir(celsius));
	}
	protected void do_btnMillas_actionPerformed(ActionEvent e) {
		int km= Integer.parseInt(txtnum.getText());
		CONVERSOR C = new CONVERSOR(km);
		txtS.setText("");
		txtS.append("\nKilómetros a millas: "+C.convertir(km));
	}
	protected void do_btnMinutosYSegundos_actionPerformed(ActionEvent e) {
		int seg= Integer.parseInt(txtnum.getText());
		boolean flag = true;
		CONVERSOR C = new CONVERSOR(seg);
		txtS.setText("");
		txtS.append("\nSegundos a minutos y segundos: "+C.convertir(seg, flag));
	}
}
