public class Circle {
    private static double radius;
    private static double diameter;
    private static double area;

    public Circle() {
        radius = 1;
        diameter = 2 * radius;
        area = Math.PI * Math.pow(radius, 2);
    }

    public static void setRad(double rad) {
        radius = rad;
        diameter = 2 * radius;
        area = Math.PI * Math.pow(radius, 2);
    }

    public static double getRad() {
        return radius;
    }

    public static double getDia() {
        return diameter;
    }

    public static double getArea() {
        return area;
    }

    public static void main(String[] args) {

        Circle a = new Circle();
        Circle b = new Circle();
        Circle c = new Circle();

        a.setRad(3);
        System.out.println("Radius of the first circle: " + a.getRad());
        System.out.println("Diameter of the first circle: " + a.getDia());
        System.out.println("Area of the first circle: " + a.getArea());

        b.setRad(20);
        System.out.println("Radius of the second circle: " + b.getRad());
        System.out.println("Diameter of the second circle: " + b.getDia());
        System.out.println("Area of the second circle: " + b.getArea());
    }
}
