import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Poem {
    private static final String HARLEM =
            "What happens to a dream deferred?\n" +
                    "Does it dry up\n" +
                    "like a raisin in the sun?\n" +
                    "Or fester like a sore—\n" +
                    "And then run?\n" +
                    "Does it stink like rotten meat?\n" +
                    "Or crust and sugar over—\n" +
                    "like a syrupy sweet?\n" +
                    "Maybe it just sags\n" +
                    "like a heavy load.\n";

    public static void main(String[] args) {
        List<String> poem = Arrays.asList(HARLEM.split("\n"));
        System.out.println(poem);
        Collections.sort(poem, (String o1, String o2) -> (o1.length() - o2.length()));
        System.out.println(poem);
    }
}
