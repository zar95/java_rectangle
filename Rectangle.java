public class Rectangle {
    private double lenght;
    private double width;

    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle(double lenght, double width, double x, double y) {
        this.lenght = lenght;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public double calArea() {
        return lenght * width;
    }

    public double calPerimeter() {
        return 2 * (lenght + width);
    }

    public String toString() {
        return String.format("lenght is %.2f and width is %.2f", getLenght(), getWidth());
    }

    // no need to write new in this case
    public Rectangle GetMaxRect(Rectangle r1, Rectangle r2) {
        double area1 = r1.calArea();
        double area2 = r2.calArea();
        if (area1 > area2) {
            return r1;
        } else if (area1 < area2)
            return r2;
        else
            System.out.printf("both Rects are equal");
        return null;
    }

    public Rectangle overlapCheck(Rectangle r1, Rectangle r2) {

        double x1 = r1.getX();
        double y1 = r1.getY();
        double x2 = r2.getX();
        double y2 = r2.getY();
        double l1 = r1.getLenght();
        double l2 = r2.getLenght();
        double w1 = r1.getWidth();
        double w2 = r2.getWidth();

        if ((x1 + l1) < (x2 + l2) || (x1 + l1) == (x2 + l2) ) {

            System.out.printf("no over lap take place from sides\n");
            return null;
        } else if ( (y1 + w1) < (y2 + w2) || (y1 + w1) == (y2 + w2)) {
            System.out.print("no overlap from top or bottom\n");
            return null;
        } else {
            System.out.printf("overlapping take place\n");
            return null;
        }
    }
}