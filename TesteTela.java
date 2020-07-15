package teste;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JRadioButtonMenuItem;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.SystemColor;

public class TesteTela extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textEmail;
	private JTextField textIdade;
	private JPasswordField passwordField;
	private JTextField textSexo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteTela frame = new TesteTela();
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
	public TesteTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 364, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BotãoAção = new JButton("Registrar");
		BotãoAção.setBackground(SystemColor.controlShadow);
		BotãoAção.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Nome: "+textNome.getText()+"\nIdade: "+textIdade.getText()+"\nE-mail: "+textEmail.getText()+"\nSexo: "+textSexo.getText(), "Cadastro efetuado com sucesso!", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		
		BotãoAção.setBounds(153, 203, 89, 23);
		contentPane.add(BotãoAção);
		
		textNome = new JTextField();
		textNome.setToolTipText("Nome completo\r\n");
		textNome.setBounds(105, 48, 189, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("E-mail:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(25, 80, 46, 14);
		contentPane.add(lblNewLabel);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(105, 79, 189, 20);
		contentPane.add(textEmail);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(25, 49, 46, 14);
		contentPane.add(lblNome);
		
		textIdade = new JTextField();
		textIdade.setColumns(10);
		textIdade.setBounds(105, 110, 189, 20);
		contentPane.add(textIdade);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdade.setBounds(25, 111, 46, 14);
		contentPane.add(lblIdade);
		
		JLabel lblSexo = new JLabel("Sexo(F/M):");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSexo.setBounds(25, 142, 75, 14);
		contentPane.add(lblSexo);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(105, 172, 189, 20);
		contentPane.add(passwordField);
		
		JLabel lblIdade_1_1 = new JLabel("Senha:");
		lblIdade_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdade_1_1.setBounds(25, 173, 46, 14);
		contentPane.add(lblIdade_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Para fazer seu cadastro preencha os campos abaixo:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(25, 11, 319, 14);
		contentPane.add(lblNewLabel_1);
		
		textSexo = new JTextField();
		textSexo.setColumns(10);
		textSexo.setBounds(105, 141, 189, 20);
		contentPane.add(textSexo);
		
	}
}
