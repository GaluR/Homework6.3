import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Point point1 = new Point();
        PointCheck check1 = new PointCheck();
        System.out.println("Wprowadź współrzędną X punktu: ");
        point1.coordinateX = scan.nextDouble();
        System.out.println("Wprowadź współrzędną Y punktu: ");
        point1.coordinateY = scan.nextDouble();
        System.out.println(check1.whichPart(point1));
    }
}
