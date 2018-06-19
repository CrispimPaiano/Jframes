package exercicio01;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Crispim Paiano dos Santos
 */
public class Exercicio01Interface implements InterfaceExercicio01 {

    private JFrame jFrame;
    private JLabel jLabelNome, jLabelIdade,jLabelRaca, jLabelApelido, jLabelPreco, jLabelDescricao;
    private JComboBox jComboBoxRaca;
    private JTextField jTextFieldNome, jTextFieldIdade, jTextFieldApelido, jTextFieldPreco;
    private JTextArea jTextAreaDescricao;
    private JRadioButton jRadioButtonVivo,jRadioButtonMorto, jRadioButtonRacao, jRadioButtonComeAlmocosJantas;
    private JCheckBox jCheckBoxAdestrado, jCheckBoxVacinado, jCheckBoxCastrado, jCheckBoxTemPedigree;
    private JButton jButtonCancelar, jButtonSalvar;


    public Exercicio01Interface() {
        instanciarComponentes();
        gerarTela();
        gerarDimensoes();
        gerarLocalizacao();
        adicionarComponentes();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(645, 445);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelApelido);
        jFrame.add(jLabelDescricao);
        jFrame.add(jLabelIdade);
        jFrame.add(jLabelNome);
        jFrame.add(jLabelPreco);
        jFrame.add(jLabelRaca);
        jFrame.add(jComboBoxRaca);
        jFrame.add(jTextAreaDescricao);
        jFrame.add(jTextFieldApelido);
        jFrame.add(jTextFieldIdade);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldPreco);
        jFrame.add(jRadioButtonComeAlmocosJantas);
        jFrame.add(jRadioButtonMorto);
        jFrame.add(jRadioButtonRacao);
        jFrame.add(jRadioButtonVivo);
        jFrame.add(jCheckBoxAdestrado);
        jFrame.add(jCheckBoxCastrado);
        jFrame.add(jCheckBoxTemPedigree);
        jFrame.add(jCheckBoxVacinado);
        jFrame.add(jButtonCancelar);
        jFrame.add(jButtonSalvar);
}

    @Override
    public void instanciarComponentes() {
        //nome
        jLabelNome = new JLabel("Nome");
        jTextFieldNome = new JTextField();
        
        //idade
        jLabelIdade = new JLabel("Idade");
        jTextFieldIdade = new JTextField();
        
        //raça
        jLabelRaca = new JLabel("Raça");
        jComboBoxRaca = new JComboBox();
        
        //apelido
        jLabelApelido = new JLabel("Apelido");
        jTextFieldApelido = new JTextField();
        
        //preço
        jLabelPreco = new JLabel("Preço");
        jTextFieldPreco = new JTextField();
        
        //Vivo, Morto, Ração, Come almoços e jantas
        jRadioButtonVivo = new JRadioButton("Vivo");
        jRadioButtonRacao = new JRadioButton("Ração");
        jRadioButtonMorto = new JRadioButton("Morto");
        jRadioButtonComeAlmocosJantas = new JRadioButton("Come almoços, jantas");
        
        //Adestrado, Vacinado,Castrado,Tem pedigree
        jCheckBoxAdestrado = new JCheckBox("Adestrado");
        jCheckBoxCastrado = new JCheckBox("Castrado");
        jCheckBoxVacinado = new JCheckBox("Vacinado");
        jCheckBoxTemPedigree = new JCheckBox("Tem pedigree");
        
        //Descrição
        jLabelDescricao = new JLabel("Descrição");
        jTextAreaDescricao = new JTextArea();
        
        //Botão Salvar e Cancelar
        jButtonCancelar = new JButton("Cancelar");
        jButtonSalvar = new JButton("Salvar");
        
    }

    @Override
    public void gerarLocalizacao() {
        
        //nome
        jLabelNome.setLocation(10, 0);
        jTextFieldNome.setLocation(10, 50);
        
        //idade
        jLabelIdade.setLocation(410, 0);
        jTextFieldIdade.setLocation(410, 50);
        
        //raça
        jLabelRaca.setLocation(10, 55);
        jComboBoxRaca.setLocation(10, 105);
        
        //apelido
        jLabelApelido.setLocation(205, 55);
        jTextFieldApelido.setLocation(205, 105);
        
        //preço
        jLabelPreco.setLocation(410, 55);
        jTextFieldPreco.setLocation(410, 105);
        
        //Vivo, Morto, Ração, Come almoços e jantas
        jRadioButtonVivo.setLocation(10, 145);
        jRadioButtonRacao.setLocation(115, 145);
        jRadioButtonMorto.setLocation(10, 175);
        jRadioButtonComeAlmocosJantas.setLocation(115, 175);
        
        //Adestrado, Vacinado,Castrado,Tem pedigree
        jCheckBoxAdestrado.setLocation(360, 145);
        jCheckBoxCastrado.setLocation(465, 145);
        jCheckBoxVacinado.setLocation(360, 175);
        jCheckBoxTemPedigree.setLocation(465, 175);
        
        //Descrição
        jLabelDescricao.setLocation(10, 190);
        jTextAreaDescricao.setLocation(10, 230);
        
        //Botão Salvar e Cancelar
        jButtonCancelar.setLocation(320, 330);
        jButtonSalvar.setLocation(480, 330);
        
        
    }

    @Override
    public void gerarDimensoes() {
        //nome
        jLabelNome.setSize(60, 60);
        jTextFieldNome.setSize(370, 20);
        
        //idade
        jLabelIdade.setSize(60, 60);
        jTextFieldIdade.setSize(210, 20);
        
        //raça
        jLabelRaca.setSize(60, 60);
        jComboBoxRaca.setSize(160, 20);
        
        //apelido
        jLabelApelido.setSize(60, 60);
        jTextFieldApelido.setSize(175, 20);
        
        //preço
        jLabelPreco.setSize(60, 60);
        jTextFieldPreco.setSize(210, 20);
        
        //Vivo, Morto, Ração, Come almoços e jantas
        jRadioButtonVivo.setSize(200, 20);
        jRadioButtonRacao.setSize(200, 20);
        jRadioButtonMorto.setSize(200, 20);
        jRadioButtonComeAlmocosJantas.setSize(200, 20);
        
        //Adestrado, Vacinado,Castrado,Tem pedigree
        jCheckBoxAdestrado.setSize(105, 20);
        jCheckBoxCastrado.setSize(105, 20);
        jCheckBoxVacinado.setSize(105, 20);
        jCheckBoxTemPedigree.setSize(105, 20);
        
        //Descrição
        jLabelDescricao.setSize(60, 60);
        jTextAreaDescricao.setSize(610, 75);
        
        //Botão Salvar e Cancelar
        jButtonCancelar.setSize(140, 70);
        jButtonSalvar.setSize(140, 70);
    }

}
