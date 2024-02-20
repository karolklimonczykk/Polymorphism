package edu.lab08;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public abstract class CSolid {
    protected int Mass;

    abstract double momentOfInertia();
    abstract void getData(JTable tab);
    abstract void showData(JTable tab, DefaultTableModel mod);


}
