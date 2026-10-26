package pq_AWT_Swing2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Doble extends JFrame
{
    //Valores para los campos de texto
    private int numero = 0;
    private int doble = 0;

    //Etiquetas para identificar los campos de texto
    private JLabel numeroLabel;
    private JLabel nombreLabel;
    private JLabel dobleLabel;

    //Cadenas para las etiquetas
    private static String numeroString = "Número: ";
    private static String dobleString = "El doble es: ";

    //Text fields para introducir números (ahora son de Swing: JTextField)
    private JTextField numeroField;
    private JTextField nombreField;
    private JTextField dobleField;

    private boolean focusIsSet = false;
    private JButton atrasB;
    private JButton siguienteB;

    public Doble() {
        super("Doble");

        //Lo que pasa si cerramos la ventana (sustituye al WindowListener
        //con windowClosing y System.exit(0) de la versión anterior).
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Crea las etiquetas.
        numeroLabel = new JLabel(numeroString);
        dobleLabel = new JLabel(dobleString);

        //Campo donde vamos a introducir el número
        numeroField = new JTextField(10);

        //Lo que hace cuando pulsamos Enter
        numeroField.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String n = numeroField.getText();
                try {
                    numero = Integer.parseInt(n);
                    doble = numero * 2;
                    dobleField.setText(""+doble);
                } catch(NumberFormatException nfe) {
                    //Mensaje de error en una ventana (antes: System.err)
                    JOptionPane.showMessageDialog(
                         Doble.this,
                         "No es un entero: '"+n+"'",
                         "Error",
                         JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        //Campo que nos muestra el doble del numero introducido
        dobleField = new JTextField(10);
        dobleField.setEditable(false);
        dobleField.setForeground(Color.red);

        //Dispone la geometría de las etiquetas en un panel
        JPanel labelPane = new JPanel();
        labelPane.setLayout(new GridLayout(0, 1));
        labelPane.add(numeroLabel);
        labelPane.add(dobleLabel);

        //Dispone los campos de texto en otro panel
        JPanel fieldPane = new JPanel();
        fieldPane.setLayout(new GridLayout(0, 1));
        fieldPane.add(numeroField);
        fieldPane.add(dobleField);

        //Incluye los dos paneles en otro panel,
        //etiquetas a la izquierda
        //y campos de texto a la derecha.
        JPanel contentPane = new JPanel();
        contentPane.setBorder(
               BorderFactory.createEmptyBorder(20, 20, 20, 20));
        contentPane.setLayout(new BorderLayout());
        contentPane.add(labelPane, BorderLayout.CENTER);
        contentPane.add(fieldPane, BorderLayout.EAST);

        setContentPane(contentPane);  //this.setContentPane(contentPane);
          // es set, o sea, machado el contenedor del objeto "Doble", hijo de JFrame

    }

    public static void main(String[] args) {

        // Toda la interfaz Swing se crea en el hilo de eventos (receta: se hace siempre así).
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                final Doble app = new Doble();
                app.pack();
                app.setVisible(true);
            }
        });
    }
}