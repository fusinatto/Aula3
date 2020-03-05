import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

	private JFrame frame;
	private JTextField textFieldCdCarro;
	private JTextField textFieldDescricao;
	private JTextField textFieldMarca;
	private JTextField textFieldModelo;
	private JTextField textFieldValor;
	private JTextField textFieldNome;
	private JTextField textFieldSobrenome;
	private JTextField textFieldCNH;
	private JTextField textFieldDtNascimento;
	private JTextField textFieldFone;
	private JTextField textFieldEmail;
	private JTextField textFieldEndereco;
	private JTextField textFieldCpl;
	private JTextField textFieldCidade;
	private JTextField textFieldCep;
	private JTextField textFieldUf;
	private JTextField textFieldUsuarioLoca;
	private JTextField textField_1;
	private JTextField textFieldDtLoca;
	private JTextField textFieldDtDevo;
	private JTextField textFieldVlPagar;
	private JTextField textFieldVlPago;
	private JTextField textFieldVlMulta;
	private DefaultListModel<Carros> listaCarros;
	private DefaultListModel<Usuario> listaUsuario;
	private DefaultListModel<Locacao> listaLocacao;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				Principal window = new Principal();
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
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 911, 639);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 881, 579);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panelVeiculo = new JPanel();
		tabbedPane.addTab("Ve\u00EDculo", null, panelVeiculo, null);
		panelVeiculo.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo");
		lblNewLabel.setBounds(10, 11, 46, 14);
		panelVeiculo.add(lblNewLabel);
		
		textFieldCdCarro = new JTextField();
		textFieldCdCarro.setBounds(88, 8, 776, 20);
		panelVeiculo.add(textFieldCdCarro);
		textFieldCdCarro.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Descri\u00E7\u00E3o");
		lblNewLabel_1.setBounds(10, 46, 71, 14);
		panelVeiculo.add(lblNewLabel_1);
		
		textFieldDescricao = new JTextField();
		textFieldDescricao.setBounds(88, 43, 776, 20);
		panelVeiculo.add(textFieldDescricao);
		textFieldDescricao.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Marca");
		lblNewLabel_2.setBounds(10, 82, 46, 14);
		panelVeiculo.add(lblNewLabel_2);
		
		textFieldMarca = new JTextField();
		textFieldMarca.setBounds(88, 79, 776, 20);
		panelVeiculo.add(textFieldMarca);
		textFieldMarca.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Modelo");
		lblNewLabel_3.setBounds(10, 123, 46, 14);
		panelVeiculo.add(lblNewLabel_3);
		
		textFieldModelo = new JTextField();
		textFieldModelo.setBounds(88, 120, 776, 20);
		panelVeiculo.add(textFieldModelo);
		textFieldModelo.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Valor");
		lblNewLabel_4.setBounds(10, 163, 46, 14);
		panelVeiculo.add(lblNewLabel_4);
		
		textFieldValor = new JTextField();
		textFieldValor.setBounds(88, 160, 776, 20);
		panelVeiculo.add(textFieldValor);
		textFieldValor.setColumns(10);
		
		listaCarros = new DefaultListModel<Carros>();
		
		JList listVeiculo = new JList(listaCarros);
		listVeiculo.setBounds(10, 263, 854, 273);
		panelVeiculo.add(listVeiculo);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Carros carro = new Carros();
				carro.setCodigo(Integer.parseInt(textFieldCdCarro.getText()));
				carro.setDescricao(textFieldDescricao.getText());
				carro.setMarca(textFieldMarca.getText());
				carro.setModelo(textFieldModelo.getText());
				carro.setValor(Float.parseFloat(textFieldValor.getText()));
				
				listaCarros.addElement(carro);
			}
		});
		btnNewButton.setBounds(762, 227, 89, 23);
		panelVeiculo.add(btnNewButton);
		
		JPanel panelUsuario = new JPanel();
		tabbedPane.addTab("Usu\u00E1rio", null, panelUsuario, null);
		panelUsuario.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Nome");
		lblNewLabel_5.setBounds(10, 11, 46, 14);
		panelUsuario.add(lblNewLabel_5);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(107, 8, 313, 20);
		panelUsuario.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setBounds(10, 49, 87, 14);
		panelUsuario.add(lblSobrenome);
		
		textFieldSobrenome = new JTextField();
		textFieldSobrenome.setColumns(10);
		textFieldSobrenome.setBounds(107, 46, 313, 20);
		panelUsuario.add(textFieldSobrenome);
		
		JLabel lblCnh = new JLabel("CNH");
		lblCnh.setBounds(10, 87, 46, 14);
		panelUsuario.add(lblCnh);
		
		textFieldCNH = new JTextField();
		textFieldCNH.setColumns(10);
		textFieldCNH.setBounds(107, 84, 313, 20);
		panelUsuario.add(textFieldCNH);
		
		JLabel lblNascimento = new JLabel("Nascimento");
		lblNascimento.setBounds(10, 126, 87, 14);
		panelUsuario.add(lblNascimento);
		
		textFieldDtNascimento = new JTextField();
		textFieldDtNascimento.setColumns(10);
		textFieldDtNascimento.setBounds(107, 123, 313, 20);
		panelUsuario.add(textFieldDtNascimento);
		
		JLabel lblFone = new JLabel("Fone");
		lblFone.setBounds(484, 11, 87, 14);
		panelUsuario.add(lblFone);
		
		textFieldFone = new JTextField();
		textFieldFone.setColumns(10);
		textFieldFone.setBounds(569, 8, 295, 20);
		panelUsuario.add(textFieldFone);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(484, 49, 87, 14);
		panelUsuario.add(lblEmail);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(569, 41, 295, 20);
		panelUsuario.add(textFieldEmail);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(484, 90, 87, 14);
		panelUsuario.add(lblEndereo);
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setColumns(10);
		textFieldEndereco.setBounds(569, 87, 295, 20);
		panelUsuario.add(textFieldEndereco);
		
		JLabel lblNewLabel_6 = new JLabel("Complemento");
		lblNewLabel_6.setBounds(10, 159, 87, 14);
		panelUsuario.add(lblNewLabel_6);
		
		textFieldCpl = new JTextField();
		textFieldCpl.setBounds(107, 156, 313, 20);
		panelUsuario.add(textFieldCpl);
		textFieldCpl.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(484, 126, 87, 14);
		panelUsuario.add(lblCidade);
		
		textFieldCidade = new JTextField();
		textFieldCidade.setColumns(10);
		textFieldCidade.setBounds(569, 123, 295, 20);
		panelUsuario.add(textFieldCidade);
		
		JLabel lblNewLabel_7 = new JLabel("Cep");
		lblNewLabel_7.setBounds(484, 164, 31, 14);
		panelUsuario.add(lblNewLabel_7);
		
		textFieldCep = new JTextField();
		textFieldCep.setColumns(10);
		textFieldCep.setBounds(569, 161, 130, 20);
		panelUsuario.add(textFieldCep);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setBounds(711, 164, 36, 14);
		panelUsuario.add(lblUf);
		
		textFieldUf = new JTextField();
		textFieldUf.setColumns(10);
		textFieldUf.setBounds(739, 161, 125, 20);
		panelUsuario.add(textFieldUf);
		
		listaUsuario = new DefaultListModel<Usuario>();
		JList listUsuario = new JList(listaUsuario);
		listUsuario.setBounds(10, 261, 852, 288);
		panelUsuario.add(listUsuario);
		
		
		JButton btnNewSalvarU = new JButton("Salvar");
		btnNewSalvarU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario pessoa = new Usuario();
				pessoa.setCep(textFieldCep.getText());
				pessoa.setCidade(textFieldCidade.getText());
				pessoa.setCnh(textFieldCNH.getText());
				pessoa.setCpl(textFieldCpl.getText());
				pessoa.setEmail(textFieldEmail.getText());
				pessoa.setEndereco(textFieldEndereco.getText());
				pessoa.setFone(textFieldFone.getText());
				pessoa.setNome(textFieldNome.getText());
				pessoa.setSobrenome(textFieldSobrenome.getText());
				pessoa.setUf(textFieldUf.getText());
				
				listaUsuario.addElement(pessoa);
			}
		});
		btnNewSalvarU.setBounds(775, 212, 89, 23);
		panelUsuario.add(btnNewSalvarU);
		
		
		JPanel panelLocacao = new JPanel();
		tabbedPane.addTab("Loca\u00E7\u00E3o", null, panelLocacao, null);
		panelLocacao.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Usu\u00E1rio");
		lblNewLabel_8.setBounds(10, 11, 46, 14);
		panelLocacao.add(lblNewLabel_8);
		
		textFieldUsuarioLoca = new JTextField();
		textFieldUsuarioLoca.setBounds(106, 8, 299, 20);
		panelLocacao.add(textFieldUsuarioLoca);
		textFieldUsuarioLoca.setColumns(10);
		
		JLabel lblVeculo = new JLabel("Ve\u00EDculo");
		lblVeculo.setBounds(10, 47, 46, 14);
		panelLocacao.add(lblVeculo);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(106, 44, 299, 20);
		panelLocacao.add(textField_1);
		
		JLabel lblDataLocao = new JLabel();
		lblDataLocao.setText("Data Loca\u00E7\u00E3o");
		lblDataLocao.setBounds(10, 85, 89, 14);
		panelLocacao.add(lblDataLocao);
		
		textFieldDtLoca = new JTextField();
		textFieldDtLoca.setColumns(10);
		textFieldDtLoca.setBounds(106, 82, 299, 20);
		panelLocacao.add(textFieldDtLoca);
		
		JLabel lblDataDevoluo = new JLabel("Data Devolu\u00E7\u00E3o");
		lblDataDevoluo.setBounds(417, 125, 122, 14);
		panelLocacao.add(lblDataDevoluo);
		
		textFieldDtDevo = new JTextField();
		textFieldDtDevo.setColumns(10);
		textFieldDtDevo.setBounds(515, 122, 349, 20);
		panelLocacao.add(textFieldDtDevo);
		
		textFieldVlPagar = new JTextField();
		textFieldVlPagar.setColumns(10);
		textFieldVlPagar.setBounds(515, 8, 349, 20);
		panelLocacao.add(textFieldVlPagar);
		
		JLabel lblValor = new JLabel("Valor a Pagar");
		lblValor.setBounds(417, 14, 86, 14);
		panelLocacao.add(lblValor);
		
		JLabel lblValorPago = new JLabel("Valor Pago");
		lblValorPago.setBounds(417, 47, 86, 14);
		panelLocacao.add(lblValorPago);
		
		textFieldVlPago = new JTextField();
		textFieldVlPago.setColumns(10);
		textFieldVlPago.setBounds(515, 44, 349, 20);
		panelLocacao.add(textFieldVlPago);
		
		JLabel lblValorMulta = new JLabel("Valor Multa");
		lblValorMulta.setBounds(417, 85, 86, 14);
		panelLocacao.add(lblValorMulta);
		
		textFieldVlMulta = new JTextField();
		textFieldVlMulta.setColumns(10);
		textFieldVlMulta.setBounds(515, 82, 349, 20);
		panelLocacao.add(textFieldVlMulta);
		
		listaLocacao = new DefaultListModel<Locacao>();
		JList list = new JList(listaLocacao);
		list.setBounds(10, 234, 854, 302);
		panelLocacao.add(list);
		
		JButton btnNewLocar = new JButton("Locar");
		btnNewLocar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Locacao locacao = new Locacao();
				locacao.setUsuario(Integer.parseInt(textFieldUsuarioLoca.getText()));
				locacao.setVeiculo(Integer.parseInt(textFieldUsuarioLoca.getText()));
				locacao.setVlMulta(Float.parseFloat(textFieldVlMulta.getText()));
				locacao.setVlPagar(Float.parseFloat(textFieldVlPagar.getText()));
				locacao.setVlPago(Float.parseFloat(textFieldVlPago.getText()));
				
				listaLocacao.addElement(locacao);
			}
		});
		btnNewLocar.setBounds(775, 198, 89, 23);
		panelLocacao.add(btnNewLocar);
		
		
	}
}
