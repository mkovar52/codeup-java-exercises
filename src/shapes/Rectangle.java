package shapes;

public class Rectangle extends Quadrilateral implements Measurable  {

// ========================== Interfaces & Abstract Classes  ============================== \\
//    public Rectangle() {
//    }

    public Rectangle(double length, double width) {
        super(length, width);
    }


    @Override
    public double setLength() {
        return 0;
    }

    @Override
    public double setWidth() {
        return 0;
    }

    @Override
    public void getPerimeter() {
        System.out.println("Rectangle perimeter is: " + ((2 * length) + (2 * width)));
    }

    @Override
    public void getArea() {
        System.out.println("Rectangle area is: " + length * width);
    }


// ========================== Inheritance & Polymorphism  ============================== \\
//    protected double length;
//    protected double width;
// constructor with set params
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }

//    public double getLength(){
//        return length;
//    }

//    public void setLength(int length){
//        this.length = length;
//    }

//    public double getWidth(){
//        return width;
//    }

//    public void setWidth(int width){
//            this.width = width;
//    }

// ================= Area & Perimeter Methods ================ \\

//    public double getArea(){
//        return this.length * this.width;
//    }
//
//
//    public double getPerimeter(){
//        return (2 * this.length) + (2 * this.width);
//    }

}
