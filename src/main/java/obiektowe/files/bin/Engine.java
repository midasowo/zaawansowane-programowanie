package obiektowe.files.bin;

import java.io.Serializable;
import java.util.Objects;

public class Engine implements Serializable {
    private String typ;

    public Engine(String typ) {
        this.typ = typ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Objects.equals(typ, engine.typ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typ);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "typ='" + typ + '\'' +
                '}';
    }
}
