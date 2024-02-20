package edu.lab08;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CCuboid extends CSolid{
    protected int A;
    protected int B;
    public CCuboid(int m, int a, int b) {
        Mass = m;
        A = a;
        B = b;
    }

    @Override
    double momentOfInertia() {
        return ((double) 1 /12) * Mass * ((A * A) + (B * B));
    }

    @Override
    void getData(JTable tab) {
        Mass = Integer.parseInt(tab.getValueAt(0,1).toString());
        A = Integer.parseInt(tab.getValueAt(1,1).toString());
        B = Integer.parseInt(tab.getValueAt(2,1).toString());
    }

    @Override
    void showData(JTable tab, DefaultTableModel mod) {
        mod.setRowCount(3);
        tab.setValueAt("Mass",0,0);
        tab.setValueAt(Mass,0,1);
        tab.setValueAt("Dimension a",1,0);
        tab.setValueAt(A,1,1);
        tab.setValueAt("Dimension b",2,0);
        tab.setValueAt(A,2,1);
    }
}
