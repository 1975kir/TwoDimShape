package TwoDimShape;

public class Shapes2 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        Square t3 = new Square();

        t1.setWidth (4.0);
        t1.setHeight (4.0);
        t1.style = "закрашенный";

        t2.setWidth (8.0);
        t2.setHeight (12.0);
        t2.style = "контурный";

        t3.setWidth (5.0);
        t3.setHeight (5.0);
        t3.style = "в полоску";

        System.out.println("Информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Площадь - " + t1.area());

        System.out.println();

        System.out.println("Информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Площадь - " + t2.area());

        System.out.println();

        System.out.println("Информация о t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Площадь - " + t3.area());

    }
}
