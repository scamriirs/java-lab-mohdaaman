abstract class Shape {
    abstract double area();
}

class Triangle extends Shape {
    double b, h;

    Triangle(double base, double height) {
        b = base;
        h = height;
    }

    double area() {
        return 0.5 * b * h;
    }
}

class Rectangle extends Shape {
    double l, w;

    Rectangle(double length, double width) {
        l = length;
        w = width;
    }

    double area() {
        return l * w;
    }
}

class Circle extends Shape {
    double r;

    Circle(double radius) {
        r = radius;
    }

    double area() {
        return 3.14 * r * r;
    }
}

class ShapeTest {
    public static void main(String[] args) {
        Shape t = new Triangle(10, 5);
        Shape r = new Rectangle(4, 6);
        Shape c = new Circle(7);

        System.out.println("Triangle Area: " + t.area());
        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Circle Area: " + c.area());
    }
    
}
