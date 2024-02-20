package edu.lab08;

public class CCone extends CSphere{
    public CCone(int r, int m) {
        super(r, m);
    }
    @Override
    double momentOfInertia() {
        return 0.3 * Mass * R * R;
    }
}
