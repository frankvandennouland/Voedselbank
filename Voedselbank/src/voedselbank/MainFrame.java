/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voedselbank;

import javax.swing.JFrame;

/**
 *
 * @author Niek van der Starre
 */
public class MainFrame extends JFrame {

    
    public MainFrame() {
        initComponents();
    }

    private void initComponents() {
        setSize(500, 500);
        setTitle("Voedselbank Haaglanden");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {

                SimpleDataSourceV2.closeConnection();
                System.out.println("De database is succesvol afgesloten");
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        MainFrame scherm = new MainFrame();
        scherm.setVisible(true);
        ClientAanmaken a = new ClientAanmaken();
        a.setVisible(true);
        NewJFrame f = new NewJFrame();
        f.setVisible(true);
        OverzichtScherm s = new OverzichtScherm();
        s.setVisible(true);

    }

}
