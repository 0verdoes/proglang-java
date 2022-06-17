import java.io.IOException;
import java.util.*;
import bingo.BingoGame;
import bingo.LoadableBingoGame;
import bingo.exception.BingoException;

public class Main {
    public static void main(String[] args) {
        
        try {

            List<String> rows = new LinkedList<>(List.of("egy", "kettö", "három"));
            BingoGame bg = new BingoGame(rows, 4);
            LoadableBingoGame lbg = new LoadableBingoGame("bingo.txt", 5);
            System.out.print(bg);
            
            bg.call("egy", 3);
            for (int i = 0; i < 4; i++) {
                bg.call("kettö", i);
            }
    
            System.out.print(bg);
            System.out.println(lbg);
        } catch (BingoException e) {
            System.err.println("Calling failed: " + e.getReason());
        } catch (IOException err){
            err.printStackTrace();
        }
    }
}
