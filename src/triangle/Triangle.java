package triangle;
/* Singh Karanbir ksohi97@gmail.com
 * This is a very simple program that finds out the area of a triangle using Heron's formula. The program
 *  below uses the principles of inheritance to find out the area in a hierarchical manner.
 * The scope of the program is the use of inheritance concepts in object oriented programming
*/
public class Triangle {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //declaration of the 3 points objects
        Point v1 = new Point(0,0);
        Point v2 = new Point(0,0);
        Point v3 = new Point(0,0);
        //use of the setters to change the value
        v2.setX(3);
        v3.setY(4);
        //declaration of the 3 segments objects
        LineSegment A = new LineSegment(v1.getX(),v1.getY());
        LineSegment B = new LineSegment(v2.getX(),v2.getY());
        LineSegment C = new LineSegment(v3.getX(),v3.getX());
        //storing of the 3 lengths into the variables
        double a = A.length(v1,v2);
        double b = B.length(v2,v3);
        double c = C.length(v3,v1);
        //calculating the value of S and the area
        double s = (a+b+c)/2;
        double area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        //print the area
        System.out.println("The area calculated by heron's formula is: "+area);
    }

}
