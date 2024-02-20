package edu.lab08;

public class CCylinder extends CCone{

    public CCylinder(int r, int m) {
        super(r, m);
    }

    @Override
    double momentOfInertia() {
        return 0.5 * Mass * R * R;
    }
}
