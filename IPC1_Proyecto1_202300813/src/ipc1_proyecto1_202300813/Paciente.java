
package ipc1_proyecto1_202300813;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class Paciente extends JFrame implements ActionListener {

    public Paciente() {
        
        this.setTitle("Paciente");
        this.setBounds(650, 400, 500, 350);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
