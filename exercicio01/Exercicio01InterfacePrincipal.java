package exercicio01;

import java.awt.EventQueue;

/**
 * @author Alunos
 */
public class Exercicio01InterfacePrincipal {

    public static void main(String[] args) {
    
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Exercicio01Interface();
            }
        });
    
    }
    
}
