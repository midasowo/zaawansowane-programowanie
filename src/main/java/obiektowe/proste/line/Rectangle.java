package obiektowe.proste.line;

public class Rectangle {

    Line vertical;
    Line horizontal;

    public Rectangle(Line vertical, Line horizontal) {
        this.vertical = vertical;
        this.horizontal = horizontal;
    }

    void print() {
        for (int y = 0; y < vertical.length; y++) {
            for (int x = 0; x < horizontal.length; x++) {
                if ((x+y) % 2  == 0) {
                    System.out.print(vertical.fill);
                } else {
                    System.out.print(horizontal.fill);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }


}
