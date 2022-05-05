class Point1 {
    int x;
    int y;
}
class Point2 {
    int x;
    int y;

    Point2(int x, int y) {
        this.x = x;
        this.y =y;
    }
}
class Point3 {
    int x;
    int y;

    Point3() {
        this(0, 0);
    }

    Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void printPoint() {
        System.out.println("(" + x + "," + y + ")");
    }

    public Point3 center(Point3 other) {
        return new Point3((x + other.x)/2, (y+other.y)/2);
    }

    public Point3 scale() {
        Point3 origin = new Point3(0, 0);
        int _originToX = x - origin.x;
        int _originToY = y - origin.y;
        return new Point3(origin.x + _originToX/2, origin.y + _originToY/2);
    } 
}
public class objects {
    public static void main(String[] args) {
        Point2 p2 = new Point2(1, 2);
        Point3 p3 = new Point3();
        p3.x = 3;
        p3.y = 4;
        Point3 p4 = new Point3(p2.x, p2.y);
        System.out.println(p4.center(p3));
        System.out.println(p4.scale());

    }
}
