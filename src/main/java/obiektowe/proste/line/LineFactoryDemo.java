package obiektowe.proste.line;

public class LineFactoryDemo {

    public static void main(String[] args) {

        LineFactory factory = new LineFactory();
        Line line = factory.getLineWith('$');
        System.out.println();
    }

}
