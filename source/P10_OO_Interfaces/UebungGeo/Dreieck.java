package P10_OO_Interfaces.UebungGeo;

public class Dreieck implements Geo {
    double hoehe;
    double grund;

    public Dreieck (double hoehe, double grund) {
        super();
        this.hoehe = hoehe;
        this.grund = grund;
    }
    @Override
    public double getFlaeche() { return (this.hoehe*this.grund)/2; }
}

