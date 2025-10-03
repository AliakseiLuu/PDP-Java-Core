package Task17;

import java.util.*;

public class Flomaster {
    final String color;
    final String taste;

    public Flomaster(String c, String t) {
        color = c;
        taste = t;
    }

    public String getTaste() {
        return taste;
    }

    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return taste;
    }
}
