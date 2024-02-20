package edu.lab08;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CSphere extends CSolid {
    protected int R;

    public CSphere(int r, int m) {
        R = r;
        Mass = m;
    }

    @Override
    double momentOfInertia() {
        return 0.4 * Mass * R * R;
    }

    @Override
    void getData(JTable tab) {
        Mass = Integer.parseInt(tab.getValueAt(0,1).toString());
        R = Integer.parseInt(tab.getValueAt(1,1).toString());
    }

    @Override
    void showData(JTable tab, DefaultTableModel mod) {
        mod.setRowCount(2);
        tab.setValueAt("Mass",0,0);
        tab.setValueAt(Mass,0,1);
        tab.setValueAt("Radius",1,0);
        tab.setValueAt(R,1,1);
    }
}
