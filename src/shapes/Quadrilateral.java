package shapes;

public abstract class Quadrilateral extends Shape implements Measurable  {
// ========================== Interfaces & Abstract Classes  ============================== \\

    protected double length;
    protected double width;

//    ask why error is thrown from rectangle class that no default constructor appears here?
    public Quadrilateral(){}

    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

// getters \\

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public abstract double setLength();
    public abstract double setWidth();
}
