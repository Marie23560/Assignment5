import java.util.Scanner;

public class Main {
    public class ShapeCalculator{

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a Shape: 1 = Circle,2 = Rectangle, 3 = Triangle");
        int choice = sc.nextByte();

        Absshape shape ;

        switch (choice){
            case 1:
                System.out.println("Enter radius: ");
                double r = sc.nextDouble();
                shape =new AbsCircle(r);
                break;
            case 2:
                System.out.println("Enter Length: ");
                double l = sc.nextDouble();
                System.out.println("Enter Width: ");
                double w = sc.nextDouble();
                shape = new AbsRectangle(l,w);
                break;
            case 3
                System.out.println("Enter base: ");
                double b = sc.nextDouble();
                System.out.println("Enter height: ");
                double h = sc.nextDouble();
                shape = new AbsRectangle(b,h);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
        System.out.println("Area: " + shape.calculateArea());
    }
}