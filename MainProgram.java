import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(new Point(2, 3), 4, 6));
        shapes.add(new Square(new Point(0, 0), 5));
        shapes.add(new Circle(new Point(1, 1), 3));

        System.out.println("=== Tổng số hình đã khởi tạo: " + Shape.getCount() + " ===\n");

        System.out.println("Danh sách chi tiết các hình:");
        for (Shape s : shapes) {
            System.out.println("- " + s);
        }

        System.out.println("\nDanh sách tâm điểm:");
        for (Shape s : shapes) {
            System.out.println("- " + s.getCenterPoint());
        }
    }
}
