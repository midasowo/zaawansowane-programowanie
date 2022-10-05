package obiektowe.proste.line;

import java.util.Random;

public class LineFactory {

    //linię losowej długości z wybranym znakiem,
    public Line getLineWith(char fill) {
        Random random = new Random();
        int length = random.nextInt(1,50);
        return new Line(length, fill);
    }
}
