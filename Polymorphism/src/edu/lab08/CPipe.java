package edu.lab08;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CPipe extends CCylinder{
    protected int r2;

    public CPipe(int r, int m, int r2) {
        super(r, m);
        this.r2 = r2;
    }

    @Override
    double momentOfInertia() {
        return 0.5 * Mass * ((R*R) + (r2*r2));
    }

    @Override
    void getData(JTable tab) {
        super.getData(tab);
        r2 = Integer.parseInt(tab.getValueAt(2,1).toString());
    }

    @Override
    void showData(JTable tab, DefaultTableModel mod) {
        //super.showData(tab, mod);
        mod.setRowCount(3);
        tab.setValueAt("Mass",0,0);
        tab.setValueAt(Mass,0,1);
        tab.setValueAt("Radius R",1,0);
        tab.setValueAt(R,1,1);
        tab.setValueAt("Radius r",2,0);
        tab.setValueAt(r2,2,1);
    }
}
