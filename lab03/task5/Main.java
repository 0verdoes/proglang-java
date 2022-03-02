import stringutils.IterLetter;

public class Main {
    public static void main(String[] args) {
        IterLetter il = new IterLetter("Prog Lang java lab03 sols are arriving a bit late around now!");

        while(il.hasNext()){
            il.printNext();
        }
        il.restart();
        while(il.hasNext()){
            il.printNext();
        }
    }
}
