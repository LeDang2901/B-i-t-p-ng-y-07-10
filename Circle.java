public class Circle extends Shape {
    private double radius;

    public Circle(Point centerPoint, double radius) {
        super(centerPoint);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Hình tròn - " + super.toString() +
                ", bán kính: " + radius;
    }
}
