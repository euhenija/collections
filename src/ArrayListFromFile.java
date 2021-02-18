import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;


public class ArrayListFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        new BufferedReader(new FileReader("/Users/Valentina/data/Collections/src/text")).lines().forEach(list::add);
        Collections.sort(list);
        System.out.println(list);
    }

}
