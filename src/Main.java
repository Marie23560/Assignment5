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
                double r = sc.nextByte();
                shape =new AbsCircle(r);
                break;
        }


    }
}