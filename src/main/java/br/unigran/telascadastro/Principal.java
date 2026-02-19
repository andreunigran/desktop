package br.unigran.telascadastro;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Principal extends JFrame{

    public Principal()  {
     setTitle("Sistema ?");
        setSize(420, 380);
        setLayout(null); // uso de setBounds
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);//centralizado
        setExtendedState(MAXIMIZED_BOTH);//maximixado
    
        init();
    }

    private void init() {
        setLayout(null);
        JPanel painel = new JPanel();
        painel.setBounds(10, 10, 400, 100);
        add(painel);
        
        JButton btnCadastroCliente = new JButton("Cadastro Clientes");
        painel.add(btnCadastroCliente);
        
        JButton btnCadastroProduto = new JButton("Cadastro Produto");
        painel.add(btnCadastroProduto);
    }
    
    
}
