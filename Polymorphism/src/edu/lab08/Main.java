package edu.lab08;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // new CMainForm("Moments of inertia").setVisible(true);
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                //Nimbus, Metal, CDE/Motif, Windows, Windows Classic
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.out.println("Look and feel error");
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println("Look and feel unsupported");
        }

        SwingUtilities.invokeLater(() -> new CMainForm("Moments of inertia").setVisible(true));
    }

}