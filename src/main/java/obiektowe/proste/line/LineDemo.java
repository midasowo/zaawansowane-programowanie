package obiektowe.proste.line;

public class LineDemo {

    public static void main(String[] args) {
        Line line1 = new Line(3,'*');
        Line line2 = new Line(70,'#');

//        line1.print();
//        line2.print();

        Rectangle rectangle = new Rectangle(line1,line2);
        rectangle.print();


    }
}
