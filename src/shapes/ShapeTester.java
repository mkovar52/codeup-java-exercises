package shapes;

public class ShapeTester {
    public static void main(String[] args) {

// ========================== Interfaces & Abstract Classes  ============================== \\

    Measurable myShape = new Square(20.0);
    Measurable myShape2 = new Rectangle(2.0, 5.0);
//    myShape.getArea();
//    myShape2.getPerimeter();

// ============== Quad types  =========== \\
//    Quadrilateral quad = new Square(5.0);
//    quad.getArea();
////    25
//    quad.getPerimeter();
//    20
//
//    Quadrilateral quad2 = new Rectangle(9.0, 5.0);
//    System.out.println(quad2.getLength());
//    System.out.println(quad2.getWidth());
//    quad2.getPerimeter();
//    quad2.getArea();

//        quad2.setLength(31.0); ********
//make sure to clearly understand WHY i can't manually reset the length/width.... is it bc they're protected in
//        the QUAD abstract class??????

        Rectangle rectangle = new Rectangle(8.0, 2.0);
        System.out.println(rectangle.getLength());













// ========================== Inheritance & Polymorphism  ============================== \\
//// box1 (rec) info
//        System.out.println("Rectangle....");
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("Rectangle Area: " + box1.getArea());
//        System.out.println("Rectangle Perimeter: " + box1.getPerimeter());
//
//// box2(square) info
//        System.out.println("Square......");
//        Rectangle box2 = new Square(5);
//        System.out.println("Square area: " + box2.getArea());
//        System.out.println("Square perimeter: " + box2.getPerimeter());

    }
}
