/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package healthswift.pkgcase.study;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author Kheymp
 */
public class NewJPanel extends javax.swing.JPanel implements ActionListener {
    Timer timer;
    int xVelocity = 1;
    int xVelocity2 = 1;
    int yVelocity = 1;
    int x = 50;
    int y = 120;
    int x2 = 400;
    int y2 = 120;
    Image doctor;
    Image patient;
    /**
     * Creates new form NewJPanel
     */
    public NewJPanel() {
        this.setBounds(0, 0, 800, 600);
        this.setLayout(null);
        doctor = new ImageIcon("C:\\Users\\Kheymp\\Documents\\NetBeansProjects\\HealthSwift Case Study\\src\\healthswift\\pkgcase\\study\\doctor-img.png").getImage();
        patient = new ImageIcon("C:\\Users\\Kheymp\\Documents\\NetBeansProjects\\HealthSwift Case Study\\src\\healthswift\\pkgcase\\study\\patient-img.png").getImage();
        timer = new Timer(1, this);
        timer.start();
        initComponents();
    }
    
    public void paint(Graphics g) {
        HealthSwift.pnlSignIn.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(doctor, x, y, null);
        g2d.drawImage(patient, x2, y2, null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (x > 550 - 407 || x < 50) {
            xVelocity = xVelocity * -1;
        }
        if (x2 < 400  || x2 > 500 ) {
            xVelocity2 = xVelocity2 * -1;
        }
        x = x + xVelocity;
        x2 = x2 + xVelocity2;
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(153, 102, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
