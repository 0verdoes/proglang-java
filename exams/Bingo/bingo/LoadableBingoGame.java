package bingo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoadableBingoGame extends WellFormattedBingoGame{

    public LoadableBingoGame(String fileName, int m) throws FileNotFoundException, IOException{
        super(readRowNames(new BufferedReader(new FileReader(fileName))), m);
        
    }
    
    private static List<String> readRowNames(BufferedReader bf) throws IOException{
        List<String> res = new ArrayList<>();
        String line = null;
        while(null != (line = bf.readLine())){
            res.add(line);
        }

        return res;
    }
}
