package br.unigran.telascadastro;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CadastroCliente extends JDialog {

    public CadastroCliente(boolean modal) {
        setModal(true);
        setTitle("Cadastro de Cliente");
        setSize(420, 380);
        setLayout(null); // uso de setBounds
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        init();
    }

    private void init() {
        // 1 - Código
        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(20, 20, 120, 25);
        add(lblCodigo);

        JTextField txtCodigo = new JTextField();
        txtCodigo.setBounds(140, 20, 220, 25);
        add(txtCodigo);

        // 2 - Nome
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 60, 120, 25);
        add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(140, 60, 220, 25);
        add(txtNome);

        // 3 - CPF
        JLabel lblCpf = new JLabel("CPF:");
        lblCpf.setBounds(20, 100, 120, 25);
        add(lblCpf);

        JTextField txtCpf = new JTextField();
        txtCpf.setBounds(140, 100, 220, 25);
        add(txtCpf);

        // 4 - Telefone
        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(20, 140, 120, 25);
        add(lblTelefone);

        JTextField txtTelefone = new JTextField();
        txtTelefone.setBounds(140, 140, 220, 25);
        add(txtTelefone);

        // 5 - Email
        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(20, 180, 120, 25);
        add(lblEmail);

        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(140, 180, 220, 25);
        add(txtEmail);

        // 6 - Endereço
        JLabel lblEndereco = new JLabel("Endereço:");
        lblEndereco.setBounds(20, 220, 120, 25);
        add(lblEndereco);

        JTextField txtEndereco = new JTextField();
        txtEndereco.setBounds(140, 220, 220, 25);
        add(txtEndereco);

        // Botões
        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(100, 280, 90, 30);
        add(btnSalvar);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(210, 280, 100, 30);
        add(btnCancelar);
        
       btnCancelar.addActionListener(e->dispose());
       btnSalvar.addActionListener(e->{
       
       
       });
    }
}
