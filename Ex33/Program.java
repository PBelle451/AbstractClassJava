package co.pedrobelle.curso.Ex33;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();
        System.out.println("Enter the number of shapes: ");
        int n = scanner.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println("Shape #" + i + " data:");
            System.out.println("Rectangle or Circle (r/c)? ");
            char ch = scanner.next().charAt(0);
            System.out.println("Color (BLACK/BLUE/RED)? ");
            Color color = Color.valueOf(scanner.next());
            if (ch == 'r'){
                System.out.println("Widht: ");
                double widht = scanner.nextDouble();
                System.out.println("Height: ");
                double height = scanner.nextDouble();
                list.add(new Rectangle(color, widht, height));
            } else {
                System.out.println("Radius: ");
                double radius = scanner.nextDouble();
                list.add(new Circle(color, radius));
            }
        }
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : list){
            System.out.println(String.format("%.2f", shape.area()));
        }
        scanner.close();
    }
}
