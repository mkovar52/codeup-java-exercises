package shapes;

public class Square extends Quadrilateral {

// ========================== Interfaces & Abstract Classes  ============================== \\

    protected double side;


    public Square(double side){
        this.side = side;
    }

    @Override
    public double setLength() {
        return this.side;
    }

    @Override
    public double setWidth() {
        return this.side;
    }

    @Override
    public void getPerimeter() {
        System.out.println("SQUARE perimeter is: " + (4 * side));
    }

    @Override
    public void getArea() {
        System.out.println("SQUARE area is: " + (side * side));
    }

    // ========================== Inheritance & Polymorphism  ============================== \\
//    public Square(double side){
//       super(side, side);
////       this.side = side;
//    }
//
//    @Override
//    public double getArea(){
//        return length * length;
//    }
//
//
//    @Override
//    public double getPerimeter(){
//        return 4 * length;
//    }

}
