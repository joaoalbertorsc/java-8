import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static java.util.Comparator.comparing;

public class OrndenaStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("Ale");
        palavras.add("Cava");
        palavras.add("Bigorna");
        System.out.println(palavras);

        Collections.sort(palavras);
        System.out.println(palavras);
        System.out.println();

        palavras.sort(comparing(String::length));
        System.out.println(palavras);

        palavras.sort(comparing(String::toString));
        System.out.println(palavras);

//        for (String p: palavras) {
//            System.out.println(p);
//        }

//        Collections.sort(palavras);
//        palavras.forEach(System.out::println);
//        System.out.println(palavras);

    }
}
