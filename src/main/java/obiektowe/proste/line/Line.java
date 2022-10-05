package obiektowe.proste.line;

public class Line {

    int length;
    char fill;

    public Line(int length, char fill) {
        this.length = length;
        this.fill = fill;
    }

    void print() {
        for (int i = 0; i < length; i++) {
            System.out.print(fill);
        }
        System.out.println();
    }
}
