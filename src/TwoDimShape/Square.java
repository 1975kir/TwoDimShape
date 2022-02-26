package TwoDimShape;

class Square extends TwoDimShape {
    String style;

    double area() {
        return getWidth() * getHeight();
    }

    void showStyle() {
        System.out.println("Квадрат " + style);
    }
}

