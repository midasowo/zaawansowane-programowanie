package obiektowe.files.json;

import java.util.Objects;

public class Engine {
    private String typ;

    public Engine(String typ) {
        this.typ = typ;
    }

    public String getTyp() {
        return typ;
    }

    public Engine() {
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
