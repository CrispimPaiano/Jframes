package exemplo06;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author Crispim Paiano dos Santos
 */
public class ExemploJTextArea01 {
    
    public JFrame jFrame;
    public JTextArea jTextArea;
    public JLabel jLabelDescricao;
    public JScrollPane jScrollPane;
    
    public ExemploJTextArea01(){
        gerarTela();
        instaciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        configurarJScrollPane();
        jFrame.setVisible(true);
    }
        
    private void gerarTela() {
        jFrame = new JFrame("Exemplo JTextArea");
        jFrame.setSize(500,500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
    }
    
    private void instaciarComponentes(){
        jTextArea = new JTextArea();
        jLabelDescricao = new JLabel("Descrição");
        jScrollPane = new JScrollPane();
    }
    
    private void gerarDimensoes(){
        jLabelDescricao.setSize(70, 20);
        jScrollPane.setSize(450, 410);
    }

    private void gerarLocalizacoes(){
        jLabelDescricao.setLocation(10, 10);
        jScrollPane.setLocation(10, 35);
    }
    
    private void adicionarComponentes(){
        jFrame.add(jLabelDescricao);
        jFrame.add(jScrollPane);
    }
    
    private void configurarJScrollPane(){
        jScrollPane.setViewportView(jTextArea);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jTextArea.setLineWrap(true);
    }
    
}
