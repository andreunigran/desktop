package br.unigran.telascadastro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CadastroProduto extends JDialog {

    JButton btnSalvar;
    JTextField txtPreco;
    public JTextField txtCodigo;
    JTextField txtNome;
    JTextField txtDescricao;
    JTextField txtQuantidade;
    

    public CadastroProduto(boolean modal) {
        setModal(modal);
        setTitle("Cadastro de Produto");
        setSize(400, 350);
        setLayout(null); // necessário para usar setBounds
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);//centraliza tela
        init();
    }

    private void init() {
        // 1 - Código
        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(20, 20, 100, 25);
        add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(120, 20, 200, 25);
        add(txtCodigo);

        // 2 - Nome
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 60, 100, 25);
        add(lblNome);

         txtNome = new JTextField();
        txtNome.setBounds(120, 60, 200, 25);
        add(txtNome);

        // 3 - Descrição
        JLabel lblDescricao = new JLabel("Descrição:");
        lblDescricao.setBounds(20, 100, 100, 25);
        add(lblDescricao);

        txtDescricao = new JTextField();
        txtDescricao.setBounds(120, 100, 200, 25);
        add(txtDescricao);

        // 4 - Preço
        JLabel lblPreco = new JLabel("Preço:");
        lblPreco.setBounds(20, 140, 100, 25);
        add(lblPreco);

        txtPreco = new JTextField();
        txtPreco.setBounds(120, 140, 200, 25);
        add(txtPreco);

        // 5 - Quantidade
        JLabel lblQuantidade = new JLabel("Quantidade:");
        lblQuantidade.setBounds(20, 180, 100, 25);
        add(lblQuantidade);

        txtQuantidade = new JTextField();
        txtQuantidade.setBounds(120, 180, 200, 25);
        add(txtQuantidade);

        // 6 - Categoria
        JLabel lblCategoria = new JLabel("Categoria:");
        lblCategoria.setBounds(20, 220, 100, 25);
        add(lblCategoria);

        JTextField txtCategoria = new JTextField();
        txtCategoria.setBounds(120, 220, 200, 25);
        add(txtCategoria);

        // Botões
        btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(80, 260, 100, 30);
        add(btnSalvar);

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(200, 260, 100, 30);
        add(btnCancelar);
    }

    public void salvar(ActionListener a) {
        btnSalvar.addActionListener(a);
    }
}
