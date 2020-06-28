package triangle;
public class LineSegment extends Point{
    Point v1;
    Point v2;
    public LineSegment(double x, double y) {
        super(x, y);
        // TODO Auto-generated constructor stub
    }
    //formula for getting the length of a segment
    public double length(Point v1, Point v2) {
        return Math.sqrt(Math.pow((v1.getX()-v2.getX()),2)+Math.pow((v1.getY()-v2.getY()),2));
    }

}