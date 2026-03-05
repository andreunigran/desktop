package br.unigran.telascadastro;

import br.unigran.app.ClienteController;
import br.unigran.app.ProdutoController;
import br.unigran.models.Produto;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Principal extends JFrame {

    private JButton btnCadastroCliente;
    private JButton btnCadastroProduto;
    private JButton btnSair;

    public Principal() {
        setTitle("Sistema ?");
        setSize(420, 380);
        setLayout(null); // uso de setBounds
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);//centralizado
        setExtendedState(MAXIMIZED_BOTH);//maximixado

        init();
    }

    private void init() {
        setLayout(new BorderLayout());
        JPanel topo = new JPanel(new GridLayout());
        JPanel centro = new JPanel();
        JPanel rodape = new JPanel();
        add(topo, BorderLayout.PAGE_START);

        btnCadastroCliente = new JButton("Cadastro Clientes");
        topo.add(btnCadastroCliente);

        btnCadastroProduto = new JButton("Cadastro Produto");
        topo.add(btnCadastroProduto);

        btnSair = new JButton("Sair");
        topo.add(btnSair);

        JLabel data = new JLabel("dd/mm/aaa");
        rodape.add(data);

        ImageIcon icon = new ImageIcon("imagens/foto.png");
        JLabel imagem = new JLabel(icon);
        imagem.setAlignmentX(FlowLayout.CENTER);
        centro.add(imagem);

        add(rodape, BorderLayout.PAGE_END);
        add(centro, BorderLayout.CENTER);

        acoes();
    }

    private void acoes() {
        btnSair.addActionListener(e -> dispose());
        btnCadastroCliente.addActionListener(e -> new CadastroCliente(true).setVisible(true));
        // btnCadastroProduto.addActionListener(e -> new CadastroProduto(true).setVisible(true));
        btnCadastroProduto.addActionListener(
                e -> {
                    CadastroProduto cadastroProduto = new CadastroProduto(true);
                    ProdutoController controller = new ProdutoController(cadastroProduto, new Produto());
                    cadastroProduto.setVisible(true);

                });
    }

}
