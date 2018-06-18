package exemplo06;

import java.awt.EventQueue;

/**
 * @author Crispim Paiano dos Santos
 */
public class ExemploJTextAreaPrincipal {

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

        @Override
        public void run() {
            new ExemploJTextArea01();
            }
        });

    }

}
