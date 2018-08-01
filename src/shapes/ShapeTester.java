package shapes;

public class ShapeTester {
    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(5, 4);
        Rectangle box2 = new Square(5);

// box1 (rec) info
        System.out.println("The Area of box1 = " + box1.getArea());
        System.out.println("The  perimeter of box1 = " + box1.getPerimeter());

// box2(square) info
        System.out.println("Square area: " + box2.getArea());
        System.out.println("Square perimeter: " + box2.getPerimeter());

    }
}
