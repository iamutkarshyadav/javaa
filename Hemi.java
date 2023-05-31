//question 15
import java.util.Scanner;

interface Volume {
    void displayVolume();
}

class Cone implements Volume {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void displayVolume() {
        double volume = (1.0 / 3.0) * Math.PI * radius * radius * height;
        System.out.println("Volume of Cone: " + volume);
    }
}

class Hemisphere implements Volume {
    private double radius;

    public Hemisphere(double radius) {
        this.radius = radius;
    }

    public void displayVolume() {
        double volume = (2.0 / 3.0) * Math.PI * radius * radius * radius;
        System.out.println("Volume of Hemisphere: " + volume);
    }
}

class Cylinder implements Volume {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void displayVolume() {
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder: " + volume);
    }
}

public class Hemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the cone: ");
        double coneRadius = scanner.nextDouble();
        System.out.print("Enter the height of the cone: ");
        double coneHeight = scanner.nextDouble();
        Cone cone = new Cone(coneRadius, coneHeight);
        cone.displayVolume();

        System.out.print("Enter the radius of the hemisphere: ");
        double hemisphereRadius = scanner.nextDouble();
        Hemisphere hemisphere = new Hemisphere(hemisphereRadius);
        hemisphere.displayVolume();

        System.out.print("Enter the radius of the cylinder: ");
        double cylinderRadius = scanner.nextDouble();
        System.out.print("Enter the height of the cylinder: ");
        double cylinderHeight = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
        cylinder.displayVolume();

        scanner.close();
    }
}
