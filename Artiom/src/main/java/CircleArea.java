public class CircleArea {
    public static void main(String[] args) {
        System.out.println(calculateCircleArea());
    }
    public static double calculateCircleArea() {
        int radius = 4;
        double pi = 3.14159265359;
        double area = pi * (radius * radius);
        return area;
    }
}

