
class Foo {
    private int x;

    public Foo(int init_x) {
        x = init_x;
    }
}

public class Main {//                   STACK ---------------------------->    HEAP
    public static void main(String[] args) {
    int counter = 10; // (1)            cnt = 10

        Foo obj; // (2)                 obj   ----------------------------> NULL
        obj = new Foo(5); // (3)        obj   ----------------------------> {x = 5}

        Foo obj2 = new Foo(7); // (4)  obj2   ----------------------------> {x = 7}
        /*-------------------------------------------------------------------------------------------------------------------- */
        obj2 = obj; // (5)             obj2   ----------------------------> {x = 5}
                                    // obj    ----------------------------> {x = 5}
                                    // SENKI  ----------------------------> {x = 7} -> mivel senki sem mutat rá, "elérhetetlen"
                                    // memória cím, ezért a garbage collector "szemét gyüjtő/szedő" jöhet és összeszedgeti
        // ...
    }
}
