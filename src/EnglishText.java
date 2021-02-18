import java.util.*;

public class EnglishText {
    private static final String text = "There, are many big and small libraries everywhere in our country. They have millions of books in different languages.\n" +
            " You can find there the oldest and the newest books. Every school has a library. Pupils come to the library to take books on different subjects.\n" +
            " The school library where Oleg studies is good. It is a large clean room. There are four big windows in it. The walls are light blue.\n" +
            " There are a lot of shelves full of books. You can find books on literature, physics, history, chemistry, geography, biology and other subjects.\n" +
            " There are books in English, too. On the walls you can see pictures of some great writers and poets. \n" +
            " On the table near the window you can always see beautiful spring and autumn flowers.  Oleg likes to go to the library.\n" +
            " He can always find there something new, something he needs.";
    public static void main(String[] args){

        List<String> textToList = Arrays.asList(text.toLowerCase().split((" |, |\n |\\.")));
        System.out.println(textToList);
        Set<String> uniqueWords = new HashSet<>(textToList);
        System.out.println(uniqueWords);
    }
}
