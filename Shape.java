abstract class Shapegeo {
    abstract void rectangleArea(int length, int breadth);

    abstract void squareArea(int side);

    abstract void circleArea(int radius);
}

class Area extends Shape {

    void rectangleArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle is: " + area);
    }

    void squareArea(int side) {
        int area = side * side;
        System.out.println("Area of Square is: " + area);
    }

    void circleArea(int radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle is: " + area);
    }
}
    public class Shape {
        public static void main(String[] args) {
            Area area = new Area();
            area.rectangleArea(10, 20);
            area.squareArea(10);
            area.circleArea(10);
     }
 }


// Area of Rectangle:200
//     Area of Square:100
//     Area of Circle:
//    314.0