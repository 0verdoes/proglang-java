import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Fel1to3 {

    public static LinkedList<Integer> divisor(int divisor) {
        return IntStream.range(1, divisor).filter(i -> divisor % i == 0).collect(LinkedList::new, LinkedList::add,
                LinkedList::addAll);
    }

    public static ArrayList<String> getStrSameBeginningAndEnding(ArrayList<String> al) {
        return al.stream().filter(str -> str.length() < 0 || str.charAt(0) == str.charAt(str.length() - 1))
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }

    public static void removeStrDifferBeginningAndEnding(ArrayList<String> al) {
        al.removeIf(str -> str.length() < 0 || str.charAt(0) != str.charAt(str.length() - 1));
    }

    public static void minToFront(ArrayList<Integer> al) {
        al.add(0, al.remove(al.indexOf(Collections.min(al))));;
    }

    public static void main(String[] args) {

        System.out.println("divs of 42: " + divisor(42));
        System.out.println("divs of 72: " + divisor(72));

        ArrayList<String> list = new ArrayList<String>();
        list.add("alma");
        list.add("aggteleki kutya");
        list.add("gerinc");
        list.add("OV");

        System.out.println("Original: " + list);
        System.out.println("filtered: " + getStrSameBeginningAndEnding(list));
        System.out.println("Original: " + list);

        // -----------------------------------

        ArrayList<Integer> list_int = new ArrayList<Integer>(Arrays.asList(4, 65, 45, 44, 76, 2, 98, 72));
        System.out.println("Original: " + list_int);
        minToFront(list_int);
        System.out.println("Switched: " + list_int);

    }
}
