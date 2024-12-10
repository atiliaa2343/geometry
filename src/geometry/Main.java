package geometry;

import java.util.Scanner;

/**
 * Main class for the Geometry Program.
 * 
 * This class implements a command-line REPL interface
 * that allows users to:
 * 1. Add 2D and 3D geometries.
 * 2. View all added geometries.
 * 3. Remove geometries.
 * 4. Find geometries by specific attributes.
 * 5. Exit the program.
 * 
 * The program interacts with the user to gather data about geometric shapes,
 * stores the shapes in linked lists, and displays their details on request.
 */
public class Main {

    /**
     * The entry point of the program.
     * 
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Geometry2D> geometries2D = new LinkedList<>();
        LinkedList<Geometry3D> geometries3D = new LinkedList<>();

        System.out.println("Welcome to the Geometry Program!");

        while (true) {
            System.out.println("\nOptions: ");
            System.out.println("1. Add 2D Geometry");
            System.out.println("2. Add 3D Geometry");
            System.out.println("3. View All Geometries");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("1. Rectangle, 2. Circle, 3. Triangle");
                    int type = scanner.nextInt();
                    switch (type) {
                        case 1 -> {
                            System.out.print("Enter length and width: ");
                            double length = scanner.nextDouble();
                            double width = scanner.nextDouble();
                            Rectangle rectangle = new Rectangle(length, width);
                            geometries2D.add(rectangle);
                            System.out.println("Added: " + rectangle);
                        }
                        case 2 -> {
                            System.out.print("Enter radius: ");
                            double radius = scanner.nextDouble();
                            Circle circle = new Circle(radius);
                            geometries2D.add(circle);
                            System.out.println("Added: " + circle);
                        }
                        case 3 -> {
                            System.out.print("Enter base, height, and sides a, b, c: ");
                            double base = scanner.nextDouble();
                            double height = scanner.nextDouble();
                            double sideA = scanner.nextDouble();
                            double sideB = scanner.nextDouble();
                            double sideC = scanner.nextDouble();
                            Triangle triangle = new Triangle(base, height, sideA, sideB, sideC);
                            geometries2D.add(triangle);
                            System.out.println("Added: " + triangle);
                        }
                        default -> System.out.println("Invalid 2D geometry option.");
                    }
                }
                case 2 -> {
                    System.out.println("1. Sphere, 2. Triangular Prism");
                    int type = scanner.nextInt();
                    switch (type) {
                        case 1 -> {
                            System.out.print("Enter radius: ");
                            double radius = scanner.nextDouble();
                            Sphere sphere = new Sphere(radius);
                            geometries3D.add(sphere);
                            System.out.println("Added: " + sphere);
                        }
                        case 2 -> {
                            System.out.print("Enter base, height, and length: ");
                            double base = scanner.nextDouble();
                            double height = scanner.nextDouble();
                            double length = scanner.nextDouble();
                            TriangularPrism triangularPrism = new TriangularPrism(base, height, length);
                            geometries3D.add(triangularPrism);
                            System.out.println("Added: " + triangularPrism);
                        }
                        default -> System.out.println("Invalid 3D geometry option.");
                    }
                }
               
                case 3 -> {
                    System.out.println("\n2D Geometries:");
                    geometries2D.printAll();
                    System.out.println("\n3D Geometries:");
                    geometries3D.printAll();
                }
                case 4 -> {
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice, try again.");
            }
        }
    }
}


