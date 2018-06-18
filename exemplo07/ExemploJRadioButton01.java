package exemplo07;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.UIManager;

/**
 * @author Crispim Paiano dos Santos
 */
public class ExemploJRadioButton01 {

    private JFrame jFrame;
    private JLabel jLabelCor;
    private JRadioButton jRadioButtonCorPreto,
            jRadioButtonCorBranco,
            jRadioButtonCorFushia,
            jRadioButtonCorRose;
    private ButtonGroup buttonGroupCor;
    private JButton jButtonSalvar, jButtonLimparSelecao;

    public ExemploJRadioButton01() {
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        definirRadioParaButtonGroup();
        adicionarAcao();
        estilizarRadioButton();
        //alterarBackground();
        jFrame.setVisible(true);
    }

    private void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void instanciarComponentes() {
        jLabelCor = new JLabel("COR");
        jRadioButtonCorBranco = new JRadioButton();
        jRadioButtonCorBranco.setText("Branco");
        jRadioButtonCorFushia = new JRadioButton();
        jRadioButtonCorFushia.setText("Fushia");
        jRadioButtonCorPreto = new JRadioButton("Preto");
        jRadioButtonCorRose = new JRadioButton("Rose");
        buttonGroupCor = new ButtonGroup();
        jButtonSalvar = new JButton("Salvar");
        jButtonLimparSelecao = new JButton("Limpar");
    }

    private void definirRadioParaButtonGroup() {

        buttonGroupCor.add(jRadioButtonCorRose);
        buttonGroupCor.add(jRadioButtonCorPreto);
        buttonGroupCor.add(jRadioButtonCorBranco);
        buttonGroupCor.add(jRadioButtonCorFushia);

    }

    private void gerarDimensoes() {
        jLabelCor.setSize(40, 20);
        jRadioButtonCorRose.setSize(100, 20);
        jRadioButtonCorPreto.setSize(100, 20);
        jRadioButtonCorFushia.setSize(100, 20);
        jRadioButtonCorBranco.setSize(100, 20);
        jButtonSalvar.setSize(120, 20);
        jButtonLimparSelecao.setSize(120, 20);
    }

    private void gerarLocalizacoes() {
        jLabelCor.setLocation(10, 10);
        jRadioButtonCorRose.setLocation(10, 35);
        jRadioButtonCorPreto.setLocation(10, 55);
        jRadioButtonCorFushia.setLocation(10, 75);
        jRadioButtonCorBranco.setLocation(10, 95);
        jButtonLimparSelecao.setLocation(10, 135);
        jButtonSalvar.setLocation(135, 135);
    }

    private void adicionarComponentes() {
        jFrame.add(jLabelCor);
        jFrame.add(jRadioButtonCorBranco);
        jFrame.add(jRadioButtonCorFushia);
        jFrame.add(jRadioButtonCorPreto);
        jFrame.add(jRadioButtonCorRose);
        jFrame.add(jButtonSalvar);
        jFrame.add(jButtonLimparSelecao);
    }

    private void adicionarAcao() {
        jButtonLimparSelecao.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                buttonGroupCor.clearSelection();
                definirCorDeTexto("#000000");
                jFrame.getContentPane().setBackground(
                        UIManager.getColor("Frame.background")
                );
            }
        });
        jButtonSalvar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(jRadioButtonCorBranco.isSelected()){
                    jFrame.getContentPane().setBackground(Color.WHITE);
                    definirCorDeTexto("#FF00FF");
                }else if(jRadioButtonCorFushia.isSelected()){
                    jFrame.getContentPane().setBackground(Color.decode("#FF00FF"));
                    definirCorDeTexto("#FFFFFF");
                }else if(jRadioButtonCorPreto.isSelected()){
                    jFrame.getContentPane().setBackground(Color.decode("#000000"));
                    definirCorDeTexto("#FF00FF");
                }else if(jRadioButtonCorRose.isSelected()){
                    jFrame.getContentPane().setBackground(Color.decode("#FF009D"));
                    definirCorDeTexto("#6eff00");
                }
            }
        });
    }

    private void definirCorDeTexto(String cor){
        jRadioButtonCorBranco.setForeground(Color.decode(cor));
        jRadioButtonCorFushia.setForeground(Color.decode(cor));
        jRadioButtonCorPreto.setForeground(Color.decode(cor));
        jRadioButtonCorRose.setForeground(Color.decode(cor));
    }
    
    private void estilizarRadioButton(){
        jRadioButtonCorBranco.setContentAreaFilled(false);
        jRadioButtonCorFushia.setContentAreaFilled(false);
        jRadioButtonCorPreto.setContentAreaFilled(false);
        jRadioButtonCorRose.setContentAreaFilled(false);
    }
    
    /*private void alterarBackground() {
        jRadioButtonCorBranco.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jFrame.getContentPane().setBackground(Color.decode("#b3fc2a"));
            }
        });
        jRadioButtonCorFushia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jFrame.getContentPane().setBackground(Color.decode("#ff00ff"));
            }
        });
        jRadioButtonCorPreto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jFrame.getContentPane().setBackground(Color.decode("#aaaaaa"));
            }
        });
        jRadioButtonCorRose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jFrame.getContentPane().setBackground(Color.decode("#bbbbbb"));
            }
        });
    }*/

}
