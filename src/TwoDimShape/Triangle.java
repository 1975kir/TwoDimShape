package TwoDimShape;

class Triangle extends TwoDimShape {
    String style;
    double area() {
        return getWidth() * getHeight() / 2;
        }
        void showStyle() {
            System.out.println("Треугольник " + style);
        }
}
