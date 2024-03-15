
package ec.edu.espe.dailyDev.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Carlos Ñato, Coding Ninjas, DCC-ESPE
 */
public class Modal extends  JDialog {
    private JButton[] buttons;
    
    public Modal(JFrame parent, String message, String[] buttonLabels) {
        super(parent, "My Dialog", true);
        initComponents(message, buttonLabels);
    }

    private void initComponents(String message, String[] buttonLabels) {
        JLabel messageLabel = new JLabel(message);
        JPanel buttonPanel = new JPanel();

        buttons = new JButton[buttonLabels.length];
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(new ButtonClickListener());
            buttonPanel.add(buttons[i]);
        }

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(messageLabel)
                .addComponent(buttonPanel)
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(messageLabel)
                .addComponent(buttonPanel)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton sourceButton = (JButton) e.getSource();
            String buttonText = sourceButton.getText();
            dispose();
        }
    }
     
 // se implementa en el J frame así:
 //      String[] etiquetasBotones = {"Acept", "Cancel"};
//     Modal dialogo = new Modal(this, " your mensaje", etiquetasBotones);
//     dialogo.setVisible(true);  
}
