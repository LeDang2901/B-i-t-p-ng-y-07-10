public class Square extends Shape {
    private double side;

    public Square(Point centerPoint, double side) {
        super(centerPoint);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Hình vuông - " + super.toString() +
                ", cạnh: " + side;
    }
}
