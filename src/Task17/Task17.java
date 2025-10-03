package Task17;

// Необходимо сформировать список цветов кислых фломастеров и вывести его в формате ["цвет1", ..., "цветN"] пример ["красный", "зелёный", "жёлтый"]

import java.util.*;
import java.util.stream.Collectors;

public class Task17 {

    public static void main(String[] args) {
        Set<Flomaster> flomasterSet = Set.of(
                new Flomaster("красный", "кислый"),
                new Flomaster("зелёный", "кислый"),
                new Flomaster("жёлтый", "кислый"),
                new Flomaster("синий", "сладкий")
        );

        String result=getSourFlomaster(flomasterSet);

        System.out.println(result);
    }

    public static String getSourFlomaster(Set<Flomaster> flomasterSet){
            String sour = flomasterSet.stream()
                    .filter(w -> w.getTaste().equals("кислый"))
                    .map(Flomaster::getColor)
                    .collect(Collectors.joining(", "));
        return sour;
    }

}
